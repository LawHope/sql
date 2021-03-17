package day01;
	/** 
	 * 
	 *@author lyusk
	 *@category javabasic
	 *@version 1.0
	 * 자바프로그램기초 성적처리프로그램 작성
	 * 입력:이름,국어,영어,수학
	 * 처리:총점,평균,학점
	 * 출력:이름,국어,영어,수학,총점,평균,학점
	 * 단 학점은 A,B,C,D,F
	 */

public class ScoreV1 {
	 public static void main(String[] args) {

		 // 변수선언//
		 String name;	//학생명
		 int Kor;		//국어
		 int eng;		//영어
		 int mat;		//수학
		 int tot;		//총합
	     double avera;	//평균
		 char grd;		//성적
		 
		 
		 //처리//
		 name= "김태희";
		 Kor = 98;
		 mat = 100;
		 eng = 97;
		 tot = Kor + mat + eng;
		 avera = tot/3;
		 grd = 'A';//char라서 작은 따옴표 씀
		 
		 
		 //결과출력//
		 System.out.print("이름: ");
		 System.out.println(name);
		 System.out.print("국어: ");
		 System.out.println(Kor);
		 System.out.print("영어: ");
		 System.out.println(eng);
		 System.out.print("수학: ");
		 System.out.println(mat);
		 System.out.print("총점: ");
		 System.out.println(tot);
		 System.out.print("학점: ");
		 System.out.println(grd);		 


	 }	 
}
	 
