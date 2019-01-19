import java.util.Scanner;
public class FindPath {

    public static String path = "";
    public static Maze mm;
    public static boolean leads_to_exit(int commingfrom, int currentcell){
        //write your code here
        //remember this method must return either true or false
    }
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter an int: ");
        int ll = input.nextInt();
        //the integer read from the user determines which Maze is
        //going to be solved
        
        MazeFactory factory = new MazeFactory();
        //the Maze factory creates a different Maze for each integer
        mm = factory.getMaze(ll);
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
        
        if (leads_to_exit(0,1)){
            System.out.println("Path found" );
            path = path + "" + mm.exit();
        }else {
            System.out.println("Path NOT found" );
        }
        System.out.println(path);
        
    }
}
