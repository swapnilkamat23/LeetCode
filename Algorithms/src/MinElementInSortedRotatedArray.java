
public class MinElementInSortedRotatedArray {

	public int minElement(int[] arr){
		if(arr.length == 1){
			return arr[0];
		}
		else if(arr[0]<arr[arr.length-1]){
			return arr[0];
		}
		int result = binarySearch(arr, 0, arr.length-1);
		return result;
	}
	
	public int binarySearch(int[] arr, int start, int end){
		if(start < end){
			int mid = (start + end)/2;
			if(mid-1>=0 && mid+1<arr.length){
				if(arr[mid+1]<arr[mid]){
					return arr[mid+1];
				}
				else if(arr[mid-1]>arr[mid]){
					return arr[mid];
				}
				else if(arr[])
			}
		}
		
		return arr[start];
	}
	
}
