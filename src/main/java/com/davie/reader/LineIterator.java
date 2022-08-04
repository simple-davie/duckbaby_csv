package com.davie.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineIterator {

    private BufferedReader br;

    private String line;

    public LineIterator(String path) throws FileNotFoundException {
        br = new BufferedReader(new FileReader(path));
        try {
            line = br.readLine();
        } catch (IOException e) {
            line = null;
        }
    }

    public boolean hasNext() {
        return line!=null;
    }

    public String next() {
        if (line.isBlank()) {
            return null;
        } else {
            String current = line;
            try {
                line = br.readLine();
            } catch (IOException e) {
                line = null;
            }
            return current;
        }
    }



}




















































