package day05;

import java.util.Scanner;

//성적처리기 V3.
//성적처리 학점계산을 switch 제어문으로 작성해보자
public class grade_V3_2 
{
	//성적처리 프로그램에 선택 실행하는 메뉴를 추가함
	//객체 지향 기법으로 CRUD 기능을 제공
	public static void main (String [] adgs) {
		
		 Scanner sc = new Scanner(System.in);
		 
	while (true) { //재시작할 것 없이 알아서 무한으로 넘어감
		String displaymenu = 
		"==================== \n"+
		"  알뜰 학점 계산기 V.4   \n"+
		"==================== \n"+
		 	 " 1. 성적 입력 \n" +
			 " 2. 성적 조회 \n" +	
			 " 3. 성적 상세 \n" +
			 " 4. 성적 수정 \n" +
			 " 5. 성적 삭제 \n" +
		"==================== \n" +
		 "[작업을 선택하세요] : \n";
		
		System.out.print(displaymenu);
			 
		String menu;
		 menu = sc.next();
		 switch (menu) {//JDK 7부터는 switch문에 문자 가능)
		 case "1":  System.out.println("성적 입력"); break;
		 case "2":  System.out.println("성적 조회"); break;
		 case "3": System.out.println("성적 상세"); break;
		 case "4":  System.out.println("성적 수정");break;
		 case "5":  System.out.println("성적 삭제");break;
		 case "0":  System.exit(0);break;  
		 default : System.out.println("입력사항 오류!");
		 
		 System.out.println();
		 System.out.println();
		 System.out.println();
		 } //switch
		}//while
	} //main
	}
