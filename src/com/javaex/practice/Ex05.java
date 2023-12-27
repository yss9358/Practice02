package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex05.java]
				
		아래와 같이 작성된 코드가 있다.
		보기와 같은 형식으로 나이가 입력되었을 때 
		결과값을 예상하여 작성해 보세요
		
		보기)
        
        (1) 15일 때 결과
        (2) 19일 때 결과
        (3) 20일 때 결과
        (4) 21일 때 결과
        (5) 100일 때 결과
        
        ====================================
        
        결과값 예상
        
        (1) 15일 때 결과 -> '2번그룹' 
        (2) 19일 때 결과 -> '2번그룹'
        (3) 20일 때 결과 -> '2번그룹'
        (4) 21일 때 결과 -> "1번그룹"
        (5) 100일 때 결과 -> "1번그룹"
      
 	    */ 
		
		Scanner sc = new Scanner(System.in);
		
		int age; // 나이
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		
		age = sc.nextInt();
		
		//그룹을 분류한다.
		
		if( age > 20 ) { // 20살 초과이면
			
			System.out.println("\"1번그룹\"");
		
		} else { // 20살 이하이면
			
			System.out.println("\'2번그룹\'");
		}
		
		System.out.println("입니다.");
		
		sc.close();

	}

}
