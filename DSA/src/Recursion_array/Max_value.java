package Recursion_array;

public class Max_value {
	static int max_value(int[] arr,int indx) {
		if(indx==arr.length-1) {//if there is only 1 element in an array
			return arr[indx];
		}
		if(arr[indx]>max_value(arr, indx+1))
			//or
			//math.max(arr[indx],subproblem)
		{
			return arr[indx];
		}
		return max_value(arr, indx+1);
		  
		
	}
	public static void main(String[] args) {
		int [] arr= {19,15,17,8,9};
		System.out.println(max_value(arr, 0));
	}

}
