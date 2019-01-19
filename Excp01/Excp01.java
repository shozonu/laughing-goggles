import java.util.*;
public class Excp01 {
    public static void main(String[] args) {
        try {
            myMethod();
        }
        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public static boolean isOnlyInteger(String arg) {
        //returns true if arg contains digits and nothing else
        if(arg.matches("^-?\\d+$")) return true;
        else return false;
    }
    public static void myMethod() throws IllegalArgumentException {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("enter nr of integers (max 10) to be processed: ");
        while(true) {
            //loops input until integer is valid and within range
            String input = s.nextLine();
            if(isOnlyInteger(input)) {
                n = Integer.parseInt(input);
                if((n > 0) && (n < 10)) {
                    break;
                }
                System.out.print("out of bounds, ");
            }
            System.out.print("try again, enter an int: ");
        }
        //get integers for n integers
        System.out.println("ok, now lets loop " + n + " times");
        int[] x = new int[n];
        for(int i = 0; i < n; i++) {
            //for each integer in x
            System.out.print("enter an int: ");
            String input = s.nextLine();
            //check if input is integer format
            if(isOnlyInteger(input)) {
                //add integer to current x
                x[i] = Integer.parseInt(input);
                if((x[i] < 0) || (x[i] > 100)) {
                    //if x is outside bounds, throw exception
                    throw new IllegalArgumentException(
                    new String("Exception thrown--number: "
                    + Integer.toString(x[i])));
                }
                //if not outside bounds, continue asking for integers
            }
            else {
                //if not a valid format, repeat input
                System.out.print("try again, ");
                //decrement counter to repeat in current index
                i--;
            }
        }
        //calculate average
        double avg = 0;
        for(int k : x) {
            avg += k;
        }
        avg /= n;
        System.out.println("average is: " + avg);
        System.out.print("enter an integer less than 200: ");
        while(true) {
            //loops input until integer is valid and within range
            String input = s.nextLine();
            if(isOnlyInteger(input)) {
                n = Integer.parseInt(input);
                if(n < 200) {
                    System.out.println("integer was: " + n);
                    break;
                }
                System.out.print("out of bounds, ");
            }
            System.out.print("try again, enter an int: ");
        }
    }
}
