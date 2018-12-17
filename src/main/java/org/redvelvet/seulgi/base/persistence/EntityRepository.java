package org.redvelvet.seulgi.base.persistence;

import org.redvelvet.seulgi.base.domain.Entity;

public interface EntityRepository<T extends Entity> {
    T findOne(Long id);
    void save(T entity);
}
