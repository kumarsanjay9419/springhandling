package com.sorting;

import java.util.HashSet;

public class Find3NubmbersByHashSet {
static	boolean find3Numbers(int A[],int arr_size,int sum)
	{
		int l,r;
		for(int i=1;i<arr_size-2;i++)
		{
			HashSet<Integer>s=new HashSet<Integer>();
			int curr_sum=sum-A[i];
			for(int j=i+1;j<arr_size;j++)
			{
				
				if(s.contains(curr_sum-A[j]))
				{
					System.out.printf("Trilpet is %d,%d,%d",A[i],A[j],curr_sum-A[j]);
					//System.out.println("Trilpet is:"+ A[i] +"  "+A[j]+"  "+curr_sum-A[j]);
					return true;
				}
				s.add(A[j]);
			}
		}
	
		return false;
	}
	public static void main(String[] args) {
		
		int A[]= {1,4,45,6,10,8};
		int sum=22;
		int arr_size=A.length;
		find3Numbers(A, arr_size, sum);
				
	}

}
