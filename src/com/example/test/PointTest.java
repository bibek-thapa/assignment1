package com.example.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.assignment.Point;

public class PointTest {

	@Test
	public void testconstructor1() {
		Point p = new Point();
		assertTrue(p.getX()==0);
		assertTrue(p.getY()==0);
		
	}
	
	@Test
	public void testConstructor2() 
	{
		Point p = new Point(5,10);
		assertTrue(p.getX()==5);
		assertTrue(p.getY()==10);
	}
	
	@Test
	public void testConstructor3() 
	{
		Point p = new Point("5,10");
		assertTrue(p.getX()==5);
		assertTrue(p.getY()==10);
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testConstructor4() 
	{
		
		new Point(" ");
	}
	
	@Test
	public void testConstructor5() 
	{
		Point p = new Point("5,10");
		Point q = new Point(p);
		assertTrue(q.getX()==5);
		assertTrue(q.getY()==10);
		
		
	}
	
	
	
	@Test(expected = NullPointerException.class)
	public void testConstructor6() 
	{
		
		Point p=null;
		Point q =  new Point(p);
	}
	
	
	
	
	@Test (expected = IllegalArgumentException.class)
	public void testStringConstructor() 
	{
		Point p = new Point("2,3,5");
		
		assertTrue(p.getX()==2);
		assertTrue(p.getY()==3);
		
		
		
	}
	
	@Test
	public void testPointotherConstructor() 
	{
		Point p1 = new Point(2,3);
		Point p2 = new Point(p1);
		assertTrue(p1.getX() == p2.getX());
		assertTrue(p1.getY()==p2.getY());
		
	}
	
	
	@Test
	public void testToString() 
	{
		
		Point p = new Point();
		assertTrue(p.toString().equals("(0,0)"));
	}
	
	@Test
	public void testToString1() 
	{
		Point p1 = new Point(5,10);
		
	assertTrue(p1.toString().equals("(5,10)"));
	}
	
	@Test
	public void testToString2(){
	
	String str = "3,7";
	Point p2 = new Point(str);
	assertTrue(p2.toString().equals("(3,7)"));
	}
	
	
	@Test
	public void testToString3() 
	{
		Point p = new Point(5,10);
		Point q = new Point(p);
		assertTrue(q.toString().equals("(5,10)"));

		
	}
	
	@Test
	public void testEquals1() 
	{
		Point p = new Point(5,10);
		assertFalse(p.equals(null));

		
	}
	
	@Test
	public void testEquals2() 
	{
		Point p = new Point(5,10);
		Point q = new Point(5,10);
		assertTrue(p.equals(q));
	}
	
	@Test
	public void testEquals3() 
	{
		Point p = new Point(5,10);
		Point q = new Point(10,5);
		assertFalse(p.equals(q));

	}
	
	@Test
	public void testManhattan1() 
	{
		Point p = new Point(10,15);
		assertTrue(p.manhattanDistance(p)==0);


	}
	
	@Test
	public void testManhattan2() 
	{
		Point p = new Point(5,7);
		Point q = new Point(10,15);
		assertTrue(p.manhattanDistance(q)==13);

	}
	
	@Test
	public void testManhattan3() 
	{
		Point p = new Point(5,7);
		Point q = new Point(0,0);
		assertTrue(p.manhattanDistance(q)==12);

	}
	
	@Test
	public void testManhattan4() 
	{
		Point p = new Point(5,7);
		Point q = new Point(0,-5);
		assertTrue(p.manhattanDistance(q)==17);

	}
	
	
	
	
	
	

}
