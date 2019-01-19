import java.util.*;
public class CourseGrades {
    public GradedActivity[] grades;
}
class GradedActivity {
    public double score;
    public String grade;
    public double getScore() {
        return score;
    }
    public String getGrade() {
        return grade;
    }
    public void setScore(double d) {
        score = d;
    }
    public void setGrade(String s) {
        grade = new String(s);
    }
}
class Lab extends GradedActivity {
    //lab
}
class PassFailExam extends GradedActivity {
    public gradeExam() {
        if(score >= 70.0) {
            setGrade("P");
        }
        else {
            setGrade("F");
        }
    }
}
class Essay extends GradedActivity {
    //essay
}
class FinalExam extends GradedActivity {
    //final
}
