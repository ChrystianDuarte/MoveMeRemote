package com.cl.moveme.controlers;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.apache.commons.logging.*;

import com.cl.moveme.entities.Oportunidad;
import com.cl.moveme.entities.OportunidadPK;
import com.cl.moveme.servicelocator.delegate.GnosisLifeBusinessDelegate;

public class OportunidadController {

	// private Log log =
	// LogFactory.getLog("com.cl.moveme.controlers.OportunidadController");
	private Oportunidad oportunidad = new Oportunidad();
	private OportunidadPK oportunidadPK = new OportunidadPK();
	private GnosisLifeBusinessDelegate delegate;

	public OportunidadPK getOportunidadPK() {
		return oportunidadPK;
	}

	public void setOportunidadPK(OportunidadPK oportunidadPK) {
		this.oportunidadPK = oportunidadPK;
	}

	public OportunidadController() {
		// TODO Auto-generated constructor stub
		System.out.println("Hola constructor");
		// log.info("--Constructor de oportunidad---");
	}

	public Oportunidad getOportunidad() {
		return oportunidad;
	}

	public void setOportunidad(Oportunidad oportunidad) {
		this.oportunidad = oportunidad;
	}

	@Init
	public void init() {
		System.out.println("Hola init");
		delegate = new GnosisLifeBusinessDelegate();
		// log.info("--method init---");

	}

	@Command
	public void submit() {
		
		System.out.println("Oportunidad bindig: "+this.getOportunidad());
		System.out.println("Oportunidad- namebindig: "+this.getOportunidad().getNombre());
		System.out.println("Oportunidad- Tipobindig: " +this.getOportunidad().getTipo());
		this.setOportunidadPK(new OportunidadPK(4,1));
		this.getOportunidad().setOportunidadPK(this.getOportunidadPK());
		System.out.println("Oportunidad to insert: "+this.getOportunidad());
		this.delegate.createOportunidad(this.getOportunidad());
	}

}
