package org.redvelvet.seulgi.domain.movie.repository;

import org.redvelvet.seulgi.base.persistence.EntityRepositorySupport;
import org.redvelvet.seulgi.domain.movie.Movie;
import org.redvelvet.seulgi.domain.movie.MovieRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MovieRepositoryImpl extends EntityRepositorySupport<Movie> implements MovieRepository {
}
