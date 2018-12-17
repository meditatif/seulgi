package org.redvelvet.seulgi.config;

import org.redvelvet.seulgi.domain.money.Money;
import org.redvelvet.seulgi.domain.movie.*;
import org.redvelvet.seulgi.domain.movie.pricing.PercentDiscountPolicy;
import org.redvelvet.seulgi.domain.movie.pricing.PeriodCondition;
import org.redvelvet.seulgi.domain.movie.pricing.SequenceCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Component
public class EntityInitializationListener {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private ScreeningRepository screeningRepository;

    @EventListener
    public void handle(ContextRefreshedEvent event) {
        customerRepository.save(new Customer("슬기"));

        movieRepository.save(
                new Movie("타이타닉", Duration.ofMinutes(180), Money.wons(11000),
                        new PercentDiscountPolicy(0.1,
                            new PeriodCondition(DayOfWeek.TUESDAY, LocalTime.of(14, 0), LocalTime.of(17, 0)),
                            new SequenceCondition(2),
                            new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(14, 0)))));

        screeningRepository.save(new Screening(movieRepository.findOne(1L), 1, LocalDateTime.of(2019, 12, 1, 10, 0)));
        screeningRepository.save(new Screening(movieRepository.findOne(1L), 2, LocalDateTime.of(2019, 12, 1, 12, 0)));
    }
}
