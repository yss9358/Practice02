package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex08.java]
				
		사용자로 키와 몸무게를 입력받아 표준체중을 계산한 후에 
		저체중, 표준, 과체중을 구분하여 출력하 프로그램을 작성하세요.
		
		표준체중 = (키-100) * 0.9
		
		=============================================================
		
		키180 몸무게 60 / 키180 몸무게72 / 키180 몸무게 100
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키:");
		
		double h = sc.nextDouble(); // 키
		
		System.out.print("몸무게: ");
		
		double w = sc.nextDouble(); // 몸무게
		
		double a = (h-100) * 0.9; // 표준체중
		
		if (a>w) {
			
			System.out.println("저체중 입니다.");
		
		} else if(a<w) {
			
			System.out.println("과체중 입니다.");
		}
		
		if (a==w) {
			
			System.out.println("표준 입니다.");
		}
		
		System.out.println("표준체중: "+ a);
		
		sc.close();
	
	}

}
