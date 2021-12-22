package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class WriteFile {
    public static void main(String[] args) {
        try {
           Formatter formatter = new Formatter("C:/Users/ASUS/Desktop/myFile.txt");
           for (int i = 0; i< 10000000; i++) {
               formatter.format("%d %s", i+1, "I Love You Srabony\r\n");
           }
           formatter.close();

        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
