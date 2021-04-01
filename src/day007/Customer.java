package day007;

public class Customer {
public static void main(String[] args) {
            //고객 정보를 클래스로 정의

            //속성별로 변수를 각각 선언 - 관리 골치아픔 찾아서 해야돼

/*
    1. 클래스이름() { ... } // 매개변수가 없는 생성자 선언
    2. 클래스이름(인수1, 인수2,...) { ... } // 매개변수가 있는 생성자 선언

<클래스의 선언>
클래스(class)란 객체 지향 프로그래밍의 추상화(abstraction)라는 개념을 직접 구현한 것이라 할 수 있습니다.
자바에서는 개발자의 편의를 위해 유용하게 사용할 수 있는 많은 수의 클래스를 미리 정의하여 제공하고 있습니다.
또한, 개발자가 원하는 동작을 하는 새로운 클래스를 손쉽게 작성할 수도 있습니다.
자바에서 클래스를 선언하는 방법은 접근 제어자와 함께 class 키워드를 사용하면 됩니다.

<인스턴스 변수의 초기화>
클래스를 가지고 객체를 생성하면, 해당 객체는 메모리에 즉시 생성됩니다.
하지만 이렇게 생성된 객체는 모든 인스턴스 변수가 아직 초기화되지 않은 상태입니다.
객체를 참조하기 위한 참조 변수를 먼저 선언합니다.
그 후에 new 키워드를 사용하여 인스턴스를 생성하고,
해당 인스턴스의 주소를 미리 선언한 참조 변수에 저장하여 사용합니다.

객체참조변수이름 = new 클래스이름();

또한, 다음과 같이 참조 변수의 선언과 인스턴스의 생성을 동시에 할 수도 있습니다.
Car myCar = new Car();

사용자가 원하는 값으로 인스턴스 변수를 초기화하려면, 일반적인 방식으로는 초기화할 수 없습니다.
인스턴스 변수 중에는 private 변수도 있으며,
private 변수에는 사용자나 프로그램이 직접 접근할 수 없기 때문입니다.
따라서 private 인스턴스 변수에도 접근할 수 있는 초기화만을 위한 public 메소드가 필요해집니다.
이러한 초기화만을 위한 메소드는 객체가 생성된 후부터 사용되기 전까지
반드시 인스턴스 변수의 초기화를 위해 호출되어야 합니다.

<기본 생성자(default constructor)>
자바의 모든 클래스에는 하나 이상의 '생성자' 가 정의되어 있어야 합니다.
but 자바 컴파일러가 '기본 생성자(default constructor)' 라는 것을 기본 제공하기 때문에
생성자를 정의하지 않고도 인스턴스를 생성할 수 있습니다.
'기본 생성자' 는 매개변수를 전혀 갖지 않고, 아무런 명령어도 포함하고 있지 않습니다.
자바 컴파일러는 컴파일 시 클래스에 생성자가 없으면 자동으로 기본 생성자를 추가합니다.
자바에서는 new 키워드를 사용하여 객체를 생성할 때 자동으로 생성자가 호출됩니다.


<this 참조 변수>
this 참조 변수는 인스턴스가 바로 자기 자신을 참조하는 데 사용하는 변수입니다.
this 참조 변수는 해당 인스턴스의 주소를 가리키고 있습니다.
생성자의 매개변수 이름과 인스턴스 변수의 이름이 같을 경우에는
인스턴스 변수 앞에 this 키워드를 붙여 구분해만 합니다.
this 참조 변수를 사용할 수 있는 영역은 인스턴스 메소드뿐이며,
클래스 메소드에서는 사용할 수 없습니다.

<static 제어자>
자바에서 static 제어자는 '공통적인' 이라는 의미로 사용됩니다.
static 제어자를 변수에 사용하면 해당 변수를 클래스 변수로 만들어 줍니다.
또한, 메소드에 사용하면 해당 메소드를 클래스 메소드로 만들어 줍니다.
이러한 static 제어자는 초기화 블록에도 사용할 수 있습니다.

    1. 프로그램 시작시 최초에 단 한 번만 생성되고 초기화됩니다.
    2. 인스턴스를 생성하지 않고도 바로 사용할 수 있게 됩니다.
    3. 해당 클래스의 모든 인스턴스가 공유합니다.


<필드의 구분>
클래스의 필드(field)란 클래스에 포함된 변수(variable)를 의미합니다.
클래스 내에서 필드는 선언된 위치에 따라 다음과 같이 구분됩니다.

    1. 클래스 변수(static variable)
    2. 인스턴스 변수(instance variable)
    3. 지역 변수(local variable)

class Car {
    static int modelOutput; // 클래스 변수
    String modelName;       // 인스턴스 변수
    void method() {
        int something = 10; // 지역 변수
    }
}

<클래스 변수와 인스턴스 변수>
클래스 영역에 위치한 변수 중에서 static 키워드를 가지는 변수를 클래스 변수(static variable)라고 합니다.
그리고 클래스 영역에 위치한 변수 중 static 키워드를 가지지 않는 변수는 인스턴스 변수(instance variable)라고 합니다.
또한, 메소드나 생성자, 초기화 블록 내에 위치한 변수를 지역 변수(local variable)라고 합니다.


<Math 클래스>
java.lang.Math 클래스
Math 클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해 놓은 클래스입니다.
Math 클래스의 모든 메소드는 클래스 메소드(static method)이므로, 객체를 생성하지 않고도 바로 사용할 수 있습니다.
이러한 Math 클래스는 java.lang 패키지에 포함되어 제공됩니다.

    1. Math.E : 오일러의 수라 불리며, 자연로그(natural logarithms)의
                밑(base) 값으로 약 2.718을 의미합니다.
    2. Math.PI : 원의 원주를 지름으로 나눈 비율(원주율) 값으로 약 3.14159를 의미합니다.

<random() 메소드>
random() 메소드는 0.0 이상 1.0 미만의 범위에서 임의의 double 형 값을 하나 생성하여 반환합니다.
이 메소드는 내부적으로 java.util 패키지의 Random 클래스를 사용한
의사 난수 발생기(pseudorandom-number generator)를 사용하여 임의의 수를 생성합니다.

    System.out.println((int)(Math.random() * 100)); // 0 ~ 99
    Random ran = new Random();
    System.out.println(ran.nextInt(100));           // 0 ~ 99
                            or
    (int)(Math.random() * 6);       // 0 ~ 5
    ((int)(Math.random() * 6) + 1); // 1 ~ 6
    ((int)(Math.random() * 6) + 3); // 3 ~ 8

<pow() 메소드와 sqrt() 메소드>
pow() 메소드는 전달된 두 개의 double형 값을 가지고 제곱 연산을 수행합니다.
예를 들어, pow(a, b)는 a의 b 승을 반환하게 됩니다.
반대로 sqrt() 메소드는 전달된 double형 값의 제곱근 값을 반환합니다.

            System.out.println((int)Math.pow(5, 2)); // 25
            System.out.println((int)Math.sqrt(25));  // 5

            실행 결과
            25
            5






*/


            //클래스에서 쓰려면 객체화를 해야함
            //변수들이 메모리에 할당 되어야 쓸 수 있다.
            Customer p = new Customer();
            //클래스의 매개 변수 초기화

            p.name = "이미녀";
            p.job = "골프선수";
            p.age = 28;
            p.gender = "F";
            p.blood = "O";
        }

