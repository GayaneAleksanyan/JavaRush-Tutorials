package com.company.pricesCRUD;

/*
Прайсы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader inputPath = new BufferedReader(new InputStreamReader(System.in));
        String filePath = inputPath.readLine();

        if (args.length == 4) {
            if (args[0].equals("-c")) {

                if (args[1].length() != 30) {
                    if (args[1].length() > 30) {

                        args[1] = args[1].substring(0, 30);
                    } else {

                        for (int i = args[1].length(); i < 30; i++) {
                            args[1] = args[1] + " ";
                        }
                    }


                }


                if (args[2].length() != 8) {
                    if (args[2].length() > 8) {

                        args[2] = args[2].substring(0, 8);
                    } else {

                        for (int i = args[2].length(); i < 8; i++) {
                            args[2] = args[2] + " ";
                        }
                    }


                }

                if (args[3].length() != 4) {
                    if (args[3].length() > 4) {

                        args[3] = args[3].substring(0, 4);
                    } else {

                        for (int i = args[3].length(); i < 4; i++) {
                            args[3] = args[3] + " ";
                        }
                    }


                }


                try {

                    BufferedReader buffer = new BufferedReader(new FileReader(filePath));
                    ArrayList<String> fileList = new ArrayList();

                    while (buffer.ready()) {

                        fileList.add(buffer.readLine());
                    }
                    buffer.close();

                    BufferedWriter bufferWrite = new BufferedWriter(new FileWriter(filePath, true));

                    if (fileList.size() == 0) {
                        bufferWrite.write("0       " + args[1] + args[2] + args[3] + "\n");
                        bufferWrite.close();
                    } else {
                        int maxID = Integer.parseInt(fileList.get(0).substring(0, 8).trim());

                        for (String s : fileList) {
                            int nextID = Integer.parseInt(s.substring(0, 8).trim());
                            if (nextID > maxID) {
                                maxID = nextID;
                            }
                        }
                        maxID++;

                        bufferWrite.write("\n");
                        bufferWrite.write(maxID + args[1] + args[2] + args[3] + "\n");
                        bufferWrite.close();
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
