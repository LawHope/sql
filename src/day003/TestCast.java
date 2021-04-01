package day003;

public class TestCast {
 public static void  main (String[]args) {
	 //자바의 JVM은 32비트가 기본이다.
	 byte x = 1;
	 byte y = 2; // 여기까지는 오케이인데 x+y;넣으면 터짐.
	 byte z = (byte)(x+y); //-> 초과되어 오류잔치 자바가 메서드에 병적으로 집착함
	 //그래서 해당 내용 앞에 (byte)를 붙여서 그릇 작은 걸로 옮긴다고 알려주기
	 //int가되어야할 x+y를 바이트로 변환한다는 뜻임 
	 /**
		String name; 
		int kor;
		int eng;
		int mat;
		int tot; //어차피 숫자라 int
		double avr; //평균이라 더블
		char gra; //단 학점은 A,B,C,D,F
		
		//총점, 평균 처리		
		tot = kor + eng + mat;
		avr = tot /3;
		

	 //double avr = (kor + eng + mat )/3;
	double avr = (double)(kor + eng + mat )/3.0;
	 double avr = (kor + eng + mat )/ (double) 3.0; 
	 //(double)은 어디에 붙으나 OK
	 
	 System.out.println("평균은 " + avr + "점 입니다.");
	 //긴 서술은 + 로 연결해서 써준다
	 
	String fmt = "평균은 %f 입니다.";
	//소수점을 짤리게 쓰려면 %.1f 로 쓴다. 
	System.out.printf(fmt, avr);
	
	 
	 
	 */
 }
}
