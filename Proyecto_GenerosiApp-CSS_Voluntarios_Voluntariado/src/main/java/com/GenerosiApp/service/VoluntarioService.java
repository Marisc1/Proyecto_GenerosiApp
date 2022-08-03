
package com.GenerosiApp.service;

import com.GenerosiApp.domain.Voluntario;
import java.util.List;

public interface VoluntarioService {
    
    public List<Voluntario> getVoluntarios();
    
    public void save(Voluntario voluntario);
    
    public void delete(Voluntario voluntario);
    
    public Voluntario getVoluntario(Voluntario voluntario);
    
}
