package Grade;


import java.util.Scanner;

    public class GradeV6Main {

        // 성적처리프로그램 V6 -  ArrayList + CRUD
        // 동적배열을 이용해서 대량의 성적데이터를 저장할수 있게 함
        // 즉, 입력받은 성적데이터는 동적배열에 저장하고
        // 저장한 데이터들을 조회/수정/삭제할 수 있도록 함
        // GradeSerivceV2
        // (1)newGrade, (2)showGrade, (3)showOneGrade,
        // (4)modifyGrade, (5)removeGrade
        // computeGrade, displayMenu
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            GradeServiceV2 grsrv = GradeServiceV2Impl.getInstance();

            String menu = "";
            while(true) {
                grsrv.displayMenu();
                menu = sc.next();

                switch(menu) {
                    case "1": grsrv.newGrade(); break;
                    case "2": grsrv.showGrade(); break;
                    case "3": grsrv.showOneGrade(); break;
                    case "4": grsrv.modifyGrade(); break;
                    case "5": grsrv.removeGrade(); break;
                    case "0": System.exit(0); break;
                    default:
                        System.out.println("잘못 입력하셨습니다!!");
                }
            }

        }

    }