
package com.GenerosiApp.service;

import com.GenerosiApp.domain.Solicitud;
import java.util.List;

public interface SolicitudService {
    
    public List<Solicitud> getSolicitudes();
    
    public void save(Solicitud solicitud);
    
    public void delete(Solicitud solicitud);
    
    public Solicitud getSolicitud(Solicitud solicitud);
    
}
