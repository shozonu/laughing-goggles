import java.util.*;
public class Demo {
    public static void main(String[] args) {
        //it just works
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
class ShiftSupervisor extends Employee {
    public double annualSalary;
    public double annualProductionBonus;
    ShiftSupervisor() {
        //blank
    }
    public void setAnnualSalary(double d) {
        annualSalary = d;
    }
    public void setAnnualProductionBonus(double d) {
        annualProductionBonus = d;
    }
    public double getAnnualSalary() {
        return annualSalary;
    }
    public double getAnnualProductionBonus() {
        return annualProductionBonus;
    }
}
class TeamLeader extends ProductionWorker {
    public double monthlyBonus;
    public int requiredTrainingHours;
    public int attendedTrainingHours;
    TeamLeader() {
        //blank
    }
    public void setMonthlyBonus(double d) {
        monthlyBonus = d;
    }
    public void setRequiredTrainingHours(int i) {
        requiredTrainingHours = i;
    }
    public void setAttendedTrainingHours(int i) {
        attendedTrainingHours = i;
    }
    public double getMonthlyBonus() {
        return monthlyBonus;
    }
    public int getRequiredTrainingHours() {
        return requiredTrainingHours;
    }
    public int getAttendedTrainingHours() {
        return attendedTrainingHours;
    }
}
