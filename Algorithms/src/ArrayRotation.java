/**
 * Author: Swapnil Kamat
 */

public class ArrayRotation {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String args[]){
		int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10};
		int offset = 2;
		rotate(nums, offset);
		printArray(nums);
	}
	
	/**
	 * Implements juggling algorithm for rotation
	 * @param nums
	 * @param offset
	 */
	public static void rotate(int[] nums, int offset){
		int gcd = gcd(offset, nums.length);
		int temp;
		for(int i = 0; i<gcd; i++){
			temp = nums[i];
			int j = i;
			while(true){
				if(j+gcd < nums.length){
					nums[j] = nums[j+gcd];
					j = j+gcd;
				}
				else{
					nums[j] = temp;
					break;
				}
			}
		}
	}
	
	/**
	 * Compute GCD of offset and nums.length
	 * @param a
	 * @param b
	 * @return
	 */
	public static int gcd(int a, int b){
		if(b == 0){
			return a;
		}
		else{
			return gcd(b, a%b);
		}
	}
	
	/**
	 * Print array elements
	 * @param arr
	 */
	public static void printArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+"	");
		}
	}
}
