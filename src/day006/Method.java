package day006;

public class Method {
    //psvm 치면 아래 녀석이 나옴
    public static void main(String[] args) {

        /* 메소드 : 특정 작업 수행을 위한 코드 집합 / C 언어 함수와 유사함
        유사 코드를 반복으로 쓰는 프로그래밍을 피할 수 있음
        프로그램의 모듈화(부품화)
        쪼각쪼각이라 유지보수가 유리함(지저분한 코드를 박아놓고 축약 대체어를 써서 잛보여)

ㅡ클래스는 : ㅁㅁㅁ class ### { 내용 }
ㅡ메소드는 : %% class @@ {   클래스 안에서 (선언&조건 걸어){내용을적어 }  }클래스닫기 임

         */
        
        //ex) 1 ~ 18 사이 난수 10개 생성 V 1

        for (int i =1; i <= 10; ++i){
            int magic = (int) (Math.random() * 10) + 1; //난수 1개 만들기
            System.out.print(magic + " ");
        }

                                                  System.out.println(" ");


        //ex) 1 ~ 18 사이 난수 10개 생성 V 1
        for (int i =1; i <= 10; ++i){
          make_magic(); //html처럼 지저분한걸 foot에다가 박아 놓고 불러오는 식

        }

    }
    public static  void make_magic(){
        int magic = (int) (Math.random() * 10) + 1;
        System.out.print(magic + " ");

        }









}
