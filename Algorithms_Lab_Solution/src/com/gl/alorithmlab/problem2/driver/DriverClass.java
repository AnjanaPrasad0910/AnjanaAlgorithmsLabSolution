package com.gl.alorithmlab.problem2.driver;
import com.gl.alorithmlab.problem2.service.*;
import java.util.*;
public class DriverClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		NotesClass sv = new NotesClass();
		System.out.println("Enter the size of currency denominations : ");
		int size = sc.nextInt();
		
		System.out.println("Enter the currency denominations values");
		int[] currencyDemonition = new int[size];
		for(int i=0;i<size;i++) {
			currencyDemonition[i]=sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay : ");
		int amount = sc.nextInt();
		sv.minnotes(currencyDemonition,amount);
		sc.close();		
	}



}
