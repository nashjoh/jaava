package JAVA;
import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		// ArrayList = 	a resizable array. 
		//				Elements can be added and removed after compilation phase
		//				store reference data types

		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Pizza");
		food.add("noodle");
		food.add("soup");
		
		
		//some functions
		
		food.set(0, "pasta");
		food.remove(2);
		food.clear();
		
		for (int i = 0; i< food.size();i++) {
			System.out.println(food.get(i));
		}
		
		
		
		
		
		
		
		
	}

}
