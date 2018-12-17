package org.redvelvet.seulgi.domain.movie.repository;

import org.redvelvet.seulgi.base.persistence.EntityRepositorySupport;
import org.redvelvet.seulgi.domain.movie.Customer;
import org.redvelvet.seulgi.domain.movie.CustomerRepository;
import org.redvelvet.seulgi.domain.movie.Reservation;
import org.redvelvet.seulgi.domain.movie.ReservationRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationRepositoryImpl extends EntityRepositorySupport<Reservation> implements ReservationRepository {
}
