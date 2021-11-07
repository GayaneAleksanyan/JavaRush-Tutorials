package com.threadsCrud2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    public static SimpleDateFormat dateFormatInfo = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public static void main(String[] args) throws ParseException {
        // args = new String[]{"-c", "Иванов", "м", "04/01/1990", "Иванова", "ж", "18/05/1999"};
        // args = new String[]{"-u", "0","Петров", "м", "04/01/1991", "1","Петрова", "ж", "18/05/1995"};
        // args = new String[]{"-d", "0","1"};
        // args = new String[]{"-i", "0","1"};
        switch (args[0]) {

            case "-c":
                synchronized (allPeople) {
                    add(args);
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    update(args);
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    delete(args);
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    info(args);
                }
                break;

        }
    }

    public static void add(String[] args) throws ParseException {

        for (int i = 1; i < args.length; i = i + 3) {
            if (args[i + 1].equals("м")) {
                allPeople.add(Person.createMale(args[i], dateFormat.parse(args[i + 2])));
                System.out.println(allPeople.size() - 1);
            } else if (args[i + 1].equals("ж")) {
                allPeople.add(Person.createFemale(args[i], dateFormat.parse(args[i + 2])));
                System.out.println(allPeople.size() - 1);
            }
        }
    }

    public static void update(String[] args) throws ParseException {
        for (int i = 1; i < args.length; i = i + 4) {

            if (args[i + 2].equals("м")) {

                allPeople.get(Integer.parseInt(args[i])).setSex(Sex.MALE);
                allPeople.get(Integer.parseInt(args[i])).setName(args[i + 1]);
                allPeople.get(Integer.parseInt(args[i])).setBirthDate(dateFormat.parse(args[i + 3]));


            } else if (args[i + 2].equals("ж")) {
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
                allPeople.get(Integer.parseInt(args[i])).setName(args[i + 1]);
                allPeople.get(Integer.parseInt(args[i])).setBirthDate(dateFormat.parse(args[i + 3]));

            }
        }

    }

    public static void delete(String[] args) {
        for (int i = 1; i < args.length; i++) {
            allPeople.get(Integer.parseInt(args[i])).setName(null);
            allPeople.get(Integer.parseInt(args[i])).setSex(null);
            allPeople.get(Integer.parseInt(args[i])).setBirthDate(null);
        }
    }

    public static void info(String[] args) {

        for (int i = 1; i < args.length; i++) {
            Person person = allPeople.get(Integer.parseInt(args[i]));
            System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE ? "м" : "ж") + " " + dateFormatInfo.format(person.getBirthDate()));

        }

    }
}
