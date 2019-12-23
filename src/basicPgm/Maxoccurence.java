package basicPgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Maxoccurence {
	public static void main(String[] args) {	
		String s ="Welcomemmmmaaaa to java Programming";			
		String s1 = s.replaceAll("\\s", "");
		char[] ch = s1.toCharArray();
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<ch.length;i++) {
			if(map.containsKey(ch[i])) {
				continue;
			}
			else {
				int count =1;
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						count++; 						
					}
				}
				map.put(ch[i], count);
			}
		}
		System.out.println(map);
		List<Entry<Character,Integer>> li =new ArrayList<>(map.entrySet());
		Collections.sort(li, new Comparator<Entry<Character,Integer>>() {
			public int compare(Entry<Character,Integer> h, Entry<Character,Integer> h1) {
				return h1.getValue()-h.getValue();
			}
		}
		);
		System.out.println(li);
 }
}
