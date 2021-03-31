package day012;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {
    public static void main(String[] args) {

        /*

        컬랙션


        알고리즘의 집합
        데이터 저장에서 자료 구조와 데이터 처리 알고리즘을 클래스로 구현한 것

        LIST: 입력 순서 중요, 중복요소 허용
        Set : 객체 순서 없고, 중복 비허용
        Map : 키 값으로 구성된 자료 구조 검색속도 빠름

        ArrayList : List 인터페이스를 구현한 클래스, 입력순서 중요, 중복 허용, 크기 가변적인 선형(한줄)리스트 = 동적배열
                        []  []  []  []  []  [] 순서가 있는 - 순차 리스트라고도 부름
                        저장용량이 차면 자동으로 늘어나 줌



         */

                    List<Integer> nums = new ArrayList<>(); //숫자만 들어갈 수 있는 리스트
                    nums.add(123); //데이터 추가
                    nums.add(456);
                    nums.add(789);
                    nums.add(1, 000);//특정위치 뒤에 요수 추가

                System.out.println(nums.size());// 리스트 크기 출력
                //결과 : 4

                System.out.println( nums.get(1)); //get 지정 위치의 요소를 출력
                //결과 : 0

                //리스트의 모든 요소 출력
                for (int i = 0; i < nums.size(); ++i)
                System.out.print(nums.get(i) + "삐융 ");
                //결과 : 123삐융 0삐융 456삐융 789삐융
                                                                                    System.out.println();
//향상된 for 문 쓰기 - 더 깔끔하지롱 for(객체요소타입 변수명 : 객체명) {
                for(Integer num : nums) {
                    System.out.print( num + "for ");
                }
               //결과 : 123for 0for 456for 789for
                                                                                        System.out.println();

                //While 문 이건 더 좋지롱!!
                Iterator iter = nums.iterator();
                while(iter.hasNext())
                    System.out.println(iter.next()+ " While");
                // 결과 :    123 While
                //          0 While
                //          456 While
                //          789 While

                                                                                     System.out.println();

            //리스트에서 요소 검색

            //contains(찾을 데이터), 결과는 true false
            //indexOf(찾을 데이터), 결과는 위치값, -1
            System.out.println(nums.contains(123));
            System.out.println(nums.contains(987));
            //결과 : true
            //      false
                                                                                      System.out.println();


            //회원 객체를 리스트로 저장
            List<Member> members = new ArrayList<>();
            members.add(new Member("abc123", "1234"));
            members.add(new Member("567asd", "2345"));
            members.add(new Member("890qwe", "3456"));

                                                                                       System.out.println();
         //모든 회원정보 출력
            for (Member member : members) {
                System.out.println(member);
            }
                // 결과 :
            // {userid:abc123, passwd:1234}
            // {userid:567asd, passwd:2345}
            // {userid:890qwe, passwd:3456}




                                                                                               System.out.println();

             //abc123 회원을 찾아라
             //반복문 코드로 최적화하자
            for(Member m : members) {
            if(m.userid.equals("890qwe")){
                System.out.println("데이터 발견");
                break; } }
                //결과 : 데이터 발견
                }
            }


class Member {
    String userid;
    String passwd;

    public Member(String userid, String passwd) {
        this.userid = userid;
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        String fmt = "{userid:%s, passwd:%s}";
        String result = String.format(fmt, userid, passwd);
        return result;
    }
}
