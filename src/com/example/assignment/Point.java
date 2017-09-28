package com.example.assignment;

public class Point {

	private int x;
	private int y;
	
	/**
	 * Initializes a newly created Point object with x and y
	 * coordinates set to 0.
	 */
	public Point() {

	}
	
	/**
	 * Initializes a newly created Point object with the given 
	 * values.
	 * 
	 * @param x the x coordinate of this point
	 * @param y the y coordinate of this point
	 */
	public Point(int x, int y) {
		
		this.x = x;
		this.y = y;

	}
	
	/**
	 * Initializes a newly created Point object with the values 
	 * from the input string. Throws an IllegalArgumentException
 	 * if parameter str is a null reference or contains more 	 
	 * than two values; sets both instance variables to zero if
 	 * str contains nothing but space characters.  
	 * 
	 * @param str string containing values of coordinates, such 
	 *        as "10,20".
	 */
	public Point(String str) {
		
		String parts[] = str.split(",");
		
		if(str == null || (parts.length>2)) 
		{
			
			this.x=0;
			this.y=0;
			throw new IllegalArgumentException();
		}
		
		this.x=Integer.parseInt(parts[0]);
		this.y=Integer.parseInt(parts[1]);

	}
	
	/**
	 * Initializes a newly created Point object with the values 
	 * from the input Point object.
	 * 
	 * @param other a Point object used to initialize this Point 
	 * object
	 */
	public Point(Point other) {
		
		this.x 	= other.x;
		this.y	= other.y;

	}
	
	/**
	 * Returns the x coordinate of this Point object.
	 * 
	 * @return the x coordinate of this object.
	 */
	public int getX() {
		
		return x;
	}

	/**
	 * Returns the y coordinate of this Point object.
	 * 
	 * @return the y coordinate of this object.
	 */
	public int getY() {
		
		return y;
	}

	/**
	 * Returns a String object that represents this Point as, 
	 * for example, (5, 3) if x is 5 and y is 3.
	 * 
	 * @return a string representation of this Point's value.
	 */
	public String toString() {
		// TO DO
		return "("+x+","+y+")";
	}
	
	/**
	 * Compares this object to the other object. The result is 
	 * true if and only if the argument is not null and is a 
	 * Point object that contains the same values as this Point 
	 * object.
	 * 
	 * @param obj the object to compare with.
	 * 
	 * @return true if the objects are the same; false 
	 * otherwise.
	 */
	public boolean equals(Object other) {
		// TO DO
		boolean result = false;
		if(other != null && (other instanceof Point)) 
		{
			Point p = (Point)other;
			if(this.x == p.getX() && this.y == p.getY()) 
			{
				result = true;
			}
		}
		else 
		{
			result = false;
		}
			
		return result;
	}
	
	
	/**
	 * Returns the Manhattan distance between this Point object 
	 * and the other Point object.
	 * 
	 * Manhattan distance is the distance between two points if 
	 * you walk only in a horizontal or vertical direction.
	 * 
	 * @param other the other Point object
	 * 
	 * @return the Manhattan distance between this and other 
	 * Point objects.
	 */
	public int manhattanDistance(Point other) {
		// TO DO
		return Math.abs(this.x-other.getX())+Math.abs(this.y-other.getY());
	}

	
	
	

	
	
}