/**
 * Author: Swapnil Kamat
 */

public class MaximumSubarray {
	
	public static int maxSubArray(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int prev = 0;
        int[] sum = new int[nums.length];
        int result = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            if(prev+nums[i]>nums[i]){
                sum[i] = prev+nums[i];
            }
            else{
                sum[i] = nums[i];
            }
            prev = sum[i];
            if(result<sum[i]){
                result = sum[i];
            }
        }
        return result;
    }
	
	public static void main(String args[]){
		int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		System.out.println("Max sum = " + maxSubArray(nums));
	}
}
