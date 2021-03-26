package day09;

import javax.swing.*;

public class Interface {
    public static void main(String[] args) {
        /*인터페이스
          0.인터페이스는 추상메소드, 상수로만 구성된 클래스의 모양임.
          1. 객체지향 프로그래밍, 추상화
          2. 복잡한/자료/모듈/시스템을 핵심적인 개념,기능만 간추리는 것
          3. 중복 소스코드를 줄이고, 느슨한 결합도를 유지함
          4.추상화를 사용할 수 있도록 문법적 지원해주는 논리 도구가 인터페이스 
          5. 클래스를 만들 때 추상 메소드로 기본 틀을 만들고 규칙에 따라 코드를 짜기 좋음
          6.클래스와 다르게 다중상속을 지원함
          7. 인터페이스 작성시 interface 예약어를 사용함
          8.기능을 내려 받아서 온전하게 구현할 때는 implements 를  붙임
        */


        Cat3 c = new Cat3();
        c.cry();

        Murloc m = new Murloc();
        m.cry();

        Dog3 d = new Dog3();
        d.cry();

    }
}



    //인터페이스 = 추상메소드, 상수로만 구성된 클래스 모양
    class Animal3 {
        protected int height;
        protected int weight;

        // abstract public void cry(); < 전에는 이게 왔지마나는~
        // 클래스의 기능 부분을 인터페이스로 구현하기
    }

    interface Animal3Action{
        abstract public void cry();
    }

          //기능을 내려 받아서 온전하게 구현하기 -> implements를   붙임
        class Cat3 extends Animal3 implements Animal3Action {

                @Override
                public void cry() {
                    System.out.println("고양이는 고롱~ 고롱~");
                }
              }


        class Murloc extends  Animal3 implements Animal3Action {

            @Override
            public void cry() {
                System.out.println("멀록은 아옳옳~~");
              }
            }


        class Dog3 extends Animal3 implements  Animal3Action {
            @Override
            public void cry() {
                System.out.println("개는 크르릉 웡 웡!!");

            }
        }