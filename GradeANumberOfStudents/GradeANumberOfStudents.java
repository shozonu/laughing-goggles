import java.util.*;

public class GradeANumberOfStudents {
    public static double bestScore = 0.0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int inputInt;

        System.out.print("Enter number of students: ");
        inputInt = s.nextInt();
        //if at least one student to be inputted
        if(inputInt > 0) {
            int capacity = inputInt;
            ArrayList<Student> list = new ArrayList<Student>(capacity);
            //prompt for input until capcity is reached
            for(int i = 0; i < capacity; i++) {
                //temporary variables
                double td;
                String ts;
                String tss;
                System.out.print("Enter score for student " + (i + 1) + ": ");
                td = s.nextDouble();
                s.nextLine();
                //check/update the highscore
                if(td > bestScore) {
                    bestScore = td;
                }
                System.out.print("Enter first name for student " + (i + 1) + ": ");
                ts = s.nextLine();
                System.out.print("Enter last name for student " + (i + 1) + ": ");
                tss = s.nextLine();
                //construct new Student object in-place in list
                list.add(new Student(td, ts, tss));
            }
            //print header using formatted print
            System.out.printf("%1$7s", "Student");
            System.out.printf("%1$9s", "First");
            System.out.printf("%1$9s", "Last");
            System.out.printf("%1$6s", "Score");
            System.out.printf("%1$6s", "Grade");
            System.out.println();
            //print all students using formatted print
            for(int k = 0; k < list.size(); k++) {
                System.out.printf("%1$7d", k + 1);
                System.out.printf("%1$9s", list.get(k).getFirst());
                System.out.printf("%1$9s", list.get(k).getLast());
                System.out.printf("%1$6.1f", list.get(k).getScore());
                System.out.printf("%1$6c", evaluateLetterGrade(list.get(k).getScore()));
                System.out.println();
            }
        }
    }
    private static char evaluateLetterGrade(double sc) {
        char letter = 'F';
        if(sc >= bestScore - 10.0) {
            letter = 'A';
        }
        else {
            if(sc >= bestScore - 20.0) {
                letter = 'B';
            }
            else {
                if(sc >= bestScore - 30.0) {
                    letter = 'C';
                }
                else {
                    if(sc >= bestScore - 40.0) {
                        letter = 'D';
                    }
                }
            }
        }
        return letter;
    }
}

class Student {
    private double score;
    private String first;
    private String last;
    public Student(double ss, String ff, String ll) {
        setScore(ss);
        setFirst(ff);
        setLast(ll);
    }
    public void setScore(double ss) {
        score = ss;
    }
    public void setFirst(String ff) {
        first = ff;
    }
    public void setLast(String ll) {
        last = ll;
    }
    public double getScore() {
        return score;
    }
    public String getFirst() {
        return first;
    }
    public String getLast() {
        return last;
    }
}
