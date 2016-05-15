package com.cl.moveme.data;

public class Contributor {

	private String name;
	private String apellido;
	private  String tittle;
	private  int edad=0;
	
	public Contributor(String name,String apellido, String tittle, int edad){
		
		this.name=name;
		this.apellido=apellido;
		this.tittle=tittle;
		this.edad=edad;
	}
	
	public Contributor() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
		
	
	}


