package Sel_Rumination;

import java.util.Scanner;

public class JavaWrapper {
    public static void main(String[] args) {
    
        
        
    wrapper class  : 기본 자료형의 데이터 -> 참조자료형으로 바꿔야할 떄,
                        메서드의 매개변수가 객체형을 요구할 경우 객체형으로 변경함
                        int -> Integer, double, -> Double
                        char -> Character, boolean -> Boolean

                        Integer() 박싱 : 하면 기본자료형 변수 -> 참조자료형 변수로, 사용할 수 있는 변수로 만들어줌!
                        Integer.parseInt() 문자 변환 : 문자 변수를 정수로 변환한다!
                        intValue() 언박싱 : 참조자료형 변수를 기본 자료형으로 바꿈!





        int a = 123;
        System.out.println(a);
        //이건 늘 하던 식이고


                               //-------------------------------------------------------------//
        
        
        
        
                                        Integer b = new Integer(a);
                                        System.out.println(b);
                                                                이건 박싱으로 클래스를 사용할 수 있는 변수로 변환

                                        Scanner sc = new Scanner(System.in);
                                        System.out.println("숫자를 하나 입력하시오.");
                                        int number = Integer.parseInt(sc.next());
                                                                        이건 문자 변수를 정수로 변환함

                                        int c = b.intValue();
                                                                언박싱 = 원래대로 자료형으로 바뀜

                                        Integer d = 456;
                                                         <- new Integer는 사용안함
                                        int e = d;      <- int09Value 안씀


                                            
                                            
                                            
                                            
                                        10진수를 2진수로 변환하기  4=>100
                                            
                                        
                                        System.out.println( Integer.toBinaryString(4));


                                        /* compareTo(수1, 수2)
                                        결과 = 1, 0, -1  */
        
                                        두 수의 크기를 비교하시오.
                                            
                                        System.out.println(b.compareTo(d));
                                        System.out.println(Integer.compare(b,d));
        
        
        

    }
}
