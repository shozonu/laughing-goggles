import java.util.*;

public class CountWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<ListEntry> list = new ArrayList<ListEntry>();
        boolean exitFlag = false;
        System.out.println("Enter at most 1000 lines:");
        System.out.print("finish by entering a line containing only 0: ");
        //start input loop
        do {
            String input = s.nextLine();
            //if input is not only 0, add to list
            if("0".equals(input) == false) {
                list.add(new ListEntry(input));
            }
            else {
                exitFlag = true;
            }
        }while((exitFlag == false && list.size() < 1000));
        //interate through list to flag first unique instances of entries
        if(list.size() > 0) {
            for(int i = 0; i < list.size(); i++) {
                //if first is still equal to true, then it is unique
                if(list.get(i).isFirst() == true) {
                    //remember the current content to compare
                    String current = list.get(i).get();
                    //keep count of duplicates
                    int count = 1;
                    //flag all other occurences of this content as false
                    for(int k = 0; k < list.size(); k++) {
                        //if content is the same and indexes are different
                        if((list.get(k).get().equals(current) == true)
                        && k != i) {
                            //flip boolean flag (to false)
                            list.get(k).toggle();
                            count++;
                        }
                    }
                    //at this point, the unique one has the only true flag
                    if(count > 1) {
                        System.out.println(current + " occurs " + count + " times");
                    }
                    else {
                        System.out.println(current + " occurs " + count + " time");
                    }
                }
                //end of this loops for this unique entry
            }
        }
    }
}

class ListEntry {
    private String content;
    private boolean first;
    public ListEntry(String s) {
        set(s);
        first = true;
    }
    public void set(String s) {
        content = new String(s);
    }
    public String get() {
        return content;
    }
    public void toggle() {
        first = !first;
    }
    public boolean isFirst() {
        return first;
    }
}
