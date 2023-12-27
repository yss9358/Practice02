package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex16.java]
				
	    다음과 같이 정의되는 함수의 함수값을 계산해보자

		f(x) = {x3 − 9x + 2 , x ≤ 0 (x가 0보다 작거나 같으면 이식을 사용)
				7x + 2 , x > 0 (x가 0보다 크면 이식을 사용)
		
		----------------------------------------------------------
		
		-2 / 7 / 0
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		
		double no = sc.nextInt();
		
		if (no<=0) {
			
			System.out.println( (no*no*no) - (9*no) + 2);
			
		} else {
			
			System.out.println( (7*no) + 2);
			
		}
		
		sc.close();

	}

}
