package Sel_Rumination;

public class Re_AbstractClass {
    public static void main(String[] args) {

        
        
                              {{{         추상화 클래스  abstract=요약하다    }}}
        
        
        
        
        
                    abstract 요약- 너무 요약해서 핵심만 추린 나머지 abstract 가 붙고 {}가 사라짐
                       추상화클래스 =  추상 메소드를 포함하는 클래스 // 추상 메소드 = 메소드 선언부만 있는 불완전 메소드.
                            => 선언부만 있고 대상이 없어서 내용을 자유롭게 채울 수 있음 but 객체화가 안되고 

                       불완전 메소드가 있어서 추.클은 객체화가 안됨  ex) Animal a = new Animal (){};
                       다른 클래스들이 호출해서 써줘야 기능을 함.

                        수퍼 클래스 메소드가 필요 없으면 오버라이딩 할 이유가 없자네?

                    형태만 만들어 놓고 서브 클래스들이 내용을 채우게 하는 것은 어뗘?
                    그게 추상화 메소드임 ↘  
                                        abstract(요약) class {abstract(요약한다 메소드도) public  void ㅁㅁ();}*/


                    추상화 클래스가 편한이유는 상속 섭클이   class ####  extends  $$$ {} 만 치고 커서 대면 텝 떠서 자동 완성이 가능하니깐

                            
ㅡ문법 abstract class Animal2 { abstract public void cry(); }

                                추상화 클래스는 다른 클래스에서 extends 확장용으로 사용해야만 기능함

                                 추상화 클래스ㅡㅡㅡ> ●abstract●  class  ㅁㅁ {
                                                    protected String name;
                                                    abstract public void ㅁㅁ (); <ㅡㅡㅡㅡㅡㅡㅡㅡㅡ추상화 메소드는 {}가 없음
                                                 }


                                                 class ####   ●extends●  ㅁㅁ {  <ㅡㅡㅡㅡㅡㅡㅡㅡㅡextends로 추상화 ㅁㅁ 클을 상속함
                                                     @Override  <ㅡㅡㅡ마우스 대면 뜨고, 탭에서 고르면 알아서 생기는 애
                                                     public void  ㅁㅁ() {
                                                        System.out.println("출력메시지");} <ㅡㅡㅡ 뭐할 지만 내가 작성하면됨.
                                                 }    ↑ 이렇게 주거니 받거니 해야 기능이됨


    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////



추상 클래스
             abstract class Animal2 {
                protected String name;
                abstract public void cry(); // 'cry(){}'에서 '{}'가 빠진 추상 메소드

             }


                class Cat2 extends Animal2 {
                                            추상 메소드는 완성해야 쓸 수 있다고 경고 뜸  public void cry 부분에 커서 대고
                                             implement method 를 클릭해서 오버라이드를 자동생성 해주자
                    @Override
                    public void cry() { System.out.println("먀옹먀옹~");}
                }
                



                class Dog2 extends  Animal2 {
                    @Override
                    public void cry() { System.out.println("으르르르르 컹컹"); }
                }








