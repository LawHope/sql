package day010;

public class Polymorph {
    public static void main(String[] args) {
        /*

        클래스 & 인터페이스간의 형 type 변환

        CASTING!!!
        캐스팅 = 형변환, 상속관계에 있는 부모 자식 클래스 인터페이스간에 서로 형변환이 가능
        기본자료형에서는 데이터크기에 변환 가능
        정수와 정수 연산 정수
        정수와 실수 연산 실수 (자동으로 형변환됨)

        상속 여부에 따라 형변화가 되는 것 = 업 / 다운 캐스팅
        섭클이 슈클의 타입으로 바뀌는 것이 업캐스팅,
        슈클이 섭클 타입으로 바뀌는 게 다운캐스팅임

         */



        // 1. paint 메서드로 한줄로 쉽게 바꿈
        //벗뜨 draw메소드 호출 시 같은 클래스 타입을 써애하야
        //도형 추가시 paint 메서드에도 넣어줘야함..

        Line l = new Line();
        l.draw();

        Circle c = new Circle();
        c.draw();



        paint (new Line());
        paint (new Circle());



        //2. paint가 아니라 shape로 호출을 해버리면 부르고 넣고 안해도됨
        paint2(new Line());
        paint2(new Circle());



        //3.배열변수에 각 도형 저장해보기

        //Shapes [0] = new Line ();
        //Shapes [0] .draw ();

        //Shapes[0] = new Circle ();
        //Shapes[0].draw ();

      //동적 바인딩으로 배열 변수에 line circle을 저장
        // 동적바인딩이란 : 구성요소의 실제 값, 속성을 결정하 것
        //변수에 값이 저장되거나 함수 호출 시 실제 함수 위치 메모리의 주소와 연결하는 것
        //변수 성격이 바뀌어서 작용성은 좋은데
        //이 그 저를 다 만들어주세욧. 타입
        //  ↕
        //정적 바인딩도 이써!
        //컴파일에 변수 타입이나 함수의 위치가 정해짐
        //실행 전에 정보들이 미리 결정 되므 실행하기 좋아
        //이거 없으면 저거 저것도 없어? 그럼 그거라도.. 이런 식임
        
        Shape[] shapes = new Shape[10];

        shapes[0] = new Line();
        shapes[1] = new Circle();


        for(int i=0; i<shapes.length; ++i)
            shapes[i].draw();





    }



    //1. paint 메서드로 구현해서 draw 호출을 쉽게 바꿈 
    //  but 일일이 line circle 써서 줘야하네..
    public static void paint (Line l) {l.draw(); }
    public static void paint (Circle c) {c.draw(); }

    // 2.  ↓ paint 메소드를 shape으로 업 캐스팅을 해버리자
    public  static void paint2(Shape s){s.draw();}



}


class  Shape {  //야가 슈퍼 클라스여
    public  void draw() {
        System.out.println("도형을 그립니다.");
    }
}


class Circle extends Shape{
 public void draw(){
     System.out.println("원을 그려요");
 }
        }

class Line extends Shape{
public void draw(){
System.out.println("선을 그려요");
}
}