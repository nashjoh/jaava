package JAVA;


public class arrays_2d {

	public static void main(String[] args) {
		// 2D array = an array of arrays.
		
	String [][] cars = {
						 {"camaro","corvatte","Silverado"},
						 {"Mustang","dodge","BMW"},
						 {"Ferrari","Lotus","Tesla"}
					   };
	
	for (int i = 0; i < cars.length;i ++ ) {
		System.out.println();
		for(int j = 0 ; j<cars[i].length; j ++) {
			System.out.print(cars[i][j]+" ");
		}
	}
	
			
	
		

	}

}
