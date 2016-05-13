package com.cl.moveme.test;



import com.cl.moveme.servicelocator.delegate.GnosisLifeBusinessDelegate;

public class Test {

	GnosisLifeBusinessDelegate delegate = new GnosisLifeBusinessDelegate();
	public Test(){
		
		delegate = new GnosisLifeBusinessDelegate();
		System.out.println("----------Start--------");
			
		System.out.println("Numero de elementos= "+delegate.countElements());
		System.out.println("Numero de Persona= "+delegate.countPersona());
		System.out.println("Numero de opy= " +delegate.countOportunidades());
		System.out.println("----------Finish--------");
		
	}	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Test test =new Test();
	}

}
