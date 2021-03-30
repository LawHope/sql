package day06;
import java.util.Scanner;
public class Calculation {
public static void main(String[] args) {
        
    
    
계산 프로그램 만들기

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


                public static void  computeBirth () { }
                public  static void computeChange (){ }
  
                    }


teach Ver.
    

                public static void plusTwo1() {
                int a, b;
                int sum = 0;
                Scanner sc = new Scanner(System.in);

                System.out.println("두수를 입력받습니다");
                System.out.print("첫번째 숫자는? ");
                a = sc.nextInt();
                System.out.print("두번째 숫자는? ");
                b = sc.nextInt();

                sum = a + b;

                String fmt = "입력받은 수는 각각 %d,%d이고요 \n" +
                        "두 수의 총합은 %d입니다";
                System.out.printf(fmt, a, b, sum);
            }


