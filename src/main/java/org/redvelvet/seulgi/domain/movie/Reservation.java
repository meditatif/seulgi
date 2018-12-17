package org.redvelvet.seulgi.domain.movie;

import org.redvelvet.seulgi.base.domain.Entity;
import org.redvelvet.seulgi.domain.money.Money;

public class Reservation implements Entity {
    private Long id;
    private Customer customer;
    private Screening Screening;
    private Money fee;
    private int audienceCount;

    public Reservation(Customer customer, Screening Screening, Money fee, int audienceCount) {
        this.customer = customer;
        this.Screening = Screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
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
}
