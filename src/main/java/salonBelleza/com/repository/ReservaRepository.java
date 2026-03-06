

package salonBelleza.com.repository;


import salonBelleza.com.domain.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository
        <Reserva, Integer> {
}