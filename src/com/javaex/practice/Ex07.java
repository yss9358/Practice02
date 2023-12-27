package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex07.java]
				
	    나이를 입력받아 아래와 같이 입장료가 출력되도록 프로그램을 작성하세요.
				
	    조건 출력내용
		
	    0세~7세 취학전아동/무료 입니다.
		8세~13세 초등학생/2000원 입니다.
		14세~16세 중학생/3000원 입니다.
		17세~19세 고등학생/4000원 입니다.
		20세~ 성인/5000원 입니다.
		
		---------------------------------------------------
		
		5 / 7 / 10 / 13 / 14 / 16 / 18 / 19 / 20 / 45
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이: ");
		
		int age = sc.nextInt();
		
		if (age>=0 && age<=7) { // 0세~7세 취학전아동/무료
			
			System.out.print("취학전 아동//무료");
		
		} else if(age>=8 && age<=13) { // 8세~13세 초등학생/2000원
			
			System.out.print("초등학생//2000원");
			
		} else if(age>=14 && age<=16) {
			
			System.out.print("중학생//3000원");
			
		} else if(age>=17 && age<=19) {
			
			System.out.print("고등학생//4000원");
			
		} else if(age>=20) {
			
			System.out.print("성인//5000원");
			
		}
		
		System.out.println("입니다");	
		
		sc.close();
		
	}

}
