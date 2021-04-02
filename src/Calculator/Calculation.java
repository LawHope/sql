package Calculator;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        //계산 프로그램 만들기

         plusTwo1(); //아래에 다 박아놔버려




    }//main

                public static void plusTwo1(){
                int a,b;
                Scanner sc = new Scanner(System.in);
                System.out.println("두수를 입력하시오");
                System.out.println("첫번째 수 입력");
                a = sc.nextInt();
                System.out.println("두번째 수 입력");
                b = sc.nextInt();

                int sum = a + b;

                String fmt = "입력받은 수는 %d, %d 이다. \n" +
                        "두수의 총합은 %d이다.";
                System.out.printf(fmt, a, b, sum);
                }




                public static void  computeBirth () {

                }
                public  static void computeChange (){

                }


}
