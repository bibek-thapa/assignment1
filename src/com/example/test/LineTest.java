package com.example.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.assignment.Line;
import com.example.assignment.Point;

public class LineTest {

	@Test
	public void testConstructor1() {
		Line l1 = new Line(2,3,4,5);
		assertEquals("[(2,3),(4,5)]", l1.toString());
	}
	
	
	@Test
	public void testConstructor2(){
		Line p=new Line(new Point(100,12), new Point(23,432));
		assertEquals("[(100,12),(23,432)]", p.toString()); 
	}
	
	@Test
	public void testSlope1() 
	{
		
		Line l1 = new Line(-1,4,2,-2);
		assertTrue(l1.getSlope()==-2);
		
	}
	
	@Test(expected = ArithmeticException.class)
	public void testSlope2(){
		Line p = new Line(2,3,2,5);
		p.getSlope();
		
	}
	
	@Test
	public void testDistance1() 
	{
		
		Line l1 = new Line(-1,1,3,4);
		assertTrue(l1.getDistance()==5.0);
		
	}
	
	@Test
	public void testDistance2() 
	{
		
		Line l1 = new Line(4,5,6,7);
		assertTrue(l1.getDistance()==2.8284271247461903);
		
	}
	
	
	
	@Test
	public void testMidPoint1() 
	{
		
		Line l1 = new Line(2,2,2,2);
		assertTrue(l1.getMidpoint().getX()==2);
		assertTrue(l1.getMidpoint().getY()==2);
		
	}
	
	@Test
	public void testmidpoint2(){
		Line l=new Line(5,7,7,5);
		Point p=new Point(9,0);
		assertFalse(p.equals(l.getMidpoint()));
	}
	
	@Test 
	public void testParallel1() 
	{
		Line p=new Line(-2,0,0,2);
		Line q=new Line(0,-2,2,0);
		assertTrue(p.parallelTo(q));	
	}
	
	
	@Test 
	public void testParallel2() 
	{
		Line p=new Line(-3,0,0,3);
		Line q=new Line(0,-3,3,0);
		assertTrue(p.parallelTo(q));
		
		
	}
	
	@Test
	public void toSring1(){
		Line p=new Line(0,0,0,0);
		assertEquals("[(0,0),(0,0)]",p.toString());
		
	}
	
	@Test
	public void toSring2(){
		Line p=new Line(9,10,11,12);
		assertEquals("[(9,10),(11,12)]",p.toString());
		
	}
	
	@Test
	public void testEquals1() 
	{
		Line l1 = new Line(4,5,6,7);
		Line l2= new Line(4,5,6,7);
		assertTrue(l1.equals(l2));
		
	}
	
	@Test
	public void testEquals2() 
	{
		Line l1 = new Line(4,5,6,7);
		Line l2= new Line(100,101,102,103);
		assertFalse(l1.equals(l2));
		
	}
	
	
	

	
	
	
}
