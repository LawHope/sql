package day007;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

            //생년 월일을 받아서 나이 계산
        //올해 - 생년
        //생일 지날 경우 그대로 사용
        //생일 전이면 -1하기

        computeAge();


}

    public static void computeAge() {
        int byear, bmonth, bday;
        int pyear, pmonth, pday;
        Scanner sc = new Scanner(System.in);
        String fmt = "현재 : %d년 %d월 %d일 \n" +
                "생일 : %d년 %d월 %d일 \n" +
                "나이 : %d세";
        pyear = 2021;
        pmonth = 3;
        pday= 24;

        //생년월일을 받기
        System.out.print("생년? ");
        byear = sc.nextInt();
        System.out.print("생월? ");
        bmonth = sc.nextInt();
        System.out.print("생일? ");
        bday = sc.nextInt();

        //나이계산
        int age = pyear - byear; // 나이 = 계산 연도 - 생년
        if (pmonth > bmonth  )
            age = age;
        else if (pmonth == bmonth && pday >=bday)
            age = age;
        else
            age = age-1;
        System.out.printf(fmt, pyear, pmonth, pday, byear, bmonth, bday, age);

    }

}
