
package com.GenerosiApp.service;

import com.GenerosiApp.dao.AdministradorDao;
import com.GenerosiApp.domain.Administrador;
import com.GenerosiApp.domain.Administrador;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdministradorServiceImpl implements AdministradorService {

    @Autowired
    private AdministradorDao administradorDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Administrador> getAdministradores() {
        return (List<Administrador>)administradorDao.findAll();
    }

    @Override
    public void save(Administrador administrador) {
        administradorDao.save(administrador);
    }

    @Override
    public void delete(Administrador administrador) {
        administradorDao.delete(administrador);
    }

    @Override
    @Transactional(readOnly = true)
    public Administrador getAdministrador(Administrador administrador) {
        return administradorDao.findById(administrador.getId_administrador()).orElse(null);
    }

    
    
}