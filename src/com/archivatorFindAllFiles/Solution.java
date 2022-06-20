package com.archivatorFindAllFiles;

import java.io.File;
import java.io.IOException;
import java.util.*;

/* 
Находим все файлы
*/

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        File folder = new File(root);
        List<String> list = new ArrayList<>();
        Queue<File> queue = new ArrayDeque<>();
        if (folder.isDirectory()) {
            Collections.addAll(queue, Objects.requireNonNull(folder.listFiles()));
            while (!queue.isEmpty()) {
                File currentFile = queue.remove();
                if (currentFile.isDirectory()) {
                    Collections.addAll(queue, Objects.requireNonNull(currentFile.listFiles()));
                } else {
                    list.add(currentFile.getAbsolutePath());
                }
            }
        }
        return list;

    }

    public static void main(String[] args) throws IOException {
        getFileTree("C:/tmp");
    }
}
