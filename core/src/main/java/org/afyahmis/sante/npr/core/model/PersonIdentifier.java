package org.afyahmis.sante.npr.core.model;

import org.afyahmis.sante.npr.shared.model.AggregateRoot;
import org.afyahmis.sante.npr.shared.utils.LiveGuid;

import java.util.UUID;

public class PersonIdentifier implements AggregateRoot {
    private UUID id;
    private PersonId personId;
    private Identifier identifier;

    public UUID getId() {
        return id;
    }

    public PersonId getPersonId() {
        return personId;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public PersonIdentifier(UUID id, PersonId personId, Identifier identifier) {
        this.id = id;
        this.personId = personId;
        this.identifier = identifier;
    }

    public PersonIdentifier(PersonId personId, Identifier identifier) {
        this(LiveGuid.NewId(), personId, identifier);
    }

    @Override
    public String toString() {
        return identifier.toString();
    }
}
