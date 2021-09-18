package com.stringsorting;

import java.util.HashSet;

public class CFG {
	static void removeDuplicate(char str[],int n)
	{
		HashSet<Character>s=new HashSet<Character>();
		for(char x:str)
			s.add(x);
		for(char x:s)
			System.out.println(x);
	}

	public static void main(String[] args) {
		char str[]="Sanjay Kumar".toCharArray();
		int n=str.length;
		removeDuplicate(str, n);

	}

}
