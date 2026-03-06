package salonBelleza.com.service;

import salonBelleza.com.domain.Servicio;
import java.util.List;

public interface ServicioService {
    List<Servicio> listar();
    Servicio buscarPorId(Integer id);
    void guardar(Servicio servicio);
    void eliminar(Integer id);
}