package day06;

public class D06quize {
    public static void main(String[] args) {
        //배열 다루는 예제
        char[] letter; //배열 변수 선언
        letter = new char[3]; //문자 3개를 저장하는 배열선언!

        letter[0] = 'a';
        letter[1] = 'b';
        letter[2] = 'c';
        //letter 배열에 a,b,c 문자를 저장

//위의 다섯줄을 한줄에 쓰기 는
//char [] letter = {'a', 'b', 'c'};

        for (int i = 0; i < 3; ++i) {
            System.out.print(letter[i] + ",");
        }


        System.out.println();

       /* double[] a = {1.1, 2.2, 3.3};
        System.out.println(a[0] + " "+ a[1] + " " + a[2]);
        a[1] = a[2];
        //3번째 요소 값을 2번째 요소에 대입
        System.out.println(a[0] + " " + a[1] +" " + a[2]);

                                                        System.out.println();
            for(int idx =1; idx < sampleArray.length; ++idx)
                sampleArray[idx] = 3*idx;
            //배열 변수명.length : 배열의 크기를 알려주는 특수 변수
        */
        System.out.println();

        //배열을 정의하고 값 저장하기 1
        int[] num1 = new int[10];
        num1[0] = 1;
        num1[1] = 2;
        num1[2] = 3;
        num1[3] = 4;
        num1[4] = 5;
        num1[5] = 6;
        num1[6] = 7;
        num1[7] = 8;
        num1[8] = 9;
        num1[9] = 10;
        //출력할 때도 10개 다써야해;;
//        System.out.print(num1[0]);
//        System.out.print(num1[1]);
//        System.out.print(num1[2]);
//        System.out.print(num1[3]);
//        System.out.print(num1[4]);
//        System.out.print(num1[5]);
//        System.out.print(num1[6]);
//        System.out.print(num1[7]);
//        System.out.print(num1[8]);
//        System.out.print(num1[9]);

//ctr + / 하면 한줄 다 주석처리됨


        /*배열을 정의하고 값 저장하기 2*/
 /*       for (int i = 1; i < num1.length; ++i) {
            num1[i - 1] = i;
            //[ ? ][ 1 ][ 2 ][..][][][][][][]
            //i값이 1이지만 0이 오는 첫자리에 오도록 -1로 표기

        }

        for (int i = 0; i < num1.length; ++i) {
            num1[i] = i + 1;
            //얘는 i가 0니까 표기 값이 1이 되게 하려면 i에 +1하기
            //쓰기 편하려면 값부분을 수정하는 게 낫다는.
*/
        for (int i = 0; i < num1.length; ++i) {
            System.out.println(num1[1]);

        }
        System.out.println();

        //배열을 정의하고 값 저장하기 3
        //1 4 9 16 35 36 49 ..
        int[] num3 = new int[10];

        for (int i = 0; i < num3.length; ++i) {

            //um3[i] =(i +1) * (i+1);
            num3[i] = (int) Math.pow((i + 1), 2);
//math 등장!
            System.out.print(num3[i] + ", ");
        }



        System.out.println();


        //배열을 정의하고 값 저장하기 4
       /* int [] num4 = new int [];
            for (int i = 0; i< num4.length; ++i)
                System.out.println(num4[i] + ", ");
}
//참고 : 참조자료형 변수는 new 연산자로 객체 생성하면 미리 변수에 기본 값이 생김
//숫자형 : 0, 객체형 : null
 // ㅅㅂ 뭐가 뭔지 모르겠네
//문제 받아쓰기도 잘못한거 같고
//나는 run도 안돼 ㅅㅂ
*/

        //배열을 정의하고 값 저장하기 5
        int[] num5 = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        for (int i = 0; i < num5.length; ++i) ;


    }
}