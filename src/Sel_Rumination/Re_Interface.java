package Sel_Rumination;

public class Re_Interface {
    public static void main(String[] args) {
        
        /*인터페이스
          0.인터페이스는 추상메소드, 상수로만 구성된 클래스의 모양임.
          1. 객체지향 프로그래밍, 추상화
          2. 복잡한/자료/모듈/시스템을 핵심적인 개념,기능만 간추리는 것
          3. 중복 소스코드를 줄이고, 느슨한 결합도를 유지함
          4.추상화를 사용할 수 있도록 문법적 지원해주는 논리 도구가 인터페이스 
          5. 클래스를 만들 때 추상 메소드로 기본 틀을 만들고 규칙에 따라 코드를 짜기 좋음
          6.클래스와 다르게 다중상속을 지원함
          7. 인터페이스 작성시 ● interface ● 예약어를 사용함
          8.기능을 내려 받아서 온전하게 구현할 때는 ● implements ● 를  붙임

                    1- 슈퍼클래스인 얼씨구를 선언함
                class 얼씨구 {
                        태초의 슈퍼 클래스 얼씨구를 쓰고 }
                    2- 인터페이스 같은이름A를 선언함 내용은 어쩌구,
                interface 같은이름A{
                        abstract 어쩌구 쓰고   }
                    3- 자식 섭클래스인 뫄뫄를 작성함.
                class 뫄뫄 extends 얼씨구 implements 같은이름A {        //  ┎클래스 뫄뫄는 얼씨구랑 내용을 합치고,
                       여기에 커서를 두고 있으면 안에 내용을 채우라고 뜸↑↑↑  \\ └어쩌구를 포함한다는 소리
                         자동완성 후  ## @Override + 어쩌구 ## 가 같이 같은 내용이 써지면 끝!  }


        여담이지만 인터페이스면 상속으로 할 것들을 해치울 수 있어서 좀.. 상속이 계륵이라고 한다.
        */


        Cat3 c = new Cat3();
        c.cry();

        Murloc m = new Murloc();
        m.cry();

        Dog3 d = new Dog3();
        d.cry();

    }
}



    //인터페이스는 추상메소드, 상수로만 구성된 클래스 모양 여튼 뭐 그렇다고.

// 1. 슈퍼마더파더 클래스 >>>> 를 선언한다.
    class Animal3 {
        protected int height;
        protected int weight;
                                            // abstract public void cry(); < 전에는 이게 왔지마나는 과거는 버려
    }

// 2.인터페이스 >>>> 클래스의 기능 부분을 인터페이스로 구현하기
    interface Animal3Action{ abstract public void cry(); }

// 3.  상속자 섭클↓ 등장 >>>>>  ↓ 확장할 엄마님     ↓ 인터페이스 클래스 내용을 그대로 쓸거임 -> implements를   붙임
        class Cat3 extends Animal3 implements Animal3Action {
                @Override
                public void cry() {
                    System.out.println("고양이는 고롱~ 고롱~");
                }
                }


//자식 클↓      부모 클↓          인터페이스 클↓
class Murloc extends Animal3 implements Animal3Action {
@Override
public void cry() {
    System.out.println("멀록은 아옳옳~~");
  }
}

        class Dog3 extends Animal3 implements  Animal3Action {
            @Override
            public void cry() { System.out.println("개는 크르릉 웡 웡!!");}
            }
