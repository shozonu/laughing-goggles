import java.util.*;
public class PhoneNrTranslator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a phone number containing alphabetic characters: ");
        String input = s.nextLine();
        input = customReplace(input, 2, "A", "B", "C", "a", "b", "c");
        input = customReplace(input, 3, "D", "E", "F", "d", "e", "f");
        input = customReplace(input, 4, "G", "H", "I", "g", "h", "i");
        input = customReplace(input, 5, "J", "K", "L", "j", "k", "l");
        input = customReplace(input, 6, "M", "N", "O", "m", "n", "o");
        input = customReplace(input, 7, "P", "Q", "R", "S", "p", "q", "r", "s");
        input = customReplace(input, 8, "T", "U", "V", "t", "u", "v");
        input = customReplace(input, 9, "W", "X", "Y", "Z", "w", "x", "y", "z");
        System.out.println("The numeric version of that number is " + input);
    }
    public static String customReplace(String s, int num, String ... arr) {
        for(int i = 0; i < arr.length; i++) {
            s = new String(s.replace(arr[i], String.valueOf(num)));
        }
        return s;
    }
}
