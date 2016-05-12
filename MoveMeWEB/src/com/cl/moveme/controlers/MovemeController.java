package com.cl.moveme.controlers;

import javax.ejb.EJB;

import org.zkoss.zk.ui.Component;

import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.GenericForwardComposer;

import org.zkoss.zul.Textbox;

import com.cl.moveme.servicelocator.delegate.GnosisLifeBusinessDelegate;




//import com.cl.moveme.sessionbeans.ElementsFacadeLocal;

/**
 * @author Chrystian Duarte
 * 
 */
public class MovemeController extends GenericForwardComposer {
	
	
	private GnosisLifeBusinessDelegate delegate;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Wire
	private Textbox keywordBox;

	/**
	 * @param args
	 */

	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);

		System.out.println("Entra a doafter");
		delegate = new GnosisLifeBusinessDelegate();
		System.out.println("Inicia Contexto");
		System.out.println("Numero de registros"+delegate.getHola());
		

	}
	/*
	 * @Listen("onClick = #searchButton") public void search(){
	 * 
	 * 
	 * System.out.println("Hola Mundo ZK Controller");
	 * System.out.println("Numero de Elementos"+miEJB.count());
	 * 
	 * 
	 * 
	 * /* String keyword = keywordBox.getValue(); List<Car> result =
	 * carService.search(keyword); carListbox.setModel(new
	 * ListModelList<Car>(result));
	 */

	/**
	 * @return the delegate
	 */
	private GnosisLifeBusinessDelegate getDelegate() {
		return delegate;
	}

	/**
	 * @param delegate the delegate to set
	 */
	private void setDelegate(GnosisLifeBusinessDelegate delegate) {
		this.delegate = delegate;
	}

}
