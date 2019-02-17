package org.afyahmis.sante.npr.core.model;

import org.afyahmis.sante.npr.shared.model.ValueObject;
import org.afyahmis.sante.npr.shared.utils.LiveGuid;

import java.util.UUID;

public class PersonId implements ValueObject {
    private UUID id;

    public UUID getId() {
        return id;
    }

    public PersonId() {
        id = LiveGuid.NewId();
    }

    public PersonId(UUID id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonId)) return false;

        PersonId personId = (PersonId) o;

        return id != null ? id.equals(personId.id) : personId.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return id.toString();
    }
}
