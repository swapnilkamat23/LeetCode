/**
 * Author: Swapnil Kamat
 */

import java.util.*;

public class TwoSum {
	
	/**
	 * Computes TwoSum
	 * @param nums
	 * @param target
	 * @return
	 */
    public static int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> diff = new Hashtable<Integer, Integer>();
        int[] res = new int[2];
        for(int i=0; i < nums.length; i++){
            if(diff.containsKey(nums[i])){
                res[0] = diff.get(nums[i]);
                res[1] = i;
                break;
            }
            else{
            	// store complement of current number in hashmap with respect to the target 
                diff.put(target-nums[i],i);
            }
        }
        return res;
    }
    
    /**
     * Main Method
     * @param args
     */
    public static void main(String args[]){
    	
    	int[] nums = new int[]{1, 3, 6, 2, 8, 7, 9};
    	int target = 10;
    	int[] result = twoSum(nums, target);
    	System.out.println("The numbers are: " + nums[result[0]] + " and " + nums[result[1]]);
    }
}