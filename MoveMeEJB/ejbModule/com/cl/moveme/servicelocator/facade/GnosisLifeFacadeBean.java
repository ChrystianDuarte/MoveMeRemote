/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cl.moveme.servicelocator.facade;

import javax.ejb.Stateless;

/**
 *
 * 
 * @author fito
 */
@Stateless
public class GnosisLifeFacadeBean implements GnosisLifeFacadeRemote {

   /* @EJB
    SegIndicadoresFacadeLocal segIndicadoresFacade;
    @EJB
    ObjObjetivosFacadeLocal objObjetivosFacade;
    @EJB
    IndIndicadoresFacadeLocal indIndicadoresFacade;
    @EJB
    PmaPresentacionMapaFacadeLocal pmaPresentacionMapaFacade;
    @EJB
    PmePresentacionMapaElementoFacadeLocal pmePresentacionMapaElementoFacade;
    @EJB
    PerPerspectivaFacadeLocal perPerspectivaFacade;
    @EJB
    IniEstrategicasFacadeLocal iniEstrategicasFacade;
    @EJB
    ProcessElementLogicLocal processElementLogicLocal;
    @EJB
    PtePresentacionTipoElementoFacadeLocal ptePresentacionTipoElementoFacadeLocal;
    @EJB
    PelPresentacionElementoFacadeLocal pelPresentacionElementoFacadeLocal;
    @EJB
    EltElementoTipoFacadeLocal elementoTipoFacadeLocal;
    @EJB
    TarTareasFacadeLocal tarTareasFacadeLocal;
    @EJB
    FdmFrecuenciamedicionFacadeLocal fdmFrecuenciamedicionFacadeLocal;
    @EJB
    IngIndicadorGraficaFacadeLocal ingIndicadorGraficaFacadeLocal;
    @EJB
    AueAccesoUsuarioElementoFacadeLocal aueAccesoUsuarioElementoFacadeLocal;
    @EJB
    VreVRelacionFacadeLocal vreVRelacionFacadeLocal;
    @EJB
    VelVElementoFacadeLocal velVElementoFacadeLocal;
    @EJB
    AniAccesoNivelFacadeLocal aniAccesoNivelFacadeLocal;
    @EJB
    AudAuditoriaFacadeLocal audAuditoriaFacadeLocal;
    @EJB
    RelCausaEfectoFacadeLocal relCausaEfectoFacadeLocal;
    @EJB
    MarEstrategicoFacadeLocal marEstrategicoFacadeLocal;
*/

    public String getHola() {
    	
    	System.out.println("Entro");
        return "Hi MoveMe!!!!";
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
