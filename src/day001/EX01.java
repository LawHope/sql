package day001;

 //*연습문제실습

public class EX01 {

		public static void main(String[] args) {

// 1번 문제
		  System.out.println("*   *    **    ****    ****    *   *      ///// ");
		  System.out.println("");
		  System.out.println("*   *   *  *   *   *   *   *   *   *    ㅣ 0 0 ㅣ");
		  System.out.println("");
		  System.out.println("*****  *    *  ****    ****     * *    (ㅣ  ^  ㅣ)");
		  System.out.println("");
		  System.out.println("*   *  ******  *   *   *   *     *      ㅣ [_] ㅣ");
		  System.out.println("");
		  System.out.println("*   *  *    *  *    *  *    *    *        -----");
		  System.out.println("                           ＋- - -＋");
		  System.out.println("");
		  System.out.println("                           ｜     ｜");	
		  System.out.println("");
		  System.out.println("                           ＋- - -＋");
		  System.out.println("                  ＋- - -＋＋- - -＋");
		  System.out.println("");
		  System.out.println("                  ｜     ｜｜     ｜");	
		  System.out.println("");
		  System.out.println("                  ＋- - -＋＋- - -＋              /\\ /\\");
		  System.out.println("         ＋- - -＋＋- - -＋＋- - -＋                ￣       -----");
		  System.out.println("                                                 ( ' ' )   / Hello \\");
		  System.out.println("         ｜     ｜｜     ｜｜     ｜");	
		  System.out.println("                                                 (  -  )  <  junior ㅣ");
		  System.out.println("         ＋- - -＋＋- - -＋＋- - -＋");		  
		  System.out.println("＋- - -＋＋- - -＋＋- - -＋＋- - -＋             ㅣㅣㅣ    \\ Coder! /");
		  System.out.println("                                                             -----");
		  System.out.println("｜     ｜｜     ｜｜     ｜｜     ｜            (  ㅣ  )     ");
		  System.out.println("                                                  ￣￣");
		  System.out.println("＋- - -＋＋- - -＋＋- - -＋＋- - -＋");
		  
System.out.println();
System.out.println();
System.out.println();
// 2번 문제 영수증 출력하기
String food ;
String getsu;
String soolyang;
String price;
String total;
String tax;
System.out.println();



//	4번 문제
		 // 표현식 : expression 으로 명명, 수학의 수식을 자바로 표현하기
		// 표현식의 특징은 평가 ecaluate 임, 코드의 결과 값이 나온다는 뜻임
		// 답안지
	  int x, y, z, s, s0, v, g, t;
	  x  = 10;
	  y  = 20;
	  z  = 30;
	  v  = 10;
	  t  = 15;
	  g  = 20;
	  s0 = 5; 
	  
 	int result = (3 * x) ;
	System.out.print("3x = ");

	//형변환= 오류 발생시 자동 변경 전환 - 나중에 코드 겁나게 복잡해지니 애초에 선언할 때 설정을 따로 하자
	result = ( 3 * x ) + y; 
	System.out.print ( "3x + y = ");
	System.out.println(result);
	
	System.out.print("( x + y ) / 7 = ");
	System.out.println( ( x + y ) / 7);

	result = ( 3 * x + y ) / ( z + 2 );
	System.out.print("( 3 * x + y ) / ( z + 2 ) = ");
	System.out.println(result);
	
	result = s0 + v * t + (1/2) * g * t ^ 2; //^ 캐롯 마크가 제곱 표현법임
	System.out.println("s0 + v * t + (1/2) * g * t ^ 2");
	System.out.println(result);
	
/* 내가 쓴 답안인데 다틀렸음
String yap1 = ("x + y");
String yap2 = ("(x + y)");
System.out.println("3x");				  
System.out.printf("3"); System.out.println(yap1);	
System.out.printf(yap2); System.out.println(" / 7"); 
System.out.printf("(3"); System.out.printf (yap1); System.out.printf(")"); System.out.println (" / (x + 2)");
System.out.printf(""); System.out.println("ｓ = s + vt + 1/2gt"); 	 
*/		    
System.out.println();
System.out.println();
System.out.println();
			
/** 
* 5번 문제
* 가. double number = (1/3) * 3;
* 나. int quoient = 7/3;
* 다. int remainder = 7 % 3;
* 라. int result =11; result / = 2;
*/

			 double number = (1/3) * 3;
			 int quoient   = 7/3; //
			 int remainder = 7 % 3; 
			 result    = 11; result /= 2; 
			 //▲이 문제에는 int result인데
			 //이미 int result로 선언이 되어 있어서 오류가 뜸, int 빼고 result 만쓰기
			 
			 System.out.println(" ( 1 / 3 ) * 3 = " + number); //답안지
			 //예상값은 1 , 실제값은 0.0 --- 정수나누기 정수 값은 정수라서!
			 
			 System.out.println(" 7 / 3 = " + quoient);
			 
			 System.out.println(" 7 % 3 = " + remainder);	
			 
			 System.out.println(" result /= 2=" + result);
			 
			 System.out.println();

	System.out.println();
	System.out.println();
	System.out.println();	
			  
/** 6번 문제 - 복합대입연산자 //산술연산자와 대입연사자를 합쳐놓은 연산자
* ex) a = a + 1 -> 복합연산자로는 a += 1 로 줄여 쓸 수 있음
*
* double x = 2.5; double y = 1.5;	int m = 18;	int n = 4;
* 가. x + n * y - (x + n) * y;
* 나. m / n + m % n;
* 다. 5 * x - n / 5;
* 라. 1 - ( 1 -( 1 - (1 - ( 1- n))));
*/
			 double x1 = 2.5;  //이미 x 변수를 선언해두었기 때문에 x만 쓰면 오류가 남
			 double y1 = 1.5;  //y도 마찬가지, 그래서 1을 붙인 거임, 형변환으로 오류 수정할 수도 있지만 후환이 두려움
			 int m    = 18; 
			 int n    = 4;
			 
			 double result2 = x1 + n *y1 - (x1 +n) * y1;
			 System.out.println();
			  System.out.println(x1 + n * y1 - (x + n) * y);

			  System.out.println(" x1 + n +y1 - ( x1 + n ) * y1 = " + result2);
			  System.out.println(m / n + m % n);
			  
			  result2 =  5 *x1 -n /5;
			  System.out.println("5 * x- n / 5 = " +result2);

			  result2 = 1 - ( 1 -( 1 - (1 - ( 1- n))));
			  System.out.println("1 - ( 1 -( 1 - (1 - ( 1- n))))" +result2);
		  
		  
		   

		  
	}
}