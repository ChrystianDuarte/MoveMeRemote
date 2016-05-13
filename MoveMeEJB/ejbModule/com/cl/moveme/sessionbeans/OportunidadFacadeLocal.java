/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cl.moveme.sessionbeans;

import com.cl.moveme.entities.Oportunidad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Chrystian Duarte
 */
@Local
public interface OportunidadFacadeLocal {

    void create(Oportunidad oportunidad);

    void edit(Oportunidad oportunidad);

    void remove(Oportunidad oportunidad);

    Oportunidad find(Object id);

    List<Oportunidad> findAll();

    List<Oportunidad> findRange(int[] range);

    int count();
    
}
