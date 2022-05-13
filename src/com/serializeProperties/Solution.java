package com.serializeProperties;

import java.io.*;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/

public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        Properties p = new Properties();
        for (Map.Entry<String, String> m : runtimeStorage.entrySet()) {
            p.put(m.getKey(), m.getValue());
        }
        p.store(outputStream, "P");
    }

    public static void load(InputStream inputStream) throws IOException {
        Properties p1 = new Properties();
        p1.load(inputStream);
        Enumeration<Object> e = p1.keys();
        while (e.hasMoreElements()) {
            String key = (String) e.nextElement();
            String values = p1.getProperty(key);
            runtimeStorage.put(key, values);
        }
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
