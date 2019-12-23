package basicPgm;

public class FirstDuplicate {
	
	public static void main(String[] args) {
		 int[] a= {1, 2, 4, 4, 1, 3, 7, 5, 5, 2};
		 int count =0;
		 for(int i=0;i<a.length;i++) {
			 if(count<1) {
			 for(int j=i+1;j<a.length;j++) {
				 if(a[i]==a[j]) {
					 count++;
					 System.out.println(a[i]);
					 break;
				 }
			 }
			 }
			 else {
				 break;
			 }
		 }
	}

}
