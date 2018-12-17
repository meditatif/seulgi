package org.redvelvet.seulgi.domain.movie.repository;

import org.redvelvet.seulgi.base.persistence.EntityRepositorySupport;
import org.redvelvet.seulgi.domain.movie.Screening;
import org.redvelvet.seulgi.domain.movie.ScreeningRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ScreeningRepositoryImpl extends EntityRepositorySupport<Screening> implements ScreeningRepository {
}
