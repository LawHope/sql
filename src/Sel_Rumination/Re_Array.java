package Sel_Rumination;
public class Re_Array {
    public static void main(String[] args) {


       배열 : 배열은 초기화할 때 그 크기가 정해진다.
        그래서 정해진 크기 이상의 값을 넣을 수 없다.


        배열이 자료를 불러오는 방식

                                        String[] classGroup = { "주석훈", "주석경", "배로나", "유제니" };

                                        System.out.println(classGroup[0]);
                                        System.out.println(classGroup[1]);
                                        System.out.println(classGroup[2]);
                                        System.out.println(classGroup[3]);

                                        System.out.println(classGroup + "이 상담을 받았습니다");


                                        결과는
                                                주석훈
                                                주석경
                                                배로나
                                                유제니  로 뜸



                                        classGroup[0] 처럼 배열이 담겨있는 변수의 이름 뒤에 대괄호를 붙이고
                                        그 안에 0부터 시작하는 숫자를 입력하면 순차적으로 값을 가져올 수 있다.


            
            
            


                ㅡ  .length
                                            .length는 배열에 실제 담긴 데이터의 숫자를 의미하는 것이 아니라
                                            배열을 처음 생성할 때 지정한 배열의 크기를 의미한다는 점을 주의하자.

                                            String[] classGroup2 = new String[666];
                                            classGroup[0] = "최진혁";
                                            System.out.println(classGroup2.length);
                                            classGroup[1] = "최유빈";
                                            System.out.println(classGroup2.length);
                                            classGroup[2] = "한이람";
                                            System.out.println(classGroup2.length);
                                            classGroup[3] = "이고잉";
                                            System.out.println(classGroup2.length);
                                                                                    .length는 결과 값이 아니라 자료가 몇개 있나를 표시함
                                            결과
                                            666 <--666이 4개 나옴
                                            666
                                            666
                                            666
                                                                       <-- length : 5 --> 자료 갯수가 length
                                                                        김  유  채  이 모  ㅣ
                                                                        갈  진  이  혜 모  ㅣ<- 자료들이 element
                                                                        리  한  헌  준     ㅣ   
                                                      숫자가 index ->    0  1   2   3   4


                                                                           
                                                                           
                                                                           
                                            String[] members0 = {"감잡아", "남날리", "담디디", "룰루루","말보로" };
                                            System.out.println(members0[2]);
        
                                            자료가 총 5개 있으므로  프린트(배열명 [ ])에 0 ~ 4 까지 들어갈 수 있다.
                                            다른 수가 들어 있으면 오류남, 정해놓은 크기보다 더 큰수는 못넣음
                                          
                                            넣어 놓은 숫자 자리의 자료가 출력 됨 0 ~ 4 중에 [ 2 ] 니깐 
                                            결과 : 담디디



                                    
                                    

        ㅡ 반복문 for과  배열 콜라보

                                                String[] members = { "최진혁 ", "최유빈 ", "한이람 " };
                                                for (int i = 0; i < members.length; i++) {
                                                    String member = members[i];
                                                    System.out.println(member + "고객이 상담을 받았습니다");
                                                }


        
        
        

        ㅡ for 더 간단하게 쓰기
                                                    String[] members2 = { "김가나 ", "나다라 ", "도레미 " };
                                                    for (String gogogo : members2) {
                                                        System.out.println( gogogo + " 학생이 상담을 받았네요"); }

                                                    결과
                                                    최진혁 고객이 상담을 받았습니다
                                                    최유빈 고객이 상담을 받았습니다 
                                                    한이람 고객이 상담을 받았습니다
                                                    김가나 학생이 상담을 받았네요
                                                    나다라 학생이 상담을 받았네요
                                                    도레미 학생이 상담을 받았네요 }

}



    }
}
