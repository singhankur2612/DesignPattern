package com.singeltondp;

import javax.management.RuntimeErrorException;

public class Singelton {
	private static Singelton singelton=null;
	private Singelton(){
		if(singelton!=null) {
			throw new RuntimeException("use get instance method");
		}
		
	}
	public static Singelton getInstance() {
		if(singelton==null) {
			synchronized (Singelton.class) {
				if(singelton==null) {
					singelton=new Singelton();
				}
			}
		}
		return singelton;
	}

}
