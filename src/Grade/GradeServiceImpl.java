package Grade;


import java.util.Scanner;

public class GradeServiceImpl implements GradeService {

    // 싱글톤 패턴 시작
    private static GradeService grsrv = null;

    private GradeServiceImpl() {
    }

    public static GradeService getInstance() {
        if (grsrv == null) grsrv = new GradeServiceImpl();
        return grsrv;
    }
    // 싱글톤 패턴 끝

    @Override
    public void displayMenu() {
        String displaymenu =
                "--------------------- \n" +
                        "    성적 프로그램 v3     \n" +
                        "--------------------- \n" +
                        " 1. 성적데이터 입력       \n" +
                        " 2. 성적데이터 조회       \n" +
                        " 3. 성적데이터 상세조회    \n" +
                        " 4. 성적데이터 수정       \n" +
                        " 5. 성적데이터 삭제       \n" +
                        " 0. 프로그램 종료        \n" +
                        "--------------------- \n" +
                        " 작업을 선택하세요 : ";

        System.out.print(displaymenu);
    }

    @Override
    public GradeVO readGrade() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름은?");
        String name = sc.next();
        System.out.print("국어는?");
        int kor = sc.nextInt();
        System.out.print("영어는?");
        int eng = sc.nextInt();
        System.out.print("수학은?");
        int mat = sc.nextInt();

        return new GradeVO(name, kor, eng, mat);

    }




    @Override
    public void computeGrade(GradeVO gr) {
        gr.setTot(gr.getKor() + gr.getEng() + gr.getMat());
        gr.setAvg((double) gr.getTot() / 3);

        switch ((int) gr.getAvg() / 10) {
            case 10:
            case 9:
                gr.setGrd('수');
                break;
            case 8:
                gr.setGrd('우');
                break;
            case 7:
                gr.setGrd('미');
                break;
            case 6:
                gr.setGrd('양');
                break;
            default:
                gr.setGrd('가');
                break;}
    }

    @Override
    public void printGrade(GradeVO sj) {
        String fmt = "%s %d %d %d\n%d %.1f %c\n";
        System.out.printf(fmt,
                sj.getName(), sj.getKor(), sj.getEng(), sj.getMat(),
                sj.getTot(), sj.getAvg(), sj.getGrd());
    }
}