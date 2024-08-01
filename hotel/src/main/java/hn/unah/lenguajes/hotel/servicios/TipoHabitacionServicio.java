package hn.unah.lenguajes.hotel.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hn.unah.lenguajes.hotel.modelos.TipoHabitacion;
import hn.unah.lenguajes.hotel.repositorios.TipoHabitacionRepositorio;

@Service
public class TipoHabitacionServicio {

    @Autowired
    private TipoHabitacionRepositorio tipoHabitacionRepositorio;

    public List<TipoHabitacion> obtenerTipoHabitacion(){
        return this.tipoHabitacionRepositorio.findAll();

    }

    public TipoHabitacion crearHabitacion(String descripcion, double valorAdicional){
        TipoHabitacion tipoHabitacion = new TipoHabitacion();
        tipoHabitacion.setDescripcion(descripcion);
        tipoHabitacion.setValorAdicional(valorAdicional);

        return this.tipoHabitacionRepositorio.save(tipoHabitacion);

    }

    public TipoHabitacion buscarporId(long id){
        return this.tipoHabitacionRepositorio.findById(id).get();

    }

    public String eliminarPorId(long id){
        if(this.tipoHabitacionRepositorio.existsById(id)){
            this.tipoHabitacionRepositorio.deleteById(id);
            return "El registro se ha eliminado";
        }
        return "El registro no existe";

    }




    
}
