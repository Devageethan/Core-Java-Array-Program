package array;
import java.util.*;

public class Linearsearch {
			static String res="not present";

			public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				
				int[]a= {23,4,56,11,98};
				System.out.println("enter the key element");
				int key=s.nextInt();
				System.out.println(linearSearch(a,key));
			}
			
			public	static String linearSearch(int a[],int key) {
					for (int i = 0; i < a.length; i++) {
						if(a[i]==key) {
							res="present";
							break;
						}
					
					}
					return res;
						
				}
				
			
			
}
