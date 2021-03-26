package Sel_Rumination;

public class Re_Overloading {

    public static void main(String[] args) {
       /* << 메소드 다중정의 = 오버로딩 >>
        객체지향 3대 개념 중에 다형성에 해당
        같은 이름의 메소드를 중복해서 정의하는 것을 의미
        메서드의 서명을 다르게해서 한 클래스에서 같은 메서드를 2개 이상 선언하는 것

1. 본체 클래스 등장! ●지정자 자리에 add 넣기!●
ㅡ class ㅁㅁㅁ {
    public int  ●add●  (double ㅁ, int ㅁㅁ      ->>> 하나가 double 이고 딴건 int인데) {
        return 반환 값 저쩌구 }


2.  한 클래스 않에 여러개 알까기
ㅡ class 롸롸 {
   int로 묶은 메서드1 -> public int ●add●(int ㅁ, int ㅁㅁ, int ㅁㅁㅁ) {
                         return ㅁ + ㅁㅁ + ㅁㅁㅁ; }
        
    double 세트 메서드2 -> public double ●add●(double a, double b) {
                           return a + b; }
        
      String 세트 메서드3 -> public String ●add●(String A, String B, String C) {
                                            return "A" + "B" + "C" ; }
     } 롸롸에 셋씩이나 떄려넣었다! 
            

3.오버로딩할 클래스 등장!!  ●대상자에 ov.add 붙이기!!!!!!!!●
ㅡ class ### {   ㅁㅁㅁ ov = new Over();
        System.out.println( ●ov.add● ( ㅁ , ㅁㅁ)); } <- double ㅁ int ㅁㅁ 이라고 안쓰고
                                                            ㅁ,ㅁㅁ으로만 써도됨
                                                            위아래 다니며 int냐 String이냐
                                                             찾아다니지 않아도 됨!            

*/



        //오버로딩 안한 NonOver 클래스를 소환
        NonOver no = new NonOver();
        System.out.println(no.add1_int(10,10) );



        //오버로딩한 over 클래스를 소환
        Over ov = new Over();
        System.out.println(ov.add(100.0,10));
        //no -> ov 로 바뀜 이런 방식이 오버로딩이로다!!
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
