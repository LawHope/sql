package Lottos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto645V1 {
 /*
 ArrayList로 1~45 임의수 6개 생성
 중복 허용 안됨 Random - nextInt, remove 이미 뽑은 수는 제거하고 다시 돌린다.
  */

    public static void main(String[] args) {


        List<Integer> lotto = new ArrayList<>();


        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 45; ++i){
            nums.add(i);
        }

        for (int i = 0; i < 6; ++i) {
            Random rnd = new Random();
            int idx = rnd.nextInt(45 - i);
            // 배열에서 인데스 값을 난수로 만든다는 뜻
            lotto.add(nums.get(idx));
            nums.remove(idx);

            //결과
            for (Integer key : lotto) {
                System.out.println(key + " ");
            }

        }

    }}