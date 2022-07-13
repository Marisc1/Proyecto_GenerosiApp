
package com.GenerosiApp.service;

import com.GenerosiApp.domain.Voluntariado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.GenerosiApp.dao.VoluntariadoDao;

@Service
public class VoluntariadoServiceImpl implements VoluntariadoService {

    @Autowired
    private VoluntariadoDao voluntariadoDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Voluntariado> getVoluntariados() {
        return (List<Voluntariado>)voluntariadoDao.findAll();
    }

    @Override
    @Transactional
    public void save(Voluntariado voluntariado) {
        voluntariadoDao.save(voluntariado);
    }

    @Override
    @Transactional
    public void delete(Voluntariado voluntariado) {
        voluntariadoDao.delete(voluntariado);
    }

    @Override
    @Transactional(readOnly = true)
    public Voluntariado getVoluntariado(Voluntariado voluntariado) {
        return voluntariadoDao.findById(voluntariado.getId_voluntariado()).orElse(null);
    }

    

}