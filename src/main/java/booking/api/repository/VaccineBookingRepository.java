package booking.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import booking.api.model.VaccineBooking;

public interface VaccineBookingRepository extends JpaRepository<VaccineBooking, Long> {

}
