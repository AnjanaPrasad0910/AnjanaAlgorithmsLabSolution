package com.gl.algorithmlab.problem1.driver;

import java.util.*;

import com.gl.algorithmlab.problem1.service.*;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TransactionClass sv = new TransactionClass();
		System.out.println("Enter the size of transaction array :");
		int size=sc.nextInt();
		int[] transactionArray = new int[size];
		System.out.println("Enter the values of array");
		for(int i=0;i<size;i++) {
			transactionArray[i]=sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved :");
		int no_target =sc.nextInt();
		sv.findTarget(transactionArray, no_target);
		sc.close();

	}

}
