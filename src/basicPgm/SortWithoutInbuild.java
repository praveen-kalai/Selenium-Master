package basicPgm;

public class SortWithoutInbuild {
        public static void main(String[] args) {
			int arr[] = {14,56,38,44,26,68,77};
			int temp=0,a=0,b=0;
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					 a=i;
					for(int j=i;j<arr.length-1;j++) {
						if(arr[j]>arr[j+1]) {
							 b=j+1;
						}
					}
					temp=arr[a];
					arr[a]=arr[b];
					arr[b]=temp;
					break;
				}			
			
			}
			
			for(int d:arr) {
				System.out.print(d+",");
			}
		}
}
