package Recursion_array;

public class IsSorted {
	static boolean isSort(int[] arr,int idx) {
		//basecase
		if(idx==arr.length-1) {
			return true;
		}
		
		//self work
		if(arr[idx]>arr[idx+1]) {
			return false;
			
		}
		
		return isSort(arr, idx+1);
		
	}
	public static void main(String[] args) {
		int[] arr= {1,4,5,9};
		if(isSort(arr, 0)) {
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		
	}

}
