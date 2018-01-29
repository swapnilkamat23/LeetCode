/**
 * Author: Swapnil Kamat
 */

public class MinElementInSortedRotatedArray {

	/**
	 * Find the minimum element
	 * @param arr
	 * @return
	 */
	public int minElement(int[] arr){
		if(arr.length == 1)
			return arr[0];
		else{
			if(arr[0]<arr[arr.length-1])
				return arr[0];
			else
				return binarySearch(arr, 0, arr.length-1);
		}
	}
	
	/**
	 * Use binary search algorithm for O(logn) complexity
	 * @param arr
	 * @param start
	 * @param end
	 * @return
	 */
	public int binarySearch(int[] arr, int start, int end){
		if(start == end){
			return arr[start];
		}
		else if(start < end){
			int mid = (start + end)/2;
			if(arr[mid+1] < arr[mid]){
				return arr[mid+1];
			}
			else if(arr[mid] < arr[end] && mid-1>=0){
				return binarySearch(arr, start, mid-1);
			}
			else{
				return binarySearch(arr, mid+1, end);
			}
		}
		return -1;
	}
	
	public static void main(String args[]){
		MinElementInSortedRotatedArray obj = new MinElementInSortedRotatedArray();
		int[] arr = new int[]{7,8,2,3,4,5,6};
		System.out.println("Minimum element = " + obj.minElement(arr));
	}
	
}
