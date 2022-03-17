package com.threadBytesCount;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();
            if (fileName.equals("exit")) {
                break;
            }
            new ReadThread(fileName).start();
        }
    }

    public static class ReadThread extends Thread {
        Map<Integer, Integer> mapBytes = new HashMap<>();
        String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
                while (fileInputStream.available() > 0) {
                    int bytes = fileInputStream.read();
                    int count = 1;
                    if (mapBytes.containsKey(bytes)) {
                        count = mapBytes.get(bytes);
                        mapBytes.put(bytes, count + 1);
                    } else {
                        count = 1;
                        mapBytes.put(bytes, count);
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
            int countMax = 0;
            for (Map.Entry<Integer, Integer> entry : mapBytes.entrySet()) {
                if (entry.getValue() > countMax) {
                    countMax = entry.getValue();
                }
            }
            for (Map.Entry<Integer, Integer> entry : mapBytes.entrySet()) {
                if (entry.getValue() == countMax) {
                    resultMap.put(fileName, entry.getKey());
                }
            }
        }
    }
}
