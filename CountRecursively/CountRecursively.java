import java.util.*;
public class CountRecursively {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int inputInt;
        System.out.print("enter an integer: ");
        inputInt = s.nextInt();
        recursiveSub(inputInt);
    }
    private static int recursiveSub(int num) {
        if(num >= 0) {
            System.out.println(num);
            return recursiveSub(num - 2) - num;
        }
        return num;
    }
}
