package com.anno.common;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented // Annotation�� JavaDoc�� ������
@Retention(RetentionPolicy.RUNTIME) //Annotation ������ �������� ���������� ������, RUNTIME(�ҽ�, Ŭ����, ����ÿ� ����)
@Target(value={ElementType.TYPE, ElementType.METHOD }) //Annotation�� ������ ����� ������, TYPE(Ŭ����, �������̽�, enum)
public @interface Login {
	String number();
	String date() default "2013-10-9";
	
}
