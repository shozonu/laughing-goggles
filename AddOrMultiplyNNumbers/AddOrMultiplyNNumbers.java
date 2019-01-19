import java.util.*;

class AddOrMultiplyNNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int inputInt;
        char inputChar;
        boolean quitFlag = false;

        do {
            System.out.print("enter an integer number: ");
            inputInt = s.nextInt();
            if(inputInt > 0) {
                System.out.print("enter either 'a' or 'm': ");
                inputChar = s.next().charAt(0);
                switch(inputChar) {
                case 'a':
                    System.out.println(recursiveAdd(inputInt));
                    break;
                case 'm':
                    System.out.println(recursiveMult(inputInt));
                    break;
                default:
                    break;
                }
            }
            else {
                quitFlag = true;
            }
        }while(quitFlag == false);
    }
    private static int recursiveAdd(int num) {
        if(num > 0) {
            return recursiveAdd(num - 1) + num;
        }
        return num;
    }
    private static int recursiveMult(int num) {
        if(num > 1) {
            return recursiveMult(num - 1) * num;
        }
        return num;
    }
}
