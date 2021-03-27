package day04;

import java.util.Scanner;

public class Condition {
public static void main (String [] args) {
	
	
	
	
	
	 
조건문	Condition

	
		원래는 순차적으로 진행하는 Sequence지만 특정 코드만 실행해야할 때
		if, switch
			
	
if
		조건식 결과가 참 혹은 거짓일 때 각각 실행함
		if ( 조건식 ) { 참일 때 실행부 } else { 거짓일 때 실행부 }
		else가 분기점이네

		
					 수열지옥;;
		1-100 짝수 출력하기
		for(int i = 1; i<=100; ++i) { //참인 부분 시작
			if(i % 2 == 0 ) //i가 짝수라면 2로 나눈 나머지가 0일테니까
				System.out.print(i + ", "); }// 실행


		for(int i = 0; i<=100; ++i) {
			if(i % 2 ==0)
				System.out.println(i + "는 짝수입니다.");
			else
				 System.out.println(i + "는 홀수입니다.");
		}
	

	
	
		//연봉 salary 과 결혼 married 여부를 입력하면 
		//세율과 세금을 계산
		//미혼 : 0 ; 연봉 5000미만 - 10%, 5000이상 - 25%
		//기혼 : 1 ; 연봉 5000미만 - 15%, 5000이상 - 35%

		//미혼 기혼 / 미만 이상
	
		int mar;	
		int sal;	
		double tax;
		
		Scanner sc = new Scanner(System.in); 

		System.out.println("결혼 여부 입력해 (미혼0,기혼1)");
		mar = sc.nextInt();
		System.out.println("연봉을 입력해 (5000만 미만0,이상1)");
		sal = sc.nextInt();
		
		if (mar == 0) // 미혼0과 같으면  -이라는 뜻
			if(sal <= 5000) tax = sal * 0.1;
			else 
				tax = sal * 0.15;

			else //기혼
				if(sal < 6000) tax = sal * 0.15;
				else 
					tax = sal * 0.35;		
		
				String fmt = "연봉은 %d이고, 결혼여부는 %d 이므로, \n" 
				+ "세금은 %.1f 입니다.";
				System.out.printf(fmt, sal, mar, tax);
				
				
				
				

	 	
	 	
	 	
	 	
	 	
	}
}
