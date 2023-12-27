package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex03.java]
				
	    다음 코드는 오류가 있습니다. 
	    오류의 내용을 찾고 올바르게 수정하여 코딩해 보세요.
	  
	    ===================================================
	    
	    public static void main(String[] args){
	    
	       int age = 15;
	       
	       //age가 0살 초과이고 18살 미만 이면
	        
	       if(0 < age < 18){
	       
	       System.out.println("청소년 입니다.");
	       
	       }
	       
	     }
	    
	     ===============================================
	     
	     (1) Scanner 를 추가한다.
	     
	     (2) if 조건문안에 0 < age < 18 대신
	         age>0 && age<18 을 작성해야 한다.     
	     
	    */
		
		Scanner sc = new Scanner(System.in);

		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		//int age = 15;
		
		if(age>0 && age<18) {
			System.out.println("청소년 입니다.");
		}
		
		sc.close();
		
		
	}

}
