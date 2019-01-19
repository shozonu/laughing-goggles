import java.util.*;
class Demo {
    public static void main(String[] args) {
        System.out.println("it just works");
    }
}
class Employee {
    private String name;
    private String number;
    private String hire;
    public Employee() {
        //stuff
    }
    public void setName(String s) {
        name = new String(s);
    }
    public void setNumber(String s) {
        number = new String(s);
    }
    public void setHire(String s) {
        hire = new String(s);
    }
    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }
    public String getHire() {
        return hire;
    }
}
class ProductionWorker extends Employee {
    private int shift;
    private double payRate;
    public ProductionWorker() {
        //stuff
    }
    void setShift(int i) {
        shift = i;
    }
    void setPayRate(double d) {
        payRate = d;
    }
    int getShift() {
        return shift;
    }
    double getPayRate() {
        return payRate;
    }
}
