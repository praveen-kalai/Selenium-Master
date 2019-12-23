package basicPgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Anagram{
static int count=0;
public static void main(String[] args){
String s1 ="LISTEN";
String s2 ="TESNIL";
char[] ch1 = s1.toCharArray();
char[] ch2 = s2.toCharArray();
List<Character> li1 = new ArrayList<>();
List<Character> li2 = new ArrayList<>();
for(char c:ch1) {
	li1.add(c);
}
for(char e:ch2) {
	li2.add(e);
}
if(li1.size()==li2.size()) {
for(Object c:li1) {
	if(li2.contains(c)) {
		continue;
	}
	else {
		count++;
		break;
	}
}
}
else {
	System.out.println("Not Anagram");
}
if(count!=0) {
	System.out.println("Not Anagram");
}
else {
	System.out.println("Anagram");
}
}
}
