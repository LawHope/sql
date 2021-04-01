package day004;

import java.util.Scanner;

//성적처리 머신 2
//반복문을 이용하기,여러명의 성적을 출력해보자
public class grade_V2 
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
			grd = 	(avg >= 90) ? 'A' :
					(avg >= 80) ? 'B' :				
					(avg >= 70) ? 'C' :
					(avg >= 60) ? 'D' : 'f';
			
			
			//결과
			System.out.printf
			(fmt, name, kor, eng,mat,tot,avg, grd);
			
			
			//반복증감식
			++i;
			
			}
			
//do{ }while ();
//조건문이 처음부터 false이면 while은 코드 실행안함
//do-while은 일단 실행은 해주고 조건 검사해줌
			
			
			
	}
}
