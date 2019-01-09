package com.singeltondp;

public class SingeltonTEst {

	public static void main(String[] args) {
		Singelton singelton=Singelton.getInstance();
		System.out.println(singelton);
		Singelton singelton1=Singelton.getInstance();
		System.out.println(singelton1);
		
	}

}
