package day09;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class AbstractClass {
    public static void main(String[] args) {
        /*  추상 클래스
           추상클래스 =  추상메소드를 포함하는 클래스 // 추상 메소드 = 메소드 선언부만 있는 불완전 메소드.
           불완전 메소드가 있어서 추.클은 객체화가 안됨  ex) Animal a = new Animal (){};
           다른 클래스들이 호출해서 써줘야 기능을 함.

        (상속관계에 있는 서브 클래스가 수퍼 클래스에 정의해둔 메소드를 사용안하고
        재정의해서 사용하는 경우 ) = 오버라이딩
        근디 수퍼 클래스 메소드가 필요 없으면 오버라이딩 할 이유가 없자네?
        
        형태만 만들어 놓고 서브 클래스들이 내용을 채우게 하는 것은 어뗘?
         */

    }
}

//추상 클래스
 abstract class Animal2 {
    protected String name;
    abstract public void cry(); // 'cry(){}'에서 '{}'가 빠진 추상 메소드

 }
 class Cat2 extends Animal2 {
    //추상 메소드는 완성해야 쓸 수 있다고 경고 뜸  public void cry 부분에 커서 대고
     //inplemant method를 클릭해서 오버라이드를 자동생성 해주자
     @Override
     public void cry() {
         System.out.println("먀옹먀옹~");}
 }

class Dog2 extends  Animal2 {
    @Override
    public void cry() { System.out.println("아르르르르"); }
}
