package basicPgm;

public class StringReversalTest {
	public static void main(String[] args) {
		String s="welcome the person ";
		//System.out.println(s.charAt(18));
		String s1="";
		String s2="";
		for(int i=0;i<s.length();i++) {	
		if((s.charAt(i))==' ') {
			for(int j=0;j<s1.length();j++) {
				s2+=s1.charAt(s1.length()-j-1);
			}			
			System.out.print(s2+" ");
			s1="";
			s2="";
		}
		else {			
			s1+=s.charAt(i);
			//System.out.println(s1);			
		}
	  }
		
		
	}	
}
