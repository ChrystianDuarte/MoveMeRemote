/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cl.moveme.sessionbeans;

import com.cl.moveme.entities.Oportunidad;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Chrystian Duarte
 */
@Stateless
public class OportunidadFacade extends AbstractFacade<Oportunidad> implements OportunidadFacadeLocal {

    @PersistenceContext(unitName = "MoveMe-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OportunidadFacade() {
        super(Oportunidad.class);
    }
    
}
