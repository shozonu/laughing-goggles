import java.util.*;

public class CountInts {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean exitFlag = false;
        int inputInt;
        System.out.println("Enter integers between 1 and 100.");
        System.out.println("Finish by entering 0: ");
        //start input loop
        do {
            inputInt = s.nextInt();
            //stop input loop if input was 0
            //nextInt allows the input of multiple integers seperated by space
            if(inputInt != 0) {
                //add integer to list only if between 1 and 100
                if((inputInt >= 1)&&(inputInt <= 100)) {
                    //add integer to list
                    list.add(inputInt);
                }
            }
            else {
                exitFlag = true;
            }
        }while(exitFlag == false);

        //if any items in list, display them
        if(list.isEmpty() != true) {
            //use ArrayList's built-in sort function.
            //pass null into argument to let it sort by natural order
            list.sort(null);
            int indexLast;
            for(int k = 0; k < list.size(); k = indexLast + 1) {
                //since list is sorted, same values are all next to each other
                //thus, number of instances of same value can be calculated
                indexLast = list.lastIndexOf(list.get(k));
                int count = (indexLast - k) + 1;
                if(count == 1) {
                    System.out.println(list.get(k) + " occurs " + count + " time");
                }
                else {
                    System.out.println(list.get(k) + " occurs " + count + " times");
                }
                //k is set to after the last index of the value
                //this allows loop to skip over the duplicates
            }
        }
    }
}
