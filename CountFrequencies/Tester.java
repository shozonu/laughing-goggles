import java.util.*;
public class Tester {
    public static void main(String[] args) {
        String str = "hey get out of here";
        String word;
        int wordstart = 0;
        int wordend = 0;
        wordend = str.indexOf(" ", wordstart);
        word = str.substring(wordstart, wordend);

        System.out.println(word + "|");
        System.out.println("start: " + wordstart);
        System.out.println("end: " + wordend);
    }
}
