package Strings;

public class Reverse_string {
	public static void main(String[] args) {
		String str="Hello World";
		char[] chArr=str.toCharArray();
		for(int i=0;i<chArr.length;i++) {
			System.out.println(chArr[i]);
		}
		System.out.println("After Reversing ");
		for(int i=chArr.length-1;i>=0;i--) {
			
			System.out.println(chArr[i]);
		}
	}

}
