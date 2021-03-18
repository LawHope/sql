package day03;

public class pra_quiz_7_8 {
 public static void main (String [] adgs) {
	 
	 
	 // 7번 문제 결과값 계산하고 틀린부분 고치기
	 System.out.println(3 + 4.5 * 2 + 27 /8); 
	 
	 System.out.println(true || false && 3 < 4 ||!(5==7));
	
	 System.out.println(true || (3 < 5 ^ 6 >+ 2)); 
//밑에 노란줄 있는 애들은 단축식 평가라 앞에 트루면 나머진 안본다는 뜻
	 
	 //System.out.println(!true > 'A' ); --->숫자가 아니라서 망함
	 
	 System.out.println(7 % 4 + 3 - 2 /6 *'Z');
	 //묵시 강제 형 변환중에 큰따옴표는 산술 연산에선 못쓰고, 
//단일문자를 수식에 ''를 씌워서 쓰면 아스키 코드 숫자로 바뀜
//아스키코드 값 때문에 'Z'를 숫자로 인식하는 거임, 
	 
	 System.out.println('D' + 1 +'M' % 2 / 3);
	 
	 System.out.println(5.0 / 3 + 3 / 3);
	 
	 System.out.println("8번 " + (53 % 21 < 45 / 18) );
	 //53나누기 21 나머지가 45나누기 18보다 커? 라는 뜻
	 
	 System.out.println((4 < 6) || true && false && ( 2 > 3 ));
	 //앞이 트루라 뒤는 버린다 2
	 System.out.println(7 - (3 + 8 * 6 + 3) - (2+ 5* 2));
	 
	 
	 //8번문제
	 
	 
	System.out.print("May 18, 2021 fell on day number ");
	
	System.out.println( ( (13 + (13 * 3 - 1) / 5 + 2021 % 100  
            + 2021 % 100 / 4 + 2021 / 400
            - 2 * (2021 / 100) ) % 7 + 7) % 7 );
//지정한 연도의 -1 해에 마지막 날 요일을 알아내는 것
//그레고리력 달력 만들 때 쓴다. 0=일 1=월 2=화 이런 식
//계산 결과에 +1을 하면 올해 마지막날의 요일이 됨
	
	System.out.print(" Check out this line ");
	
	System.out.println("  //hello there" + '9' + 7);
	
	System.out.print('H' +'I' + " is" + 1 +" more example");
	//H, I 에도 아스키코드가 먹힘	
	
	//System.out.print("Print both of us", "Me too");
	//자바에서는 쉼표로 문장 연결 안됨
	
	System.out.println("Reverse" + 'I' + 'T');
	// "" 안에 문자가 있어가지고 I랑 T가 문자로 인식되어버림
	
	System.out.println("NO! Here is" + 1 + "more example");
	
	System.out.println('H' + 'I' +" is " + 10 * 10); // that's 100;
	
	System.out.println("This x is " + true);// that's true
	
	//System.out.print();
	//매개 변수를 받아서 작동하는 애라 빈칸은 오류남 
	
	System.out.println();
	
	//System.out.println("How about this one " ++ '?' + " Huh?");
	//문자열에 증감연산자인 ++는 못씀
	
//★★★★★★★증감 연산자
/**증감연산자에서 ++, -- 1만큼 증가 or 감소
+가 어디 붙냐에 따라 연산순서가 바뀜
i= 1  ->  i=i+1   ->  i+= 1   ->  ++i 
i = i+3 -> i+= 3 */
	
	int a = 7, b = 8;	
	int result3 = ++a + 10; //a값을 증가시킨 다음 연산 적용함(전치)
	int result4 = b++ + 10; //a값을 연산 적용하고 나서 증가 값(후치)
	System.out.println("++a + 10 = " + result3);
	System.out.println("b++ + 10 = " + result4);
	//주로 전치 사용함
	
	
	 
	 
	 
	 
	 
 }
}
