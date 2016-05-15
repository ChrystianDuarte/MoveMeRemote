/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cl.moveme.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Chrystian Duarte
 */
@Embeddable
public class OportunidadPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ID" ,nullable = false)
    private int id;
    @Basic(optional = false)
    @Column(name = "RESPONSABLE",nullable= false)
    private int responsable;

    public OportunidadPK() {
    }

    public OportunidadPK(int id, int responsable) {
        this.id = id;
        this.responsable = responsable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getResponsable() {
        return responsable;
    }

    public void setResponsable(int responsable) {
        this.responsable = responsable;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) responsable;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OportunidadPK)) {
            return false;
        }
        OportunidadPK other = (OportunidadPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.responsable != other.responsable) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cl.moveme.entities.OportunidadPK[ id=" + id + ", responsable=" + responsable + " ]";
    }
    
}
