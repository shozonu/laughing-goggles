import java.util.*;
//this version of the program fails the testProgram for some reason
//but it works correctly, as far as I can tell, and produces correct output
public class Binary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, max;
        System.out.print("enter number of digits: ");
        num = s.nextInt();
        System.out.print("enter maximum: ");
        max = s.nextInt();
        //initialize array to num size (in previous version)
        if(num >= 0) {
            //count up to num from 0, printing in binary
            countBinary(max, num);
        }
    }
    private static void countBinary(int target, int digits) {
        for(int i = 0; i <= target; i++) {
            int[] array = decToBinary(i);
            //print every element of array
            for(int z = array.length - digits; z < array.length; z++) {
                System.out.print(array[z]);
            }
            System.out.println();
        }
    }
    public static int[] decToBinary(int n) {
        int arr[] = new int[32];
        recursiveMod(arr, n, arr.length);
        return arr;
    }
    private static void recursiveMod(int[] binaryArray, int n, int pos) {
        binaryArray[--pos] = n % 2;
        n /= 2;
        if((n >= 0)&&(pos > 0)) {
            recursiveMod(binaryArray, n, pos);
        }
    }
}
