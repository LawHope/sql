package day05;

import java.util.Random;

public class Arrays {
 public  static void main (String [] args) {
//배열 
//같은 종류의 복수 데이터를 저장하는 자료
	 //각 값은 요소(element)라 부름
	 //요소의 위치는 숫자값 index로 지정함
//배열 index는 0부터 시작함, 1~3차원까지만 지원함
	 //배열 생성에는 크기를 정해야함
	 
//자료형[] 배열변수명; -Good // 자료형 배열변수명[]; -soso
//초기화
//배열변수 = new 자료형[갯수];
	 
	 //회원정보 (uid, pwd,age)를 지정하는 배열
	 String[] uid;
	 String[] pwd;
	 Object[] age;
	 
	 uid = new String[3]; //3명분 아이디를 저장하는 배열변수
	 pwd = new String[3]; //3명분 패스워드
	 age = new String[3]; // 3명분 나이
	 
	  System.out.println(uid);
	  System.out.println(pwd);
	  System.out.println(age);
	  
//new연산자는 참조형 객체를 만들라는 의미
//┌ 기본 자료형 객체는 변수에 실제 값이 저장된 것 (변수 선언한 것들)
//└ 참조 자료형 객체는 변수에 값이 저장된 '위치'를 저장함
	 //실제 값을 알려면 위치+변위(떨어진 줄 수)를 적용해야함
	  	/*JVM메모리를 이용해서 힙영역에 있는 자료의 위치를 읽어오고
	  				그걸 토대로 불러올 자료를 지정할 수도 있음 */
	 //참조형은 자료 데이터가 아니라 힙 영역에 저장된 자료가 있는 위치라는.
	 

	  /*JVM 메모리 구조
	  *┌ 스택 : 일반적인 변수 선언 시 사용되는 공간
	  *│ 	  기본/참조자료형들이 주로
	  *└ 힙  : 객체형(instans) 자료 저장되는 공간
	  *		  그래서 중복 자료 표기가 가능함 지정된 위치 값은 
	  *		  스택의 생선 변수에 저장
	  */	  
	
	  
	  //배열요소 다루기
//배열명 [인덱스] = 값 //특정 요소에 값을 저장함
	  
	  uid[0] = "abc123";
	  uid[1] = "xyz456";
	  uid[2] = "789abc";
	  
//배열의 요소 출력은 배열명[인덱스] 로 씀
	  
	  /*System.out.println(uid[0]);
	  System.out.println(uid[1]);
	  System.out.println(uid[2]);*/
	  //▲ 보다 간단하게 쓰는 방법은 
	  //배열 요소는 반복문 쓰려고 사용하는 셈
	 
	   for(int i = 0; i < 3 ; ++i) {
		  System.out.println(uid[i]);
		  
System.out.println();
System.out.println();	




		//1~45사이 숫자를 랜덤으로 출력하기 V.1
//random 클래스 : 난수
		//랜덤 클래스를 쓰면 원하는 형식의 난수 생성 가능
		int [] lotto = new int[6]; //6개의 수를 뽑는다는
		Random rnd = new Random();
		//randome도 스캐너처럼 외부 라이브러리 빌려쓰는 거
		//난수표를 써서 난수를 생성함
		
		/*lotto[0] = rnd.nextInt(45)+1;
		lotto[1] = rnd.nextInt(45)+1;
		lotto[2] = rnd.nextInt(45)+1;
		lotto[3] = rnd.nextInt(45)+1;
		lotto[4] = rnd.nextInt(45)+1;
		lotto[5] = rnd.nextInt(45)+1;
		*/
		// nextInt(경계) : 0 ~ 경계-1 범위에서 난수 생성
		//nextInt(45) => 0 ~ 44 이면 1~45까지 나옴
		
		//System.out.println(lotto[0]);//~[5] 까지 해야하는데
		//다 쓰기는 귀찮아 for를 쓰자

		for( int i1 = 0; i1<6; ++i1) {
			System.out.println(lotto[i1]);
		}
		
		
	   }
	  
 }
}
