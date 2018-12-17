package org.redvelvet.seulgi.domain.movie;

import org.redvelvet.seulgi.base.domain.Entity;
import org.redvelvet.seulgi.domain.movie.pricing.DiscountPolicy;
import org.redvelvet.seulgi.domain.money.Money;

import java.time.Duration;

public class Movie implements Entity {
    private Long id;
    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}

