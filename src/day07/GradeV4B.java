package day07;

public class GradeV4B {
    /* 클래스의 종류
    VA : Value object / DTO : Data transfer object =
                       값만 저장하고 테이블과 연계해서 작성
    ★★Service : 기능부분 = 비즈니스 로직을 구성하는 클래스/
                           데이터 영구저장(영속화)전에 처리 코드들
    DAO : data access object = 데이터 영속화와 관련 코드 구성 클래스
                                주로 데이터베이스를 이용해서 추가 조회 수정 삭제 기능
    */



    /*
    public static void main(String[] args) {

    }

    static class Grade {
        private  String name;
        private  int  kor;
        private  int  eng;
        private  int  mat;
        private  int  tot;
        private  double  avg;
        private  char  grd;


        public Grade() { }



        public Grade(String name, int kor, int eng, int mat) {
            this.name = name;
            this.kor = kor;
            this. eng = eng;
            this.mat = mat;
        }

    }

    static class GradeService{
        public void computeGrade(Grade sj) {
           sj.tot = sj.kor + sj.eng + sj.mat;
            sj.avg = (double)sj.tot / 3;
            switch((int) sj.avg /10) {

                case 10: sj.grd = 'A'; break;
                case 9:  sj.grd = 'B'; break;
                case 8:  sj.grd = 'C'; break;
                case 7:  sj.grd = 'D'; break;
                case 6:  sj.grd = 'F'; break;

            }

        }
        //결과출력


        public void printGrade(Grade sj) {

            String fmt = "%s %d %d %d\n %d %1.f %c \n";
            System.out.printf(fmt,sj.name, sj.kor, sj.eng,
                                    sj.mat, sj.tot, sj.avg, sj.grd );

        }


    }


}
*/
//클래스에서 중요한 것
//지정자 생성
//값만 저장만 하는 클래스



        // 클래스의 종류
        // VO/DTO   : value object/data transfer object
        //            값만 저장하기 위해 사용하는 클래스
        //            주로 데이터베이스 테이블의 각 열과 연계해서 작성함

        // Service : 비지니스 로직을 구성하는 클래스
        //           데이터 영속화 전에 처리하는 코드들로 구성

        // DAO : data access object
        //       데이터 영속화와 관련된 코드들로 구성된 클래스
        //       주로 데이터베이스를 사용해서 데이터를
        //       추가/조회/수정/삭제하는 기능을 작성함

        public static void main(String[] args) {
            // 성적 데이터 생성
            SungJuk sj = new SungJuk(
                    "지현", 87, 56, 32);

            // 성적처리를 위해 service 객체 생성
            SungJukService sjsrv = new SungJukService();

            // 성적처리
            sjsrv.computeSungJuk(sj);

            // 결과출력
            sjsrv.printSungJuk(sj);
        }

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
        }

        static class SungJukService {
            // 성적 데이터 입력
            public SungJuk readSungJuk() {
                return null;
            }

            // 성적 처리
            public void computeSungJuk( SungJuk sj ) {
                sj.tot = sj.kor + sj.eng + sj.mat;
                sj.avg = (double)sj.tot / 3;
                switch((int)sj.avg / 10) {
                    case 10: case 9: sj.grd = '수'; break;
                    case 8:  sj.grd = '우'; break;
                    case 7:  sj.grd = '미'; break;
                    case 6:  sj.grd = '양'; break;
                    default: sj.grd = '가'; break;
                }
            }

            // 결과출력
            public void printSungJuk(SungJuk sj) {
                String fmt = "%s %d %d %d\n%d %.1f %c\n";
                System.out.printf(fmt,
                        sj.name, sj.kor, sj.eng, sj.mat,
                        sj.tot, sj.avg, sj.grd);
            }
        }}