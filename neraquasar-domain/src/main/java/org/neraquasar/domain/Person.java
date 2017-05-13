package org.neraquasar.domain;

import java.time.LocalDate;

/**
 * Основные параметры личности. Не имеет интерейса, т.к. пока что рассчитан на гражданина РФ.
 *
 * @author Konstantin Valer'evich Dichenko
 *         Created 01.05.2017
 */
public class Person {

    private String firstname;

    private String surname;

    private String secondname;

    private LocalDate dateOfBirth;

    private LocalDate dateOfDeath;

    private Gender gender;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(LocalDate dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
