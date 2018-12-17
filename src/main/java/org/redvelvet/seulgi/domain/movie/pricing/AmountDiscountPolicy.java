package org.redvelvet.seulgi.domain.movie.pricing;

import org.redvelvet.seulgi.domain.movie.Screening;
import org.redvelvet.seulgi.domain.money.Money;

public class AmountDiscountPolicy extends DiscountPolicy{
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition ... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
