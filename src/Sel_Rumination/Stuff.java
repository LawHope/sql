package Sel_Rumination;

public class Stuff {

    /*
    1. 캡슐화 2. 다형성


1.    캡슐화
        ↖는 지정자 (선언 대상)에 private 붙인 거다 별거 아님         ex)    private int profeno;

    
2.   다형성
            ⓐㅡ 본체 클래스 등장! 
                                        
                     class ㅁㅁㅁ {    ↙ ●지정자 자리에 add 넣기!●
                    public int  ●add●  (double ㅁ, int ㅁㅁ     ->>> 하나가 double 이고 딴건 int인데) {
                                                    return 반환 값 넣고?  } 다음으로 감


            ⓑㅡ  오버로딩한 (한 클래스에 메소드 여러개 넣기) 클래스 등장!!
            
                 class 롸롸 {                              ↙ ●지정자 자리에 add 넣기!●
                       int로 묶은 메서드1 -> public int ●add●(int ㅁ, int ㅁㅁ, int ㅁㅁㅁ) {
                                             return ㅁ + ㅁㅁ + ㅁㅁㅁ; }
                       double 세트 메서드2 -> public double ●add●(double a, double b) {
                                               return a + b; }
                       String 세트 메서드3 -> public String ●add●(String A, String B, String C) {
                                                                return "A" + "B" + "C" ; }
                     } 롸롸에 셋씩이나 떄려넣었다! 


             ⓒㅡ 오버로딩할 클래스 등장!!  ●대상자에 ov.add 붙이기!!!!!!!!●
                ㅡ class ### {   ㅁㅁㅁ ov = new Over();
                                                    ↙ ●지정자에 ov.add 넣기!●
                        System.out.println( ●ov.add● ( ㅁ , ㅁㅁ)); } <- double ㅁ int ㅁㅁ 이라고 안쓰고
                                                                            ㅁ,ㅁㅁ으로만 써도됨
                                                                            위아래 다니며 int냐 String이냐
                                                                             찾아다니지 않아도 됨!       
    */
    

}
