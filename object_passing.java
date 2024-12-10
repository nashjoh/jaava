package JAVA;

public class object_passing {

	public static void main(String[] args) {
		Garage garage = new Garage();
		car car1 = new car("BMW");
		car car2 = new car("porsche");
		
garage.park(car1);
garage.park(car2);

	}

}
