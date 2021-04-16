package com.military.profile;

import java.util.List;

public class PersonRegistry {
    private List<Person> personList;

    public PersonRegistry(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }


}
