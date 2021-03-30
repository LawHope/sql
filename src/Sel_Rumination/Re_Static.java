package Sel_Rumination;

public class Re_Static {
   
    public static void main(String[] args) {
        // 클래스 변수
        // 클래스 내에 선언된 변수는 한번 저장되면 모든 영역에서 공유 가능, 메모리 절약!
        
       인스턴스 변수는 개별적이고 독립적인 값이 생성/저장하는데 클래스변수는 불러다 쓰기만 함 
       
         static 을 붙여서 선언함 ex) " static String 그래_내가_클래스객체다_인마 " 
         클래스변수는 객체 생성 따로 필요 없이 바로 사용가능
         호출방법은 '클래스명.변수명' 을 사용함

        보통, 인스턴스변수를 하나만 생성되도록 제한해서 사용하는 것을 추천!
        디자인 패턴 중 singleton 패턴 사용
        
          
          
        // main 메서드의 비밀

        Member m1 = new Member();
        m1.userid = "혜교";
        m1.passwd = "abc123";
        Member.allOfMember = 1;  // 클래스변수 호출
        m1.allOfMember1 = 1;  // 클래스변수 호출

        System.out.println(m1.userid + "/" + m1.passwd + "/");
        System.out.println(Member.allOfMember1 + "/" + m1.allOfMember1);

        Member m2 = new Member();
        m2.userid = "지현";
        m2.passwd = "987xyz";
        //Member.allOfMember = 2;
        m2.allOfMember1 = 2;

        System.out.println(m2.userid + "/" + m2.passwd + "/");
        System.out.println(Member.allOfMember1 + "/" + m2.allOfMember1);
        System.out.println("m1의 allOfMember : " + m1.allOfMember1);
        // m1의 allOfMember과 m2의 allOfMember는 같은 변수를 참조함
    }
    
}

class Member1 {
    static int allOfMember;    <- 이게 클래스변수

    String userid;             <- 이게 인스턴스변수
    String passwd;
}









