package com.biz.lists;

import java.util.ArrayList;
import java.util.List;

public class List_01 {

	/*
	 * collections는 자바에 있는 또다른 배열의 형태
	 * 기존 배열들이 확장된 기능에 매우 취약해서 
	 * 사용이 불편한 면들이있다
	 * 
	 * 기존 배열의 단전을 보완하고 
	 * 다양한 기능들을 구형할수 있도록 만들어진 클래스들의 묶음
	 * 
	 * Framework: 어떤 규칙이 적용된 프로젝트 묶음
	 * -- 자바 고유의 규칙 +Framework만의 규칙
	 */
	public static void main(String[] args) {

		// ArrayList 클래스를 객체로 생성하는데
		// List Type으로 선언하겠다.
		
		//List Type 으로 객체를 선언하고
		// ArrayList 로 초기화한다
		List strList =new ArrayList<String>();
		
		strList.add("대한민국");
		strList.add("우리나라");
		strList.add("Repulic of Korea");
		
		// 0번째 뭔가를 읽어서(getter)문자열로 바꾸어(toString())
		//strN 에 저장하라
		String strN = strList.get(0).toString();
		System.out.println(strN);
		
		System.out.println(strList.get(1).toString());
		System.out.println(strList.get(2).toString());
		System.out.println(strList.get(3).toString());
	}

}
