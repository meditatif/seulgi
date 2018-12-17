package org.redvelvet.seulgi.domain.movie.pricing;

import org.redvelvet.seulgi.domain.movie.Screening;
import org.redvelvet.seulgi.domain.money.Money;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition ... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
