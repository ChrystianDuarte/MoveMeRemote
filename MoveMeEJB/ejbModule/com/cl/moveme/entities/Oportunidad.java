/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cl.moveme.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Chrystian Duarte
 */
@Entity
@Table(name = "oportunidad", catalog = "Moveme", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Oportunidad.findAll", query = "SELECT o FROM Oportunidad o"),
    @NamedQuery(name = "Oportunidad.findById", query = "SELECT o FROM Oportunidad o WHERE o.oportunidadPK.id = :id"),
    @NamedQuery(name = "Oportunidad.findByResponsable", query = "SELECT o FROM Oportunidad o WHERE o.oportunidadPK.responsable = :responsable"),
    @NamedQuery(name = "Oportunidad.findByNombre", query = "SELECT o FROM Oportunidad o WHERE o.nombre = :nombre"),
    @NamedQuery(name = "Oportunidad.findByTipo", query = "SELECT o FROM Oportunidad o WHERE o.tipo = :tipo"),
    @NamedQuery(name = "Oportunidad.findByCliente", query = "SELECT o FROM Oportunidad o WHERE o.cliente = :cliente"),
    @NamedQuery(name = "Oportunidad.findByEstado", query = "SELECT o FROM Oportunidad o WHERE o.estado = :estado"),
    @NamedQuery(name = "Oportunidad.findByMonto", query = "SELECT o FROM Oportunidad o WHERE o.monto = :monto")})
public class Oportunidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OportunidadPK oportunidadPK;
    @Basic(optional = false)
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE" ,nullable=false)
    private String nombre;
    @Size(max = 50)
    @Column(name = "TIPO")
    private String tipo;
    @Size(max = 50)
    @Column(name = "CLIENTE")
    private String cliente;
    @Size(max = 50)
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "MONTO")
    private Integer monto;
    @JoinColumn(name = "ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Elements elements;
    @JoinColumn(name = "ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Persona persona;

    public Oportunidad() {
    }

    public Oportunidad(OportunidadPK oportunidadPK) {
        this.oportunidadPK = oportunidadPK;
    }

    public Oportunidad(OportunidadPK oportunidadPK, String nombre) {
        this.oportunidadPK = oportunidadPK;
        this.nombre = nombre;
    }

    public Oportunidad(int id, int responsable) {
        this.oportunidadPK = new OportunidadPK(id, responsable);
    }

    public OportunidadPK getOportunidadPK() {
        return oportunidadPK;
    }

    public void setOportunidadPK(OportunidadPK oportunidadPK) {
        this.oportunidadPK = oportunidadPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public Elements getElements() {
        return elements;
    }

    public void setElements(Elements elements) {
        this.elements = elements;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oportunidadPK != null ? oportunidadPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Oportunidad)) {
            return false;
        }
        Oportunidad other = (Oportunidad) object;
        if ((this.oportunidadPK == null && other.oportunidadPK != null) || (this.oportunidadPK != null && !this.oportunidadPK.equals(other.oportunidadPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cl.moveme.entities.Oportunidad[ oportunidadPK=" + oportunidadPK + " ]";
    }
    
}
