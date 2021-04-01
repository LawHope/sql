package day011;

import java.util.StringTokenizer;

public class JavaStringToken {
    private static int i;

    public static void main(String[] args) {

                    /*
                    StringTokenizer
                    문자열을 지정한 문자로 쪼개는 메서드
                    쪼개진 문자를 tpken 이라고 부름

                    단순문자열은 StringTokenizer을 쓰고
                    복잡한건 정규식으로 나눠서 split 을 씀
                    */


                    String str = "this string include default delims";

                    String words1[] = str.split(" ");
                    //공백을 기준으로 split이 문자를 쪼갠다는 
                            
                            for(int i =0; i< words1.length; ++i);
        
                            System.out.print(words1[i] + " ");
                            System.out.println("");
                    //빅데이터에서 자연어를 정리하거나 분류할 때 많이 쓰인다.
                    //단어 출현 빈도, 강조부분,문장의 의도 파악 등등

                                                                                                     System.out.println();

                            StringTokenizer st = new StringTokenizer(str, " ");
                            // ↑ 기본구분자로 문자열을 쪼개버림
                            System.out.println(st.countTokens());
                            while(st.hasMoreTokens()) {
                                System.out.println(st.nextToken() + " "); }
                            //iterable 자료구조 : 배열의 객체형식인 StringTokenizer는
                            // iterable 자료 구조여서 분리된 토큰들 전체를 차례대로 하나씩 처리할 수 있음
                            //배열보다 스타일이 좋은 편
}}


