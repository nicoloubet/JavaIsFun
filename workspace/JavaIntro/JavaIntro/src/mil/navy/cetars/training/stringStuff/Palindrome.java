package mil.navy.cetars.training.stringStuff;

public abstract class Palindrome {

	public abstract void palindromeFinder(String[] myArray); 
	public abstract void reverseString(String[] strArray);
	
	
	//Helper method to call in my driver class
	public void run(String[] array) {
		this.palindromeFinder(array);
		
	
	}
}
