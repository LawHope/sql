package day05;

import java.util.Scanner;

public class LeapYear {

	private static int year;
	private static String result;

	public static void main(String[] args) {
		
		
		System.out.println(" 몇년도 입니까? ");			
		
		Scanner sc = new Scanner(System.in);	
				 year = sc.nextInt();
	
 
		if ((year % 4 == 0 && year % 100  != 0) ||
					(year % 400 == 0))
			result = "윤년입니다.";
			else 
			result = "평년입니다.";
		  
		System.out.println(result);
		
		
	}

}
