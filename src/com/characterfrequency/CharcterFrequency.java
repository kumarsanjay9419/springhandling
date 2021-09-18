package com.characterfrequency;

import java.util.HashMap;
import java.util.Map;

//using hasing function
public class CharcterFrequency {
	
	public static void prCharWithFreq(String s)
	{
		//store all the characters and
		//their frequencies in dictionary
		Map<Character,Integer>d=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(d.containsKey(s.charAt(i)))
			{
				d.put(s.charAt(i), d.get(s.charAt(i))+1);
			}
			else {
				d.put(s.charAt(i), 1);
			}
		}
		//Print characters and their
		//frequencies in same order
		//of their apperance
		for(int i=0;i<s.length();i++)
		{
			//print only if this 
			//charactre is not printed
			//before
			
			if(d.get(s.charAt(i))!=0)
			{
				System.out.println(s.charAt(i));
				System.out.println(d.get(s.charAt(i)));
				d.put(s.charAt(i), 0);
			}
		}
	}
	
	//Driver code

	public static void main(String[] args) {
		
		String S="google";
		prCharWithFreq(S);

		
	}

}
