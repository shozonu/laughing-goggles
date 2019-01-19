import java.util.*;
class AddNumbers {
    public static final String regex = "(?=[+-])";
    //with this regex, string split should return [+-n1] and [+-n2+-n3+-n4...]
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter numbers: ");
        String input = s.nextLine();
        //remove all white space from input
        input = new String(input.replaceAll("\\s", ""));
        System.out.print("result: " + recursiveSumString(input));
    }
    public static int recursiveSumString(String arg) {
        //split input string into the left-hand coefficient and the rest
        String[] split = arg.split(regex, 2);
        if(split.length > 1) {
            return Integer.valueOf(split[0]) + recursiveSumString(split[1]);
        }
        else {
            //if is the only coefficient left
            return Integer.valueOf(split[0]);
        }
        //Integer.valueOf() automatically evaluates plus/minus,
        //returning the correct integer value.
    }
}
