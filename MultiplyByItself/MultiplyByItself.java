import java.util.*;
public class MultiplyByItself {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, n;
        System.out.print("enter an integer: ");
        x = s.nextInt();
        System.out.print("enter another integer: ");
        n = s.nextInt();
        if(n >= 0) {
            System.out.println(recursiveMult(x, n));
        }
    }
    private static int recursiveMult(int x, int n) {
        if(n > 0) {
            return recursiveMult(x, n - 1) * x;
        }
        return 1;
    }
}
