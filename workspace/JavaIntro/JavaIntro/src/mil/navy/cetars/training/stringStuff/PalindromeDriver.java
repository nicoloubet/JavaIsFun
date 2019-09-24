package mil.navy.cetars.training.stringStuff;
import java.util.Arrays;

public class PalindromeDriver {

	/**
	 * Make and instance of MyStrings class
	 * Pass in given strings either Palindrome or not
	 * Call helper method and pass in the array of strings
	 */
	
	public static void main(String[] args) {
		
		String[] arr = {"radar", "shoot", "hannah"};
		
		MyStrings strings = new MyStrings();
		strings.run(arr);

	}

}
