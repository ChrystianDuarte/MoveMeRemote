package com.cl.moveme.test;

import org.apache.derby.tools.sysinfo;

import com.cl.moveme.servicelocator.delegate.GnosisLifeBusinessDelegate;

public class Test {

	GnosisLifeBusinessDelegate delegate = new GnosisLifeBusinessDelegate();
	public Test(){
		
		delegate = new GnosisLifeBusinessDelegate();
		System.out.println("----------Start--------");
		System.out.println(delegate.getHola());
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
