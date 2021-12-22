package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class WriteNewFile {
    public static void main(String[] args) {

        // write into file
        Scanner input = new Scanner(System.in);
        System.out.print("How many Sorry do you want : ");
        int n = input.nextInt();
        try {
            Formatter formatter = new Formatter("C:/Users/ASUS/Desktop/test.txt");
            for (int i = 0; i < n; i++){
                formatter.format("%d %s", i+1, "Sorry\r\n");
            }
            formatter.close();
        } catch (FileNotFoundException e){
            System.out.println(e);
        }


        // read from a file

        try {
            File file = new File("C:/Users/ASUS/Desktop/test.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                String id = scanner.next();
                String content = scanner.next();
                System.out.println("ID " + id + " Content " + content );
            }
            scanner.close();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
