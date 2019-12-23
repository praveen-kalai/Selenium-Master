package basicPgm;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		 int[] a= {1, 2, 4, 4, 1, 3, 7, 5, 5, 2};
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 for(int i=0;i<a.length;i++) {
			 for(int j=i+1;j<a.length;j++) {
				 int temp=0;
				 temp=a[i]+a[j];
				 if(num==temp) {
					 System.out.println("("+a[i]+","+a[j]+")");
				 }
			 }
		 }
	}
}
