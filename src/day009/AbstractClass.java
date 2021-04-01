package day009;

public class AbstractClass {
    public static void main(String[] args) {
        /*  추상화 클래스
        abstract 요약- 너무 요약해서 핵심만 추린 나머지 abstract 가 붙고 {}가 사라짐
           추상화클래스 =  추상 메소드를 포함하는 클래스 // 추상 메소드 = 메소드 선언부만 있는 불완전 메소드.
           => 선언부만 있고 대상이 없어서 내용을 자유롭게 채울 수 있음 but 객체화가 안되고

           불완전 메소드가 있어서 추.클은 객체화가 안됨  ex) Animal a = new Animal (){};
           다른 클래스들이 호출해서 써줘야 기능을 함.

        (상속관계에 있는 서브 클래스가 수퍼 클래스에 정의해둔 메소드를 사용안하고
        재정의해서 사용하는 경우 ) = 오버라이딩
        근디 수퍼 클래스 메소드가 필요 없으면 오버라이딩 할 이유가 없자네?
        
        형태만 만들어 놓고 서브 클래스들이 내용을 채우게 하는 것은 어뗘?
        그게 추상화 메소드임 →  abstract(요약) class {abstract(요약한다 메소드도) public  void ㅁㅁ();}
        문법 abstract class Animal2 { abstract public void cry(); }

        추상화 클래스는 다른 클래스에서 extends 확장용으로 사용해야만 기능함

             ㅏ추상화 클래스ㅏ ●abstract●  class  ●ㅁㅁ● {
                            protected String name;
                            abstract public void ●ㅁㅁ●(); ←ㅓ추상화 메소드{}가 없어ㅓ
                         }

                         class ####   ●extends●  ●ㅁㅁ● {  ㅓextends로 추상화 클을 상속함
                             @Override
                             public void  ●ㅁㅁ●() {
                                 System.out.println("출력메시지");}
                         }    ↑ 이렇게 주거니 받거니 해야 기능이됨
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
     //implement method 를 클릭해서 오버라이드를 자동생성 해주자
     @Override
     public void cry() {
         System.out.println("먀옹먀옹~");}
 }

class Dog2 extends  Animal2 {
    @Override
    public void cry() { System.out.println("아르르르르"); }
}
