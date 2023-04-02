package array;

public class Largestelement {
		public static void main(String[] args) {
			int a[]= {12,34,1,3,44,63};
			int largest=a[0];
			for (int i = 0; i < a.length; i++) {
				if(a[i]<largest) {
					largest=a[i];
				}
			}
				System.out.println(largest);
			
		}
}
