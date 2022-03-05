
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.persona;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    
    personaJpaController persJPA = new personaJpaController();

    public ControladoraPersistencia() {
    }
    
    
    
    public void crearPersona(persona per) {
        
        persJPA.create(per);
    }
    
    public void eliminarPersona(int id) {
        try {
            persJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarPersona(persona pers){
        try {
            persJPA.destroy(pers.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<persona> traerPersonas() {
       return persJPA.findpersonaEntities();
    }
    
   public void editarPersona(int id) {
       try {
            persJPA.edit(id);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   public void editarPersona(persona pers) {
        try {
            persJPA.edit(pers.getId());
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
}
