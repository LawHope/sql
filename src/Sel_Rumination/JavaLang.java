package Sel_Rumination;

public class JavaLang {
    public static void main(String[] args) {
        /* 자바프로그램에서 가장 기본인 클래스와 인터페이스 보관소
        import 문 없이 바로 사용 가능
        Math,   StringBuilder/StringBuffer, String

        object 클래스 / 모든 클래스의 조상 클래스 : toString, equals, hashCode 외 6가지 메서드, 오버라이딩해서 쓴다


        class 실행중인 자바 프로그램 내부에 포함된 클래스와 인터페이스를 제공 동적 객체 생성 가능
         */




//1.방식
        Member m = new Member();
        m.userid= "1234";
        m.passwd = "asdf";

        String fmt = "아이디 : %s 비밀번호 : %s \n";
        System.out.printf(fmt, m.userid, m.passwd);
        //이 방식은 출력할 변수가 많으면 복잠해지잖아, 출력횟수 따라서도 늘어날 거고;;




//2. 클래스의 멤버 변수 출력용 to String 메소드를 써보자
        System.out.println(m.toString());



//3. math 클래스 수학 연산을 위한 static 메서드(객체생성 없이 바로 호출가능) =  max, min,random, ceil, floor, round
        System.out.println("원주율: " + Math.PI);

        //round : 반올림
        System.out.println(Math.round(10.0) + "/" + Math.round(10.4) + "/" + Math.round(10.7));
        //ceil : 올림
        System.out.println(Math.ceil(10.0) + "/" + Math.ceil(10.4) + "/" + Math.ceil(10.7));
        //floor : 내림 = 버림
        System.out.println(Math.floor(10.0) + "/" + Math.floor(10.4) + "/" + Math.floor(10.7));

        //ex) 전체게시물 수 : 125
        //     페이지당 게시물수 : 10
        //      총페이지는?  125/10에 추가로 메소드가 필요해!, if문 안써도 되는 간편 수학 메소드!
        System.out.println(Math.ceil((double)125/10));
        //ex) 3.1215916 에서 round 메소드 써서 소수 두번Wi 자리 구하기?
        System.out.println( (Math.round(Math.PI * 100)/100.0));


        //max= 최대 min = 최소
        System.out.println( Math.max(10, 11));
        System.out.println( Math.max(-10, -11));




        }
    }


//1 방식
class Member {

String userid;
String passwd;

    //2 방식 . toString method 는 ctr + Space 로 오토생성 가능 생성 후 수정가능
public String toString() {
    String fmt= "{userid = '%s', passwd : '%s' }\n";
    String result = String.format(fmt, userid, passwd);
    return result;


}
}



