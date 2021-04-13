package com.military.profile;

public class Person {

    private String name;
    private int age;
    private String sex;


    Adress adress = new Adress(this.country, this.city);

    String city = adress.getCity();
    String country = adress.getCountry();


    public Person(String nameObj, int ageObj, String sexObj, String cityObj, String countryObj) {
        this.name = nameObj;
        this.age = ageObj;
        this.sex = sexObj;
        this.city = cityObj;
        this.country = countryObj;
    }


}
