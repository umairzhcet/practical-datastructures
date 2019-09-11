package com.umair.udemy.datastructures.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int[] array = { 125, 167, 392, 145, 87, 28, 256 };
		for (int i : array)
			System.out.print(i + " ");
		//selectionSort(array);
		mergeSortRecursive(array,0,array.length-1);

		System.out.println();
		for (int i : array)
			System.out.print(i + " ");

	}

	private  static void mergeSortRecursive(int[] array, int start, int end) {
		if(end<=start) {
			return;
		}
		int mid=(start+end)/2;
		mergeSortRecursive(array, start, mid);
		mergeSortRecursive(array, mid+1, end);
		mergeArray(array,start,mid,end);
		
	}

	private static void mergeArray(int[] array, int start, int mid, int end) {
		int[]l1=new int[end-start+1];
		int leftSlot=start;
		int rightSlotj=mid+1;
		int k=0;
		while(leftSlot<=mid && rightSlotj<=end) {
			
				if(array[leftSlot]<array[rightSlotj]) {
					l1[k]=array[leftSlot];
					leftSlot++;
				}
				else {
					l1[k]=array[rightSlotj];
					rightSlotj++;
				}
				k++;
			}
		
		if(leftSlot<=mid) {
			while(leftSlot<=mid) {
				l1[k]=array[leftSlot];
				leftSlot++;
				k++;
			}
		}
		else if(rightSlotj<=end) {
			
			while(rightSlotj<=end) {
				l1[k]=array[rightSlotj];
				rightSlotj++;
				k++;
			}
		}
		
		for(int m=0;m<l1.length;m++) {
			array[m+start]=l1[m];
		}
			
		}
		
	
}
