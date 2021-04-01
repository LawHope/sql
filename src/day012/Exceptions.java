package day012;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) throws IOException {
        /*
예외처리  exception

        개발자 선에서 처리 가능한 오류 때문에
        비정상적 종료될 것을  막고
        프로그램 진행을 원활히하려고 우회 경로를 만드는 것.

        (오류인 에러 Error 는 시스템 단계에서 사고로
        강제 종료 되는 것 = 개발자가 어떻게 못하는 것.
         ex) 서버 다운, 센터 화재, 정전, 지진, 서버폭주 등 사람이 어떻게 못할 문제들)

        자바 프로그램에서 문법에 맞지 않으면 컴파일 오류가 나거나,
        코드를 잘 짜놔도 실행 중에 충돌이나 버그로 오류가 발생할 수도 있음.
        프로그램에 영향을 주는 예기치 못한 상황 = 예외
        ex) 파일 경로 오지정, 데이터값 오타 등등

        예외 경우에도 프로그램이 강제 종료 될 수 있는데,
        중단되는 사태를 예방할 수 있게 개발자는 예외상황에 대처할 수 있는
        예외처리 코드를 미리미리 작성할 수 있어야 함 / 이것이 개발자의 능력이다!
        :: try - catch - finally 구문을 사용함!


        try {   예외 발생 예상되는 코드들 }

        catch ( 예측되는 예외 상황1 ) {
                                      예외상황 대처 코드1
                                      }
        catch ( 예측 예외 상황2 )  {
                                     예외상황 대처코드2
                                     }



        일반 예외 checked exception 메소드:
                     명시적인 예외처리를 강제함 - 안고치면 나 안해 스타일.
                     예외발생 시점은 컴파일할때 compile time //입출력시, 특정 클래스 호출 시

                     ArithmeticExeption
                     ArrayIndexOutOfBoundsExeption
                     InputismatchExeption


        실행 예외 unchecked exeption 메소드 :  명시적 예외처리를 강제하지 않음
                    ↑인터페이스에는 빨간 줄 뜨면서 경고하는 스타일처럼
                    이걸 꼭 쓰세요라고 강요하지 않는다는 뜻, 경고가 치대지 않아.
                    예외 발생 시점은 실행할 때 runtime 임 - 아 그 런타임 오류!

                    IOException
                    ClassNotFoundException



        예외처리 회피 / 양도 / 떠넘기기
                    메소드 선언부에 throws를 기입해서 메소드에 발생한 예외를 미리 선언하고
                    상위메소드에서 처리하게 함 /
                    하위 메소드들의 예외 이슈들을 상위에서 모아서 해결함 /
                    메소드 try-catch문을 안써도 됨. /
                    벗뜨 최상위에 임포트로 너무 많이 떠넘기면 터져서
                     "뭐 어쩌라고" 하고 오류 띄움 주의. /

         */


                //예외처리전
                System.out.println("c프로그램 시작!");
                int a = 10, b = 25;
                int c = a + b;
                System.out.println(c);
                System.out.println("c프로그램 끝!");
                //결과: c프로그램 시작!
                //        35
                //     c 프로그램 끝!

                System.out.println();
               /* System.out.println("f 프로그램 시작!");
                int d = 10, e = 0;
                int f = d / e;
                System.out.println(f);
                System.out.println("f 프로그램 끝!");
                //결과 : f 프로그램 시작!
                //                         ....??뭐야 왜 없어?
                // Exception in thread "main" java.lang.ArithmeticException: / by zero
                //	오류 난리 났다 난리 났어
                */
                                                                                              System.out.println();




                //예외처리 들어간다!
                //try - catch - finally 구문을 사용함!
          /*      System.out.println("예외처리 시작");
                try {
                    int g = 10, i = 0;
                    int j = g / i;      //<- 앗! 오류 발생
                    System.out.println(j); // <- 얘도 놀고 있음
                } catch (Exception ex) {
                    //예외 상황 지정 전
                    ex.printStackTrace();
                }
                System.out.println("예외처리 끝");
                //결과 :       예외처리 시작
                //          /j가 노는 구간/
                //           예외처리 끝
                // java.lang.ArithmeticException: / by zero
                //	at day012.Exceptions.main
                //	(Exceptions.java:66         <- 딱 j 등장 구간임 ) ::  끝은 나왔지만 오류 파티..

                //ex.printStackTrace(); 도 없었으면 그냥 오류 없는 척 넘어감 오우쉣
        */

                System.out.println();
                //ex) 1~9사이 정수만 입력되는 반환 프로그램, 딴짓 할 때"잘못 입력하셨소이다" 출력함

                Scanner sc = new Scanner(System.in);
                try {
                    System.out.println("1 ~ 9 정수를 입력하시오 : ");
                    int num = sc.nextInt();
                    System.out.println("입력한 정수 : " + num);
                } catch (Exception ex) {
                    System.out.println("잘못 입력하였습니다.");
                    ex.printStackTrace();
                }

                                                                                                  System.out.println();

                //일반예외 예시
                //성적데이터를 c:/JAva/sungjuk.txt 에 작성하고
                String sjdata = "송혜교 56 34 12";
                String fpath = "C:\\Users\\Fourth\\Desktop\\sungjuk.txt";

                try{ // try 구문, catch 구문 작성해주기
                FileWriter fw = new FileWriter(fpath);
                                    //↑빨간 줄 메뉴탭, 예외를 메소드 시그니처에 포함으로 설정
                                    //상단에 임포트가 생기고 이 가상 머신이 해결하게 됨
                                    //이것이 바로 회피 양도 떠넘기기임
                                    //벗뜨 최상위에 임포트로 너무 많이 떠넘기면
                                    // 터져서 "뭐 어쩌라고" 하고 오류 띄움 조심.

                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(sjdata);
                bw.close();
                fw.close();} catch (IOException e) {
                    e.printStackTrace();
                }

                                                                                                    System.out.println();



    }}


