package EEEE;

public class SayHello {
    // 다국어(한글,영어,일본어)로 인사하는 프로그램 작성
    public static void main(String[] args) {
        // 다국어 인삿말 하기 - 국가별 인삿말을 개별적으로 작성
        SayHelloKor say = new SayHelloKor();
        say.sayHello();

        SayHelloEng say2 = new SayHelloEng();
        say2.sayHello();

        SayHelloJpn say3 = new SayHelloJpn();
        say3.sayHello();

        // 다형성을 이용해서 인삿말을 세련되게 하기
    }
}

class SayHelloKor {
    public void sayHello() {
        System.out.println("안녕하세요, 자바8!");
    }
}

class SayHelloEng {
    public void sayHello() {
        System.out.println("Hello, Java8!!");
    }
}

class SayHelloJpn {
    public void sayHello() {
        System.out.println("こんにちは、ジャワ8!!!");
    }
}