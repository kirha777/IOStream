package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eremenko on 06.02.2017.
 */
public class inputStream {

    private String path;
    public String [] linesAsArray;

    public inputStream(String path) {
        this.path = path;
    }

    public String[] read() throws IOException {
        File file = new File(path);
        try {
            if (!file.exists()) {
                System.out.println("The input file don't exist, so we created it. But notify that it will be empty");
                if (!file.createNewFile()) {
                    throw new RuntimeException("Where is my input file?");
                }
            }
            try (BufferedReader readerLines = new BufferedReader(new FileReader(path))){
                List<String> lines = new ArrayList<>();
                String line;
                while ((line = readerLines.readLine()) != null) {
                    lines.add(line);
                }
                linesAsArray = lines.toArray(new String[lines.size()]);
                if (linesAsArray.length == 0 ) {
                    System.out.println("Check! The input file may be empty (so the output file will be empty too)!");
                }
                return linesAsArray;
            }
            }catch (IOException ioExc) {
                throw new RuntimeException(ioExc);
        }

   }
}
