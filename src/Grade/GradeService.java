package Grade;


    // 성적 서비스 V1
// 입력, 처리, 출력 기능 구현
// 프로그램 메뉴 출력 기능 추가

    public interface GradeService {
        void displayMenu();

        Grade.GradeVO readGrade();
        void computeGrade(Grade.GradeVO gr);
        void printGrade(Grade.GradeVO gr);
    }
