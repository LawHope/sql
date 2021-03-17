package day02;

public class testPrintf {
 public static void main (String [] args) {
	 int x = 5;
	 double pi = 3.14;
	 
	 System.out.print("x = ");
	 System.out.print(x);
	 
	 System.out.print(" and pi = ");
	 System.out.println(pi);
	 
	 //위의 4즐 짜리를 +를 써서 반으로 줄여서 써버리짓!!
	 System.out.print("x = " + x);
	 System.out.println(" and pi = " + pi);
	 
	 
	 //printf (메소드) 를 쓰면 한줄로도 가능하다귯~! 
	 //형식지정자: 특정 문자열의 추력 대상이랑 모양을 지정하는 특수문자임
	 // 종류들▼
	 //%d : decimal 정수표기용
	 //%f : Float 실수표기용
	 //%c : Character 문자 하나 표기할때
	 //%s : Stgring 문자 열을 표기할때
	 
	 System.out.printf("x = %d and pi = %f \n", x, pi );
	 //%d는 뭔지 몰라도 정수가 온다, %f는 실수가 온다는 뜻 \n는 다음에서 줄바꾼다는 뜻
	 
	 
	 //f 사용하는 방법2
	 String fmt = "x = %d and pi = %f \n";
	 System.out.printf(fmt, x, pi);
	 
 }
}
