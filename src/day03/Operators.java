package day03;

public class Operators {
 public static void main ( String [] agrs) {
	 //연산자 operator
	 //여러종류의 연산을 수행할 때 쓰는 기호 (특수)
	 //산술,비교, 논리, 조건 >> 연산자가 빈번히 쓰임
	 //산술 연산 : 사칙연산용 연산자 >> +, -, *, /, %, 5가지임
	 // 개발자용 폰트 중에 합자(laigature)를 지원하는 폰트를 쓰면 식 쓰기에 유리
	 // 합자(!=>= 이런거 가능한 지원 폰트는 d2coding, cascadia code font
	 //비교 연산 결과는 참 , 거짓으로 값이 나옴 (반환)
	 
	 
	 int x = 30, y = 15; //같은 int값이니까 한줄에 같이 써도 됨
	 	 
	 System.out.println((" + 연산 ") + x + y );
	 System.out.println((" + 연산 ") + x + y );
	 System.out.println("x - 15 연산" + (x + y));
	 System.out.println("30 mod 15 연산" + (x % y));
	 
	 //★★★★★★비교연산 : 값의 크기 비교
	 System.out.println("30 > 15 " + (x > y));	 
	 System.out.println("30 < 15 " + (x < y));
	 System.out.println("30 >= 15 " + (x >= y));	 
	 System.out.println("30 <= 15 " + (x <= y));
	 System.out.println("30 != 15 " + (x != y));
	 //카스카디아 폰트에서는  !하고 =을 붙이면 됨
	 System.out.println("30 = 15 " + (x == y));

	 
	 
	 
	 //★★★★★★논리 연산: 주어진 논리식을 판단
	 //논리 연산의 결과도 참, 거짓으로 나온다 (반환)
	 //2개 이상의 비교연산으로 구성됨
	 //논리에서곱 : &, && (단축식 평가 short-circuit지원)-짧은 회로
	 //논리합연산   : |, ||
	 //논리부정연산  :!
	 //논리식에서 참 거짓 중에 확정된 대답이 나옴
	 
	 boolean result = (x > y) & (x != y);
	System.out.println("(x > y) and (x != y)" + result);
    System.out.println(true || (3 < 5 && 6 >= 2));	 // 애는 일단 true
	 
    System.out.println();
    //★★★★조건연산자 (삼항 연산자) 3개항의 피연산자(계산 대상)으로 함
    //형식 : 조건식 ? 참일때 : 거짓일때 값
    //if문에 활용 가능한가?
    
    // result = x >= y;
    String result2 = x > y ? "참, x가 큽니다" : "거짓, y가 큽니다.";
    System.out.println(result2);
    
    
    
    
    
    
    
 }
}
