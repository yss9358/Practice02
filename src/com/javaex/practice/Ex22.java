package com.javaex.practice;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex22.java]
				
		숫자(정수) 3개를 입력받아 가장 큰 수를 출력하세요
		
		--------------------------------------
		
		57, 36 , 15 / 9, 14, 22 / 25, 3, 74
		
		======================================
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 3개 입력해주세요");
		
		System.out.print("숫자1: ");
		
		int no1 = sc.nextInt();
		
		System.out.print("숫자2: ");
		
		int no2 = sc.nextInt();
		
		System.out.print("숫자3: ");
		
		int no3 = sc.nextInt();
		
		if (no1<no2 && no2<no3 ) {
			
			System.out.println("가장 큰수는 " + no3 + " 입니다.");
		
		} else if (no3<no2 && no2<no1 ) {
			
			System.out.println("가장 큰수는 " + no1 + " 입니다.");
			
		} else if (no1<no3 && no3<no2) {
			
			System.out.println("가장 큰수는 " + no2 + " 입니다.");
			
		} else if (no2<no1 && no1<no3) {
			
			System.out.println("가장 큰수는 " + no3 + " 입니다.");
		}
		
		sc.close();

	}

}
