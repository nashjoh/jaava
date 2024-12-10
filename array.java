package JAVA;

public class array {

public static void main(String[] args) {
//		// array = used to store multiple values in a single variable
//		String[] cars = {"lotus","lambo","ferrari"};
//		cars[0] = "Mustang";
//		
//		System.out.println(cars[0]);
//	method 2
//	
	String[] cars = new String[3];
	
	cars[0] = "lotus";
	cars[1] = "lambo";
	cars[2] = "benz";
	
	//System.out.println(cars);
	
	//for loop
	
	for(int i = 0 ; i <cars.length; i++) {
	System.out.println(cars[i]);
	}
	}

}
