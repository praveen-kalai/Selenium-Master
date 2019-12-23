package basicPgm;

import java.util.ArrayList;
import java.util.List;

public class StringTest {

	public static void main(String[] args) {
		
		List<String> li= new ArrayList<>();
		String[] str = {"alan","xylos","alex","victor","alex","alan","phil","victor"
				,"phil","alex","alan","alex","victor","alex"};
	    for(int i=0;i<str.length;i++) {	    	
	    	for(int j=i+1;j<str.length;j++) {
	    		int count=0;
	    		if(str[i].equals(str[j])) {
	    			
	    			if(Character.isDigit(str[j].charAt(str[j].length()-1))){
	    				count++;	
	    				char c=str[j].charAt(str[j].length()-1);
	    				String s="";
	    				char ch[] = str[j].toCharArray();
	    				for(int k=0;k<ch.length-1;k++) {
	    					s+=ch[k];
	    				}
	    				
	    				//int temp=Integer.parseInt(String.valueOf(c))+1;
	    				int temp = Character.getNumericValue(c)+1;
	    				str[j]=s+temp;	    	
	    			}
	    			else {
	    			count++;
	    			str[j]+=count;	  			    				
	    			}
	    		}
	    		else {
	    			continue;
	    		}
	    	}
	    	
	    }
	    for(String s: str) {
	    	li.add(s);
	    }
	    System.out.println(li);
	}
}
