package com.anno.common;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented // Annotation을 JavaDoc에 포함함
@Retention(RetentionPolicy.RUNTIME) //Annotation 정보가 언제까지 유지될지를 지정함, RUNTIME(소스, 클래스, 실행시에 사용됨)
@Target(value={ElementType.TYPE, ElementType.METHOD }) //Annotation을 적용할 대상을 지정함, TYPE(클래스, 인터페이스, enum)
public @interface Login {
	String number();
	String date() default "2013-10-9";
	
}
