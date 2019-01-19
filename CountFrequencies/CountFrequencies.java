import java.util.*;
import java.io.*;
public class CountFrequencies {
    static boolean debug = false;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter file name: ");
        String path = s.nextLine();
        //need to close scanner because it will be re-used later
        s.close();
        File file = new File(path);
        //flag used to know if more should be read
        boolean flag = false;
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        //open file
        try {
            //instantiating scanner using file requires exception handling
            s = new Scanner(file);
        }
        catch(Exception e) {
            flag = true;
            System.out.println("Error reading file.");
        }
        while(!flag) {
            String line;
            try{
                //read line
                line = s.nextLine();
                if(debug) System.out.print("Read|" + line);
                //get rid of leading whitespace, which prevents an extra empty
                //string from being produced from split
                line = new String(line.replaceAll("(^\\W+)", ""));
                //replace non-words with space
                line = new String(line.replaceAll("\\W+", " "));
                if(debug) System.out.println("|->|" + line + "||");
                //find words by keeping track of position of next space
                int startPos = 0;
                int endPos = 1;
                while((endPos >= 0) && (startPos < line.length())) {
                    endPos = line.indexOf(" ", startPos);
                    String word;
                    if(endPos < 0) {
                        //if it is the last word
                        word = new String(line.substring(startPos));
                    }
                    else {
                        //if not the last word
                        word = new String(line.substring(startPos, endPos));
                    }
                    if(debug) System.out.print("->|" + word + "| @ [" + startPos + "," + endPos + "] ");
                    //set startPos to index of the next word's first char
                    startPos = endPos + 1;
                    //add word to map
                    if(map.containsKey(word)) {
                        //if duplicate, increment value by 1;
                        map.put(word, map.get(word) + 1);
                    }
                    else {
                        //if first, add word to map with value of 1
                        map.put(word, 1);
                    }
                }
                if(debug) System.out.println();
            }
            catch(NoSuchElementException e) {
                if(debug) System.out.println("Finished reading file.");
                flag = true;
            }
        }
        if(flag) {
            if(debug) System.out.println("Display words in alphabetical order:");
            for(Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + "  " + entry.getValue());
            }
        }
    }
}
