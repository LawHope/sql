package day03;

public class TestCast {
 public static void  main (String[]args) {
	 //자바의 JVM은 32비트가 기본이다.
	 byte x = 1;
	 byte y = 2; // 여기까지는 오케이인데 x+y;넣으면 터짐.
	 
	 byte z = (byte)(x+y); -> 초과되어 오류잔치 자바가 메서드에 병적으로 집착함
	 	     ↖그래서 해당 내용 앞에 (byte)를 붙여서 그릇 작은 걸로 옮긴다고 알려주기
	 int가되어야할 x+y를 바이트로 변환한다는 뜻임 
	
	 
	 
	String fmt = "평균은 %f 입니다.";
		 ↖소수점을 짤리게 쓰려면 %.1f 로 쓴다. 
	 
	 
	 
	System.out.printf(fmt, avr); }
}
