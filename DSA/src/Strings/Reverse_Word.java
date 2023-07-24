package Strings;

import java.util.Scanner;

public class Reverse_Word {
	
	 static  String reverseStringWordWise(String input) {
		 int i=input.length()-1;
			int j=input.length()-1;
			String ans="";
			for( i=input.length()-1;i>=0;i--) {
				if(input.charAt(i)==' ') {
					ans=ans+input.substring(i+1,j+1)+" ";
					j=i;
				}
				
				
			}
			ans=ans+input.substring(i+1,j+1);
			return ans;
			
	        
	    }

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        String input = sc.nextLine();
	        String ans = reverseStringWordWise(input);
	        System.out.println(ans);
	    }
}
