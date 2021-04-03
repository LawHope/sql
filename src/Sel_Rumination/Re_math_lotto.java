package Sel_Rumination;

import java.util.Random;
import java.util.Scanner;

public class Re_math_lotto {
  public static void main(String[] args) {
   /*
        
                            /14 # 하루는 86400초이다. 한시간은 3600초, 1분은 60초이다.
                            / ● ● ● Math 메소드 이용하기!


                            int data1 = 1234567890;
                            System.out.println( 1234567890 / 86400);
                            System.out.println( Math.round((double) data1  / 86400));

                            int data2 = 98765;
                            System.out.println(data2 / 3600);
                            System.out.println(Math.round((double) data2 / 3600));

                            int data3 = 12345;
                            System.out.println(data3 / 60);
                            System.out.println(Math.round ((double)data3 / 60));


                                                                                                                       System.out.println();





                            /lotto 3자리 숫자 랜덤 뽑기
                            / 1등은 백만원/ 불일치는 꽝, 위치에 상관 없이 일치 숫자에 피드백
                            /● ● ● 입력 값과 난수 비교

                            Scanner sc = new Scanner(System.in);
                            Random rnd = new Random();
                            int match = 0; //일치한 갯수

                            System.out.println("복권 3자리를 입력하세요.");
                            int youtkey = sc.nextInt();

                            int lottokey = rnd.nextInt(1000); //999까지 나와요.


                            char lkey1 = String.valueOf(lottokey).charAt(0);
                            char lkey2 = String.valueOf(lottokey).charAt(1);
                            char lkey3 = String.valueOf(lottokey).charAt(2);

                            char ykey1 = String.valueOf(youtkey).charAt(0);
                            char ykey2 = String.valueOf(youtkey).charAt(1);
                            char ykey3 = String.valueOf(youtkey).charAt(2);

                            /if문을 쓴다면, 구 버전으로는.....
                            /*if (lkey1 == ykey1 || lkey1 == ykey2 || lkey1 == ykey3) ++match;
                            if (lkey2 == ykey1 || lkey2 == ykey2 || lkey2 == ykey3) ++match;
                            if (lkey3 == ykey1 || lkey3== ykey2 || lkey3 == ykey3) ++match; // 어우야. 반복문으로 다시 해봐;; ↓ ↓ ↓


                            System.out.println(youtkey+ "/" +lottokey);
                            System.out.println("일치한 수 : " + match);





                            for(int i =0; i<3; ++i) {//3자리니까 i<3
                                char lkey = String.valueOf(lottokey).charAt(i);

                                for (int j = 0; j < 3; ++i) {
                                    char ykey = String.valueOf(youtkey).charAt(j);
                                    if (lkey == ykey) ++match;
                                }
                            }
                                                                                                    System.out.println();

       






    */

    }

}
