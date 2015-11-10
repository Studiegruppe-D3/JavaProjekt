import java.util.*;
import java.io.*;

public class frontend {

public static void main(String[] args) {
	
		File file = new File("Names.txt");

	    try 
	    		{

	        Scanner sc = new Scanner(file);

	        while (sc.hasNextLine()) {
	            String i = sc.nextLine();
	            
	            String[] str = i.split(" ");
	            
	            
	            System.out.println(str[0]+" "+ str[1]);
	            }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) 
	    { e.printStackTrace(); }
	}
}