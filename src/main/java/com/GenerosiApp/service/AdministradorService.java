
package com.GenerosiApp.service;

import com.GenerosiApp.domain.Administrador;
import java.util.List;

public interface AdministradorService {
    
    public List<Administrador> getAdministradores();
    
    public void save(Administrador administrador);
    
    public void delete(Administrador administrador);
    
    public Administrador getAdministrador(Administrador administrador);
    
}
