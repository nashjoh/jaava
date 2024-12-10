package JAVA;
import java.util.ArrayList;

public class for_each {

	public static void main(String[] args) {
		// for-each = 	traversing technique to iterate through the elements in an array/collection
		//				less steps, more readable
		//				less flexible

//		
//		String[] animals = {"cat","dog","mouse"};
		
		ArrayList<String> animals = new ArrayList<String>();
		 animals.add("cat");
		 animals.add("dog");
		 animals.add("mouse");
		
		for(String i : animals) {
			System.out.println(i );
		}
		
		
		
		
	}

}
