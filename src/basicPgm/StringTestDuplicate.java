package basicPgm;

import java.util.ArrayList;
import java.util.List;

public class StringTestDuplicate {
	
	public static void main(String[] args) {
		
		String s ="HelLo diamonD!!! ffsfahaa";
		String[] str = s.split("\\s");
		List<Object> li = new ArrayList<>();
		for(String s1:str) {
			char ch[]=s1.toCharArray();
			for(int i=0;i<ch.length;i++) {
				if(li.contains(String.valueOf(ch[i]))) {
					continue;
				}
				else {
				int count=0;
				for(int j=i+1;j<ch.length;j++) {					
					String a = String.valueOf(ch[i]);
					String b = String.valueOf(ch[j]);
					if(a.equalsIgnoreCase(b)) {
						System.out.print(ch[i]);
						li.add(a);
						li.add(b);
						count++;
						break;
					}
					
				}
				if(count==0) {
					System.out.print(ch[i]);
				}
			 }
				
			}
			System.out.print(" ");
		}
	}

}
