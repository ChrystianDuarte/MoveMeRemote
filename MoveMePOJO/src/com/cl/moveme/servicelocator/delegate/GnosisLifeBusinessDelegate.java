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

	public int countElements() {
		return fachada.countElements();

	}

	public int countPersona() {

		return fachada.countOportunidades();
	}

	public int countOportunidades() {

		return fachada.countPersona();
	}

	/**
	 * Retorna un obj IngIndicadorGrafica de acuerdo al codigo
	 * 
	 * @param ingCode
	 * @return
	 * @throws EvaluationException
	 */
	/*
	 * public IngIndicadorGrafica findIndicatorByIndicatorGrafica(String
	 * ingCode) throws EvaluationException { return
	 * fachada.findIndicatorByIndicatorGrafica(ingCode); }
	 */

}
