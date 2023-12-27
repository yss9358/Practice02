package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex12.java]
				
		숫자(정수) 3개를 입력받아 가장 작은 수를 출력하세요
		
		-----------------------------------------------------
		
		9, 14, 22 / 57, 36, 15 / 25, 3, 74
		
		=====================================================
		
		Scanner
		
		숫자 3개를 입력해주세요
		숫자1: 
		int no1  
		숫자2: 
		int no2
		숫자3: 
		int no3
		
		if a<b<c 
		 a출력
		 
		 else if b<a<c 
		 b 출력
		 
		 else 
		 c출력
		
		스캐너종료
		
 		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		
		int no1 = sc.nextInt();
		
		System.out.print("숫자2: ");
		
		int no2 = sc.nextInt();
		
		System.out.print("숫자3: ");
		
		int no3 = sc.nextInt();
		
		if (no1<no2 && no2<no3) {
			
			System.out.println("가장 작은수는 " + no1 + " 입니다.");
			
		} else if (no2<no1 && no1<no3) {
			
			System.out.println("가장 작은수는 " + no2 + " 입니다.");
			
		} else {
			
			System.out.println("가장 작은수는 " + no3 + " 입니다.");
			
		}
		
		sc.close();

	}

}
