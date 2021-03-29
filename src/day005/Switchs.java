package day005;

import java.util.Scanner;

public class Switchs {

	private static final Scanner sc = null;
	 

	public static void main(String[] args) {
		//switc제어문
		//둘 이상의 조건의 결과에 따라 명령을 선택적으로 실행
		//낙하형이라는 건 쭈루룩 가서 맨 아랫것만 실행한다는 뜻임
		//중간에 break;를 꼭 걸어야함
		
		/*switch(정수인 상수, 연산식도 가능) { 
			case 상수 1 (case 레이블임) : 실행문1; break; 
									//브레이크 없으면 시공의 폭풍이 됨
			case 상수 2 : 실행문2; break;	
			case 상수 3 : 실행문3; break;
			defaullt : 실행문4;(선택사항)
			}
			
			
		 * 35. 시간때를 의미하는 영어단어를 변수 daytime으로 입력받으면,
	그에 따른 의미를 출력하는 프로그램을 작성하라 (CheckDayTime)
	morning hours 아침시간 (7)  
	midday / noon 점심시간 (12)
	 hours 오후 (1)
	evening hours 저녁시간 (6)
	night hours 밤시간 (9)
	midnight 자정시간 (12)
	early morning hours 새벽시간 (12)
	small hours   새벽 (1)
	dawn / daybreak 일출 전 (5)
*/
		
		int daytime;
		String result = "";
		
		System.out.print("시간을 입력하세요 ");
		daytime = sc.nextInt();
		
		/* if (daytime >=7 && daytime <= 12)
			result = "morning hours";
		else if (daytime >=12 && daytime <1)
			result = "noon"; ... 
			이런식으로 써도 되지만 너무 복잡해;; 
			
			▼▼ 단순하고 무식하게 가보자 ▼▼ */
			
		
		switch (daytime) {
		case 7: case 8: case 9: case 10: case 11:
			result = "morning"; break;
		case 12: case 13:
			result = "noon"; break;
		case 14: case 15: case 16: case 17:
			result = "after noon";break;
		case 18: case 19: case 20:
			result = "evening";break;
		case 21: case 22: case 23:
			result = "night";break;
		case 24 :
			result = "mid night";break;
		case 1: case 2: case 3: case 4:
			result = "early morning";break;
		case 5 :
			result = " dawn";break;
		}
		
		System.out.println(result);
			
		
		}
		
	}


