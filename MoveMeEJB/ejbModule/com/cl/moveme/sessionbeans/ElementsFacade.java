/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cl.moveme.sessionbeans;

import com.cl.moveme.entities.Elements;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Chrystian Duarte
 */
@Stateless(mappedName="Elements",name="elementsejbref")
public class ElementsFacade extends AbstractFacade<Elements> implements ElementsFacadeLocal {
    @PersistenceContext(unitName = "MoveMe-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ElementsFacade() {
        super(Elements.class);
        
    }
    
}
