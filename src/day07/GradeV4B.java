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

//클래스에서 중요한 것
//지정자 생성
//값만 저장만 하는 클래스