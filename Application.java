/**
 * This class allows you to create circles and squares and get the area of them
 * @author Chase Hall
 * @version 1/25/23
 * CS131Lab0_1_COH
 * Spring 2023
 */
public class Application {
	/**
	 * Default
	 */
	Application(){
		
	}
/**
 * Main loop of application
 * @param args arguments of main method
 */
	public static void main(String[] args) {
		Square s1 = new Square(2);
		System.out.println("Square Area: "+s1.area());
		Circle c1 = new Circle(1);
		System.out.println("Circle Area: "+c1.area());

	}//end main

}//end class
