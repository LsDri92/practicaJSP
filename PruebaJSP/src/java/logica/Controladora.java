package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearPersona (persona per){  
        controlPersis.crearPersona(per);
    }
    
    public void eliminarPersona (int id){       
        controlPersis.eliminarPersona(id);
    }
    
    public void eliminarPersona (persona pers) {
        controlPersis.eliminarPersona(pers);
    }
    
    public List<persona> traerPersonas(){
        return controlPersis.traerPersonas();
    }
    
    public void editarPersona (int id) {
        controlPersis.editarPersona(id);
    }
    
    public void editarPersona (persona pers) {
        controlPersis.editarPersona(pers);
    }
    
    
    
    
}
