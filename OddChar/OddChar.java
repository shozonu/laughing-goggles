import java.util.*;

class OddChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter a String: ");
        String inputString = s.nextLine();
        int sLength = inputString.length();
        if(sLength > 0) {
            for(int i = 0; i < sLength; i++) {
                if((i % 2) == 0) {
                    System.out.print(inputString.charAt(i));
                }
            }
            System.out.println();
        }
    }
}
