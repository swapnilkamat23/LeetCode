
public class SearchRotatedSortedArray {

	public int search(int[] nums, int target) {
        if(nums.length==0){
            return -1;
        }
        int result = binarySearch(nums, 0, nums.length-1, target);
        return result;
    }
    
    public int binarySearch(int[] nums, int start, int end, int target){
        if(start==end){
            if(target == nums[start])
                return start;
        }
        else if(start < end){
            int mid = (start + end)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid]<=nums[end]){
                if(target > nums[mid] && target <= nums[end]){
                    return binarySearch(nums, mid+1, end, target);
                }
                else{
                    return binarySearch(nums, start, mid-1, target);
                }
            }
            else if(nums[start]<=nums[mid]){
                if(target>=nums[start] && target<nums[mid]){
                    return binarySearch(nums, start, mid-1, target);
                }
                else{
                    return binarySearch(nums, mid+1, end, target);
                }
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
    	SearchRotatedSortedArray obj = new SearchRotatedSortedArray();
    	int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
    	System.out.println(obj.search(nums, 1));
    }
	
}
