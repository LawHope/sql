package Sel_Rumination;


import java.util.Map;

public class HashMap {
    public static void main(String[] args) {

        /*
        키와 값으로 구성된 Entry 객체를 저장함
        값 중복은 되지만 키 중복은 불가
        키는 hashing=해시 값을 이용해서 저장해서
        많은 데이터를 검색할 때 유용함

        해시 값은 복사된 디지털 증거가 동일함을 증명하려고 파일 특성을 축약한 암호임
        파일 변조나 무결성 확인 가능
        주로 사용하는 해시 알고리즘은 CRC32, MD5, SHA-1

        https://www.fileformat.info/tool/hash.htm

         */


        Map<String, String> names = new java.util.HashMap<>();
        names.put("H","헤일로"); //객체추가시 put(키, 값)
        names.put("A","안젤로");
        names.put("L","라붐");
                                                            System.out.println();
        //값 출력 : get (키)- 개별 값 출력하기
        System.out.println(names.get("L"));
        System.out.println(names.get("A"));
        //결과 라붐
        //      안젤로
                                                              System.out.println();
        //전체 출력하기
        System.out.println(names.get(names));
        //결과 null   으잉? 어쨰서...?;
                                                               System.out.println();
        // keySet(활용)
        for(String k : names.keySet()) {
            System.out.println(names.get(k)+ " 일걸");
        }
        //결과 안젤로 일걸
        //  헤일로 일걸
        //  라붐 일걸
                                                              System.out.println();

        //entrySet() 으로 전체 출력 (강추!!)
        for(Map.Entry<String, String> e:names.entrySet()) {
            System.out.println(e.getValue() + "");
        }
        //결과  안젤로
        //      헤일로
        //       라붐
                                                          System.out.println("");

        System.out.println(names.containsKey("H"));
        System.out.println(names.containsValue("헤일로"));
        //결과    true
        //        true


                                                         System.out.println();
        //  set 없는 값 수정하기
        //key를 remove한 다음에 새로 put함
        names.remove("안젤로");
        names.put("N", "뉴튼");
                                                           System.out.println();
        //replace로 수정하기
        System.out.println(names.get("N" ));
        //결과 : 뉴튼
                                                            System.out.println();
        names.replace("N", "Newton");
        System.out.println(names.get("N"));
        //결과 : Newton
                                                   System.out.println();


        }
    }

