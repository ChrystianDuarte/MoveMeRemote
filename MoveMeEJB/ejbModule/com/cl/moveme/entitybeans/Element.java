package com.cl.moveme.entitybeans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the elements database table.
 * 
 */
@Entity
@Table(name="elements")
public class Element implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int nombre;

	public Element() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNombre() {
		return this.nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

}