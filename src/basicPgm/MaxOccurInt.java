package basicPgm;

import java.util.HashMap;

public class MaxOccurInt {
  public static void main(String[] args) {
	  int[] a={2,2,2,2,2,3,3,5,6,7,7,7};
	  HashMap<Integer, Integer> map = new HashMap<>();
	  for(int i=0;i<a.length;i++) {
		  if(map.containsKey(a[i])) {
			  continue;
		  }
		  else {
			  int count=1;
			  for(int j=i+1;j<a.length;j++) {
				  if(a[i]==a[j]) {
					  count++;
				  }
			  }
			  map.put(Integer.valueOf(a[i]), Integer.valueOf(count));
		  }
	  }
	  System.out.println(map);
}
}
