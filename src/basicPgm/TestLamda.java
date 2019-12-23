package basicPgm;

public interface TestLamda {
	
	public static void state() {
		System.out.println("Static Block");
	}
	default void state1() {
		System.out.println("Default Block");
	}
	
	public void state2(String name);

}
