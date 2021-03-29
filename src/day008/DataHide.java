package day008;

import day007.B;

public class DataHide {
    public static void main(String[] args) {
        //캡슐화 capsulation
        //사용자가 모르게 정보를 은닉하는 개념 ex) TV 리모컨
        //최소한의 정보 (리모컨 사용법 등) 로 쉽게 이해하고 쓰도록.

        //그것이 바로 접근지정자이다!!! ex)private
        //클래스와 멤버변수 메소드 선언 시 정보 은닉 레벨을 부여함

        //자바에선 4가지 접근지정자가 있음
        //private > default >  protected  > public 순으로 레벨 높음

         A one = new  A ();
        System.out.println(one.c);
        System.out.println(one.a);
       // System.out.println(one.b); 멤버변수의 접근지정자가 private 라 접근이 안됨- 빨간글씨로 뜸

        B two = new B(); // day07 팩에 있는 B클 래스를 임포트해옴
        System.out.println(two.f); //B에서 f만 public 이라 소환 가능함 /e,d는 빨갛게 뜸
// ●●●●●● 멤버변수의 접근지정자가 private 인  클래스를 소환하려면? -> 메소드를 쓴다!! valueObject 참조

        




    } //main
}//dataHide

            class A{
            int a;           //default 접근지정
            private int b;   //private 접근지정
            public int c;     //public 접근지정
}
