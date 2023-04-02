package array;

public class Bubblesort {
public static void main(String[] args) {
	int a[]= {23,45,12,0,-1,13,-4};
	int r=a.length-1;
	int temp=0;
	for(int i=1;i<=r;i++) {
		for(int j=0;j<r;j++) {
			if(a[j]>a[j+1]) {
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(int index=0;index<a.length;index++) {
		System.out.print(a[index]+" ");
	}
}
}
