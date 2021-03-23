package day06;

public class Methods {
    public static void main(String[] args) {

    //메소드 형식
    //접근지정자 반환타입            메서드명(매개변수목록){
    //                                      메서드 몸체
    //                                       return 변수
    //                                       }

    //접근지정자 : 메서드 접근허용 범위 지정 (public /or/ private)
    //반환타입(return) : 메서드 실행 후 반환하는 자료 타입 지정
    //매개변수목록 = 파라미터(C에서는 아규먼트) : 메소드 노출 시 전달하는 변수
        //메서드호출
        //메서드명()
        //

    //public static void main(String[] args) {
    //public (모두가 접근 가능함)
    //class 클래스는 나중에 배움+ 클래스명
    // Methods { public static 
    // void
    // main(String[] args)



        //1.인삿말 출력
        sayHello(); // 아래 박아놓은 메소드를 소환한 것
        //2.인삿말 say hello !메시지 출력하기
        sayHello2();
        //3.인삿말 대상을 변수화 (불러오기 스타일)
        sayHello3( "GIT hub" );
        sayHello3("FTP");
        //4. 호출자에게 수행을 넘기고 명령만 내리기 / 리턴 달린 메소드
        String say = sayHello4("Python");
        System.out.println(say);

} // main method 거



 //메소드로 소환할 간단한 인삿말 쟁여 놓기 부분//Foot이나 외부 html 같은 존재
        public static void sayHello(){
        System.out.println("Morning, JAVA!! \n");}

        public static void sayHello2(){
        System.out.println("After Noon, World!! \n");}

        public static void sayHello3(String msg){
        System.out.print("Evening, " + msg + "!! \n");} //설정대로만 출력됨

        public static String sayHello4(String msg){
        String say = "Hola Hola, " + msg + "!!"; return say;  } //원본 받아다가 msg부분을 가공 가능

        //****** 리턴타입 메소드가 많이 쓰임 *******



} // <- class 거
