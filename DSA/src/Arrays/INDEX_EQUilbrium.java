package Arrays;

public class INDEX_EQUilbrium {

	public static int arrayEquilibriumIndex(int[] arr){  
		
		int n=arr.length;
		for(int i=0;i<n;i++){
			int left_sum=0;
		    int right_sum=0;

			for(int k=0;k<i;k++){
				left_sum +=arr[k];
			}

			for(int j=i+1;j<n;j++){
				right_sum +=arr[j];
				
			}
			
			
		    if(left_sum==right_sum){
				return i;
		   }
		}

	return -1;
	}

}
