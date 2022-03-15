package com.practice;

public class MockSortingArray {

	public static void main(String[] args) {
		
		int arr[]= {0,0,1,0,1,1,0,1};
		int i,j;
		int temp;
		for(i=0;i<arr.length;i++) {

			for(j=i;j<arr.length;j++) {
				
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
			System.out.print(arr[i]);
	}

	}
}
