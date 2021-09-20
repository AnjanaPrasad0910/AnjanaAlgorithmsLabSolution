package com.gl.algorithmlab.problem1.service;

import java.util.*;

public class TransactionClass {
	
	public void findTarget(int[] arr, int no_target) {
		Scanner sc = new Scanner(System.in);
		while(no_target-->0) {
			System.out.println("Enter the value of target :");
			int t=sc.nextInt();
			int sum =0,i=0,flag=0;
			for(;i<arr.length;i++) {
				sum+=arr[i];
				if(sum>=t) {
					System.out.println("Target achieved after "+(1+i)+" transactions\n");
					flag=1;
					break;
				}
			}
			
			if(flag==0) {
				System.out.println("Given target is not achieved\n");
			}
		}
		sc.close();					
	}

}
