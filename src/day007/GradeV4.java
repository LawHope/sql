package day007;

public class GradeV4 {
    public static void main(String[] args) {
        SungJuk sj = new SungJuk(
                "혜교", 99, 98, 99);

        sj.computeSungJuk();  // 성적 처리

        System.out.println(sj.toString());
    }

    // 성적 클래스
    // 클래스는 속성과 기능으로 구성(?!?)
    static class SungJuk {
        // 멤버변수
        private String name;
        private int kor;
        private int eng;
        private int mat;
        private int tot;
        private double avg;
        private char grd;

        // 생성자
        public SungJuk() {  }

        public SungJuk(String name, int kor, int eng, int mat) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.mat = mat;
        }

        // 성적 처리
        public void computeSungJuk() {
            tot = kor + eng + mat;
            avg = (double)tot / 3;
            switch((int)avg / 10) {
                case 10: case 9: grd = '수'; break;
                case 8:  grd = '우'; break;
                case 7:  grd = '미'; break;
                case 6:  grd = '양'; break;
                default:  grd = '가'; break;
            }
        }

        // 결과출력
        @Override
        public String toString() {
            return
                    "SungJuk{ name=" + name + ", kor=" + kor +
                            ", eng=" + eng + ", mat=" + mat +
                            ", tot=" + tot + ", avg=" + avg +
                            ", grd=" + grd + '}';
        }}}


    /*
   public class GradeV4 {
    public static void main(String[] args) {

        Grade sj = new Grade();

        sj.computeGrade(); //성적처리 메소드 소환


        String name ="채이탁";
        int  kor = 99;
        int  eng = 98;
        int  mat = 100;
        int  tot = kor + eng + mat / 3 ;
        double avr = tot /3;;
        char  grd ;

        avr = (double) tot /3;
        grd = (avr >= 90) ? 'A' :
                (avr >= 80) ? 'B' :
                        (avr >= 70) ? 'C' :
                                (avr >= 60) ? 'D' : 'F';

    }


    //성적 클래스
    // 1.데이터 클래스부터 정하기
    static class Grade {
      //클래스명은 대문자로 시작함

        //멤버 변수 선언
        private  String name;
        private  int  kor;
        private  int  eng;
        private  int  mat;
        private  int  tot;
        private  double  avg;
        private  char  grd;


        // 2. 기본생성자 만들기
        public Grade() { }
//이거 만들려면 alt+ins 눌러서 constructor 클릭함


        //3.
        public Grade(String name, int kor, int eng, int mat) {
            this.name = name;
            this.kor = kor;
            this. eng = eng;
            this.mat = mat;
        }
        // 4. 성적처리 기능설정 / 메소드 넣기
         public void computeGrade(){
            tot = kor + eng + mat;
            avg = (double)tot / 3;
            switch((int) avg /10) {

                case 10: grd = 'A'; break;
                case 9:  grd = 'B'; break;
                case 8:  grd = 'C'; break;
                case 7:  grd = 'D'; break;
                case 6:  grd = 'F'; break;

            }

         }
        //결과출력

        @Override
        public java.lang.String toString() {
            return "Grade{" +
                    "name=" + name +
                    ", \n kor=" + kor +
                    ", \n eng=" + eng +
                    ", \n mat=" + mat +
                    ", \n tot=" + tot +
                    ", \n avg=" + avg +
                    ", \n grd=" + grd + '}';
        }
    }



}
*/