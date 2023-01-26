/**
 * This class allows you to create circle and find the area of them
 * @author Chase Hall
 * @version 1/25/23
 * CS131Lab0_1_COH
 * Spring 2023
 */
public class Circle {
	double radius;//radius will be used to find the area of the circle
	/**
	 * Initializes radius being 0
	 */
	public Circle() {
		this.radius=0;
	}// end constructor
	/**
	 * Allows you to Initializes any size radius you want
	 * @param radius the value of radius is based on the calling method
	 */
	public Circle(double radius) {
		this.radius=radius;
	}//end constructor
	/**
	 * Gets the area of the circle
	 * @return the new value area
	 */
	public double area() {
		double area = Math.PI*Math.pow(radius, 2);
		return area;
	}// end area
	/**
	 * tells you the radius
	 * @return the current value of radius
	 */
	public double getRadius() {
		return radius;
	}//end getRadius
	/**
	 * allows you to change the radius
	 * @param radius the value of radius to be set
	 */
	public void setRadius(double radius) {
		this.radius=radius;
	}//end setRadius
}// end class
