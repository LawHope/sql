package Grade;

public class GradeV4 {
    public static void main(String[] args) {
        Grade gr = new Grade(
                "혜교", 99, 98, 99);

        gr.computeGrade();  // 성적 처리

        System.out.println(gr.toString());
    }

    // 성적 클래스
    // 클래스는 속성과 기능으로 구성(?!?)
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
        public Grade() {
        }

        public Grade(String name, int kor, int eng, int mat) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.mat = mat;
        }

        // 성적 처리
        public void computeGrade() {
            tot = kor + eng + mat;
            avg = (double) tot / 3;
            switch ((int) avg / 10) {
                case 10:
                case 9:
                    grd = '수';
                    break;
                case 8:
                    grd = '우';
                    break;
                case 7:
                    grd = '미';
                    break;
                case 6:
                    grd = '양';
                    break;
                default:
                    grd = '가';
                    break;
            }
        }

        // 결과출력
        @Override
        public String toString() {
            return
                    "Grade{ name=" + name + ", kor=" + kor +
                            ", eng=" + eng + ", mat=" + mat +
                            ", tot=" + tot + ", avg=" + avg +
                            ", grd=" + grd + '}';
        }
    }}
