package JAVA;
import java.util.*;
public class array_list_2d {

	public static void main(String[] args) {
		// 2D ArrayList = a dynamic list of lists
		//You can change the size of these lists during runtime.

		ArrayList<ArrayList<String>>groceryList = new ArrayList();
		
		
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("Pasta");
		bakeryList.add("Garlic bread");	
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomato");
		produceList.add("zucchini");	
		produceList.add("peppers");
		
		ArrayList<String>drinksList= new ArrayList();
		drinksList.add("vodka");
		drinksList.add("coffee");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		
		System.out.println(groceryList);
		
	}

}
