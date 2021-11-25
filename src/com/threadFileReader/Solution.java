package com.threadFileReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws CorruptedDataException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            File file1 = new File(reader.readLine());
            File file2 = new File(reader.readLine());
            FileReader fr1 = new FileReader(file1);
            FileReader fr2 = new FileReader(file2);
            BufferedReader br1 = new BufferedReader(fr1);
            BufferedReader br2 = new BufferedReader(fr2);
            StringBuffer sb1 = new StringBuffer();
            StringBuffer sb2 = new StringBuffer();
            String line;
            while ((line = br1.readLine()) != null) {
                sb1.append(line);
                sb1.append("\n");
                allLines.add(line);
            }
            while ((line = br2.readLine()) != null) {
                sb2.append(line);
                sb2.append("\n");
                forRemoveLines.add(line);
            }
            fr1.close();
            fr2.close();
            System.out.println(sb1.toString());
            System.out.println(sb2.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            new Solution().joinData();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
