package com.hrms.testscripts;

import com.hrms.LIB.General;

public class Execute extends General {

	public static void main(String[] args) throws InterruptedException {

//		General g= new General();      we can use this or below object
		
		Execute e= new Execute();
		e.setUp();
		e.loginn();
		e.logoutt();
		e.tear();
		
	}

}
