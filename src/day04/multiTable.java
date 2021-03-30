package day04;

import java.util.Scanner;

public class multiTable {
public static void main (String [] args) {
	
	
	
	

구구단을 외자! 
	  while문 / 증감식 / charAt (); / try + catch 예외처리 문
					

		

<< 7단 짜기의 두가지 방식 
		
			
		1)증감식을 써서 

					for(int i = 1; i <= 9; ++i ) {
						System.out.println(" 7 x " + i + " = " + (7*i));	
					}


		2) while문을 써서

					String fmt = "7 x %d = %d \n";
					int i = 1;
					while(i <= 9) {
						System.out.printf(fmt, i,  i * 7);
						++i;
					}


		
<< 3단 출력하기  - 증감식과 while문 써서
	
		
				for( i = 1; i <= 9; ++i ) {
					System.out.println
					(" 3 x " + i + " = " + ( 3* i ));	
				}

				-----------------------------------------

				fmt = "3 x %d = %2d \n";  
				 \n은 줄바꾸기 임 
					 정렬정리 코드 %d에 %2d 넣기
				i = 1;
				while(i <= 9) {
					System.out.printf(fmt, i,  (i * 3 ));
					++i;
				}	

	

	
	
<< while문 + 스캐너 로 숫자를 입력 받으면 그 단으로 구구단 외기 >>		

				Scanner sc = new Scanner(System.in);		
				System.out.println("출력할 구구단을 입력하세요");
				int lev = sc.nextInt();

				i =1;
				fmt = "%d x %d = %2d\n";
				while (i<=9 ) {
					System.out.printf(fmt, lev , i , (i*lev) );
				++i;

				}

				user가 입력한 수가 1-9 내의 숫자가 아니면 에러발생

					
					
					

					
<< charAt(ㅁ); + 스캐너로 구구단 외기 >>		
				System.out.print("출력할 구구단을 입력하세요");
				char leve = sc.next().charAt(0);

						입력될 문자 중 첫 글자만 뽑아서 캐릭터 변수에 대입
						sc.next는 문자를 받는다는 뜻이고,
						글자 중 0자리의 첫글자를 변수로 쓴다뜻 이다
						컴퓨터는 0부터 숫자를 센다.

						
							
				입력된 문자의 아스키 코드 값이 49 ~ 57 (숫자키로는 1~9)인지를 검사
							
				String result =  			<---3항 식임 -> 내가 낸데 ? 맞아 : 아냐
				(leve >= 49 && leve <=57 ) ? 
							    "출력"  :  "오류입니다.";
				
				System.out.println(result);

		
	
	
	
	
<< try + catch  예외처리 코드를 활용한 구구단 퀘스트를 입력 받기 >>
	
		예외처리코드인 try - catch 를 이용해서 오류발생 시 제어를 캐치 코드 쪽으로 넘겨줌
			
				System.out.print("출력할 구구단을 입력하세요");
				String level = sc.next();

				i =1;
				try {while (i <= 9){ 
					

						%d를 넣어서 숫자 입력이냐 글자 입력이냐로 오류 발생함
							
				System.out.printf(fmt, level, i, (Integer.parseInt(level)*i) );
				++i;
				}
				     
				} catch(Exception ex) {
				System.out.println("오류발생");}
						특정 코드 진행하다 오류가 날 경우를 대비해서 
						catch 내용으로 안내하는 것.
	
	
	
	
	
		//charAt를 써서 
		//ex) 주민번호로 성별 표시하는 코드
		//2000년 이후 출생자는 3,4임

		String regino = "880324-2123456";
		
		char gender = regino.charAt(7);
		result = (gender == '1') ? "in 1999 male" : 
				(gender == '2') ? "in 1999 female" :
					(gender == '3') ? 
							"after 2000 male"
							: "after 2000 female";
		System.out.println(result);
			
	
	
	
}
}
