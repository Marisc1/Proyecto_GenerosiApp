
package com.GenerosiApp.service;

import com.GenerosiApp.dao.SolicitudDao;
import com.GenerosiApp.domain.Solicitud;
import com.GenerosiApp.domain.Solicitud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SolicitudServiceImpl implements SolicitudService {

    @Autowired
    private SolicitudDao solicitudDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Solicitud> getSolicitudes() {
        return (List<Solicitud>)solicitudDao.findAll();
    }

    @Override
    public void save(Solicitud solicitud) {
        solicitudDao.save(solicitud);
    }

    @Override
    public void delete(Solicitud solicitud) {
        solicitudDao.delete(solicitud);
    }

    @Override
    @Transactional(readOnly = true)
    public Solicitud getSolicitud(Solicitud solicitud) {
        return solicitudDao.findById(solicitud.getId_solicitud()).orElse(null);
    }

    
    
}