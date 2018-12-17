package org.redvelvet.seulgi;

import org.redvelvet.seulgi.config.AppConfig;
import org.redvelvet.seulgi.domain.movie.Reservation;
import org.redvelvet.seulgi.reservation.ReservationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ReservationService service = applicationContext.getBean(ReservationService.class);
        Reservation reservation = service.reserve(1L, 2L, 2);
        System.out.println(reservation.getFee());
    }
}
