import java.util.*;
import java.io.*;

public class frontend {
    public static void main(String[] args) {
        File file = new File("src/sorted.txt");
        try
        {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String i = sc.nextLine();
                String[] str = i.split(" ");
                String strr = str[0];
                strr = strr.substring(0, 1);
                System.out.println(strr+". "+ str[1]);
            }
            sc.close();
        }
        catch (FileNotFoundException e)
        { e.printStackTrace(); }
    }
}
