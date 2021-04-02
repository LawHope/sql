package Lottos;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto645V2
 /*
 ArrayList로 1~45 임의수 6개 생성
 중복 허용 안됨 Random - nextInt만 써보기.
  */
{ public static void main(String[] args) {
    //중복발생할 경우 변수의 갯수가 줄어드니까.
    //5-4개의   숫자가 나올 것이야..

        Set  <Integer> Lotto = new HashSet<>();

        while (Lotto.size()<6){
            Random rnd = new Random();
            int  key= rnd.nextInt (45)+1;
            Lotto.add(key);
        }
        for(Integer k :Lotto)
            System.out.println(k +"");
    }
}
