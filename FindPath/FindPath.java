import java.util.*;

public class FindPath {
    public static ArrayList<Integer> list;
    public static String path = "";
    public static Maze mm;
    public static boolean leads_to_exit(int commingfrom, int currentcell) {
        if(currentcell == mm.exit()) {
            //System.out.println(commingfrom + "->" + mm.exit() + " leads to exit");
            list.add(currentcell);
            return true;
        }
        for(int searchcell = 1; searchcell <= mm.exit(); searchcell++) {
            if((searchcell != commingfrom)&&(mm.connected(currentcell, searchcell))) {
                if(leads_to_exit(currentcell, searchcell)) {
                    System.out.println(currentcell + "->" + searchcell + " leads to exit");
                    list.add(currentcell);
                    return true;
                }
                else {
                    System.out.println(currentcell + "->" + searchcell + " does not lead to exit");
                    //continue;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("please enter an int: ");
        int inputInt = s.nextInt();
        MazeFactory factory = new MazeFactory();
        mm = factory.getMaze(inputInt);
        list = new ArrayList<Integer>();
        mm.diagram();
        //now mm refers to a specific Maze so you can use:

        //mm.exit(): returns an int that represents the node that is
        //the exit to the Maze

        //mm.entrance(): returns an int that represents the node that is
        //the entrance to the Maze

        //mm.connected(x,y): where x and y are integers. it returns
        //true if there is a direct connection between the cells with
        //those numbers, and false otherwise.  "Direct" means that you
        //can go from x to y or from y to x without passing through
        //any other node.
        if(leads_to_exit(0, mm.entrance())) {
            System.out.println("Path found");
            for(int k = list.size() - 1; k >= 0; k--) {
                path += list.get(k);
                if(k != 0) {
                    path += "->";
                }
            }
        }
        else {
            System.out.println("0->" + mm.entrance() + " does not lead to exit");
            System.out.println("Path NOT found");
        }
        System.out.println(path);
    }
}
