package day03;


import java.util.Scanner;




/*@author lyusk
*@category javabasic
*@version 1.2
* 자바프로그램기초 성적처리프로그램 작성
* 이름과 성적데이터를 키보드로 입력받아 처리
* 처리 결과 출력시 printf 매서드를 사용
* 입력:이름,국어,영어,수학
* 처리:총점,평균,학점
* 출력:이름,국어,영어,수학,총점,평균,학점
* 
*/

public class grade_V2 {
	public static void main (String[] args) {
		//변수선언
		String name; //문자이름이라 String
		int kor;
		int eng;
		int mat;
		int tot; //어차피 숫자라 int
		double avr; //평균이라 더블
		char gra; //단 학점은 A,B,C,D,F
		
		
		//처리
		//Scanner 클래스를 초기화함
		System.out.println("이름은? ");
		Scanner sc = new Scanner(System.in);
		name = sc.next();  //문자형식 입력받는 거라 name 변수에 대입/ next();를 씀
		System.out.println("국어는? ");
		kor = sc.nextInt(); //키보드로 숫자를 받아 kor 변수에 대입/ nextInt();숫자라서Int
		System.out.println("수학은? ");
		mat = sc.nextInt();
		System.out.println("영어는? ");
		eng = sc.nextInt();	
		
		//총점, 평균 처리		
		tot = kor + eng + mat;
		avr = tot /3;
		
		
/*		학점 처리 (x이상이면 뭐로 출력하기) - 비교연산자 사용
		gra = '수'; //if문인 셈, cha이라서 작은 따옴표 안에 쓴다
		gra = (avr >= 90) ? 'A' : 'B';
		gra = (avr >= 80) ? 'B' : 'C';
		
		// ▼는 00이냐? 아니야? 그럼 xx, 그것도 아니야? 그럼 ff 이런 식임
		gra = (avr >= 90) ? 'A' :
			 (avr >= 80) ? 'B' :
			 (avr >= 70) ? 'C' :
			 (avr >= 60) ? 'D' : 'F';
*/
		//정리하면 JVM변환 식을 써서 형변형(cast)를 위해 double 넣고 정리 
		avr = (double) tot /3;
		gra = (avr >= 90) ? 'A' :
			 (avr >= 80) ? 'B' :
			 (avr >= 70) ? 'C' :
			 (avr >= 60) ? 'D' : 'F';
		
		
		
		//출력
	/*	System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.print(tot);
		System.out.println(avr); */

	
		// ▼ 프린트 베리에이션으로 용량 후려치기
		
		//출력2
		 String fmt = "이름 : %s, 국어 : %d, 영어 : %d, 수학 %d \n";
		 System.out.printf(fmt, name, kor, eng, mat);
		 
		 fmt = "총점 : %d, 평균, %.1f, 학점 : %c ";
		 System.out.printf(fmt, tot, avr, gra);
		
		 
		 

		
	}
}
