/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cl.moveme.servicelocator.delegate;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.cl.moveme.servicelocator.facade.GnosisLifeFacadeRemote;

/**
 *
 * @author fito
 */
public class GnosisLifeBusinessDelegate {

    private GnosisLifeLookupService localizador;
    private GnosisLifeFacadeRemote fachada;

    public GnosisLifeBusinessDelegate() {
        localizador = new GnosisLifeLookupService();
        fachada = (GnosisLifeFacadeRemote) localizador.localizarFachada(null);
    }

    public String getHola() {
        return fachada.getHola();
    }


}
