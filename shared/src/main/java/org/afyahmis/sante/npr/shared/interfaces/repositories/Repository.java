package org.afyahmis.sante.npr.shared.interfaces.repositories;

import java.util.Set;

public interface Repository<T,TId> {
    T get(TId id);
    Set<T> getAll();
    void createOrUpdate(T entity);
    void delete(TId id);
}
