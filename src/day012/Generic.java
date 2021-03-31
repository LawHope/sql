package day012;

import java.util.ArrayList;

public class Generic {
    public static void main(String[] args) {

/*
   제네릭 - 타입 변환으로 오류가 발생하지 않도록 점검해주는 녀석

            int String "" '' 어쩌고 제각각인 데이터 타입의 객체를
            메소드나 컬랙션 클래스에 컴파일 할 수 있게
            자료형 검사, 타입을 체크해주는 기능
                                클래스에 사용할 타입 정보를 동적으로 넘겨서
                                타입 간 오류를 컴파일 타임과 동시에 잡아내 줌.
                                JDK 1.5 부터 추가되었음.

          제네릭 문법 :   < > 안에 타입변수를 지정해 놓고 씀


컬렉션으로 내용이 이어짐
 */



                        //동물 보호 구역을 만들자!

                        Lion lion1 = new Lion();
                        Tiger tiger1 = new Tiger();
                        Zebra zebra1 = new Zebra();

                        //Object zpp1 = new Object(); ↙ 최상위 오브젝트 클래스로 우리를 만들어버림
                        Object[] zoo1 = new Object[3];
                        zoo1[0] = lion1;
                        zoo1[1] = tiger1;
                        zoo1[2] = zebra1;

                        ((Lion)zoo1[0]).sayName();
                        ((Tiger)zoo1[1]).sayName();
                        ((Zebra)zoo1[2]).sayName();

                            //결과 :
                            //난 사잔디
                            //난 호랑인디
                            //난 얼룩말인디





                        //Object배열에 정수 저장해보기
                        Object[] numbers1 = new Object[5];
                        numbers1[0] = 123; //"123" 으로작성할 경우 ↓↓↓
                        numbers1[1] = 456;
                        numbers1[2] = 789;

                        System.out.println((int)numbers1[0] + (int)numbers1[1] + (int)numbers1[2]);
                        //그냥 에디터 화면에선 오류 없는 척하고 있음
                        //실제 결과 :
                        // Exception in thread "main" java.lang.ClassCastException:
                        // java.lang.String cannot be cast to java.lang.Integer
                        //	at day012.Generic.main(Generic.java:42)
                        //출력에는 int 로 넣어놓고 "123" 으로 쓴게 문자로 인식되어서 형변환 오류가 발생함.


                        // System.out.println(Integer.parseInt(numbers1[0]) +
                        // Integer.parseInt(numbers1[1]) + Integer.parseInt(numbers1[2]));
                        //이 상태로 형변환 시도하면 Object타입은 정수Integer로 변환을 못해서 빨간 줄 대잔치가 열림




                    //제네릭으로 오류 해결 ver.
                            Object[] numbers3 = new Object[5];
                            numbers3[0] = 123;
                            numbers3[1] = 456;
                            numbers3[2] = 789;
                            System.out.println((int)numbers3[0] + (int)numbers3[1] + (int)numbers3[2]);


                            ArrayList<Lion> zoo2 = new ArrayList<>();
                            ArrayList<Tiger> zoo3 = new ArrayList<>();
                            ArrayList<Zebra> zoo4 = new ArrayList<>();//각기 우리를 만들어 주는 것임
                            //따로 따로 선언해두는 게 코드가 길어지긴 하지만 사후관리에는 유리함

                            zoo2.add(new Lion());
                            zoo3.add(new Tiger()); //Tiger를 zoo2에 집어 넣기가 미션임.
                            zoo2.add(new Lion());


                            Lion l = zoo2.get(0);
                            //동적 배열에서 객체를 추출할 때 변환 필요 없음
                            zoo2.get(0).sayName();

                            Tiger t = zoo3.get(0);
                            zoo2.get(0).sayName();

                            Zebra zebra = zoo4.get(0);
                            zoo2.get(0).sayName();





                            //동적배열에 Integer 정수/문자열 저장해보기
                            ArrayList<Integer> nums1 = new ArrayList<>();
                            nums1.add(123);
                            nums1.add(456);
                            nums1.add(789); //"789"하면 오류남
                            System.out.println( nums1.get(0) + nums1.get(1) +  nums1.get(2) );

                            //nums2에는 String인 " " 만 저장할 수 있음
                            ArrayList<String> nums2 = new ArrayList<>();
                            nums2.add("123");
                            nums2.add("456");
                            nums2.add("789"); //nums2.add(789); 면 오류 발생함
                            System.out.println( nums1.get(0) + nums1.get(1) + nums1.get(2));


                }
}



                    class Lion {
                        public void sayName() {
                            System.out.println("난 사잔디");
                        }
                    }
                    class Tiger {
                        public void sayName() {
                        System.out.println("난 호랑인디");
                    }}
                    class Zebra {
                        public void sayName() {
                            System.out.println("난 얼룩말인디");
                        }

                    }





