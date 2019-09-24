package mil.navy.cetars.training.assignment7;
import java.util.Arrays;

public class ArrayRunner extends MaxMin{

	
	/**
	 * start() will take an int[] and the console will print out
	 * the minimum and maximum values in the array
	 * 
	 * Example output for int arr[] = {4, 27,-13,8,9,15};
	 * would be
	 * 
	 * Max = 27
	 * Min = -13
	 * 
	 * @param arr
	 */
	@Override
	public void findMaxMinValue(int[] nums) {
		
		Arrays.sort(nums);
		System.out.println("Maximum = " + nums[nums.length-1]);
		System.out.println("Minimum = " + nums[0]);
	}

	
	
	
	
	
}
