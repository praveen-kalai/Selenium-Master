package basicPgm;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int count=0;
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==ch[ch.length-1-i]) {
				continue;				
			}
			else {
				count++;
			}
		}
		if(count!=0) {
			System.out.println("Not a Palindrome");
		}
		else {
			System.out.println("Palindrome");
		}
		sc.close();
	}

}
