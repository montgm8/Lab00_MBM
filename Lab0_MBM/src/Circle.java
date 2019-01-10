
public class Circle {

	private double radius;
	
	
	
	public Circle() {
		
		radius = 1.0;
		
	}//end empty argument constructor
	
	
	
	public Circle(double radius) {
		
		setRadius(radius);
		//or this.setRadius(radius);
		
	}//end preferred constructor
	
	
	
	public double calculateArea() {
		
		double result = Math.PI * Math.pow(radius,  2);
		return result;
		
		//return Math.PI * Math.pow(radius,  2); // equivalent to 2 lines above
	}//end calculateArea


	
	
	/**
	 * This method returns the value of the radius.
	 * @return - radius (returns the value of the radius)
	 */
	public double getRadius() {
		return radius;
	}//end getRadius

	/**
	 * This method sets the value of the radius.
	 * The method bounds checks the radius > 1.0.
	 * @param radius
	 */
	public void setRadius(double radius) {
		
		if(radius >= 1.0)
			this.radius = radius; //let's java know that the instance variable and the radius variable we are using are the same thing. (refers to object)
		else 
			this.radius = 1.0;
		
		
	}//end setRadius


	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}//end toString 
	
	
	
}//end class
