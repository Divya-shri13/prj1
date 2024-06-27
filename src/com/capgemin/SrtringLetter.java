package com.capgemin;
import java.util.Scanner;

public class SrtringLetter {

	public static void main(String[] args) {
		Scanner sc=new 
	Scanner(System.in);
		
		System.out.println("Enter string");
		String sl=sc.next();
	
		for(int i=0;i<sl.length();i++)
		{
			int index ='z'-sl.charAt(i);
			System.out.println((char)('a'+index));
		}
		// TODO Auto-generated method stub

	}

}
