import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;

public class Sort implements familytree{
	
	public static ArrayList read_file(){
		ArrayList list = new ArrayList();
		File input = new File("unsortet.txt");		
		Scanner reader = new Scanner(System.in);
		try {
			reader = new Scanner(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
		while (reader.hasNextLine()){
			list.add(reader.nextLine());
		}
		
		Collections.sort(list);
		
		return list;
	}
	
	public static void save_file(){
		File output = new File("sortet.txt");
		ArrayList list = new ArrayList(read_file());
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(output);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i<list.size(); i++){
			String line = (String) list.get(i);
			writer.append(line + "\r\n");
		
		}
		writer.close();
	}

	
	public static void main(String[] args) {	
		save_file();		
	}
}
