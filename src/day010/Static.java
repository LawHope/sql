package day010;

public class Static {

    public static void main(String[] args) {

//static은 클래스변수
        //클래스 내에서 선언된 변수 = 클래스 변수
        //개별, 독립된 값이 생성되고 저장하는 인스턴수 변수와 달리
        //한번 저장되면 전체 영역에서 값을 공유하는 변수임, 전체에서 끌어다 쓰기 가능
        //static 키워드로 선언함
        //클래스 변수는 객체 생성 없이 바로 사용이 가능
        //클래스 메모리에 적재될 때 미리 생성됨
        //호출방법 =>  클래스명.변수명



        Member m1 = new Member();
        Member m2 = new Member();


        m1.userid = "헤일로";
        m1.passwd = "123";
      //  Member.allOfMember= 1;  //클래스변수 호출
        m1.allOfMember = 1;
        System.out.println(m1.userid + " / " + m1.passwd + "/" );

        System.out.println(Member.allOfMember + " / " + m1.allOfMember);


        m2.userid = "안젤로";
        m2.passwd = "456";
       // Member.allOfMember= 2;
        m2.allOfMember= 2;
        System.out.println(m2.userid + " / " + m2.passwd + "/" + m2.allOfMember);
        System.out.println("Member.allOfMember :" + m1.allOfMember);
        //m1의 allOfMember와 m2의 allOf~ 와 같은 변수를 참조함

    }
}


class Counts {


}
class Member{  //클래스변수
    static int allOfMember;
    String userid; //인스턴스 변수
    String passwd;

}