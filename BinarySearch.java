package array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int arr[]= {23,45,23,12,21,43,43,12};
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	System.out.println("enter the key");
	int key =s.nextInt();
	int search=(searchBinary(arr,key));
	System.out.println(search);
}
public static int searchBinary(int arr[],int key) {
	int start=0;
	int end=arr.length-1;
	while(start<=end) {
		int mid=(start+end)/2;
		if(key==arr[mid]) {
			return mid;
		}else if(key>arr[mid]) {
			start=mid+1;
		}else {
			end=mid-1;
		}
		
	}
	
		
	
	return -1;
	
}
}
