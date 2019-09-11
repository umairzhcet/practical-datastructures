package com.umair.udemy.datastructures.searching;

public class LinearSearch {

	public static void main(String[] args) {
		int[] array= {25,67,12,45,87,8};
		int x=linearSearch(array,12);
		System.out.println(x);

	}

	private static int linearSearch(int[] array, int x) {
		for(int i=0;i<array.length;i++) {
			if(array[i]==x) {
				return i;
			}
		}
		return -1;
		
	}

}
