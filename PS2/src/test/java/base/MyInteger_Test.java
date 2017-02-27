package base;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyInteger_Test {

	@Test
	public void testOdd() {
		MyInteger test1 = new MyInteger(1);
		MyInteger test2 = new MyInteger(2);
		MyInteger test3 = new MyInteger(0);
		
		assertEquals(true,test1.isOdd());
		assertEquals(false,test2.isOdd());
		assertEquals(false,test3.isOdd());
		
		assertEquals(true,MyInteger.isOdd(1));
		assertEquals(false,MyInteger.isOdd(2));
		assertEquals(false,MyInteger.isOdd(0));
		
		assertEquals(true,MyInteger.isOdd(test1));
		assertEquals(false,MyInteger.isOdd(test2));
		assertEquals(false,MyInteger.isOdd(test3));
	}
	
	@Test
	public void testEven() {
		MyInteger test1 = new MyInteger(1);
		MyInteger test2 = new MyInteger(2);
		MyInteger test3 = new MyInteger(10);
		
		assertEquals(false,test1.isEven());
		assertEquals(true,test2.isEven());
		assertEquals(true,test3.isEven());
		
		assertEquals(false,MyInteger.isEven(1));
		assertEquals(true,MyInteger.isEven(2));
		assertEquals(true,MyInteger.isEven(10));
		
		assertEquals(false,MyInteger.isEven(test1));
		assertEquals(true,MyInteger.isEven(test2));
		assertEquals(true,MyInteger.isEven(test3));
	}
	
	@Test
	public void testPrime() {
		MyInteger test1 = new MyInteger(1);
		MyInteger test2 = new MyInteger(2);
		MyInteger test3 = new MyInteger(10);
		MyInteger test4 = new MyInteger(101);
		MyInteger test5 = new MyInteger(92);
		MyInteger test6 = new MyInteger(7);
		
		assertEquals(false,test1.isPrime());
		assertEquals(true,test2.isPrime());
		assertEquals(false,test3.isPrime());
		assertEquals(true,test4.isPrime());
		assertEquals(false,test5.isPrime());
		assertEquals(true,test6.isPrime());
		
		assertEquals(false,MyInteger.isPrime(1));
		assertEquals(true,MyInteger.isPrime(2));
		assertEquals(false,MyInteger.isPrime(10));
		assertEquals(true,MyInteger.isPrime(101));
		assertEquals(false,MyInteger.isPrime(92));
		assertEquals(true,MyInteger.isPrime(7));
		
		assertEquals(false,MyInteger.isPrime(test1));
		assertEquals(true,MyInteger.isPrime(test2));
		assertEquals(false,MyInteger.isPrime(test3));
		assertEquals(true,MyInteger.isPrime(test4));
		assertEquals(false,MyInteger.isPrime(test5));
		assertEquals(true,MyInteger.isPrime(test6));
		
	}
	
	@Test
	public void testEqual(){
		MyInteger test1 = new MyInteger(1);
		MyInteger test2 = new MyInteger(2);
		MyInteger test3 = new MyInteger(1);
		
		assertEquals(true,test1.equals(test3));
		assertEquals(false,test1.equals(test2));
		assertEquals(true,test1.equals(1));
		assertEquals(false,test1.equals(2));
	}
	

}
