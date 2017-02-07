package com.company;
import java.io.*;
/**
 * Created by Eremenko on 06.02.2017.
 */
public class outputStream {
    private CountFiles countFiles = new CountFiles();
    private String pathOut;
    private OutputStream outputStr;

    public outputStream(String pathOut) {
        this.pathOut = pathOut;
    }

    public void write(String[] linesOutArray) throws IOException {
        try {
            outputStr = new FileOutputStream(pathOut);
            for (String st : linesOutArray) {
                File file = new File(st);
                int count = countFiles.getCountFiles(file);
                String str = st + "\t" + Integer.toString(count) + "\n";
                outputStr.write(str.getBytes());
            }
            outputStr.close();
        }catch (FileNotFoundException ex){
            System.out.println("There are some problems with the output file (maybe you should close it and try again)");
            System.out.println(ex.getMessage());
        }
    }

}
