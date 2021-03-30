package day010;

public class SayHola {
    //다국어로 인사하는 프로그램
    public static void main(String[] args) {

//디자인 패턴 팩토리 알아보기



        //1. 클래스로 만들기
        SayHellokor say = new SayHellokor();
        say.sayHello();

        SayHelloEng say2 = new SayHelloEng();
        say2.sayHello();

        SayHelloJap say3 = new SayHelloJap();
        say3.sayHello();

    }


    //2. 인터페이스로 만들기 /더 간결하게

    interface SayHelloService {
        void sayHello();
    }


}


// 1. 노가다로 만들기

class SayHellokor{
    public void sayHello(){
        System.out.println("안녕하시렵니까");}
}

class SayHelloEng{
    public void sayHello(){
        System.out.println("Hello.");}
}

class SayHelloJap{
    public void sayHello(){
        System.out.println("KonNi Chiwa."); }
}



// 2, 인터페이스로 간결하게 만들기