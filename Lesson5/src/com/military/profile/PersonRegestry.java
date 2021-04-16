package com.military.profile;

import java.util.ArrayList;
import java.util.List;

public class PersonRegestry {
    private List<Person> personList = new ArrayList<>();

    public PersonRegestry(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }


}
