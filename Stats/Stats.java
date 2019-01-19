import java.util.*;

public class Stats {
    public static TreeNode tree;
    public static TreeFactory factory = new TreeFactory();
    public static final boolean debug = false;
    public static int depth = 0;
    public static int nodeCount = 0;
    public static ArrayList<String> row = new ArrayList<String>();
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("please enter an int: ");
        int input = s.nextInt();
        tree = factory.getTree(input);
        calculateDisplay(tree, 0);
        for(String entry : row) {
            System.out.println(entry);
        }
        depth = evalDepth(tree, 0);
        System.out.println("=========");
        System.out.println("maxDepth: " + (depth - 1));
        System.out.println("nr of nodes: " + nodeCount);
    }
    public static void calculateDisplay(TreeNode head, int level) {
        //each node fixed width 5 characters
        if(head != null) {
            if(level >= row.size()) {
                row.add(new String(head.item + "  "));
            }
            else {
                row.set(level, new String(row.get(level) + head.item + "  "));
            }
            calculateDisplay(head.left, level + 1);
            calculateDisplay(head.right, level + 1);
        }
    }
    public static int evalDepth(TreeNode head, int count) {
        if(head != null) {
            count++;
            nodeCount++;
            int countL = evalDepth(head.left, count);
            int countR = evalDepth(head.right, count);
            if(countL > countR) count = countL;
            else count = countR;
        }
        return count;
    }
}
