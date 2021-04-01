package day008;

public class InHeritance {


    public static void main(String[] args) {

        /* 상속(extends) = 확장 : 객체 지향 3대 개념 중 하나. 기존 클래스에 기능 추가, 재정의로 새클래스 만들기
                  상속을 쓰면 기존 클래스 (부모/상위/ SuperClass 로 부름) 의 필드와 메소드를 이용해
                  새 클래스 (자식/하위/ Sub Class 로 부름)를 쉽게 만들 수 있다.
           장점 : 클래스 재활용 가능 ->소프트 웨어 생성 까지도 향상 / 클래스 계층구조 파악에 용이
                   쪽바리들이 번역한 걸 다시 번역하는 바람에 상속,부모 자식으로 inheritance 로 써놨는데,
                   상속은 ★ extends ★  다!!!!!!

                      ex) 이글도 날다고 아울도 날다인데 두개면 두번하게 되는 사태가...
                      각각 노가다로 짜놨더니 hunt를 추가하라고 하면 어떡해..?  ★ ★ 그냥 익스텐즈를 쓰자 ★ ★

                      상속의 형식은 이거! ↓ ↓
                      class 클래스명 extends 부모클래스명 {}   */


        // 3.설정해놓은 클래스를 호출(call)해보면 ↓
        Tiger2 t = new Tiger2();
        System.out.println(t.eye);
        System.out.println(t.leg);
        System.out.println(t.mouth);
    }
}
               /* class Eagle {
                    String eye;
                    String mouth;
                    String wing;

                    public void eat(){}
                    public void sleep(){}
                    public void fly(){}
                }

                class Tiger{
                    String eye;
                    String mouth;
                    String leg;

                    public void eat(){}
                    public void sleep(){}
                    public void run(){}
                }

                class GoldFish{
                    String eye;
                    String mouth;
                    String fin;

                    public void eat(){}
                    public void sleep(){}
                    public void swim(){}
                } */ //노가다로 하면 거시기 하게 길구나야.............


    //  Exends 사용하기!!!
        class Animal {
        String eye;
        String mouth;
//1.공통적인 내용만 뽑아서 클래스 하나 만들고
        public void eat(){}
        public void sleep(){}
        }


// 2.각기 따로 갖고 있는 사항은 각각 클래스로 만들기
        /*-------------------------------*/
        class Eagle2 extends Animal {
            String wing;
            public  void fly(){}
        }
        /*-------------------------------*/
        class Tiger2 extends Animal{
            String leg;
            public void run(){}
        }
        /*-------------------------------*/
        class GoldFish2 extends Animal {
            String fin;
            public  void swim(){}
        }

