package com.gl.alorithmlab.problem2.service;

public class NotesClass {
	MergeSort mg = new MergeSort();
	static void printArray(int arr[],int[] notes)
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			if(notes[i]!=0)
			System.out.println(arr[i] + " : "+notes[i]);
		}
	}

	public  void minnotes(int[] arr, int amount)
	{
		try{
			mg.sort(arr, 0, arr.length - 1);
     		int[] notes = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(amount/arr[i]>0) {
				notes[i]=amount/arr[i];
				amount%=arr[i];
			}
		}
		if(amount!=0) {
			System.out.println("The given amount cannot be paid completely using the given demonitions");
		}
		else {
		System.out.println("Your payment approach in order to give min no of notes will be");
		printArray(arr,notes);
	}
  }
		catch(ArithmeticException e) {
			System.out.println(e+" 0 as a demonition is invalid");
		}
 }
}
