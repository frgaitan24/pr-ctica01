package com.practica01.service;

import com.practica01.dao.EstadosDao;
import com.practica01.domain.Estados;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstadosServiceImpl implements EstadosService {

    @Autowired
    EstadosDao estadosDao;

    @Override
    @Transactional(readOnly = true)//Para manejar transacciones de solo lectura
    public List<Estados> getEstados() {
        return (List<Estados>) estadosDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)//Para manejar transacciones de solo lectura
    public Estados getEstados(Estados estados) {
        return estadosDao.findById(estados.getIdEstado()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Estados estados) {
        estadosDao.save(estados);
    }

    @Override
    @Transactional
    public void delete(Estados estados) {
        estadosDao.deleteById(estados.getIdEstado());
    }

}
