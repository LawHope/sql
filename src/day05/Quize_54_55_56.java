package day05;

public class Quize_54_55_56 {
	 public  static void main (String [] args) {
	
		 
//54번 문제	
/*	char [] letter = {'a', 'b', 'c'};
	for ( int index = 0; index < letter.length; index++)
	 System.out.print(letter[index] + ", ");	
			
	
	double [] a = {1.1, 2.2, 3.3};
	System.out.println(a[0] + " " + a[1] + " " + a[2]);
	a[1] = a[2];
	System.out.println(a[0] + " " + a[1] + " " + a[2]);		
			
	
	int [] sampleArray = new int [10];
	for ( int index = 1; index <= sampleArray.length; index++)
	 sampleArray[index] = 3*index;
	*/
	
//55번 문제 
		 /*가. 1 2 3 4 5 6 7 8 9 10
		 나. 0 2 4 6 8 10 12 14 16 18 20
		 다. 1 4 9 16 25 36 49 64 81 100
		 라. 0 0 0 0 0 0 0 0 0 0
		 마. 1 4 9 16 9 7 4 9 11 */
	 
/*56. 다음 값들을 입력했을 때, 아래의 결과를 출력하는 프로그램을 작성하여라
		입력값 : 0  11  2  33  4  55  6  77  8  99
		출력결과 : 99  8  77  6  55  4  33  2  11  0 */
		 
		 
				 
/*57. 다음 코드를 실행했을 때 결과는 무엇인지 설명하여라
 */
		 double [] a = new double [10];
		 double [] b = new double [10];
		 int i;
		 for (i = 0; i < a.length; i++) a[i] = i;
		 b = a;
		 System.out.println( "a[2] = " + a[2] + " b[2] = " + b[2] );
		 a[2] = 42;
		 System.out.println( "a[2] = " + a[2] + " b[2] = " + b[2] );
		 
		 
		 
		 
	}
	
	
	
}