            String name;
            String job;
            int age;
            String gender;
            String blood;

        //정보들을 Person 이라는 클래스로 묶어버림
        static class Person{
            //변수선언 (속성 property, field, member)
            private String name;
            private String job;
            private int age;
            private String gender;
            private String blood;


            //변수초기화 메소드 : 생성자

//public 클래스명(Person) (매개변수 String  어쩌고 저쩌고 ) {
// 초기화코드 }




            //생성자 종류 : 기본생성자, 매개변수 포함 생성자
            //기본 생성자 :컴파일러가 자동으로 생성&추가해줌
            public Person(){ }

            public Person(String name, String job,
                          int age, String gender, String blood)
            {
                this.name = name;
                this.job = job;
                this.age = age;
                this.gender = gender;
                this.blood = blood;
                //생성자 매개변수 명 = 멤버 변수가 되면 shadowing 현상 발생함
                //동명이 있으면 뭐가 뭔지 모르게 됨.
                //구분하려고 ' this. ' 를 붙여서 class 멤버 변수라고 알려줌.

            }

        }

        //객체 대입 값 출력
        //객체명 멤버변수명
 /*       System.out.println(p.name);
        System.out.println(p.job);
        System.out.println(p.age);
        System.out.println(p.gender);
        System.out.println(p.blood);
*/
    }









