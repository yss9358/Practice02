package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex09.java]
				
		아래의 조건과 같이 출력되도록 프로그램을 작성하세요
		
		⚫ 태어난 년도를 입력 받습니다.
		⚫ 나이는 생일과 관계없이 계산됩니다. 올해2023년, 2020년생 ➔ 3살 (2023-2020 = 3)
		⚫ 15세미만의 경우와 65세이상인 경우에는 "(나이)살 무료예방접종 대상자 입니다" 메시지를 출력합니다.
		⚫ 이외의 경우에는 " (나이)살 무료예방접종 대상자가 아닙니다" 메시지를 출력합니다.
		
		--------------------------------------------------------------------------------------------------
		
		2020 / 2009 /2008 / 2000 / 1959 / 1958 / 1940
		
		-------------------------------------------------------------------------------------------------
		
		"태어난 년도를 입력해 주세요"
		"년도: "
		
		int 년도 
		
		int 올해 = 2023
		
		int 나이 = 2023 - 년도
		
		나이 < 15 && 나이>=65  -> (나이) 살 무료예방접종 대상자 입니다.
		
		else -> (나이) 살 무료예방접종 대상자가 아닙니다.
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 년도를 입력해 주세요");
		System.out.print("년도: ");
		
		int year = sc.nextInt();
		
	    int x = 2023;
		
		int age = x - year;
		
		if(age<15 || age>=65) {
			
			System.out.println(age + "살 무료예방접종 대상자 입니다.");
			
		} else {
			
			System.out.println(age + "살 무료예방접종 대상자가 아닙니다.");
			
		}
		
		sc.close();

	}

}
