package day08;

public class Ex73 {

    //생성자로 간단하게 만들어내기

    public static void main(String[] args) {
        Fan f1 = new Fan();
        System.out.println(f1.speed);
        System.out.println(f1.on);
        System.out.println(f1.radius);
        System.out.println(f1.color);
                                                                System.out.println();
        Fan f2 = new Fan();
        System.out.println(f2.speed);
        System.out.println(f2.on);
        System.out.println(f2.radius);
        System.out.println(f2.color);
            //new 로 생성자를 호출하고 초기화해서 여러개 생산도 가능
//시험값 지정
Fan f3 = new Fan();
f3.speed = f3.FAST;
                  // speed =3; 이 speed로 표기된 거
f3.radius = 10;
f3.color = "yellow";
f3.on = true;
//클래스로 객체생성하고, 객체 멤버 변수에 값을 초기화 - 번거롭st.
//이걸 생성자로 해결할 수 있음
                                                                 System.out.println();
                     //지정생성자로 만들기임
                     Fan f4 = new Fan(2,false,5,"blue");
                    //() 안에 숫자, 들을 채워 쓰면 알아서 생성됨
                    //매개변수 생성자를 쓰면 객체 멤버변수 값을 (숫자만 쓰면 알아서 생기니까)초기화하기 편함
        }

        static class Fan {
         //static 을 안붙이면 위의 new Fan();에 빨간 줄생김
        final int SLOW  = 1 ;
        final int MEDIUM = 2 ;
        final int FAST = 3;
                                                            //const int  ->나중에 배워서 써보자구
                                                            //변치않는 수 상수를 constance = const
                private int speed;
                //private 는 접근을 제한하는 코드임
                private boolean on;
                private double radius;
                private String color;

        public Fan() { //기본생성자임
                   // ↖생성자 추가는 alt + inst ->constructor 에 이건 none 으로.
        speed = SLOW;
        on = false;
        radius = 5.0;
         color = "blue";
                 }

            //지정생성자로 만들어보자 - alt +inst > constructor 에 전부 선택하고 생성하기
            public Fan(int speed, boolean on, double radius, String color) {
                this.speed = speed;
                this.on = on;
                this.radius = radius;
                this.color = color;
                                    //pubic ~ this.color 까지 알아서 생성됨
             }
        }

}
