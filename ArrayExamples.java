package mil.navy.cetars.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayExamples implements Comparator{
	//Declarations of single dimension arrays
	Double[] doubleArr;
	int []intArr;
	String argv[];
	
	//Instantiation - creates an array that can hold 10 doubles
	
	Double[] args = new Double[10];
	
	//Declaration of multidimensional arrays
	Double[][] twoDArr;
	int [][] myArr;
	Object []arr[];
	
	
	
	/**
	 * This is an example of a method header
	 * 
	 * TestOne will declare, instantiate, initialize and then loop over the array
	 * 
	 * @return void
	 * 
	 * @param null
	 * 
	 * 
	 */
	public void testOne() {
		char cArr[] = new char[5];//declaration and instantiation
		//Initialize below
		cArr[0] = 'A';
		cArr[1] = 'r';
		cArr[2] = 'r';
		cArr[3] = 'a';
		cArr[4] = 'y';
		
		//Traversing with the traditional loop
		//for(int i = 0;i < cArr.length;i++)
		for(int i = 0; //declare and initialize a counter (can be done before the loop)
				i < cArr.length; //set a condition to stop. 'length' is  a property (not method) of an array
				i++) {			 //increment i by 1. Can also use i-- to decrement.
			System.err.println(cArr[i]);
		}
	}
	
	public void testTwo(String[] sArr) {//passing an array into the method
		//Loop using the enhanced for loop
		for(String str: sArr) {
			System.err.println(str + " ");//Note print vs println
		}
		
	}
	
	public void testThree() {
		int[] arr = this.getArray();
		//System.err.println("length = " + arr.length);
		System.err.println("How big is the array? "+ arr.length);
		for(int i=0; i<= arr.length; i++)//No brackets!!! Bad
			System.err.println(arr[i]);
		
	}
	
	private int[] getArray() {
		return new int[] {5,4,3,2,1};//return an anonymous array
	}
	
	//2D arrays and nested loops
	public void testFour() {
		int[][] twoD = new int[3][];
			twoD[0] = new int[2];
			twoD[1] = new int[3];
			twoD[2] = new int[1];
		for(int i=0; i<twoD.length; i++) {
			for(int j = 0; j < twoD[i].length; j++) {
				System.err.print(twoD[i][j] + " ");
			}
			System.err.println();
		}
	}
	
	//Cloning and Copy
	public void testFive() {
		//Copy
		char[] copyFrm = {'A','B','C','X','Y','Z'};
		char[] copyTo = new char[4];
		char[] allCopy = new char[6];
		
		
		
		//Use System
		System.arraycopy(copyFrm, 3, copyTo, 0, 2);
		
		//print out copyTo
		System.err.println(String.valueOf(copyTo));
		
		//Complete copy
		System.arraycopy(copyFrm, 0, allCopy, 0, 6);
		

		System.err.println(String.valueOf(allCopy));
		
		System.err.println("Equal? ->" + (copyFrm == allCopy));
		/****************************************************/
		//Cloning
		char[] clone = new char[6];
		
		clone = copyFrm;
		
		//print out the values using "while"
		int i = 0;
		while(i<clone.length) {//Entry control
			System.err.println(clone[i]);
			i++;
		}
		//is the clone equal?
		
		System.err.println("Equal yet? ->" + (clone == copyFrm));
		
		
	}
	/**
	 * do while and compare
	 */
	public void testSix() {
		String[] myArray = {"Steve",
							"flag",
							"Florida",
							"Bob",
							"Book",
							"Java"};
		int i = 0;
		String flag = "zip";
		do {
			System.err.println("Comparing " + myArray[i] + " with " + flag);
			i++;//remove for demo
		}while(compare(myArray[i-1],flag) != 0);//Exit control
		/*
		int j = 0;
		while(compare(myArray[j],flag) != 0) {
			System.err.println("Comparing " + myArray[j] + " with " + flag);j++;
		}
		*/
	}
	
	public void testSeven() {
		ArrayList list = new ArrayList();//NOT AN ARRAY
		for(int i = 10; i > 0; i--) {
			list.add(new Integer(i));
		}
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.err.println(itr.next());
		}
		
	}
	
	public static void main(String[] argv) {
		ArrayExamples example = new ArrayExamples();
		//example.testOne();
		
		//How big is the array args and what is the index of "declaration"?
		String[] args = {"This","is","declaration,","instatiation,","and initialization","in one."};
		
		//example.testTwo(args);//passing an array
		
		//example.testTwo(new String[] {"Passing","an","anonymous","array"});
		
		//example.testThree();//methods returning arrays
		
		//example.testFour();
		
		//example.testFive();
		
		//example.testSix();
		
		//example.testSeven();

	}


	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return (o1.toString().length() - o2.toString().length());
	}

}
