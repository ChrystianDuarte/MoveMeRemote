/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cl.moveme.sessionbeans;

import com.cl.moveme.entities.Elements;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Chrystian Duarte
 */
@Local
public interface ElementsFacadeLocal {

    void create(Elements elements);

    void edit(Elements elements);

    void remove(Elements elements);

    Elements find(Object id);

    List<Elements> findAll();

    List<Elements> findRange(int[] range);

    int count();
    
}
