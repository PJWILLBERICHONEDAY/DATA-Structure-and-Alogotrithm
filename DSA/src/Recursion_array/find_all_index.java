package Recursion_array;

public class find_all_index {
	static void find_index(int [] a,int target, int idx) {
		//Base case
		if(idx>=a.length) {
			return;
		}
		//self work
		if(a[idx]==target) {
			System.out.println(idx);
		}
		//recursive work
		find_index(a, target, idx+1);
	}
	public static void main(String[] args) {
		int [] arr= {1,2,5,2,4,2,9};
		find_index(arr, 2, 0);
	}
 
}
