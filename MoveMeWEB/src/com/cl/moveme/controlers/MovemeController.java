/**
 * 
 */
package com.cl.moveme.controlers;
import java.util.List;
import java.util.Set;
 
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Image;
import org.zkoss.zul.Label;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.ext.Selectable;
/**
 * @author Chrystian Duarte
 *
 */
public class MovemeController extends SelectorComposer<Component>{

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
