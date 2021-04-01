package day007;

public class Student{
    public static void main(String[] args)
{
        //
        // 대부분 클래스 구성요소
        //멤버변수, 생성자, setter/getter
        //학생리스트를 클래스로 정리하여 출력하기

        //생성자를 이용한 클라스 사용하기
        Student s = new Student();

        s.hakbun = "202031-145792";
        s.dname = "채이탁";
        s.adrs = "서울 종로구";
        s.birthday = "03.24";
        s.subject = "Agriculture";
        s.prof = "504";
}

    //클래스의 매개 변수 초기화
    public class gradeV4 {
    public  void main(String[] args) {
    }

    class Grade { }
                        }



        // 클래스 : 객체 지향 언어에서 프로그램을 개발하는 단위
        // 학생 클래스 : 학생 정보를 저장하는 클래스
        // 클래스명은 파스칼 표기법으로 명명 (첫글자 대문자로)
  //여기가 문제임~!!!!          static class Student {
            private String hakbun;
            private String dname;
            private String adrs;
            private String birthday;
            private String subject;
            private String prof;

    public Student (){}

             Student(String hakbun, String dname, String adrs,
                           String birthday, String subject, String prof)
                                {
                this.hakbun = hakbun;
                this.dname = dname;
                this.adrs = adrs;
                this.birthday = birthday;
                this.subject = subject;
                this.prof = prof;
                                }
        }

//생성자로 클라스 쓰기
/*        Student s2 = new Student("", "", "")*/

//객체 대입 값 출력
//객체명 멤버변수명








