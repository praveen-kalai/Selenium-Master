package basicPgm;

public class TestLambdaTest {
  public static void main(String[] args) {
	TestLamda t1 =(String s)->{
		System.out.println("Lamda block "+ s);
	};
	t1.state1();
	t1.state2("Praveen");
	TestLamda.state();
}
}
