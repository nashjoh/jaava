package JAVA;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("what yah name?");
	String name = scanner.nextLine();
	
	System.out.println("what yah age? ");
	int age = scanner.nextInt();
	scanner.nextLine();//its for the next one if not put this the next one will be skipped.
	
	System.out.println("whatchu do? ");
	String job = scanner.nextLine();
	
	System.out.println("hello "+name);
	System.out.println("you are "+ age + " old! bruhh!");
	System.out.println(job + " mmm cool");
	
	
	}

}
