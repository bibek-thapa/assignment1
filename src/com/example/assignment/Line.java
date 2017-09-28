package com.example.assignment;

public class Line {

	private Point p1, p2;

	/**
	 * Initializes a newly created Line object with the given 
	 * values.
	 * s
	 * @param x1 and x2 the x coordinates of p1 and p2 
	 * @param y1 and y2 the y coordinates of p1 and p2 
	 */
	public Line(int x1, int y1, int x2, int y2) {
		this.p1 = new Point(x1, y1);
		this.p2= new Point(x2,y2);

	}

	/**
	 * Initializes a newly created Line object with the values 
	 * from the two input Point objects.
	 * 
	 * @param p1 and p2 two Point objects used to initialize 
	 * this Line object
	 */
	public Line(Point p1, Point p2) {
		this.p1= p1;
		this.p2=p2;

	}

	/**
	 * Calculate the slope of this Line object using the  
	 * formula (y1 - y2)/(x1 - x2)
	 * 
	 * slope of a vertical line is undefined, that is, x1 and x2  
	 * are equal, throw an ArithmeticException 
	 *  
	 * @return the slope of this Line object
	 */
	public double getSlope() {
		// TO DO
		
		double slope = 0; 
		
		if(p1.getX() == p2.getX()) 
		{
			throw new ArithmeticException("Slope of vertical line is undefined");
		}
		else 
		{
			slope = (p1.getY()-p2.getY())/(p1.getX()-p2.getX());
		}
		
		
		return slope;
	}

	/**
	 * Calculate the distance between the two points of 
	 * this Line object 
	 * 
	 * @return the distance
	 */
	public double getDistance() {
		// TO DO
		
		double distance = 0;
		distance = Math.sqrt((p1.getX()-p2.getX())*(p1.getX()-p2.getX())+(p1.getY()-p2.getY())*(p1.getY()-p2.getY()));
		return distance;
	}

	/**
	 * Calculate the middle point of this Line object 
	 * 
	 * @return a Point object
	 */
	public Point getMidpoint() {
		// TO DO
		
		int xm = (p1.getX()+p2.getX())/2;
		int ym = (p1.getY()+p2.getY())/2;
		Point p1 = new Point(xm, ym);
		return p1;
	}
	
	/**
	 * ltwo lines are parallel if they have the same slope, or 
	 * if they are both vertical. Note that two slopes are the 
	 * same if their difference is very small.
	 *
	 * @param line the other Line object
	 *
	 * @return true if the objects are parallel; false
	 * otherwise.  
	 */ 
	public boolean parallelTo(Line line) {
		// TO DO
		boolean result=false;
		if(this.getSlope() == line.getSlope()) 
		{
			result = true;
			
		}
		
		
		return result;
	}

	/**
	 * Compares this object to the other object. The result is 
	 * true if and only if the argument is not null and is a 
	 * Line object with the same values as this Line object
	 * 
	 * @param obj the object to compare with.
	 * 
	 * @return true if the objects are the same; false 
	 * otherwise.
	 */
	public boolean equals(Object obj) {
		// TO DOboolean result = false;
		
		boolean result = false;
		if(obj!=null && (obj instanceof Line)) 
		{
			
			Line l1 = (Line)obj;
			if(this.p1.equals(l1.p1) && this.p2.equals(l1.p2)) 
			{
				
				result =  true;
			}
			
			
			
		}
		return result;
	}
	
	/**
	 * Returns a String object that represents this Line 
	 * 
	 * @return a string representation of this Line's value.
	 */
	public String toString() {
		return "[" + p1 + "," + p2 +"]";
	}
}
