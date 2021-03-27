package day06;

import java.util.Random;

public class ChooseLunch {
    public  static void main (String [] args) {

        //랜덤 머신 V.2
        
배열로 랜덤 만들기
    
    
    

        String[] menu = {"김밥","버거", "돈까스", "우동","비빔면"};

               // Random rnd = new Random();
                //int  idx = rnd.nextInt(4);
                             //난수 생성, 메뉴는 5개이므로 int 변수 범위는 0~4이어야함

                //System.out.println(menu[idx]);
                            //랜덤으로 메뉴를 출력


        double magic = Math.random();  //Math.random();으로 실제 난수가 생기는 원리
        System.out.println(magic); //엄청 간단해짐


        System.out.println(magic * 10);
        System.out.println((int)(magic*10));
        //0~9사이의 랜덤숫자

        System.out.println(magic * 100);
        System.out.println((int)(magic*100));
        //0~100 사이 랜덤

        //0 ~ (n-1) 랜덤 : random * b
        //0 ~ (100-1)까지 나올 거임
        System.out.println((int)(magic * 100));


        // a 이상~ b 미만 중에 랜덤 : (random * ( 최대 -  최소 ) + 최소)
        //1 이상 ~ 45미만 사이 난수
        System.out.println(magic * (45 + 1 -1) + 1);


        //랜덤 메뉴 출력 
        int idx = (int) ( Math.random() * 7);
        System.out.println(menu[idx]);





//사실 컴퓨터는 난수를 못 만들고 프로그래밍 대로 처리하는 것이다.
        // 몇%확률로 나오고 어쩌고 하는 건 사실 구라다
        
    }
}
