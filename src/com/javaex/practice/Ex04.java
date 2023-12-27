package com.javaex.practice;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex04.java]
				
	    다음 코드는 오류가 있습니다. 
	    오류의 내용을 찾고 올바르게 수정하여 코딩해 보세요.
		
		====================================================
		
		public static void main(Stirng[] args){
		
		   int x = 0;
		   
		// x가 0과 같으면
		
		if (x=0){
		    System.out.println("x는 0이다.");
		    
		   }
		 
	    }
		
		======================================================
		
		- x=0 의 의미는 x에 0을 대입하라는 뜻이고
		  x가 0 과 같으면 의 의미는 x == 0 을 작성해야한다.
		
		
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int x = sc.nextInt();
		
		if ( x==0 ) {
			
			System.out.println("x는 0이다.");
			
		}
		
		sc.close();

	}

}
