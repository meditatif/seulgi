package org.redvelvet.seulgi.base.persistence;

import org.redvelvet.seulgi.base.domain.Entity;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public abstract class EntityRepositorySupport<T extends Entity> implements EntityRepository<T> {
    private Map<Long, T> entities = new HashMap<>();
    private AtomicLong id = new AtomicLong(1);

    protected EntityRepositorySupport() {
    }

    @Override
    public T findOne(Long id) {
        return entities.get(id);
    }

    @Override
    public void save(T entity) {
        entity.setId(id.getAndAdd(1));
        entities.put(entity.getId(), entity);
    }
}
