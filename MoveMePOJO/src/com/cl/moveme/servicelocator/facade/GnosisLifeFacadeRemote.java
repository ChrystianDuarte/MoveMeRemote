/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cl.moveme.servicelocator.facade;

import java.util.List;
import javax.ejb.Remote;

import com.cl.moveme.entities.Oportunidad;

/**
 *
 * @author fito
 */
@Remote
public interface GnosisLifeFacadeRemote {

    public java.lang.String getHola();
    public int countElements() ;
    public int countPersona();
    public int countOportunidades();
    public List<?> findAllOportunidad();
    public void createOportunidad(Oportunidad oportunidad);
    
    //public com.colsin.gnosislife.entities.SegIndicadores findMonitoring(java.lang.String codeIndicator, java.util.Date dateObjetive);

  
   
}
