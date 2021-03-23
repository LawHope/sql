package day06;

import java.util.concurrent.SynchronousQueue;

public class Break {
    public static void main(String[] args) {



        //반복문 제어하기 break, continue
        //continue :

                /*
        Q. 1 ~ 100 총합 구하기 / 더한 값이 500을 넘는 경우 중단하기
                 */

        int sum = 0; // 정수 합 = 0 이다 로 '초기화' + 선언한 거
        int i; // i는 정수라고 선언한거

        for ( i =0; i <= 100; ++i) {// i는 0부터 시작이고 100보다 작거나 같으며 1씩 증가한다.
            sum += i; //총합은  
            if ( sum >= 500) break; // 만약 총합이 500보다 크거나 같으면 멈춘다.
        }
        System.out.println("총합 : " + sum);
        System.out.println("중지 지점 : " + i);

                                                     System.out.println();


                            /*
        Q. while로 주사위 눈이 6나올때 까지 계속 굴리고, 굴린 횟수를 표시하기
                            */
                    //mth.random(),  break 사용하기
        int dice =0;
        int count = 0;

        while(true){
         dice = (int) (Math.random() * 6) +1;
                 ++count;
                   System.out.print(dice + " " );
            if (dice == 6) break;
        }
        System.out.println("횟수 : " +  count);



    }


}
