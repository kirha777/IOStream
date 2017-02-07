package com.company;

import java.io.File;

/**
 * Created by Eremenko on 06.02.2017.
 */
public class CountFiles {
    public int getCountFiles(File file) {
        File[] files = file.listFiles();
        int fileCounter = 0;
        for (File insideFile : files) {
            if (insideFile.isDirectory()) {
                fileCounter += getCountFiles(insideFile);
            } else {
                fileCounter++;
            }
        }
        return fileCounter;
    }
}
