package JAVA;

public class method {

	public static void main(String[] args) {
		// methods =  a block of code executed whenever it is called upon.
		 int x = 3;
		  int y = 4;
		  
		  int z = add(x,y);

		  System.out.println(z);
	}
	static int add(int x, int y) {
		  
		  int z = x + y;
		  return z;
	}
}
