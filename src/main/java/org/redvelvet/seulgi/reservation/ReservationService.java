package org.redvelvet.seulgi.reservation;

import org.redvelvet.seulgi.domain.movie.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    private final CustomerRepository customerRepository;
    private final ScreeningRepository screeningRepository;
    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(CustomerRepository customerRepository,
                              ScreeningRepository screeningRepository,
                              ReservationRepository reservationRepository) {
        this.customerRepository = customerRepository;
        this.screeningRepository = screeningRepository;
        this.reservationRepository = reservationRepository;
    }

    public Reservation reserve(Long audienceId, Long screeningId, int audienceCount) {
        Customer customer = customerRepository.findOne(audienceId);
        Screening screening = screeningRepository.findOne(screeningId);

        Reservation reservation = screening.reserve(customer, audienceCount);

        reservationRepository.save(reservation);

        return reservation;
    }
}
