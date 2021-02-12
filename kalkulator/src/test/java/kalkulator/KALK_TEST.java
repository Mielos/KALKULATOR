package kalkulator;

import static org.junit.Assert.*;

import org.junit.Test;

public class KALK_TEST {

	
	//dodawnie 
		@Test
		public void AddTwoPostitiveNumber() {
			assertEquals(5,KALK.add(2,3));
		//	assertEquals(5,KALK.add(2,2)); //blad
		} 
		@Test
		public void AddTwoNegativeNumber() {
			assertEquals(-5,KALK.add(-2,-3));
			//assertEquals(-5,KALK.add(-2,-2));//blad
		} 
		//mnozenie
		@Test
		public void MultiplyTwoPositive() {
			assertTrue(KALK.multiply(87,34)>0);
			//assertTrue(KALK.multiply(87,34)<0);//blad
		}
		
		@Test
		public void MultiplyTwoNegativee() {
			assertTrue(KALK.multiply(-87,-34)>0);
			//assertTrue(KALK.multiply(-87,-34)<0); //blad
		}
		
		
		
		//dzielenie 
		
		@Test
		public void DivideZero() {
			assertThrows(ArithmeticException.class,()->KALK.divide(5,0));//blad
		}
		
		
		@Test
		public void Divide()
		{
			assertThrows(ArithmeticException.class,()->KALK.divide(6,3));
		}
		
		
		//odejmowanie
		
		@Test
		public void MinusTwoPostitiveNumber() {
			assertEquals(5,KALK.add(20,15));
			//assertEquals(3,KALK.add(8,2)); //blad
		} 
		
		@Test
		public void MinusTwoNegativeNumber() {
			assertEquals(-5,KALK.add(-20,-15));
			assertEquals(3,KALK.add(-8,-2)); //blad
			
		} 

}
