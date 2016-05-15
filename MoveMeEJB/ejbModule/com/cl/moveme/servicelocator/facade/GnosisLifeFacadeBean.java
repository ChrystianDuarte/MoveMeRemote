/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cl.moveme.servicelocator.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.cl.moveme.entities.Oportunidad;
import com.cl.moveme.sessionbeans.ElementsFacadeLocal;
import com.cl.moveme.sessionbeans.OportunidadFacadeLocal;
import com.cl.moveme.sessionbeans.PersonaFacadeLocal;

/**
 *
 * 
 * @author fito
 */
@Stateless
public class GnosisLifeFacadeBean implements GnosisLifeFacadeRemote {

	@EJB
	ElementsFacadeLocal elementsFacadeLocal;
	@EJB
	OportunidadFacadeLocal oportunidadFacadeLocal;
	@EJB
	PersonaFacadeLocal personaFacadeLocal;
	
	

    public String getHola() {
    	
    	System.out.println("Entro");
        return "Hi MoveMe!!!!";
    }
    
    public int countElements() {
    	return elementsFacadeLocal.count();
    	
    }
    
    public int countPersona() {
    	return personaFacadeLocal.count();
    	
    }
    public int countOportunidades() {
    	return oportunidadFacadeLocal.count();
    	
    }
    public List<?> findAllOportunidad(){
    	return oportunidadFacadeLocal.findAll();
    	
    }
    public void createOportunidad(Oportunidad oportunidad) {
    	
    	System.out.println("Contexto EJB-crear oportunidad:"+oportunidad);
    	System.out.println("Contexto EJB-crear oportunidadPK:"+oportunidad.getOportunidadPK());
    	System.out.println("Contexto EJB-crear oportunidadNombre:"+oportunidad.getNombre());
    	System.out.println("Contexto EJB-crear oportunidadTipo:"+oportunidad.getTipo());
    	oportunidadFacadeLocal.create(oportunidad);
    }

  
}
