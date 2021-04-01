package day010;

import Grade.GradeVO;

import java.util.Scanner;

public class GradeV5cMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      //  GradeService srv = new GradeServiceImpl();

        //grvrs 는 인스턴스 변수이므로 객체마다 개별적으로 생성됨
        //정적변수로 만들어서 모든 객체가 이것을 공유하도록 변경
       //singleton  싱글톤 패턴을 이용하여 단일 객체로만 생성되도록 제한
        //static 은 클래스 내용을 공유한다는 뜻이지만, 
        //but 인스턴스 변수를 하나만 생성하게 제한 & 디자인 패턴 중 싱글톤 패턴을 사용하는 걸 추천함




        String menu = "";
        GradeVO grsrv = null;

        while(true) {
  //          grsrv.displayMenu();
            menu = sc.next();

            switch(menu) {
      //         case "1": grsrv = srv.readGrade(); break;
                case "2": break;
                case "3": break;
                case "4": break;
                case "5": break;
                case "0": System.exit(0);break;
                default:
                    System.out.println("입력 오류");

        }

    }

}}
