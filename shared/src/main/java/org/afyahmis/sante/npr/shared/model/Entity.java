package org.afyahmis.sante.npr.shared.model;

import java.util.Objects;

public abstract class Entity<TId> {
    protected TId id;

    public TId getId() {
        return id;
    }

    protected Entity() {
    }

    protected Entity(TId id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entity)) return false;
        Entity<?> entity = (Entity<?>) o;
        return Objects.equals(id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
