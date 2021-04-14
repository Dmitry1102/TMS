package com.military.profile;

public class Person {

    private String name;
    private int age;
    private String sex;
    Adress adress;


    public Person(String name, int age, String sex, Adress adress) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.adress = adress.getCountry();
        this.adress = adress.getCity();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
