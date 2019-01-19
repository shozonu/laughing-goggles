import java.util.*;
public class VerifyBST {

    public static TreeNode tree;

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        System.out.print("please enter an int: ");
        int x = input.nextInt();
        TreeFactory factory = new TreeFactory();
        tree = factory.getTree(x);
        //if tree is BST print true, otherwise print false
        travel(tree, list);
        if(check(list)) {
            System.out.println("true");
        }
        else System.out.println("false");
    }
    public static void travel(TreeNode head, ArrayList<String> arr) {
        if(head.left != null) travel(head.left, arr);
        arr.add(head.item);
        if(head.right != null) travel(head.right, arr);
    }
    public static boolean check(ArrayList<String> arr) {
        String previous = "0";
        String current = "0";
        for(int i = 0; i < arr.size(); i++) {
            current = new String(arr.get(i));
            if(!(Integer.valueOf(current) >= Integer.valueOf(previous))) {
                return false;
            }
            else {
                previous = new String(arr.get(i));
            }
        }
        return true;
    }
}
