package day011;

import java.util.Date;
import java.util.Locale;

public class JavaString {
    public static void main(String[] args) {
        /* String class = 불변 객체 immutable Object
       java lang 패키지에 포함된 클래스임
       C 언어에서는 char 배열이지만, 자바에서는 String 을 이용함
       String 객체에선 생성되면 수정이 불가(immutable 임)하고 읽기만 가능함

       String 객체는 메모리를 재활용 = inerning 함,
       생성된 String 객체를 String Pool에 저장 후
       다음 String 객체와 유사한 경우, 이미 만들어진 객체를 재활용함.
           1. 재활용하려면 == (저장 위치 비교 함수)를 쓰면 되고,
           2. equals()를 써야 문자열 내용을 비교한다능.

       ChatAt, concat, indexOF, trim, length, toLowerCase, toUpperCase, split, substring


         */

/*  String 은 문자 객체값 비교할 때 equals 메소드를 써야함, 저장 위치 비교에는 ==를 써야함*/
          // 왜나면..

                String str1 = "Hello,World!"; //힙영역 안의 String(상수) pool로 감
                String str2 = new String("Hello,World!"); //나홀로 hip 영역으로 가버려..
                String str3 = "Hello,World!"; //힙영역 안의 String(상수) pool에 간 정보를 재활용함

                 if (str1 == str2)
                System.out.println("str1 = str2 가 같음");
                if (str1 == str3)
                    System.out.println("str1 = str3 가 같음");
                //결과 : str1 = str3 가 같음만 나옴 =>  같은 객체로 인식해서 출력된 것임
        
                // ==은 값비교가 아니라 자료 저장 위치를 비교하라는 함수인데,
                //str2만 new String 이라  아예 다른 곳에 저장된 String 으로 인식해버린 것임
                //equals 를 써야 문자열 비교해서 같은것으로 인식하게 됨!


                 if (str1.equals(str2))
                    System.out.println("str1 = str2 가 같음");
                if (str1.equals(str3))
                    System.out.println("str1 = str3 가 같음");
                     //결과 : str1 = str2 가 같음 / str1 = str3 가 같음 3개가 같다고 떠줌

                                                                                                     System.out.println();


 /* charAt 은 문자열 특정 위치 index에 문자를 반환 */
                    String jumin = "123456-1234567";
                    if (jumin.charAt(7) =='1')
                        System.out.println("남자입니다.");
                                                                                                           System.out.println();


/*concat 은 문자열을 하나로 이어 묶음
        문자열에 + 연산자를 쓰면 StringBuilder로 변환 -> Append 문자열 추가 -> toString으로 변환 노가다 파티가 열림
        2개 이상 문자열 합치기에 concat, 그 이상은 +로 혼용하자*/

                 String a = "Hello~~ ";
                String  b = "World!!";
                System.out.println( a.concat(b));
                                                                                                          System.out.println();

 /* indexOf : 특정 문자열이 출력된 위치를 표시
        문자열이 없을 때는 -1을 반환=출력 해줌
        찾고 싶은 문자가 있는지 없는 지를 알아내고 싶을 때 활용 Split 함수 때 쓸 예정
         */

                 String c= "Hello, World!";
                System.out.println( c.indexOf("World"));
                    //결과 7, 8번째부터 그 글자 나오더라
                String d = "asd1234.png";
                System.out.println(d.indexOf('s'));
                    //결과 1, 두번째 글자에 그거 있더라.
                String e = "1234512345678910";
                System.out.println(e.indexOf("12"));
                System.out.println(e.indexOf("12",3));
                //시작 위치 재조정할때는  fromIndex 매개 변수 사용
                System.out.println(e.indexOf("34",6));
                System.out.println(e.lastIndexOf("34",4));

                //우측 기준으로  특정 문자열 인덱스 찾기 ( ->방향으로 찾음 )
                System.out.println(e.lastIndexOf("34"));


                                                                                                           System.out.println();


//trim : 문자열에 무쓸모 공백 발생 시, 공백을 제거할 때
                String f = " asdf1234";
                System.out.println("["+ f + "]/" + f.trim() + "]");
                                        //↑ 트림 전     ↑ 트림 후
                //결과 : [ asdf1234]/asdf1234]
                String g = " 76423 23235 b2343 ";
                System.out.println("[" + g.trim()+ "]");
                //결과 : [76423 23235 b2343] 중간 스페이스는 그대로임
                //replace 메소드를 쓰면 중간 띄어쓰기도 없어짐.

                                                                                                       System.out.println();
/*length :   문자 갯수를 반환해주는 메서드
                문자열의 실제 byte 수를 알려면 getByte를 써야함   */




                System.out.println(a.length());
                System.out.println(b.length());
                //  String a = "Hello~~ "; // 결과 : 8
                //  String  b = "World!!"; // 결과 : 7

                System.out.println(e.getBytes().length);
                // String e = "1234512345678910";  // 결과 : 16byte 래

                String korean = "안녕하시렵니까, 자바색히야.";
                System.out.println(korean.length());
                //결과 : 15  자래.
                System.out.println(korean.getBytes().length);
                //한글로는 덩치가 커서리, 39 바이트래


                                                                                                     System.out.println();
 /* split :   특정문자를 기준으로 문자열 컷팅, 배열에 넣어주는 메소드
              사용이 매우 빈번함 */
         String k = "채이탁 99 97 87";
         String [] datas = k.split( " "); // 스페이스를 기준으로 문자열 자르기
         for (int z =0; z < datas.length; ++z)
        System.out.println(datas[z]);
            //결과 : 채이탁
                    //99
                    //97
                    //87
                                                                                              System.out.println();

/* toLewerCase, toUpperCase : 대소문자 변환에 사용 */

                String i = "asdfg"; //결과 ASDFG
                String j = "ASDFG"; //    asdfg
                System.out.println(i.toUpperCase());
                System.out.println(j.toLowerCase());

                    //hello, java!! 에서 각 단어 첫자를 대문자로 만드는 코드 작성해보기 (capitalization)
                 String l = "shit java!";
                 String[] word = l.split(" ");
                    System.out.println((word[0].charAt(0) + "").toUpperCase());
                    System.out.println((word[1].charAt(0) + "").toUpperCase());
                    // 결과
                     //   S
                    //    J

                                                                                                  System.out.println();

/*replace : 특정문자열을 바꾸는 메서드
                replace(기존문자,  바꿀 문자)    */

                    System.out.println(korean.replace("자바","파이썬"));
                    //결과 : 안녕하시렵니까, 파이썬색히야.

                     //123451234512345 에서 12를 아오 로 변경
                    System.out.println(e.replace("12","아오"));
                   //결과 : 아오345아오345678910
                    String q = "123-4567-89123";
                    System.out.println(q.replace("-",":"));
                    //결과 : 123:4567:89123

                    //ex ) hello, java!를 첫자만 대문자로 만들기 (capitalization)
                    String word1 =(word[0].charAt(0) + "").toUpperCase();
                     String word2 =(word[1].charAt(0) + "").toUpperCase();

                     k = k.replace("h", word1);
                     k = k.replace("j", word1);
         
                         System.out.println(k);



                                                                                               System.out.println();
/*  substring : 문자열 시작부터 끝 -1까지의 문자열 추출 메소드
                substring(start)
                substring(start,end-1)
                 */

                      //주민번호에서 생년월일 추출하기
                    System.out.println(jumin.substring(0, 6));
                        //생년월일 제외 추출
                    System.out.println(jumin.substring(7));


                                                                                                    System.out.println();

/* valueOf 숫자를 문자로 변환시 사용하는 메서드*/

                    int height =123;
                    System.out.println(height + "");
                    System.out.println((height));
                    System.out.println((height));


                                                                                         System.out.println();

/* format : c 언어의 printf 처럼  서식문자열을 변수와 문자열 조합으로 생성하는 메서드 */

        Date today = new Date();

        String fmt = "%tY년 %t<m월 %t<d일 %t<H시 %t<M분 %t<s초 \n";
        String result = String.format(fmt, today);
        System.out.println(result);




/* StringBuilder, StringBuffer
                불변객체인 String을
               새로운 문자열 바로 추가 가능, 메모리 절약
                 + + 로 잇는 거보다 StringBuilder 를 써서  append 로 연결 하는게 유리함   */

                StringBuilder sb = new StringBuilder();
                sb.append("Hello,").append("World").append("!!");

                        System.out.println(sb.toString());
                        //builder를 쓸 때는 문자열로 변환해주는 toString()을 붙여야한다.

    }

}
