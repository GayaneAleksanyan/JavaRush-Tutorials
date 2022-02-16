package com.wrapperDecorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    AmigoOutputStream aos;

    public QuestionFileOutputStream(AmigoOutputStream aos) {
        this.aos = aos;
    }

    @Override
    public void flush() throws IOException {
        aos.flush();
    }

    @Override
    public void write(int b) throws IOException {
        aos.write(b);

    }

    @Override
    public void write(byte[] b) throws IOException {
        aos.write(b);

    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        aos.write(b, off, len);

    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        if (input.equals("Д")) {
            aos.close();
        }

    }
}

