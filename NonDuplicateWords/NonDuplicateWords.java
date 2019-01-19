import java.util.*;
import java.nio.file.Path;
import java.io.*;
public class NonDuplicateWords {
    static boolean debug = false;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter file name: ");
        String path = s.nextLine();
        //need to close scanner because it will be re-used later
        s.close();
        File file = new File(path);
        String text = "";
        //flag used to know if more should be read
        boolean flag = false;
        //open file
        try {
            //instantiating scanner using file requires exception handling
            s = new Scanner(file);
        }
        catch(Exception e) {
            flag = true;
            System.out.print("Error reading file.");
        }
        while(!flag) {
            String line;
            try{
                //reading text with nextLine() discards line ending,
                //must add back
                line = s.nextLine().concat("\n");
                //add new line to existing text
                text = new String(text.concat(line));
            }
            catch(NoSuchElementException e) {
                flag = true;
            }
        }
        if(flag) {
            if(debug) System.out.println("Read: \n" + text);
            //input finished
            //get rid of leading whitespace, which prevents an extra empty
            //string from being produced from split
            text = new String(text.replaceAll("(^\\W+)", ""));
            if(debug) System.out.println("Remove leading garbage: \n" + text);
            //non-words with space
            text = new String(text.replaceAll("\\W+", " "));
            if(debug) System.out.println("Replace non-words: \n" + text);
            //split words based on spaces
            String[] parsed = text.split("\\s+");
            TreeMap<String, Integer> map = new TreeMap<String, Integer>();
            for(int i = 0; i < parsed.length; i++) {
                //add each string to map
                map.put(parsed[i], parsed[i].hashCode());
            }
            System.out.println("Display words in alphabetical order:");
            for(Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey());
            }
        }
    }
}
