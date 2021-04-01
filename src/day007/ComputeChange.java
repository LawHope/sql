package day007;

import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        // 포스 잔돈계산 프로그램

        //가액 : 54320원
        //지불액 : 100000원
        //잔금 : ??? 자 거슬러주세요.

 /*       int price, pay, change ;
        int w50000, w10000, w5000, w1000, w500,w100, w50, w10;
        String fmt = "가격은 %d, 지불액 %d, " + "잔금 %d \n" +
                "50000원권 : %d \n" +
                "10000원권 : %d \n" +
                "5000원권 : %d \n" +
                "1000원권 : %d \n" +
                "500원 : %d \n" +
                "100원 : %d \n" +
                "50원 : %d \n" +
                "10원 : %d";

        Scanner sc = new Scanner(System.in);

        System.out.print("가격 : ");
        price = sc.nextInt();
        System.out.print("지불액 : ");
        pay = sc.nextInt();

        //잔돈출력
        change = pay - price;

        w50000 = change / 50000;
        //change = change - (50000* w50000);
        change = change % 50000;

             w10000 = change / 10000;
             //change = change - (10000 * w10000);
             change = change % 10000;
                    w5000 = change / 5000;
                    change = change % 5000;
                         w1000 = change / 1000;
                         change = change % 1000;
                    w500 = change / 500;
                    change = change % w500;
                            w100 = change / 100;
                            change = change % w100;
                    w50 = change / 50;
                    change = change % w50;

                            w10 = change / 10;

            System.out.printf(fmt, price, pay,(pay-price),
                    w50000,w10000,w5000, w1000, w500,w100, w10);

    } */

    computeChange();
    }


/*
**********위의 놈을 '배열'로 소환술을 써서 만들어보자************
* =이걸 소프트 웨어 공학에서는 리팩터링이라고 부른다.=
*
*/
    public  static void computeChange(){


        int price, pay, change = 0 ; //정수 선언
        int []wons = new int[8]; //배열선언
        int []note = {50000,10000,5000,1000,500,100,50,10};

        Scanner sc = new Scanner(System.in);
        String fmt = "가격은 %d, 지불액 %d, " + "잔금 %d \n";
        System.out.print("가격 : ");
        price = sc.nextInt();
        System.out.print("지불액 : ");
        pay = sc.nextInt();


        change = pay - price;

        for(int i = 0; i <wons.length; ++i){
        wons[i] = change / note[i];
        change =change % note[i];
        }

        System.out.printf(fmt, price, pay,(pay-price),
        wons[0],wons[1],wons[2],wons[3],
                wons[4],wons[5],wons[6],wons[7]);

    }

 ////////////////////////////00원권 출력이 안돼.. fmt 선언부를 고칠 필요 있음?

    

}
