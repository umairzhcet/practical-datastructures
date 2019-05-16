package com.umair.udemy.datastructures.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = { 125, 167, 392, 145, 87, 28, 256 };
		for (int i : array)
			System.out.print(i + " ");
		//selectionSort(array);
		array=selectionSortRecursive(array,array.length,array.length-1);
		System.out.println();
		for (int i : array)
			System.out.print(i + " ");

	}

	

	private static int[] selectionSortRecursive(int[] array, int length, int i) {
		if(i<=1) {
			return array ;
		}
		System.out.println("selectionSortRecursive called with i= "+i);
	    selectionSortRecursive(array,length,i-1);
		int num=array[i];	
		int j=i-1;
		while(j>=0 && array[j]>num) {
			array[j+1]=array[j];
			j--;
		}
		array[j+1]=num;
		return array;
	}



	private static void selectionSort(int[] array) {
		int j=0;
		for(int i=1;i<array.length;i++) {
			j=i-1;
			int num=array[i];
			while(j>=0 && array[j]>num) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=num;
		}
		
	}

}
