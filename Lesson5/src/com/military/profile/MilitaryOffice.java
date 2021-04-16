package com.military.profile;

public class MilitaryOffice {
    private PersonRegestry personRegestry;

    public MilitaryOffice(PersonRegestry personRegestry) {
        this.personRegestry = personRegestry;
    }

    public PersonRegestry getPersonRegestry() {
        return personRegestry;
    }

    public void setPersonRegestry(PersonRegestry personRegestry) {
        this.personRegestry = personRegestry;
    }
}
