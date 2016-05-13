/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cl.moveme.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Chrystian Duarte
 */
@Entity
@Table(name = "elements", catalog = "Moveme", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Elements.findAll", query = "SELECT e FROM Elements e"),
    @NamedQuery(name = "Elements.findById", query = "SELECT e FROM Elements e WHERE e.id = :id"),
    @NamedQuery(name = "Elements.findByPadre", query = "SELECT e FROM Elements e WHERE e.padre = :padre"),
    @NamedQuery(name = "Elements.findByTipo", query = "SELECT e FROM Elements e WHERE e.tipo = :tipo")})
public class Elements implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "PADRE")
    private Integer padre;
    @Size(max = 50)
    @Column(name = "TIPO")
    private String tipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "elements")
    private Collection<Oportunidad> oportunidadCollection;

    public Elements() {
    }

    public Elements(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPadre() {
        return padre;
    }

    public void setPadre(Integer padre) {
        this.padre = padre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @XmlTransient
    public Collection<Oportunidad> getOportunidadCollection() {
        return oportunidadCollection;
    }

    public void setOportunidadCollection(Collection<Oportunidad> oportunidadCollection) {
        this.oportunidadCollection = oportunidadCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Elements)) {
            return false;
        }
        Elements other = (Elements) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cl.moveme.entities.Elements[ id=" + id + " ]";
    }
    
}
