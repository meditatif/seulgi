package org.redvelvet.seulgi.domain.movie.pricing;

import org.redvelvet.seulgi.domain.movie.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
