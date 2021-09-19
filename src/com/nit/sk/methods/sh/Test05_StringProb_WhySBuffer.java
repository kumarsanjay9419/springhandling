package com.nit.sk.methods.sh;

public class Test05_StringProb_WhySBuffer {

	public static void main(String[] args) {
	
		String s1="hari";
		System.out.println("Before concat:="+s1);
		s1.concat("Krishna");
		System.out.println("After concat:="+s1);
		
		System.out.println();
		
		String s2=s1.concat("NiT");
		System.out.println("s1:="+s1);
		System.out.println("s2:="+s2);
		System.out.println();
		
		s1=s1.concat("Ameerpet");
		System.out.println("s1:="+s1);
		System.out.println();

		
		System.out.println("concept of StringBuffer..");
		//problem solved by StringBuffer
		
		StringBuffer sb1=new StringBuffer("hari");
		System.out.println("sb1:"+sb1);
		sb1.append("krishna");
		System.out.println("sb1:"+sb1);

	}

}
