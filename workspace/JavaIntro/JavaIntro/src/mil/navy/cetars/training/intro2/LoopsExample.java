package mil.navy.cetars.training.intro2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class LoopsExample extends Loops {
	public LoopsExample(){
		
	}

	//All methods from Loops must be declared inside of LoopsExample with the same parameters
	//Must Override all methods from LoopsExample
	
	
	
	@Override
	public void forLoop(String[] myArray) {
		
		
		
		for(int i = myArray.length-1; i > -1; i--) {
			System.err.println(myArray[i]);
		
	}
		
		}
		
	@Override
	public void enhancedLoop(String[] myArray) {
		
		
		
		for(String arr : myArray) {
			System.err.println(arr);
			
		}
	}
	
	@Override
	public void whileLoop(String[] myArray, String str) {

		int j = 0;
		while(compare(myArray[j], str) != 0) {
			System.err.println("Comparing " + myArray[j] + " with " + str); j++;
		}
	
}
	@Override
	public void doWhileLoop(String[] myArray, String str) {
		
		int i = 0;
		do {
			System.err.println("Comparing " + myArray[i] + " with " + str ); i++;
			
		}while(compare(myArray[i-1], str) != 0);
		
	}

	
	@Override
	public void iterator(String[] myArray) {
		
		List<String> list = new ArrayList();
		for(int i = myArray.length-1; i >= 0; i--) {
			list.add(myArray[i]);
		}
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.err.println(itr.next());
		}
	}
		
		
		
	
	  public int compare(Object o1, Object o2) {
			return (o1.toString().length() - o2.toString().length());
		
	}







}










