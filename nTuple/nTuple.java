import java.util.*;
public class nTuple {
    public boolean isINT;
    private ArrayList<nTuple> list = new ArrayList<nTuple>();
    private int x;
    public nTuple(int i) {
        isINT = true;
        x = i;
    }
    public nTuple(nTuple ... args) {
        isINT = false;
        for(nTuple e : args) {
            list.add(e);
        }
    }
    public String toString() {
        String str = new String("");
        if(isINT) {
            //if isINT is true, then element should be last in stack
            str = new String(Integer.toString(x));
        }
        else {
            str += "(";
            for(int k = 0; k < list.size(); k++) {
                str += list.get(k).toString();
                if(k < list.size() - 1) {
                    //separate each element with comma
                    str += ",";
                }
            }
            str += ")";
        }
        //each iteration should return its contents within parenthesis
        //unless it is the last in stack
        return str;
    }
    public String flatten() {
        //same as toString() but does not print commas or parenthesis
        String str = new String("");
        if(isINT) {
            str = new String(Integer.toString(x));
        }
        else {
            for(int k = 0; k < list.size(); k++) {
                str += list.get(k).flatten();
                if(k < list.size() - 1) {
                    str += " ";
                }
            }
        }
        return str;
    }
    public static void main(String [] arg){
        Scanner input = new Scanner(System.in);
        int ii = 1;
        String ss;
        nTuple nt;
        nTupleFactory fact = new nTupleFactory();
        while (ii != 0){
            System.out.print("enter either toString or flatten and an int (end with 0): ");
            ss = input.nextLine();
            ii = input.nextInt();
            input.nextLine();
            if (ii != 0){
                nt = fact.getnTuple(ii);
                if (ss.equals("toString")) System.out.println(nt.toString());
                else System.out.println(nt.flatten() + " ");
                //?test program expects extra space?
            }
        }
    }
}
