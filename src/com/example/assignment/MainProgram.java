package com.example.assignment;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p = new Point(-1,4);
		Point q = new Point(2,-2);
		
		
		Point r = new Point("5,10");
		Point s = new Point(5,10);
		Line l = new Line(p,q);
		
		Line l1 = new Line(1,4,2,-2);
		Line l2 = new Line(-1,1,3,4);
		Line l3 = new Line(-2,0,0,2);
		Line l4 = new Line(0,-2,2,0);
		Line l5 = new Line(0,-2,2,0);
		
		
		//Prints the x and y from the constructor with the String
		System.out.println("X is "+ r.getX());
		System.out.println("Y is "+r.getY());
		
		
		//Sees the two objects are equal or not
		System.out.println("P"+p.toString()+" and Q"+q.toString()+" equals is "+p.equals(q));
		System.out.println("P"+p.toString()+"and Q" + q.toString()+"equals is "+p.equals(s));
		
		
		//Prints the Manhattan distance
		System.out.println("Distance between "+p.toString()+" and "+q.toString()+" is "+p.manhattanDistance(q));
		
		
		//Prints in the string form
		System.out.println("Point In String form "+ p.toString());
		
		
		System.out.println("SLOPE for" +l1.toString()+ " is "+ l1.getSlope());
		
		System.out.println("MIDPOINT for"+l1.toString()+" is " + "("+l1.getMidpoint().getX()+","+l1.getMidpoint().getY()+")");
		
		
		System.out.println("Distance between the points in line "+ l2.toString()+" is " + l2.getDistance());
		
		System.out.println("Two lines "+l1.toString()+" and "+l2.toString()+" are Parallel is " + l1.parallelTo(l2));
		System.out.println("Two lines "+l3.toString()+" and "+l3.toString()+" are Parallel is " + l3.parallelTo(l4));
		
		System.out.println("Two Lines "+l4.toString()+" and "+l5.toString()+ " are equal is  "+ l4.equals(l5));
		System.out.println("Two Lines "+l4.toString()+" and "+l5.toString()+ " are equal is  "+ l4.equals(l2));
		
		System.out.println("The midpoint  "+ l4.getMidpoint());
		System.out.println("Line in String form " +l1.toString());
		

		
		
		
		
				
		
		
		
	}

}
