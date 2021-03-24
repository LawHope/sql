package day07;

import java.util.Scanner;

public class GradeVB {
    public static void main(String[] adgs) {

/*            Scanner sc = new Scanner(System.in);//new..
            while (true) { //재시작할 것 없이 알아서 무한으로 넘어감
                String displaymenu =
                        "==================== \n"+
                                "  알뜰 학점 계산기 V.4   \n"+
                                "==================== \n"+
                                " 1. 성적 입력 \n" +
                                " 2. 성적 조회 \n" +
                                " 3. 성적 상세 \n" +
                                " 4. 성적 수정 \n" +
                                " 5. 성적 삭제 \n" +
                                "==================== \n" +
                                "[작업을 선택하세요] : \n";

                System.out.print(displaymenu);

                String menu;
                menu = sc.next();
                switch (menu) {//JDK 7부터는 switch문에 문자 가능)
                    case "1":  System.out.println("성적 입력"); break;
                    case "2":  System.out.println("성적 조회"); break;
                    case "3": System.out.println("성적 상세"); break;
                    case "4":  System.out.println("성적 수정");break;
                    case "5":  System.out.println("성적 삭제");break;
                    case "0":  System.exit(0);break;
                    default : System.out.println("입력사항 오류!");

                        System.out.println();
                        System.out.println();
                        System.out.println();
                } //switch
            }//while

*/


    } //main


//메뉴표시 메소드 -dispalyMenu

    public static void displayMenu() {

       	String name;
			int kor, eng, mat;
			int tot;
			double avg;
			char grd;
			String fmt = "%s, %d,%d, %d \n" +
			"%d, %.1f, %c \n";
			Scanner sc = new Scanner(System.in);


        while (true) {
            String displayMenu = "";
            displayMenu();
            displayMenu = sc.next();
            System.out.print(displayMenu);



        System.out.print("이름");
        name = sc.next();
        System.out.print("국어?");
        kor = sc.nextInt();
        System.out.println("영어?");
        eng = sc.nextInt();
        System.out.println("수학?");
        mat = sc.nextInt();

        tot = kor + eng + mat;
        avg = (double) tot / 3;
        switch ((int) avg / 10) {
            case 10:  grd = 'A';break;
            case 9:  grd = 'B'; break;
            case 8: grd = 'C';break;
            case 7: grd = 'D';break;
            case 6:  grd = 'F'; break;
        }

       //tring fmt = "%s%d%d%d\n%d%.1f%c \n";
        System.out.printf(fmt, name, kor, eng, mat, tot, avg); //grd 넣으면 오류 ㅈㄹ;;;

    }
    }







}


