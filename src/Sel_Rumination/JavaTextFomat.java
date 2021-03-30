package Sel_Rumination;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class JavaTextFomat {
    public static void main(String[] args) {



 /* MessageFormat


                int String 등등 지각각인 형식의 데이터를 같은 양식으로 출력할 때 씀
                템플릿 문자열을 작성할 수 있음
                printf 나   String.format 보다 상위 수준
                변수를 배열로 정의한다.
                정해놓은 포멧에 다른 정보도 같은 양식으로 반환할 수 있다.*/

                String name = "김가나";
                int kor= 89;
                int eng = 95;
                int mat = 100;

                String fmt = "Name : {0} \n Korean : {1}\n  Eng : {2}\n Math : {3}\n";
                String result = MessageFormat.format(fmt, name,kor, eng, mat);
                    System.out.println(result);
                    //%d 쓰는 거 보다 훨씬 깔끔해, 변수를 가로로 할지 세로로 할 지도 자유임
                    //변수를 배열로 정의하면 바인딩으로 수월하게 처리 가능.

                    Object[] sj = {"지현", 78,65,12,580,53.2,"D"};
                    result = MessageFormat.format(fmt, sj);
                    System.out.println(result);
                    //김가나의 점수 자리에 지현의 것이 알아서 감!

                    //결과: Name : 김가나
                        // Korean : 89
                        // Eng : 95
                        // Math : 100
                        //
                        // Name : 지현
                        // Korean : 78
                        // Eng : 65
                        // Math : 12






/* DecimalFormat
                    정수 실수를 포함한 다양한 종류의 수를 과학적 표기,화폐, 퍼센트 등으로 표시함
                     */




                    double num = 1234.567890;

                    DecimalFormat df = new DecimalFormat( "0");
                    System.out.println(df.format(num));
                    //정수로 반올림해서 출력하기
                    //결과 : 1235


                    df = new DecimalFormat( "0.0");
                    System.out.println(df.format(num));
                        //소수 첫자리까지 반올림 출력
                    //결과 :1234.6

                    df = new DecimalFormat( "000000");
                    System.out.println(df.format(num));
                    //전체 자리 수는 6자리로 지정, 숫자가 모자라면 그 자리에 0으로 출력
                    //결과 :001235

                    df = new DecimalFormat( "######");
                    System.out.println(df.format(num));
                    //자리에 숫자가 모자라면 그자리는 공백으로 출력
                    //결과 :1235


                    num = 1234567890;
                    df = new DecimalFormat( "###,###,###");
                    System.out.println(df.format(num));
                    //천 단위마다 ,를 출력함
                    //결과 :123,456,789

                    num = 0.1125;
                    df = new DecimalFormat( "##%");
                    System.out.println(df.format(num));
                    // 실수 데이터를 %로 변환
                    // 결과 : 11%


    }
}
