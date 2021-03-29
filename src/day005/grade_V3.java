package day005;

import java.util.Scanner;

//성적처리기 V3.
//성적처리 학점계산을 switch 제어문으로 작성해보자
public class grade_V3 

{
public static void main (String[] args) 
	{
			//변수 선언
			String name;
			int kor, eng, mat;
			int tot;
			double avg;
			char grd;
			String fmt = "%s, %d,%d, %d \n" +
			"%d, %.1f, %c \n";
			Scanner sc = new Scanner(System.in);				
			
			//처리
			int i =1;
			while (i<=3) { 
				//while의 조건식을 true으로 설정하면 무한 코드실행함 
			System.out.print("이름을 입력해 ");
			name = sc.next();
			System.out.print("국어 점수를 입력해 ");
			kor = sc.nextInt();
			System.out.print("영어 점수를 입력해 ");
			eng = sc.nextInt();
			System.out.print("수학 점수를 입력해 ");
			mat = sc.nextInt();
			
			tot = kor + eng + mat;
			avg = (double)tot / 3;
			
			/*grd='A';
			if (avg >= 90) grd = 'A';
			else if (avg >= 80) grd = 'B';
			if (avg >= 70) grd = 'C';
			else if (avg >= 60) grd = 'D';			
			if (avg >= 60) grd = 'F';
			else if (avg >= 80) grd = 'B';				
			}
			*/
					
			switch((int) avg /10) {//switch(초기화부에는 연산식도 ok)
			// /10을 써서 제어부의 부피를 완전 줄임
			// 100 80 80 70 을 /10했다는 뜻
				case 10:grd = 'A'; break;
				case 9:	grd = 'B'; break;			
				case 8: grd = 'C'; break;
				case 7: grd = 'D'; break;
				case 6:	grd = 'F'; break;							
				default : grd = 'A';
		
			}	
			//결과
			System.out.printf
			(fmt, name, kor, eng,mat,tot,avg, grd);
			//반복증감식
			++i;
			
			}
			
//do{ }while ();
//조건문이 처음부터 false이면 while은 코드 실행안함
//do-while은 일단 실행은 해주고 조건 검사해줌
			
			//c creat - 가입 정보를 저장
			//R Ruid- 정보 대조로 가입 유무 확인
			//U update - 30일 이상 변경해주세요   
			//D delete - 탈퇴
			//이걸 알고서 처리하기 위한 프로세스임			
			
	}
}
