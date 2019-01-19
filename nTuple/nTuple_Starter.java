import java.util.Scanner;
import java.util.ArrayList;
public class nTuple{
    /*
      1

      10

      (1)
      (1,1)
      (1,(2,3))

     */
    public boolean isINT;
    private int x;
    private ArrayList<nTuple> listOfnTuples = new ArrayList<nTuple>();
    
    //nTuple is an int
    public nTuple(int xx){
        isINT = true;
        x = xx;
    }
    
    //nTuple is a list of nTuples
    public nTuple(nTuple ...aa){
        isINT = false;
        for (nTuple nt : aa){
            listOfnTuples.add(nt);
        }
    }
    
    public String toString(){
        String str = "";
        return str;
    }
    
    public String flatten(){
        String str = "";
        return str;
    }
    
    public static void main(String [] aaa){
        Scanner input = new Scanner(System.in);
        int ii = 1;
        String ss;
        nTuple nt;
        nTupleFactory fact = new nTupleFactory();
        while (ii != 0){
            System.out.print("enter either toString or flatten and an int (end with 0): ");
            ss = input.nextLine();
            ii = input.nextInt();
            input.nextLine();
            if (ii != 0){
                nt = fact.getnTuple(ii);
                if (ss.equals("toString"))
                    System.out.println(nt);
                else
                    System.out.println(nt.flatten());
            }
        }
    }
}
