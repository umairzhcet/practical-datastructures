package com.umair.udemy.datastructures.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array= {125,167,392,145,87,28,256};
		for(int i:array)
			System.out.print(i+" ");
		array=selectionSort(array);
		System.out.println();
		for(int i:array)
		System.out.print(i+" ");

	}

	private static int[] selectionSort(int[] array) {
	for(int i=0;i<array.length;i++) {
		int min=i;
		for(int j=i+1;j<array.length;j++) {
			if(array[j]<array[min]) {
				min=j;
			}
	}
		int temp=array[i];
		array[i]=array[min];
		array[min]=temp;
		
	}
	return array;
	
		
	}

}
