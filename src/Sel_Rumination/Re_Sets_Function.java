package Sel_Rumination;

import java.util.*;

public class Re_Sets_Function {
    public static void main(String[] args) {
        /*

        set = 집합 인터페이스
            - 객체 중복은 한개만 저장
            - 저장 순서 유지 안함
          배열과의 차이임

        객체 해시 코드를 보려면 hashcode 메소드를 쓴다.

정렬이 목적이라면 ArrayList로 변환 후에 가능하다능
         */

        HashSet<String > names = new HashSet<>();
        //set<String > names = new HashSet<>();
            names.add("헤일로");
            names.add("안젤로");
            names.add("라붐");
            names.add("헤일로"); // 중복인데 하나만 나옴, 순서도 달라
                                          //결과 라붐
                                        //     안젤로
                                        //     헤일로
            for(String name: names) {
                System.out.println(name + " ");
            }
            System.out.println();

            HashSet<Integer> numbs
                    //Set<Integer> numbs
                    = new HashSet<>(Arrays.asList(10,9,8,7,6));
            for(Integer numb : numbs){
                System.out.println( numbs + " ");}

            HashSet<String> fruits = new HashSet<>(Arrays.asList());
             //Set<String> fruits = new HashSet<>(Arrays.asList());
                    names.add("Banana");
                    names.add("Peach");
                    names.add("Apple");


                     for (String fruit : fruits){
                         System.out.println( fruits + " " );}

               System.out.println("");



//set에 요소들을  List로 변환 후에 정렬 됨
        List<String> flist = new ArrayList<>(fruits);
         //컬렉션의 변수를 List<> 안에 미리 선언 안하면 Object로 넘어가 버린대
        Collections.sort(flist);
        for(String f : flist) {
            System.out.println(f + "/");}
        System.out.println("");




//HashSet 개별 요소 출력은 Set메소드에 get 메서드가 지원 안되서
 //contains 를 써서 개별 값 출력해야함
        System.out.println(names.contains("헤일로")); // 저 요소가 있나 확인만 됨
         //  결과 : true


//HashSet의 개별 요소 삭제는 remove, Clear로 가능




        //가우스 덧셈 연습 1- 10까지 // 사실 무작위 뽑은 두 수 사이의 숫자들 덧셈이지만..
        //내가 간단식을 해보고 싶어서 써본 것임
        int sum = 0;
        for(int i = 0; i <=10; ++i)
            sum += i;

        sum = (Math.abs(1 + 10)) * 10 /2;
                                    //절대값 씌우기 코드인 Math.abs()
        System.out.println(sum);



    }

    }

