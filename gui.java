package JAVA;
import javax.swing.JOptionPane;//JOptionPane is a class in the Java Swing library
//that provides a simple way to create pop-up dialog boxes for user interaction
public class gui {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter Your Name");
		JOptionPane.showMessageDialog(null,"Hello"+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age ?"));
		JOptionPane.showMessageDialog(null,"Your age is "+ age);
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height ?"));
		JOptionPane.showMessageDialog(null,"Your height is "+ height);
		
		
	}

}
