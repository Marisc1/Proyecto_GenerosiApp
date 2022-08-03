
package com.GenerosiApp.service;

import com.GenerosiApp.dao.VoluntarioDao;
import com.GenerosiApp.domain.Voluntario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VoluntarioServiceImpl implements VoluntarioService {

    @Autowired
    private VoluntarioDao voluntarioDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Voluntario> getVoluntarios() {
        return (List<Voluntario>)voluntarioDao.findAll();
    }

    @Override
    public void save(Voluntario voluntario) {
        voluntarioDao.save(voluntario);
    }
    
    @Override
    public void delete(Voluntario voluntario) {
        voluntarioDao.delete(voluntario);
    }

    @Override
    @Transactional(readOnly = true)
    public Voluntario getVoluntario(Voluntario voluntario) {
        return voluntarioDao.findById(voluntario.getId_voluntario()).orElse(null);
    }
    
}