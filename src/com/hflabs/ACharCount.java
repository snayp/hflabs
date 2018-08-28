package com.hflabs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by user6 on 28.08.2018.
 */
public class ACharCount {

    String file = "QAtest.txt";
    int aCount = 0;

    BufferedReader br = null;

    public ACharCount() throws IOException {

        try {
            br = new BufferedReader(new FileReader(file));
            int c;
            while ((c = br.read()) != -1) {
                if ((char)c == 'a'){
                    aCount ++;
                }
            }
        }
        finally {
            if (br != null) {
                br.close();
            }
        }
        System.out.println("Count a chars = " + aCount);
    }
}
