package day04;

public class Loopday4 {
public static void main (String [] args) {
	
	
	
	
		while문
			
		//조건 만족시 까지 계속 수행
		//초기식
		
		while (조건식) {
			
			   반복코드 
				&
				  증감식
		                           }
		

		
		int i = 1;  //초기식
	
		while (i <= 10) { //조건식     <-------조건식이 참이면 반복실행함
			
		System.out.println("계속 말할 거에요."); //반복코드
			
		i += 1;   //증감식
			
		}
		




		1-50홀수출력
	
		i = 1; //i값 초기화, 초기화 안하면 위에 계산식에 이어서 진행되어버림
		while (i <= 50) {
					//(i <= 50 && i % 2 == 1) 으로 넣으면 
					//i를 2로 나눠서 나머지가 1인것 이라는 뜻 -대신 번거로왕...
		System.out.println(i+" ");
			i +=2;
		}
		

		짝수출력
	
		i = 2;
		while ( i <= 50 ) {
			System.out.println(i+ "");
			i +=2;	
		}
			
			
		
		
		
		1-100총합 출력 
		
		int sum =0; 
		i = 1;
		while (i<+100) {
			sum += i;
		++i;
		}
		


		총합 sum 시작범위 i 끝범위 j
	
		i = 1;
		int j = 100;
		sum = (i +j ) * j /2;
		sum = i * (i+j) /2;  //이런 표현도 가능
		System.out.println(sum);
		


		
		
			
		
		
		
	}

}
