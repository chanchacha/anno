package com.anno.controller;

import java.util.regex.Pattern;

import com.anno.common.Login;


public class AnnoController {

	public static void main(String[] args) throws Exception {
        Test test = new Test();
        sysout(test);
    }
	
	public static void sysout(Test test) throws Exception{
		Login log = test.getClass().getMethod("test1").getAnnotation(Login.class);
		boolean bool = Pattern.matches("01[01689]-?(\\d{3,4}-?){2}", log.number());
		System.out.println("=== log ===");
		if(!bool){
			System.out.println("잘못된 전화 번호 입니다.");
			System.out.println(log.number().replaceAll("(?:\\D)", ""));
		}

		Login log1 = test.getClass().getMethod("test2").getAnnotation(Login.class);
		boolean bool1 = Pattern.matches("01[01689]-?(\\d{3,4}-?){2}", log1.number());
		System.out.println("=== log1 ===");
		if(!bool1){
			System.out.println("잘못된 전화 번호 입니다.");
			System.out.println(log1.number());
			System.out.println(log1.number().replaceAll("(?:\\D)", ""));
			System.out.println(log1.number().replaceAll("[\\s|\\d]", ""));
			
		}
	}
}
