/**
 * 
 */
package com.cl.moveme.controlers;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;

import org.zkoss.zul.Textbox;

/**
 * @author Chrystian Duarte
 *
 */
public class MovemeController extends SelectorComposer<Component>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Wire
    private Textbox keywordBox;
	/**
	 * @param args
	 */
	@Listen("onClick = #searchButton")
    public void search(){
		
		
		System.out.println("Hola Mundo ZK Controller");
      /* String keyword = keywordBox.getValue();
        List<Car> result = carService.search(keyword);
        carListbox.setModel(new ListModelList<Car>(result));*/
    }

}
