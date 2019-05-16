package com.umair.udemy.datastructures.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array= {25,67,92,145,187,228,556};
		//int x=binarySearch(array,187);
		int x=binarySearchRecursion(array,67,0,array.length-1);
		System.out.println(x);

	}


	private static int binarySearch(int[] array, int x) {
		int start=0;
		int end=array.length;
		while(end>start) {
			int midPoint=(end+start)/2;
			if(array[midPoint]==x) {
				return midPoint;
			}
			else if(x<array[midPoint]) {
				end=midPoint-1;
			}
			else if(x>array[midPoint]){
				start=midPoint+1;
			}
		}
		return -1;
	}

	private static int binarySearchRecursion(int[] array, int x,int start,int end) {
		
		if(end<start) {
			return -1;
		}
		int midPoint=(int) Math.floor((end+start)/2);
		if(array[midPoint]==x) {
			return midPoint;
		}
		else if(x<array[midPoint]) {
			end=midPoint-1;
			return binarySearchRecursion(array,x,start,end);
		}
		else if(x>array[midPoint]){
			start=midPoint+1;
			return binarySearchRecursion(array,x,start,end);
		}
		return -1;
		
		
	}

}
