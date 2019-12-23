package basicPgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest{
	
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<>();
		Integer arr[]= {4,6,8,4,7};
		li=Arrays.asList(arr);
		Arrays.sort(arr,Collections.reverseOrder());
		Collections.sort(li);
		System.out.println(li);
		Collections.sort(li, new Comparator<Integer>() {			
			public int compare(Integer arg0,Integer arg1) {
				//System.out.println(arg0 +"" + arg1);
				return arg1-arg0;
			}
		});
		System.out.println(li);
	}

}
