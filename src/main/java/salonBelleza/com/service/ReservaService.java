package salonBelleza.com.service;

import salonBelleza.com.domain.Reserva;
import java.util.List;

public interface ReservaService {
    List<Reserva> listar();
    Reserva buscarPorId(Integer id);
    void guardar(Reserva reserva);
    void eliminar(Integer id);
}