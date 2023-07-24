package Recursion_array;

import java.util.ArrayList;

public class Array_list {
//	arr={4,4,5,6,4}
//	target=4
//	ans(arraylist)={0,1,3}
	static ArrayList<Integer> allIndices(int[] arr,int target,int idx){
		if(idx>=arr.length) {
			return new ArrayList<Integer>();//return empty arraylist
		}
		
		ArrayList<Integer> ans=new ArrayList<>();
		
		// Self work
		if(arr[idx]==target) {//ans->{0}
			ans.add(idx);
		}
		
		//recursive work
		ArrayList<Integer> Small_ans=allIndices(arr, target, idx+1);
		 ans.addAll(Small_ans);
		 return ans;
		//smallans->{1,4}
		
		
		
	}
	public static void main(String[] args) {
		int[] arr= {4,4,1,3,4,5,6,7,8,4,10,9};
		int target=4;
		System.out.print("OUR array List ans  :-");
		System.out.print(allIndices(arr, target, 0));
	}

}
