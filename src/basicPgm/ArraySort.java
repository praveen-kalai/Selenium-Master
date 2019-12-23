package basicPgm;

public class ArraySort {
	public static void main(String[] args) {
	int arr[] = new int[] {1,4,6,67,89,766,665};
    for(int i=0;i<arr.length;i++) {
    	for(int j=i+1;j<arr.length;j++) {
    		if(arr[i]>arr[j]) {
    			int temp;
    			temp=arr[i];
    			arr[i]=arr[j];
    			arr[j]=temp;
    		}
    	}
    }
    for(int a:arr) {
    	System.out.print(a+" ");
    }
   
 }
}
