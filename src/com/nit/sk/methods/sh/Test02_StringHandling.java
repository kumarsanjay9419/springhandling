package com.nit.sk.methods.sh;

import java.util.Scanner;

public class Test02_StringHandling {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter string:=");
		String s1=scn.next();
		
		if(s1.equals("hari")) {
			System.out.println("Hi "+s1.toUpperCase());
		}else {
			System.out.println("Are you"+s1.concat("Krishna")+"?");
		}

	}

}
