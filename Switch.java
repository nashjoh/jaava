package JAVA;

public class Switch {

	public static void main(String[] args) {
		// switch = statement that allows a variable to be 
		//tested for equality against a list of values.
		String day = "noodles";
		switch(day) {
		case"sunday":System.out.println("Its sunday");
		break;
		case"wednesday":System.out.println("Its wednesday");
		break;
		case"Friday":System.out.println("Its friday");
		break;
		default:System.out.println("Thats not a day bruh !");
		}

	}

}
