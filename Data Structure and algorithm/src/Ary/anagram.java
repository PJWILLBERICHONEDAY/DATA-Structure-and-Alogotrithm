package Ary;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
	public static void main(String[] args) {
//		Your task is to construct an algorithm to check whether two words (or phrases) are anagrams or not!
//		"An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
//		typically using all the original letters exactly once"
////		For example: restful and fluster are anagrams.

		Scanner sc=new Scanner (System.in);
		int sze=sc.nextInt();
		
		String s1=sc.next();
		String s2=sc.next();
		char[] subject=s1.toCharArray();
		char[] ana=s2.toCharArray();
		if(subject.length!=ana.length) {
			System.out.println("False");
			
		}
		Arrays.sort(subject);
		
		
	
		
		for(int i=0;i<sze;i++) {
			 
		}
		
		
		
	}

}
