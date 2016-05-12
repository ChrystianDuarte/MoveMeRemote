package com.cl.moveme.controlers;

import javax.ejb.EJB;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import javax.naming.Context;
import javax.naming.InitialContext;
import org.zkoss.zul.Textbox;
import com.cl.moveme.sessionbeans.*;



//import com.cl.moveme.sessionbeans.ElementsFacadeLocal;

/**
 * @author Chrystian Duarte
 * 
 */
public class MovemeController extends GenericForwardComposer {
	Context context;
	AbstractFacade facade;
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
		context = new InitialContext();
		System.out.println("Inicia Contexto");
		System.out.println((context.lookup("java:global/MoveMeEA/MoveMeEJB/elementsejbref")).getClass().getCanonicalName());
		facade = (AbstractFacade) context.lookup("java:global/MoveMeEA/MoveMeEJB/elementsejbref");
		System.out.println("Lookup a ejb");
		System.out.println("Numero de registros"+facade.count());
		

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

}
