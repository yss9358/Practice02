package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex10.java]
				
		두개의 숫자를 입력받아 큰수와 작은수를 분류하여 출력하세요
		
		----------------------------------------------------------
		
		15, 123 / 358, 11 / 100, 100
		
		===========================================================
		
		숫자2개를 입력해주세요
		숫자1: no1
		int no1
		숫자2:
		int no2:
		
		큰수: a ,작은수:b 입니다
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1: ");
		
		int no1 = sc.nextInt();
		
		System.out.print("숫자2: ");
		
		int no2 = sc.nextInt();
		
		if (no1>no2) {
			
			System.out.println("큰수: " + no1 + "     " + "작은수: "+ no2 +"입니다.");
		
		} else {

			System.out.println("큰수: " + no2 + "     " + "작은수: "+ no1 +"입니다.");
			
		}
		
		
		
		
		sc.close();

	}

}
