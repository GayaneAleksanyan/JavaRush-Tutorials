package com.wrapperOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private final FileOutputStream stream;

//          private final FileOutputStream original;
//          String s = "JavaRush © All rights reserved.";

    public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(fileName);
        this.stream = fileOutputStream;

//          this.original = fileOutputStream;
    }

    @Override
    public void write(int b) throws IOException {
        stream.write(b);

//          original.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        stream.write(b);

//          original.write(b);
    }

    @Override
    public void flush() throws IOException {
        stream.flush();

//          original.flush();
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        stream.write(b, off, len);

//          original.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        flush();
        write("JavaRush © All rights reserved.".getBytes());
        stream.close();

//          original.flush();
//          original.write(s.getBytes());
//          original.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
