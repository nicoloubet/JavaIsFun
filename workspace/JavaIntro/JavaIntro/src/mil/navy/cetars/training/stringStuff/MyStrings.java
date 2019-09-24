package mil.navy.cetars.training.stringStuff;
import java.util.Arrays;



public class MyStrings extends Palindrome {

	
	// NOTE! Method should only execute one task. DO NOT try and over load the method with more than one task.
	 
	
	
	
	/**
	 * The result of calling this public method will be output to the console of every word that is a Palindrome.
	 * @return void 
	 * @param String[]
	 */
	
	@Override
	public void palindromeFinder(String[] myArray) {
		
}
	
	
	
	//Reverse the string and compare
	@Override
	public void reverseString(String[] strArray) {
		
	
	String reverse = "";
		for(int i = strArray.length-1; i > -1; i--) {
			reverse = (reverse + strArray[i]);
		}
			
			if (strArray.equals(reverse))
		         System.out.println(strArray+" is a palindrome");
		      else
		         System.out.println(strArray+" is not a palindrome");
		}
			
			//store current string in a variable and compare to reversed string
			//Compare if they match. If they match then it is a palindrome.
	}
	
	
	
	
	
	
	
	

