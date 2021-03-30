package day03;

public class Loop {
	 public static void  main (String[]args) {
	 
반복문 Loop
		 for (횟수지정 후 반복), while (조건 만족해야 반복 정지) 		 

		 System.out.println("한번하고 끝.");
		  
		같은 코드를 반복하면 양도 많고 수정하기도 힘들어.
			
		 
반복문 for문	
		 초기식 조건식 증감식을 이용한다.
		/for( 초기식, 조건식, 증감식 ){ 반복할 코드 }

		 String say = "열번만 해볼까요";
		 
		 
		 
for (int i = 1;   i <= 10; i += 1 ) {
	System.out.println("열번 말해볼게요.");}

for (int i = 3;   i <= 12; ++i) {
	System.out.println(i);}
		 
		 
		 
			홀수만 출력 >>> 수열이네;;;;;;
		 
			for (int i = 1;   i <= 50; i += 2 ) {
			System.out.println(i);}
			for (int i = 1;   i <= 50; i = i+2 ) {
			System.out.println(i);}

			for (int i = 2;   i <= 50; i += 2 ) {
			System.out.println(i);}
			for (int i = 0;   i <= 50; i = i+2 ) {
			System.out.println(i);}
		
		 
		 
			1-100의 총합 출력
			int sum = 0;

			for ( int i= 1; i<= 100; ++i ) {
				sum = sum + i;
				System.out.println("1~100의 합 : " + sum );
				}
			
			가우스의 덧셈공식
			System.out.println((100*(100+1))/2);	
			
		 
		 
	
			}
	 }

