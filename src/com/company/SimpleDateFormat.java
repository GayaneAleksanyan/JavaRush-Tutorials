package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormat {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        java.text.SimpleDateFormat currentDate = new java.text.SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        try {
            Date date = currentDate.parse(a);
            java.text.SimpleDateFormat formattedDate = new java.text.SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
            System.out.println(formattedDate.format(date).toUpperCase(Locale.ROOT));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
