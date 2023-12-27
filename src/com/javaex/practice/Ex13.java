package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex13.java]
				
		두 개의 정수를 입력받은 후에 작은 수가 큰 수의 약수인지 확인하는 프로그램을 작성하세요.
		(0은 입력하지 않습니다.)
		
		-------------------------------------------------------------------------------------
		
		35, 5 / 35, 8 / 7, 49 / 8, 49
		
		=====================================================================================
		
		스캐너입력
		
		첫번째 숫자: 
		int no1
		두번째 숫자: 
		int no2
		
		if no1>no2 
		
		  if  no1%no2=0
		
		      no2는 no1의  약수입니다
		
		  else if 
		
		      no2는 no1의 약수가 아닙니다
		
		else //no1<no2
		  
		  if no2%no1=0
		  
		        no1는 no2의  약수입니다
		  
		  else 
		        no1는 no2의 약수가 아닙니다.
		
		스캐너종료
		
		*/

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		
		int no1 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		
		int no2 = sc.nextInt();
		
		if (no1>no2) {
			
			if (no1%no2==0) {
				
				System.out.println(no2 + "는(은) "+ no1 + " 의 약수입니다.");
								
			}else {
				
				System.out.println(no2 + " 는(은) "+ no1 + " 의 약수가 아닙니다.");
			}
		} else { 
			
			if (no2%no1==0) {
				
				System.out.println(no1 + "는(은) "+ no2 + " 의 약수입니다.");
								
			}else {
				
				System.out.println(no1 + " 는(은) "+ no2 + " 의 약수가 아닙니다.");
			}
		}
		
		sc.close();
		
	}

}
