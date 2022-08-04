package com.davie.reader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * this is a class for read file by line in different ways.
 * @author davie
 */
public class FileReader {

    LineIterator it;

    public FileReader(String path) throws FileNotFoundException {
        it = new LineIterator(path);
    }

    /**
     * read all lines form the file.
     * @return lines
     */
    public List<String> readAllLines(){
        ArrayList<String> list = new ArrayList<>();
        while (it.hasNext()){
            list.add(it.next());
        }
        return list;
    }

    /**
     * read the designated lines from the file.
     * @param begin the lines begin
     * @param end the lines end
     * @return lines designated
     */
    public List<String> readLines(int begin , int end){
        int i = 0;
        ArrayList<String> list = new ArrayList<>();
        while (it.hasNext()){
            if (++i>begin){
                list.add(it.next());
            }
            if (i==end){
                break;
            }
        }
        return list;
    }

    /**
     * read lines in batch.
     * @param lines batch size
     * @return batched lines
     */
    public List<String> readLines(int lines){
        List<String> list = new ArrayList<>();
        int i = 0;
        while (it.hasNext()){
            list.add(it.next());
            if (++i==lines){
                break;
            }
        }
        return list;
    }

}






























