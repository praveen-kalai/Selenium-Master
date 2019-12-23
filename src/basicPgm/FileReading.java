package basicPgm;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileReading {
 public static void main(String[] args) throws FileNotFoundException, IOException {
	FileReader fir = new FileReader(new File("C:\\Users\\PRAVEEN\\Desktop\\TestDocument.txt"));
	//FileWriter fw = new FileWriter(new File("C:\\\\Users\\\\PRAVEEN\\\\Desktop\\\\TestDocument.txt"));
	BufferedReader br = new BufferedReader(fir);
	String line;
	while((line=br.readLine())!=null) {
		String[] str = line.split("\\s");
		for(int i=0;i<str.length;i++) {
			if(str[i].equalsIgnoreCase("Capegemini")) {
				str[i]=str[i].replace(str[i],"CG");
			}
		}		
		for(String s:str) {
			System.out.print(s+" ");
		}
		System.out.print("\n");		
		
	 }
	
	}
}

