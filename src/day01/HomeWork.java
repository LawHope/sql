package day01;

public class HomeWork {

	public static void main(String[] args) {
		/** 
		 * 5번 문제
		 * 가. double number = (1/3) * 3;
		 * 나. int quoient = 7/3;
		 * 다. int remainder = 7 % 3;
		 * 라. int result =11; result / = 2;
		 */

		 double number = (1/3) * 3;
		 int quoient   = 7/3;
		 int remainder = 7 % 3;
		 int result    = 11; result /= 2;
		 
		 System.out.println(number);
		 System.out.println(quoient);
		 System.out.println(remainder);		 
		 System.out.println(result);
		 
		 System.out.println();
		 
		 /** 6번 문제
		 * double x = 2.5; double y = 1.5;	int m = 18;	int n = 4;
		 * 가. x + n * y - (x + n) * y;
		 * 나. m / n + m % n;
		 * 다. 5 * x - n / 5;
		 * 라. 1 - ( 1 -( 1 - (1 - ( 1- n))));
		 */
		 double x = 2.5;  
		 double y = 1.5;  
		 int m    = 18; 
		 int n    = 4;
		 
		  System.out.println(x + n * y - (x + n) * y);
		  System.out.println(m / n + m % n);
		  System.out.println(5 * x - n / 5);
		  System.out.println(1 - ( 1 -( 1 - (1 - ( 1- n)))));
		
	}

}
