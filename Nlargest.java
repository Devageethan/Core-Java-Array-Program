package array;

import java.util.Scanner;

public class Nlargest {
			public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				System.out.println("enter the nth largest");
				int n=s.nextInt();
				int a[]= {23,45,34,98,555};
				int largest=a[0];
				for (int i = 1; i <=n; i++) {
					largest=a[0];
					for (int j = 0; j < a.length; j++) {
						if(a[j]>largest) {
							largest=a[j];
						}
						
					}
					for (int j = 0; j < a.length; j++) {
						if(largest==a[j]) {
							a[j]=-1;
						}
					}
					
				}
				System.out.println(largest);
			}
}
