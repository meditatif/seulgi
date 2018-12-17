package org.redvelvet.seulgi.domain.movie.repository;

import org.redvelvet.seulgi.base.persistence.EntityRepositorySupport;
import org.redvelvet.seulgi.domain.movie.Customer;
import org.redvelvet.seulgi.domain.movie.CustomerRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepositoryImpl extends EntityRepositorySupport<Customer> implements CustomerRepository {
}
