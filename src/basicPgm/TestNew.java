package basicPgm;

import java.util.HashMap;

public class TestNew {
	
	public static void main(String[] args) {
		
		/*String s="praveen@#$FRG$T$T$Gg122353d4f4645hg@##443";
		String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);*/
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
