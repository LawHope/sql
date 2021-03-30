package Sel_Rumination;
public class Re_OverRiding {
    public static void main(String[] args) {
/*  오! 버! 라! 이! 딩!!!!

        //있는 걸 수정해서 다시 만들기
        //객체지향 3대 개념 다형성에 해당
        //수퍼 클래스 메서드를 서브 클래스에서
        //같은 이름으로 재작성하는 것, 상속 받은 메소드를 재정의해서 쓰기

        waring! : 오버 로딩은 같은 클래스를 받아서 고대애로 내보내는 방식이고
                    오버 라이딩은 내맘대로 바꾼다능!


ㅡ 태초에 슈퍼마더파더 클래스가 있었다.
    class Animal {
                     public String cry() { return "섭클은 고양이지만 슈클에선 드래곤이 울부짖었다"; }
                        }

ㅡ상속받아서 출력 내용을 고쳐따. 이젠 고양이가 야옹하고 울 수 있다.
                    class ### extends ㅁㅁㅁ{
                        @Override 		//  {}일때 extends ㅁㅁㅁ에 커서 두고 우클릭, 자동 완성됨
                         public String cry() {
                        return "적용하고 싶은 내용으로 변경 고양이는 야옹~"}




}*/

            Cat c = new Cat();
        System.out.println( c.cry()); //드래곤이 운댄다. 재정의를 해야겠제

             Dog d = new Dog();
        System.out.println(d.cry());

    }

}

class Animal {
    public String cry() { return "드래곤이 울부짖었다"; }
    public String eat() { return "거인을 잡아 먹습니다."; }
}

class Cat extends Animal{
@Override //상속받아사 왔다는 의미 // @ = at 으로 해석함
public String cry() {
return "고양이 : 믜야아아우~"; //수퍼클에서 받았지만 고양이가 제대로 운다구! = 오버라이드
}
}
                class Dog extends Animal {
                    public String cry() {
                        return "강아지 : 으르르릉 ";// 오버라이드 해줌
                    }
                }


//그런데 이럴거면 뭐하러 상속을 받나 싶지
//그때 필요한게 인터페이스이다!

