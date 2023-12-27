package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex20.java]
				
		알파벳을 입력받아 자음 모음을 구분하세요.
		
		⚫ if~else문을 사용합니다.
		⚫ 영문 소문자 이외의 입력값은 고려하지 않습니다.
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		
		String letter = sc.nextLine();
		
		if( (letter.equals("a")) || (letter.equals("e")) || (letter.equals("i")) || (letter.equals("i")) || (letter.equals("u")) ) {
			
			System.out.println("모음입니다.");			
			
		} else {
			
			System.out.println("자음입니다.");
			
		}
		
		sc.close();

	}

}
