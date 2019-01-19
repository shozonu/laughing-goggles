import java.util.*;
public class SetOperations {
    public static boolean debug = false;
    public static void main(String[] args) {
        LinkedHashMap<String, String> A = new LinkedHashMap<String, String>();
        LinkedHashMap<String, String> B = new LinkedHashMap<String, String>();
        Scanner s = new Scanner(System.in);
        String input;
        boolean exit = false;
        do {
            //get user input for set A
            System.out.print("enter next element of first set (end with 0): ");
            input = s.nextLine();
            if("0".compareTo(input) != 0) {
                A.put(input, input);
            }
            else {
                exit = true;
            }
        } while(!exit);
        //reset flag
        exit = false;
        System.out.println("==============");
        do {
            //get user input for set B
            System.out.print("enter next element of second set (end with 0): ");
            input = s.nextLine();
            if("0".compareTo(input) != 0) {
                B.put(input, input);
            }
            else {
                exit = true;
            }
        } while(!exit);
        //print current values in sets
        System.out.println("set1: " + A.values().toString());
        System.out.println("set2: " + B.values().toString());
        //print result of evaluations
        System.out.println(evalUnion(A, B));
        System.out.println(evalDifference(A, B));
        System.out.println(evalIntersection(A, B));
    }
    public static String evalUnion(LinkedHashMap<String, String> Aa, LinkedHashMap<String, String> Bb) {
        //temporary map variable
        LinkedHashMap<String, String> result = new LinkedHashMap<String, String>(Aa);
        for(Map.Entry<String, String> entry : Bb.entrySet()) {
            //compare each map in Bb to each map in Aa,
            //add mappings if they dont't already exist
            result.put(entry.getKey(), entry.getValue());
        }
        return new String("The union of the two sets is " + result.values().toString());
    }
    public static String evalDifference(LinkedHashMap<String, String> Aa, LinkedHashMap<String, String> Bb) {
        LinkedHashMap<String, String> result = new LinkedHashMap<String, String>(Aa);
        for(Map.Entry<String, String> entry : Bb.entrySet()) {
            //compare each map in Bb to each map in Aa,
            //remove maps that exist in Aa
            result.remove(entry.getKey());
        }
        return new String("The difference of the two sets is " + result.values().toString());
    }
    public static String evalIntersection(LinkedHashMap<String, String> Aa, LinkedHashMap<String, String> Bb) {
        //start with uninitialized map this time
        LinkedHashMap<String, String> result = new LinkedHashMap<String, String>();
        for(Map.Entry<String, String> entry : Aa.entrySet()) {
            //compare each map from Aa to maps from Bb,
            //add maps to temporary map if Bb contains key from Aa
            if(Bb.containsKey(entry.getKey())) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return new String("The intersection of the two sets is " + result.values().toString());
    }
}
