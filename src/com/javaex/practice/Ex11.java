package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex11.java]
				
		두 개의 정수를 입력받아 큰수를 작은수로 나눈 몫과 나머지를 출력하는 프로그램을 작성하세요.
		
		-----------------------------------------------------------------------------------------
		
		34, 5 / 3, 37 / 17, 17
		
		=========================================================================================
		
		Scanner
		
		첫번째 숫자: no1 
		int no1 = 
		두번째 숫자: no2
		int no2 =
		
		if no1>=no2
		
		int a = no1 / no2
		int b = no1 % no2
		
		else
		
		int a = no2 / no1
		int b = no2 % no1
		
		스캐너종료

		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		
		int no1 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		
		int no2 = sc.nextInt();
		
		//a는 몫, b는 나머지
		
		if (no1>=no2) {
			
			int a = no1 / no2;
			int b = no1 % no2;
			
			System.out.println("몫: " + a);
			System.out.println("나머지: " + b);
					
		} else {
			
			int a = no2 / no1;
			int b = no2 % no1;
			
			System.out.println("몫: " + a );
			System.out.println("나머지: " + b);
			
		}
	
		sc.close();

	}

}
