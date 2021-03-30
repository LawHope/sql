package day06;

public class Methods {
    public static void main(String[] args) {

    //메소드 형식
    //접근지정자 반환타입

            /  메서드명 (매개변수목록) { 메서드 몸체 & return 변수 }   

    //접근지정자 : 메서드 접근허용 범위 지정 (public or pr ivate)
    //반환타입(return) : 메서드 실행 후 반환하는 자료 타입 지정
    //매개변수목록 = 파라미터(C 언어에서는 아규먼트) : 메소드 노출 시 전달하는 변수
        //메서드호출
        //메서드명()
        //

       public static void main(String[] args) {
        ↑ public (모두가 접근 가능함), protected (읽기전용) private (완전 기밀 나만 봄)
            Methods { public static
                        void
                        main(String[] args) }            */



        //1.인삿말 출력
        sayHello(); // 아래 박아놓은 메소드를 소환한 것
        //2.인삿말 say hello !메시지 출력하기
        sayHello2();
        //3.인삿말 대상을 변수화 (불러오기 스타일)
        sayHello3( "GIT hub" );
        sayHello3("FTP");
        //4. 호출자에게 수행을 넘기고 명령만 내리기 / 리턴 달린 메소드
        String say = sayHello4("Python");
        System.out.println(say);

} // main method 거



 //메소드로 소환할 간단한 인삿말 쟁여 놓기 부분//Foot이나 외부 html 같은 존재
        public static void sayHello(){
        System.out.println("Morning, JAVA!! \n");}

        public static void sayHello2(){
        System.out.println("After Noon, World!! \n");}

        public static void sayHello3(String msg){
        System.out.print("Evening, " + msg + "!! \n");} //설정대로만 출력됨

        public static String sayHello4(String msg){
        String say = "Hola Hola, " + msg + "!!"; return say;  } //원본 받아다가 msg부분을 가공 가능

        //****** 리턴타입 메소드가 많이 쓰임 *******


/*
메소드(method)
자바에서 클래스는 멤버(member)로 속성을 표현하는 필드(field)와 기능을 표현하는 메소드(method)를 가집니다.
그중에서 메소드(method)란 어떠한 특정 작업을 수행하기 위한 명령문의 집합이라 할 수 있습니다.

메소드 정의
클래스에서 메소드를 정의하는 방법은 일반 함수를 정의하는 방법과 크게 다르지 않습니다.

1.접근제어자 2.반환타입 3.메소드이름(4.매개변수목록) {    <- 선언부
    //  <- 5.구현부
                    } <-마무리
----------------------------------------
class Car {

private int currentSpeed;
private int accelerationTime;

        public void accelerate(int speed, int second) { // 선언부
        // 구현부
        System.out.println(second + "초간 속도를 시속 " + speed + "(으)로 가속함!!");
    }
---------------------------------------
1. 접근 제어자 : 해당 메소드에 접근할 수 있는 범위를 명시합니다.
2. 반환 타입(return type) : 메소드가 모든 작업을 마치고 반환하는 데이터의 타입을 명시합니다.
3. 메소드 이름 : 메소드를 호출하기 위한 이름을 명시합니다.
4. 매개변수 목록(parameters) : 메소드 호출 시에 전달되는 인수의 값을 저장할 변수들을 명시합니다.
5. 구현부 : 메소드의 고유 기능을 수행하는 명령문의 집합입니다.

위 예제의 ①번 라인에서는 accelerate() 메소드를 정의하고 있습니다.
이 메소드는 public 접근 제어자를 사용하여 선언되어 해당 객체를 사용하는 프로그램 어디에서나 직접 접근할 수 있습니다.
반환 타입에는 어떠한 값도 반환하지 않는다는 의미를 가진 void를 명시합니다.
그 다음으로 메소드의 이름을 명시하고, 매개변수로 int형 변수인 speed와 second를 전달받습니다.
이렇게 전달받은 매개변수를 가지고 메소드 구현부에서 고유한 작업을 수행할 수 있는 것입니다.

메소드 호출
자바에서 위와 같은 방법으로 정의한 메소드는 멤버 참조 연산자(.)를 사용하여 호출할 수 있습니다.
    1. 객체참조변수이름.메소드이름();                  <- 매개변수가 없는 메소드의 호출
    2. 객체참조변수이름.메소드이름(인수1, 인수2, ...);   <- 매개변수가 있는 메소드의 호출

<메소드의 사용 목적>
클래스에서 메소드를 작성하여 중복되는 코드의 반복적인 프로그래밍을 피할 수 있기 때문입니다.
모듈화로 인해 코드의 가독성도 좋아집니다. 손쉽게 유지보수를 할 수 있게 됩니다.
메소드를 작성할 때는 되도록 하나의 메소드가 하나의 기능만을 수행하도록 작성하는 것이 좋습니다.
클래스의 메소드(method)란 어떠한 작업을 수행하기 위한 명령문의 집합이라 할 수 있습니다.
클래스 내에서 메소드는 static 키워드의 여부에 따라 다음과 같이 구분됩니다.

    1. 클래스 메소드(static method)
    2. 인스턴스 메소드(instance method)
static 키워드를 가지는 메소드를 클래스 메소드(static method)라고 합니다.
static 키워드를 가지지 않는 메소드는 인스턴스 메소드(instance method)라고 합니다.
클래스 메소드는 인스턴스 변수를 사용하지 않고, 전달된 매개변수만으로 동작하는 메소드입니다.

toString() 메소드
toString() 메소드는 해당 인스턴스에 대한 정보를 문자열로 반환합니다.
이때 반환되는 문자열은 클래스 이름과 함께 구분자로 '@'가 사용되며,
그 뒤로 16진수 해시 코드(hash code)가 추가됩니다.
16진수 해시 코드 값은 인스턴스의 주소를 가리키는 값으로, 인스턴스마다 모두 다르게 반환됩니다.

charAt() 메소드
charAt() 메소드는 해당 문자열의 특정 인덱스에 해당하는 문자를 반환합니다.
만약 해당 문자열의 길이보다 큰 인덱스나 음수를 전달하면,

        IndexOutOfBoundsException 오류가 발생합니다.
        String str = new String("Java");

        System.out.println("원본 문자열 : " + str);

        for (int i = 0; i < str.length(); i++) {

            System.out.print(str.charAt(i) + " ");
        }
        System.out.println("\ncharAt() 메소드 호출 후 원본 문자열 : " + str);


 */



} // <- class 거
