package org.redvelvet.seulgi.domain.movie.pricing;

import org.redvelvet.seulgi.domain.movie.Screening;
import org.redvelvet.seulgi.domain.money.Money;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
