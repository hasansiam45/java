package file;

import java.io.File;

public class File1 {
    public static void main(String[] args) {
        File dir1 = new File("welcome");
        dir1.mkdir(); // folder will create on exiting path

        File dir = new File("C:/Users/ASUS/Desktop/siam");
        dir.mkdir();  // folder will create on this location

        System.out.println(dir.getAbsolutePath());

        if(dir.delete()){
            System.out.println(dir.getName() + " folder has been deleted");
        }

        File file1 = new File("C:/Users/ASUS/Desktop/myFile.txt");
        File file2 = new File("C:/Users/ASUS/Desktop/welcome.js");

        try {
            file1.createNewFile();
            file2.createNewFile();
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
