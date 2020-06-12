package helpers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileHelper {

    private static File file;
    private static FileWriter writer;

    public static void createFile()
    {
        file = new File (".\\fileResults\\"+generateAndGetCurrentDate()+".txt");
        try {
            writer =  new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String generateAndGetCurrentDate()
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date).replace("/","_").replace(":", "_");
    }

    public static void writeToFile(String textToWrite){
        try {
            writer.write(textToWrite+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void closeWriter()
    {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
