package com.staticCRUD;

import java.util.Date;

public class Person {
    private String name;
    private com.staticCRUD.Sex sex;
    private Date birthDate;

    private Person(String name, com.staticCRUD.Sex sex, Date birthDate) {
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
    }

    public static Person createMale(String name, Date birthDate) {
        return new Person(name, com.staticCRUD.Sex.MALE, birthDate);
    }

    public static Person createFemale(String name, Date birthDate) {
        return new Person(name, com.staticCRUD.Sex.FEMALE, birthDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public com.staticCRUD.Sex getSex() {
        return sex;
    }

    public void setSex(com.staticCRUD.Sex sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
