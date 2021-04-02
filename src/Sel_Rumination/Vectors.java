package Sel_Rumination;

import java.util.Arrays;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        /* ArrayList와 동일한 내부 구조
                - 동적배열
                - 저장순서 중요
                - 중복데이터 허용
           but 벡터는 멀티쓰레드 환경에서 안전하게 객체 추가 삭제 가능 = 동기화 기능
                ArrayList에는 동기화 기능 없음, 벡터보다는 속도 빠름
            add, get, ser, remove - CRUD 메서드들이 중요함

         */

        //벡터 정의 와 데이터 추가
        Vector<String> names = new Vector<>(); // ->순서가 임의로 바뀌기 때문에
         //List<String> names = new Vector<>(); ->상위인 리스트로 변환 후에 내맘 대로정렬 가능

        names.add("혜교");
        names.add("지현");
        names.add("수지");
        names.add(1,"아이유");


        Vector<Integer> nums =
          //List<Integer> nums = //->리스트로 쓰면 이렇게 된다우.
                new Vector<>(Arrays.asList(1,2,3,4,5));
                 //배열로 동적배열 초기화

        for(String name:names){
            System.out.println(name + "/");
        }
        System.out.println("");

        for(Integer num: nums){
            System.out.println(num + "");
        }
        System.out.println("");

        //벡터 크기 & 용량
        System.out.println(
                names.size() + "/ " + names.capacity());
        System.out.println(
                nums.size() + "/ " + nums.capacity());

        //벡터요소 출력
        System.out.println(names.get(1));

        //벡터삭제
        names.remove(1); //두번째요소 삭제
        names.clear(); //전체 요소 완전 삭제


        //벡터 요소 수정
        nums.add(3,10);
        nums.set(0, 100); //맨 앞 요소 값을 100으로 수정
        System.out.println(
                nums.get(0) +  "/" + nums.get(3));

    }
}
