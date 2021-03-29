package day005;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		//아이디 비번 입력시 로그인 성공여부를 출력하는 프로그램
		//ID o PW o 성공 / ID x or pw x 실패
		
		String userid;
		String passwd;		
//입력부분
		Scanner sc = new Scanner (System.in);
		String result;
		
		System.out.println("ID : ");
		userid = sc.next();		
		System.out.println("PassWord : ");
		passwd = sc.next();	
		
		
//결과 출력
		/*문자열 비교시에는 숫자용인 == 말고 .equals() 메소드를 써야함
		if (userid .equals("abc123")) {
		if (passwd .equals("987xyz"))
			result = "로그인 성공!";
		else 
			result ="로그인 실패";
		} else {
			if (passwd .equals("987xyz"))
				result = "PW만 오류";
				else
					result = "패스워드 오류";
		}
				System.out.println(result);
				//ID,PWo/IDx,PWo/IDo,PWx/IDxPWx인
				//경우로 4가지로 설정해서 복잡함
				*/
		
//결과 출력2
		/*
				if(userid.equals("avc123")) {
					if(passwd.equals("987xtyz"))
						result = "Success";
					else 
						result = "false!";
				} else
					result="login fail";
				//ID0,PW0 / IDx / PWx 
				//로그인 성공여부를 3가지로 설정, 단순함
				 
				 */

				
//결과 출력3
				if(userid.equals("abc123") &&
						passwd.equals("987xyz"))
					result = "Log in success";
				else
					result = "Log in fail";
				
					System.out.println(result);
					//조건식들을 논리식으로 재작성 - 슈퍼 단순
				
				
				}
		


		
	}


