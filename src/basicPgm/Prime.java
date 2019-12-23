package basicPgm;

public class Prime {
           public static void main(String[] args) {
        	   int a=2,b=3;
        	   System.out.print(a+","+b);
        	 for(int i=4;i<100;i++) {
        		 int count=0;
        		 for(int j=2;j<i;j++) {
        		 if(i%j==0) {
        			 count++;
        			 break;
        		 }
        	  }
        		 if(count==0) {
        			 System.out.print(","+i);
        		 }
            }
		}
}
