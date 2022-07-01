package com.pathFileURLDownloader;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/* 
Загрузчик файлов
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        String fileName = urlString.split("/")[urlString.split("/").length - 1];
        Path result = downloadDirectory.resolve(fileName);
       
        URL url = new URL(urlString);
        InputStream is = url.openStream();
        
        Path tmpFile = Files.createTempFile(null, null);
        Files.copy(is, tmpFile, StandardCopyOption.REPLACE_EXISTING);
        
        Files.move(tmpFile, result);
        return result;
    }
}
