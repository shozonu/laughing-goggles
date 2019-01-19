import java.util.*;

public class FindStudents {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner s = new Scanner(System.in);
        populateList(list);

        System.out.print("Enter the age (an int): ");
        int inputInt = s.nextInt();
        s.nextLine();
        System.out.print("Enter the city: ");
        String inputString = s.nextLine();
        //iterate through list for matching elements
        for(int i = 0; i < list.size(); i++) {
            //calls Student's display function if requirements are met
            if((list.get(i).getAge() >= inputInt) &&
            list.get(i).getCity().equals(inputString))
            list.get(i).display();
        }
    }
    public static void populateList(ArrayList<Student> inList) {
        inList.add(new Student("Diann", "Palomba", 23, "Los Angeles"));
        inList.add(new Student("Abram", "anwart", 45, "Tarnov"));
        inList.add(new Student("Addie", "Abdullah", 19, "Mill City"));
        inList.add(new Student("Alex", "Audette", 31, "Seven Springs"));
        inList.add(new Student("Alfreda", "Dever", 10, "Beasley"));
        inList.add(new Student("Alia", "Pittman", 59, "Edmonston"));
        inList.add(new Student("Andera", "Pegram",  37, "Hickory Hills"));
        inList.add(new Student("Audrey", "Ramsdell", 48, "North Judson"));
        inList.add(new Student("Beverly", "Espey", 58, "Santa Ana"));
        inList.add(new Student("Billi", "Schillinger", 14, "New Paris"));
        inList.add(new Student("Britney", "Barco", 34, "Lorimor"));
        inList.add(new Student("Brittny", "Brownstein", 26, "Los Angeles"));
        inList.add(new Student("Caitlyn", "Colin", 6, "Palm Springs"));
        inList.add(new Student("Camie", "Freeburg", 32, "Tarnov"));
        inList.add(new Student("Chadwick", "Gram", 54, "Mill City"));
        inList.add(new Student("Cherry", "Curnutte", 40, "Seven Springs"));
        inList.add(new Student("Corrie", "Lor", 51, "Beasley"));
        inList.add(new Student("Cristine", "Catanzaro", 35, "Edmonston"));
        inList.add(new Student("Dagmar", "Koziel", 57, "Hickory Hills"));
        inList.add(new Student("Danyelle", "Diener", 28, "North Judson"));
        inList.add(new Student("Darby", "Defazio", 52, "Santa Ana"));
        inList.add(new Student("Dario", "Volz", 17, "New Paris"));
        inList.add(new Student("Daysi", "Deveau", 43, "Lorimor"));
        inList.add(new Student("Diann", "Palomba", 23, "Los Angeles"));
        inList.add(new Student("Dwight", "Dambrosio", 56, "Palm Springs"));
        inList.add(new Student("Elizebeth", "Yerger", 15, "Tarnov"));
        inList.add(new Student("Elwanda", "Sprankle", 12, "Mill City"));
        inList.add(new Student("Ena", "Ellefson", 21, "Seven Springs"));
        inList.add(new Student("Ernesto", "Pouncy", 38, "Beasley"));
        inList.add(new Student("Eugenie", "Osier", 55, "Edmonston"));
        inList.add(new Student("Forest", "Forst", 50, "Hickory Hills"));
        inList.add(new Student("Francine", "Faulkenberry", 9, "North Judson"));
        inList.add(new Student("Georgette", "Armstong", 8, "Santa Ana"));
        inList.add(new Student("Gordon", "Takahashi", 5, "New Paris"));
        inList.add(new Student("Hugh", "Hungerford", 16, "Lorimor"));
        inList.add(new Student("Irma", "Igoe", 33, "Los Angeles"));
        inList.add(new Student("Isaac", "Ingraham", 46, "Palm Springs"));
        inList.add(new Student("Jacqualine", "Tabon", 13, "Tarnov"));
        inList.add(new Student("Janella", "Witherite", 29, "Mill City"));
        inList.add(new Student("Ji", "Jessen", 27, "Seven Springs"));
        inList.add(new Student("Jonah", "Gaulding", 44, "Beasley"));
        inList.add(new Student("Jonnie", "Jelley", 53, "Edmonston"));
        inList.add(new Student("Karisa", "Kogan", 49, "Hickory Hills"));
        inList.add(new Student("Keely", "Klump", 25, "North Judson"));
        inList.add(new Student("Kelsie", "Stagner", 24, "Santa Ana"));
        inList.add(new Student("Kena", "Keesling", 18, "New Paris"));
        inList.add(new Student("Kieth", "Kepler", 30, "Lorimor"));
        inList.add(new Student("Lachelle", "Lott", 60, "Los Angeles"));
        inList.add(new Student("Laquanda", "Lovins", 41, "Palm Springs"));
        inList.add(new Student("Laquita", "Weitzel", 36, "Tarnov"));
        inList.add(new Student("Leonardo", "Pergande", 11, "Mill City"));
        inList.add(new Student("Leta", "Landwehr", 7, "Seven Springs"));
        inList.add(new Student("Lezlie", "Letsinger", 39, "Beasley"));
        inList.add(new Student("Lola", "Levingston", 42, "Edmonston"));
        inList.add(new Student("Lorina", "Buster", 47, "Hickory Hills"));
        inList.add(new Student("Luciano", "Lahey", 20, "North Judson"));
        inList.add(new Student("Lucien", "Leroux", 22, "Santa Ana"));
        inList.add(new Student("Lucrecia", "Lefevre", 40, "New Paris"));
        inList.add(new Student("Lyman", "Laseter", 44, "Lorimor"));
        inList.add(new Student("Lynda", "Lowe", 27, "Los Angeles"));
        inList.add(new Student("Maragaret", "Morita", 48, "Palm Springs"));
        inList.add(new Student("Mardell", "Recio", 53, "Tarnov"));
        inList.add(new Student("Marguerite", "Marek", 56, "Mill City"));
        inList.add(new Student("Marianna", "Cesar", 41, "Seven Springs"));
        inList.add(new Student("Marilyn", "Papa", 23, "Beasley"));
        inList.add(new Student("Marlo", "Mcclaine", 50, "Edmonston"));
        inList.add(new Student("Marsha", "Godsey", 28, "Hickory Hills"));
        inList.add(new Student("Martha", "Mccuen", 38, "North Judson"));
        inList.add(new Student("Melody", "Horace", 31, "Santa Ana"));
        inList.add(new Student("Miki", "Mcilrath", 43, "New Paris"));
        inList.add(new Student("Nadene", "Noga", 37, "Lorimor"));
        inList.add(new Student("Paulita", "Schanz", 26, "Los Angeles"));
        inList.add(new Student("Pearlene", "Kerfien", 42, "Palm Springs"));
        inList.add(new Student("Rachele", "Ferree", 45, "Tarnov"));
        inList.add(new Student("Reginald", "Roepke", 14, "Mill City"));
        inList.add(new Student("Roman", "Rubalcaba", 32, "Seven Springs"));
        inList.add(new Student("Rosanne", "Drummond", 9, "Beasley"));
        inList.add(new Student("Salley", "Schneller", 8, "Edmonston"));
        inList.add(new Student("Sandi", "Stacey", 35, "Hickory Hills"));
        inList.add(new Student("Sang", "Bronstein", 54, "North Judson"));
        inList.add(new Student("Shena", "Schaner", 13, "Santa Ana"));
        inList.add(new Student("Shin", "Strawder", 25, "New Paris"));
        inList.add(new Student("Simone", "Murga", 11, "Lorimor"));
        inList.add(new Student("Spring", "Ulrey", 16, "Los Angeles"));
        inList.add(new Student("Stewart", "Pederson", 24, "Palm Springs"));
        inList.add(new Student("Sudie", "Sang", 59, "Tarnov"));
        inList.add(new Student("Susan", "Schnee", 34, "Mill City"));
        inList.add(new Student("Tabetha", "Cutsforth", 60, "Seven Springs"));
        inList.add(new Student("Tamie", "Thompkins", 18, "Beasley"));
        inList.add(new Student("Ted", "Tynan", 33, "Edmonston"));
        inList.add(new Student("Tillie", "Tedrow", 49, "Hickory Hills"));
        inList.add(new Student("Timika", "Tolson", 46, "North Judson"));
        inList.add(new Student("Torri", "Talor", 30, "Santa Ana"));
        inList.add(new Student("Trena", "Brotzman", 10, "New Paris"));
        inList.add(new Student("Trinity", "Lucian", 20, "Lorimor"));
        inList.add(new Student("Ty", "Kearl", 57, "Los Angeles"));
        inList.add(new Student("Wilford", "Ertel", 19, "Palm Springs"));
        inList.add(new Student("Wilhelmina", "Fiorillo", 36, "Tarnov"));
        inList.add(new Student("Willette", "Laury", 47, "Mill City"));
        inList.add(new Student("Yang", "Yao", 21, "Seven Springs"));
        inList.add(new Student("Yoshie", "Rogan", 58, "Beasley"));
    }
}

class Student {
    private String first;
    private String last;
    private String city;
    private int age;
    Student(String f, String l, int a, String c) {
        setFirst(f);
        setLast(l);
        setAge(a);
        setCity(c);
    }
    public void setFirst(String x) {
        first = new String(x);
    }
    public void setLast(String x) {
        last = new String(x);
    }
    public void setCity(String x) {
        city = new String(x);
    }
    public void setAge(int x) {
        age = x;
    }
    public String getFirst() {
        return first;
    }
    public String getLast() {
        return last;
    }
    public String getCity() {
        return city;
    }
    public int getAge() {
        return age;
    }
    public void display() {
        //prints this object's contents in correct format
        System.out.println(
        getLast() + ", " +
        getFirst() + " " + "age: " +
        getAge() + " " + "city: " +
        getCity());
    }
}
