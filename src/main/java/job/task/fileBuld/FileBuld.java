package job.task.fileBuld;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileBuld {
    public static void getFile(){
        try {
            File file = new File("apartment.txt");
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void putFile(String s){
        try {
            FileWriter writer = new FileWriter("apartment.txt");
            writer.write(s);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
