package test.java;


import static org.junit.Assert.*;

import org.junit.Test;

import main.java.SortDemoData;

public class SortDemoTest{
	SortDemoData data = new SortDemoData();

	/**
	* testNewAccountsType checks for valid input types in the 1st parameter
	*/
	@Test
	public void testNumber() {
	   data.initializeArray("20");
	   assertTrue(data.myArray.length == 20);
	   
	   data.initializeArray("30");
	   assertTrue(data.myArray.length == 30);
	   
	   data.initializeArray("0");
	   assertTrue(data.myArray.length == 0);
	}


	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test (expected=java.lang.NegativeArraySizeException.class)
	public void negativeArraySize() {
	    data.initializeArray("-20");
	    assertTrue(data.myArray.length == -20);
	}
	
	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test (expected=java.lang.NumberFormatException.class)
	public void NonIntegerValue() {
	    data.initializeArray("5.5 7.5 9.0");  
	}
	
	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test (expected=java.lang.NumberFormatException.class)
	public void NoNumber() {
	    data.initializeArray("4 x 9 y 1");
	}
	
	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test
	public void SameNumber() {
	    data.initializeArray("70 50 30 100 20 10");  
	    
	    SortDemoData data2 = new SortDemoData();
	    data2.initializeArray("70 50 30 100 20 10");
		for(int i=0; i<data.myArray.length;i++) {
			assertTrue(data.myArray[i].key == data2.myArray[i].key );
		}
	}

}