import java.util.*;
public class RoomSchedule {
    public int start;
    public int end;
    public int z;
    public RoomSchedule() {
        //empty
    }
    public RoomSchedule(int a, int b) {
        start = a;
        end = b;
        z = 1;
    }
    public boolean overlaps(RoomSchedule other) {
        if(other.z != this.z) {
            return false;
        }
        else if((other.start >= this.start) && (other.start <= this.end)) {
            return true;
        }
        else if((other.end <= this.end) && (other.end >= this.start)) {
            return true;
        }
        else if((other.start <= this.start) && (other.end >= this.end)) {
            return true;
        }
        else return false;
    }
    public void display() {
        System.out.print("(" + start + "," + end + ")");
    }
    public static boolean debug = false;
    public static final String lineRegex = "^(\\(\\d+,\\d+\\),)+\\(\\d+,\\d+\\)$";
    public static final String digitRegex = "\\D+";
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter all time intervals: ");
        //store input in string and eliminate whitespace
        String input = s.nextLine();
        input = new String(input.replaceAll("\\s*", ""));

        if(debug) System.out.println(input);
        if(isValidFormat(input)) {
            if(debug) System.out.println("Format: Valid");
            //split string into multiple strings of only nunbers
            String[] v = input.split(digitRegex);
            ArrayList<RoomSchedule> schedule = new ArrayList<RoomSchedule>();
            boolean valid = true;
            //populate RoomSchedule list by using numbers from string list
            //ignore first element in String[]
            for(int i = 1; i < v.length - 1; i+= 2) {
                //convert each number from String to int
                int start = Integer.valueOf(v[i]);
                int end = Integer.valueOf(v[i+1]);
                if(end < start) {
                    //check validity of numbers
                    valid = false;
                    break;
                }
                else {
                    schedule.add(new RoomSchedule(start, end));
                }
            }
            if(!valid) {
                //triggered by invalid numbers
                System.out.println("wrong format!");
            }
            else {
                //check compatibility of all elements of same zlevel.
                //if compatibility issue, escalate the zlevel of other element,
                //repeat until no need to escalate.
                //number of rooms needed is equal to zlevel
                if(debug) System.out.println("Number Range: Valid");
                //initialize zlevel
                int zlevel = 1;
                for(int current = 0; current < schedule.size(); current++) {
                    //iterate over each interval
                    if(debug) {
                        System.out.print(current + ": ");
                        schedule.get(current).display(); System.out.print(" | ");
                    }
                    boolean conflict = false;
                    do {
                        //iterate using this element until
                        //it no longer overlaps with same-zlevel elements
                        conflict = false;
                        for(int i = 0; i < schedule.size(); i++) {
                            if(i != current) {
                                //do not compare itself
                                if(debug) {
                                    schedule.get(i).display();
                                    System.out.print("@" + schedule.get(i).z);
                                    System.out.print(" ");
                                }
                                //compare other element, escalate other's
                                //zlevel if there is conflict
                                if(schedule.get(current).overlaps(schedule.get(i))) {
                                    if(++schedule.get(i).z > zlevel) {
                                        zlevel = schedule.get(i).z;
                                    }
                                    conflict = true;
                                    if(debug) System.out.print("->" + schedule.get(i).z + " ");
                                }
                            }
                        }
                        if(debug) System.out.print("| ");
                    }while(conflict);
                    if(debug) System.out.println();
                }
                System.out.println("minimum nr of rooms: " + zlevel);
            }
        }
        else {
            //triggered by invalid input string
            System.out.println("wrong format!");
        }
    }
    public static boolean isValidFormat(String arg) {
        //needs to follow format:
        //(a1,b1),(a2,b2),...(an,bn)
        //regex: ^(\(\d+,\d+\),)+\(\d+,\d+\)$
        // all escape characters require an additonal escape
        //to do: check each interval pair is valid
        return arg.matches(lineRegex);
    }
}
