package array;
import java.util.*;
public class RightRotational {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the nth value");
	int n=s.nextInt();
	int a []= {45,87,65,8,32};
	int first=0;
	for(int i=1;i<=n;i++) {
		first=a[0];
		for(int index=0;index<a.length-1;index++) {
			a[index]=a[index+1];
		}
			a[a.length-1]=first;
	}
	for(int index=0;index<a.length;index++) {
		System.out.println("a[index]-"+a[index]);
	}
}
}
