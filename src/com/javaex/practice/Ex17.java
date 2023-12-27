package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex17.java]
				
		다음과 같이 수익을 입력받아 소득세를 계산하는 프로그램을 작성하세요
				
		⚫ 세금계산법
		⚫ 0원이상 1000만원 이하인 경우 tax: 0.09*수익
		⚫ 1000만원 초과 4000만원 이하인 경우 tax: 1000*0.09 + 0.18*(수익-1000)
		⚫ 4000만원 초과 8000만원 미만인 경우 tax: 1000*0.09 + 3000*0.18 + 0.27*(수익-4000)
		⚫ 8000만원 이상인 경우 tax: 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(수익-8000)
		
		------------------------------------------------------------------------------------
		
		1000 / 2000 / 7000 / 9000 / -9000
		
		음수의 경우 "잘못 입력했습니다." 출력
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		
		double m = sc.nextDouble();
		// m = money
		
		double tax;
		
		if (m>=0 && m<=1000) {
			
			tax = 0.09*m;
			
			System.out.println("소득세는 " + tax + " 입니다.");
			
		} else if ( m>1000 && m<=4000) {
			
			tax = 1000*0.09 + 0.18*(m-1000);
			
			System.out.println("소득세는 " + tax + " 입니다.");
			
		} else if (m>4000 && m<8000) {
			
			tax = 1000*0.09 + 3000*0.18 + 0.27*(m-4000);
			
			System.out.println("소득세는 " + tax + " 입니다.");
			
		} else if (m>=8000) {
			
			tax = 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(m-8000);
			
			System.out.println("소득세는 " + tax + " 입니다.");
			
		}
		if (m<0) {
			
			System.out.println("잘못 입력했습니다.");
			
		}
		
		sc.close();
		
	}

}
