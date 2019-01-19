import java.util.*;

public class TreeDisplay {
    public static final boolean debug = false;
    public static int depth = 0;
    public static ArrayList<String> row = new ArrayList<String>();
    public static void main(String[] args) {
        Node F = new Node("F", null, null);
        Node E = new Node("E", null, null);
        Node D = new Node("D", null, null);
        Node C = new Node("C", F, null);
        Node B = new Node("B", D, E);
        Node A = new Node("A", B, C);
        calculateDisplay(A, 0);
        for(String entry : row) {
            System.out.println(entry);
        }
    }
    public static void calculateDisplay(Node head, int level) {
        //each node fixed width 5 characters
        if(level >= row.size()) {
            row.add(new String(getFixedData(head)));
        }
        else {
            row.set(level, new String(row.get(level) + getFixedData(head)));
        }
        if(head != null) {
            calculateDisplay(head.left, level + 1);
            calculateDisplay(head.right, level + 1);
        }
    }
    public static int evalDepth(Node head, int count) {
        if(head != null) {
            count++;
            int countL = evalDepth(head.left, count);
            int countR = evalDepth(head.right, count);
            if(countL > countR) count = countL;
            else count = countR;
        }
        return count;
    }
    public static String getFixedData(Node n) {
        int max = 5;
        int lead = 0;
        int trail = 0;
        String s = "";
        if(n != null) {
            if(n.data.length() < 5) {
                max = n.data.length();
                lead = (5 - max) / 2;
                //if data is 4 length, 1 space will always be in front
                if(lead < 1) lead = 1;
                //trailing space may be 0
                trail = (5 - max) / 2;
            }
            if(debug) System.out.println("Length: " + max + "\n" + "Lead: " + lead + "\n" + "Trail: " + trail);
            for(int i = lead; i > 0; i--) {
                s += (" ");
            }
            if(debug) System.out.println("[" + s + "]");
            s += n.data.substring(0,max);
            if(debug) System.out.println("[" + s + "]");
            for(int i = trail; i > 0; i--) {
                s += (" ");
            }
            if(debug) System.out.println("[" + s + "]");
            return s;
        }
        else return new String("     ");
    }
}
