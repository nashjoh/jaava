package JAVA;

public class overloaded_constructors {

	public static void main(String[] args) {
		// overloaded constructors = multiple constructors within the same name,
		//							 but have different parameters
		//							 name + parameter = signature

	pizza pizza = new pizza ("thicc crust ","tomato","mozzarella","pepperoni");	
		
		System.out.println("Here is your pizza ingredients :");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
	}

}
