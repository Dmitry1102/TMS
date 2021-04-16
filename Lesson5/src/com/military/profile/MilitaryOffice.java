package com.military.profile;

public class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public PersonRegistry getPersonRegestry() {
        return personRegistry;
    }

    public void setPersonRegistry(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }
}
