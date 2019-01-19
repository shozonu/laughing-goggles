import java.util.*;

class HelloJon {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input;

		System.out.print("enter your name: ");
		input = s.nextLine();
		System.out.println("hello " + input + "!");
	}
}
