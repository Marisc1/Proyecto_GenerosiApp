
package com.GenerosiApp.service;

import com.GenerosiApp.domain.Voluntariado;
import java.util.List;

public interface VoluntariadoService {
    
    public List<Voluntariado> getVoluntariados();
    
    public void save(Voluntariado voluntariado);
    
    public void delete(Voluntariado voluntariado);
    
    public Voluntariado getVoluntariado(Voluntariado voluntariado);
    
}
