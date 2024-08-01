package hn.unah.lenguajes.hotel.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.hotel.modelos.TipoHabitacion;

public interface TipoHabitacionRepositorio extends JpaRepository <TipoHabitacion, Long> {

    public TipoHabitacion descripcion (String descripcion);
    
}
