
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Student First Name");
		String a = scan.next();
		System.out.println("The student First Name Is "+a);
		System.out.println("Enter Student last name");
		String b = scan.next();
		System.out.println("The student last name is "+b);
		System.out.println("Enter student age");
		int c = scan.nextInt();
		System.out.println("The student age is "+c);
		System.out.println("Enter student gender");
		String d = scan.next();
		System.out.println("The student gender is "+d);
		System.out.println("Is student is married? say True or False");
		boolean e=scan.nextBoolean();
		System.out.println("The student is married "+e);
		System.out.println("Enter student branch");
		scan.nextLine();
		String f =scan.nextLine();
		System.out.println("The student branch is "+f);
		System.out.println("Enter student height");
		int g = scan.nextInt();
		System.out.println("The student height is "+g);
		System.out.println("Enter student weight");
		int h = scan.nextInt();
		System.out.println("The student weight is "+h);
		}

}
