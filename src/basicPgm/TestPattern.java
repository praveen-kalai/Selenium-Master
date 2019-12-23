package basicPgm;

public abstract class TestPattern {
	 public void test() {
		 System.out.println("Test");
	 }
	 public abstract void test1();
	 

	
			public static void main(String[] args) {
				TestPattern t = new TestPattern() {
					
					@Override
					public void test1() {
						System.out.println("test1"); 
						
					}
				};
				t.test();
	               for(int i=1;i<4;i++) {
	            	   for(int j=1;j<=i;j++) {
	            		   System.out.print(j);
	            	   }
	            	   System.out.println();
	               }
			}
}
