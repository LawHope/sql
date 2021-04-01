package Grade;

public class GradeV4b {

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
        Grade gr = new Grade(
                "지현", 87, 56, 32);

        // 성적처리를 위해 service 객체 생성
        GradeService grsrv = new GradeService();

        // 성적처리
        grsrv.computeGrade(gr);

        // 결과출력
        grsrv.printGrade(gr);
    }

    static class Grade {
        // 멤버변수
        private String name;
        private int kor;
        private int eng;
        private int mat;
        private int tot;
        private double avg;
        private char grd;

        // 생성자
        public Grade() {  }

        public Grade(String name, int kor, int eng, int mat) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.mat = mat;
        }
    }

    static class GradeService {
        // 성적 데이터 입력
        public Grade readGrade() {
            return null;
        }

        // 성적 처리
        public void computeGrade( Grade gr ) {
            gr.tot = gr.kor + gr.eng + gr.mat;
            gr.avg = (double)gr.tot / 3;
            switch((int)gr.avg / 10) {
                case 10: case 9: gr.grd = '수'; break;
                case 8:  gr.grd = '우'; break;
                case 7:  gr.grd = '미'; break;
                case 6:  gr.grd = '양'; break;
                default: gr.grd = '가'; break;
            }
        }

        // 결과출력
        public void printGrade(Grade gr) {
            String fmt = "%s %d %d %d\n%d %.1f %c\n";
            System.out.printf(fmt,
                    gr.name, gr.kor, gr.eng, gr.mat,
                    gr.tot, gr.avg, gr.grd);
        }
    }
}
