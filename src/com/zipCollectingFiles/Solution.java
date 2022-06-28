package com.zipCollectingFiles;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> lists = new ArrayList<>();

        for (int i = 1; i < args.length; i++) {
            lists.add(args[i]);
        }

        Collections.sort(lists);
        Vector<InputStream> inputStreams = new Vector<>();

        for (String zip : lists)
            inputStreams.add(new FileInputStream(zip));

        ZipInputStream zipInputStream = new ZipInputStream(new SequenceInputStream(inputStreams.elements()));
        FileOutputStream outputStream = new FileOutputStream(args[0], true);

        while (zipInputStream.available() > 0) {
            ZipEntry zip = zipInputStream.getNextEntry();
            byte[] bytes = new byte[1024];

            try {
                long b = zip.getSize(), a = 0;
                while (b > a) {
                    int x = zipInputStream.read(bytes);
                    a += x;
                    outputStream.write(bytes, 0, x);
                }
            } catch (NullPointerException e) {
                zipInputStream.getNextEntry();
            }
        }

        zipInputStream.close();
        outputStream.close();
    }
}
