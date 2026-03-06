/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;


import salonBelleza.com.domain.Servicio;
import java.util.List;

public interface ServicioService {
      List<Servicio> listar();
    Servicio buscarPorId(Integer id);
    void guardar(Servicio servicio);
    void eliminar(Integer id);
    
}
