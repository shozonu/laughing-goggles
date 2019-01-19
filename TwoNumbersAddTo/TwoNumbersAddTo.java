import java.util.*;

public class TwoNumbersAddTo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int limit = 20;
        int inputInt;
        int goal;
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean exitFlag = false;

        System.out.print("enter goal: ");
        goal = s.nextInt();
        System.out.println("enter at most 20 integers, end with 0:");
        //input loop
        do {
            inputInt = s.nextInt();
            if(inputInt > 0) {
                list.add(inputInt);
            }
            else{
                exitFlag = true;
            }
            if(list.size() >= 20) {
                //if capacity was reached in this interation, stop accepting input
                exitFlag = true;
            }
        }while(exitFlag == false);
        //if there were any integers added to list, evaluate which numbers add
        if(list.size() > 0) {
            //a + b = goal
            //if the the numbers sum to the goal, print
            for(int i = 0; i < list.size(); i++) {
                //iterate first operand
                for(int k = 0; k < list.size(); k++) {
                    //iterate second operand as long as the index is not identical
                    if(k != i) {
                        if(list.get(i) + list.get(k) == goal) {
                            System.out.println(list.get(i) + " + " + list.get(k) + " = " + goal);
                        }
                    }
                }
            }
        }
        //end of main
    }
}
