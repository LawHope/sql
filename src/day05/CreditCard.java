package day05;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		
		//신용카드 분류기 - 신용카드의 번호를 보고 어느 카드사 어떤 카드인지
		
		
		//문자열.charat(자릿수) : 지정한 자릿수의 문자하나 추출함
		//문자열substring(시작,끝):
		//지정한 시작위치에서 끝의 -1위치 문자 추출

		/* ex)  123456-0987687
		jumin.charat(0) : 1
		sumin.substring(7,8) : 1 */
		
		//3 : JCB / 4 : VISA / 5 : MASTER

		
		String card;
		String bank = "";
		String ctype = "";
		
		String fmt = "카드사 : %s, %s입니다.";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("카드번호를 입력하세요");
		card = sc.next();
		
		/*		if (card.charAt(0) == '3')
			ctype= "JCB";
		else if (card.charAt(0) == '4')
			ctype= "VISA";
		else if (card.charAt(0) == '5')
			ctype= "MASTER";
			// 카드사 정보도 다 넣어야하지만 
			//스위치문으로 가자 그냥.
		System.out.println(card);
		*/ //if문 치우고
		
		
		switch(card.charAt(0)) {
		case '3' : ctype = "JCB"; break;
		case '4' : ctype = "VISA"; break;
		case '5' : ctype = "MASTER"; break;
		}
		//스위치문 System.out.println(ctype);

		switch (card) {
		case "356317" : bank = "NH농협카드"; break;
		case "356901" : bank = "신한카드"; break;
		case "356912" : bank = "KB국민"; break;
		case "404825" : bank = "비씨카드"; break;
		case "438676" : bank = "신한카드"; break;
		case "457973" : bank = "국민은행"; break;
		case "515594" : bank = "신한카드"; break;
		case "524353" : bank = "외환카드"; break;
		}
		//SWITCH문
		
		System.out.printf(fmt, ctype, bank);
		
		//if 문 보다 switch 문이 더 간결하다.
		
	}

}
//솔리드 검색해서 알아보기 / 응집도 결합도 
