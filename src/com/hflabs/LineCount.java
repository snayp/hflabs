package com.hflabs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by user6 on 28.08.2018.
 */
public class LineCount {

    String file = "QAtest.txt";
    int lineCount = 0;

    BufferedReader br = null;

    public LineCount() throws IOException {
        try {
            br = new BufferedReader(new FileReader(file));
            while ((br.readLine()) != null) {
                lineCount ++;
            }
        }
        finally {
            if (br != null) {
                br.close();
            }
        }
        System.out.println("Count lines = " + lineCount);
    }
}
