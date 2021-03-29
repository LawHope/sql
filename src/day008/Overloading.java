package day008;

public class Overloading {

    public static void main(String[] args) {
       /* << 메소드 다중정의 = 오버로딩 >>
        객체지향 3대 개념 중에 다형성에 해당
        같은 이름의 메소드를 중복해서 정의하는 것을 의미
        메서드의 서명을 다르게해서 한 클래스에서 같은 메서드를 2개 이상 선언하는 것

        ex ) 정수 or 실수인 매개변수를 2~3개 까지 덧셈하는 프로그램을 만들어봅세.*/



        //오버로딩 안한 NonOver 클래스를 소환
        NonOver no = new NonOver();
        System.out.println(no.add1_int(10,10) );



        //오버로딩한 over 클래스를 소환
        Over ov = new Over();
        System.out.println(ov.add(100.0,10));

         //println 로 메소드 명은 다 같은데 안에 출력되는 내용이 다 나옴
        System.out.println(""); //마우스 갖다 대면 무슨 타입인지 나와 int, double




    } //main
}//오버로딩




 class NonOver {

     //A/ 정수 2개를 받아서 덧셈하는 매소드
     public int add1_int(int a, int b) {
         return a + b;
     }//A거

     //B/ 정수 3개 덧셈 메소드 : 정수 + 정수 = 정수니까 int 다
     public int add2_int(int a, int b, int c) {
         return a + b + c;
     }//B거

     //C/ 실수 2개 쓴 덧셈 메소드 : 실수는 소숫점..-..그래서 double 씀
     public double add_double(double a, double b) {
         return a + b;
     }//C거
 }

     /*
     ↑ ↑ ↑ ↑ 다형성이 적용 안되면 double int 이걸 다 생각해가면서 해야돼 hell 임



     그래서 같은 이름으로 써버리자
     기능이 달라도 메소드 이름이 통일 되어서 안외워도 됨/
     ● ●●● ● 다만 메소드 호출을 어떻게 할 지만 알면 됨. ( ' 0')~♪
     ↓ ↓ ↓ ↓ ↓
     */



    class Over {
    //A
    public int add(int a, int b) {
        return a + b;
    }

    //B
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    //C
    public double add(double a, double b) {
        return a + b;
    }

 }
