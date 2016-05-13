/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cl.moveme.servicelocator.facade;

import javax.ejb.EJB;
import javax.ejb.Stateless;

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

    /**
     * Retorna un obj IngIndicadorGrafica de acuerdo al codigo
     * @param ingCode
     * @return
     * @throws EvaluationException
     */
  /*  public IngIndicadorGrafica findIndicatorByIndicatorGrafica(String ingCode) throws EvaluationException {
        return ingIndicadorGraficaFacadeLocal.findIndicatorByIndicatorGrafica(ingCode);
    }*/

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method" or "Web Service > Add Operation")
    // <editor-fold defaultstate="collapsed" desc="/*commentpublic void remove(SegIndicadores segIndicadores);// </editor-fold>*/">
    /**
     * Retorna la lista de seguimientos de un indicador de acuerdo al codigo del indicador
     * @param codeIndicator
     * @return
     */
  /*  public List<SegIndicadores> findAllSegIndicatorByCode(String codeIndicator) {
        return segIndicadoresFacade.findAllSegIndicatorByCode(codeIndicator);
    }*/

  
}
