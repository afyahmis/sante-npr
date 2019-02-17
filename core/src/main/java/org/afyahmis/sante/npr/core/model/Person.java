package org.afyahmis.sante.npr.core.model;

import org.afyahmis.sante.npr.shared.model.AggregateRoot;
import org.afyahmis.sante.npr.shared.model.Sex;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Person implements AggregateRoot {
    private PersonId personId;
    private PersonName personName;
    private Date birthDate;
    private Sex sex;
    private Set<PersonIdentifier> personIdentifiers=new HashSet<>();

    public PersonId getPersonId() {
        return personId;
    }

    public PersonName getPersonName() {
        return personName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Sex getSex() {
        return sex;
    }

    public Set<PersonIdentifier> getPersonIdentifiers() {
        return personIdentifiers;
    }

    protected Person(){
    }

    public Person(PersonId personId, PersonName personName, Date birthDate, Sex sex) {
        this.personId = personId;
        this.personName = personName;
        this.birthDate = birthDate;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        return personId != null ? personId.equals(person.personId) : person.personId == null;
    }

    @Override
    public int hashCode() {
        return personId != null ? personId.hashCode() : 0;
    }

    @Override
    public String toString() {
        return personName.toString();
    }
}
