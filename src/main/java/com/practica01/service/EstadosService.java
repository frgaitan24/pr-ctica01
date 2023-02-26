package com.practica01.service;

import com.practica01.domain.Estados;
import java.util.List;
/**
 *
 * @author Usuario
 */
public interface EstadosService {
        public List<Estados> getEstados();

    public Estados getEstados(Estados estado);
    
    public void save (Estados estado);//Insertar y Modificar un registro
    
    public void delete (Estados estado);
}
