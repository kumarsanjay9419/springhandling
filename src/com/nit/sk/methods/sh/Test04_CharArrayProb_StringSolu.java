package com.nit.sk.methods.sh;

public class Test04_CharArrayProb_StringSolu {

	public static void main(String[] args) {
		
		char[]ch= {'s','a','n','j','a','y'};
		
		
		String str="sanjay";
		System.out.println(str);
		System.out.println(str.concat("kumar"));
		System.out.println(str.toUpperCase());
		
		System.out.println();
		//str=str.concat("kumar");  //sanjaykumar
		str.concat("kumar");        //sanjay
		System.out.println(str);
		System.out.println(str.toUpperCase());
		

	}

}
