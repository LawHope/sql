package Calculator;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in); //위에 Scanner sc = 가 있어;;
        System.out.println("첫번째 숫자 입력 : ");
        int num1 = sc.nextInt();
        System.out.println("두번째 숫자 입력 : ");
        int num2 = sc.nextInt();

        int begin = num1;
        int end = num2;
        if(num1>num2){ begin = num2; end = num1;}

        int sum = 0;
       for(int i = begin; i <=end; ++i)
            sum += i;

        String fmt = "%d과 %d 사이의 정수들의 합은 %d 이다.";
        System.out.printf(fmt, num1, num2, sum);

        System.out.println();



        //가우스 덧셈을 이용하여 더 간단 계산

        sum = (num1 + num2) * (Math.abs(num2-num1) + 1 ) /2;
                                //절대값 씌우기 코드인 Math.abs()
        System.out.println(sum);



    }
}
