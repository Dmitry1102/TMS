package com.military.profile;

public class Person {

    private String name;
    private int age;
    private String sex;
    private Adress adress;

    public Person(String nameObj, int ageObj, String sexObj, String cityObj, String countryObj) {
        name = nameObj;
        age = ageObj;
        sex = sexObj;
        adress = new Adress(cityObj, countryObj);

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", adress=" + adress +
                '}';
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
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
