package Sel_Rumination;

public class Re_Method {
    //psvm 치면 아래 녀석이 나옴
    public static void main(String[] args) {
        

        /* 메소드 : 특정 작업 수행을 위한 코드 집합 / C 언어 함수와 유사함
        유사 코드를 반복으로 쓰는 프로그래밍을 피할 수 있음
        프로그램의 모듈화(부품화)
        쪼각쪼각이라 유지보수가 유리함(지저분한 코드를 박아놓고 축약 대체어를 써서 잛보여)

ㅡ클래스는 : ㅁㅁㅁ class ### { 내용 }
ㅡ메소드는 : %% class @@ {   클래스 안에서 (선언&조건 걸어){내용을적어 }  }클래스닫기 임

         */

                                        /*   메서드명 (매개변수목록) { 메서드 몸체 & return 변수 }   */

                                        //접근지정자 : 메서드 접근허용 범위 지정 (public or pr ivate)
                                        //반환타입(return) : 메서드 실행 후 반환하는 자료 타입 지정
                                        //매개변수목록 = 파라미터(C 언어에서는 아규먼트) : 메소드 노출 시 전달하는 변수
                                        //메서드호출
                                        //메서드명()
                                        //

                                    /* public static void main(String[] args) {
                                        ↑ public (모두가 접근 가능함), protected (읽기전용) private (완전 기밀 나만 봄)
                                            Methods { public static
                                                        void
                                                        main(String[] args) }            */





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
