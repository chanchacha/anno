package com.anno.controller;

import com.anno.common.Login;

public class Test {

	@Login(number="010-5157-6499")
	public void test1(){
		
	}
	
	@Login(number="010-5157-6499test")
	public String test2(){
		return "test2";
	}
}
