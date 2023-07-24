package Recursion_array;

public class Linear_search {
	static boolean search(int [] arr,int idx,int target) {
		if(idx>=arr.length) {
			return false;
		}
		if(arr[idx]==target) {
			return true;
		}
		if(search(arr, idx+1, target)){
			return true;
		}else {
			return false;
		}
		
		 
	}
	public static void main(String[] args) {
		int [] arr= {2,15,6,9,8};
		System.out.println(search(arr, 0, 8));
		
	}

}
