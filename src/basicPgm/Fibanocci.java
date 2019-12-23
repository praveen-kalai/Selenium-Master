package basicPgm;

public class Fibanocci {
             public static void main(String[] args) {
            	/*int a=0,b=1;
            	System.out.print(a+","+b);
            	for(int i=2;i<100;i++) {
            		int c=a+b;
            		if(c<100) {
            		System.out.print(","+c);
            		a=b;
            		b=c;
            		}
            	}*/
            	/* int a=0,b=1,c=0;
            	for(int i=2;i<9;i++) {
            		c=a+b;
            		a=b;
            		b=c;
            	}
            	System.out.println(c);*/
            	
            	int a=0,b=1,n=0,c=0; 
            	for(int i=2;i<55;i++) {
            		c=a+b;
            		a=b;
            		b=c;
            		n++;
            		if(c==55) {
            			System.out.println(n+2);
            			break;
            		}
            	}
		}
}
