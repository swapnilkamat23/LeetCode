
public class MinElementInSortedRotatedArray {

	public int minElement(int[] arr){
		if(arr.length == 1)
			return arr[0];
		else{
			return binarySearch(arr, 0, arr.length-1);
		}
	}
	
	public int binarySearch(int[] arr, int start, int end){
		if(start == end){
			return arr[start];
		}
		else if(start <= end){
			
		}
		return -1;
	}
	
	public static void main(String args[]){
		MinElementInSortedRotatedArray obj = new MinElementInSortedRotatedArray();
		int[] arr = new int[]{7,8,1,2,3,4,5,6};
		System.out.println("Minimum element = " + obj.minElement(arr));
	}
	
}
