package com.wrapperException;

import java.io.FileInputStream;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
//        String[] str = fileName.split("\\.");
//        if (!str[str.length - 1].equals("txt")) {
//            super.close();
//            throw new UnsupportedFileNameException();
//        }
        if (!fileName.endsWith("txt")) {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) throws IOException, UnsupportedFileNameException {
        new TxtInputStream("C:/tmp/result.txt");
    }
}

