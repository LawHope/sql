package day09;

public class Phones {
    public static void main(String[] args) {

         /* 상속 Extends 확장 : 슈퍼클래스가 가진 특성, 기능을 고대로오 받음
         * 구현 implements : 슈퍼클래스가 정해둔 틀에 새로운 작성

         그래서 ↓ 이렇게 짜는 것이 썩 좋은 것은 아니다.*/
        Phone p = new Phone();
        p.call();
        p.receive();

        MPphone m = new MPphone();
        m.call();
        m.receive();
        m.playMusic();
        m.watchMovie();

        SMphone s = new SMphone();
        s.call();
        s.receive();
        s.photo();
        s.internet();
    }

    //----------------------------------------//

    interface PhoneInterface {
        void call();
        void receive();}

    interface MPphoneInterface {
        void playMusic();
        void watchMovie();}

    interface SMphoneInterface {
        void photo();
        void internet();}


    //----------------------------------//


    static class Phone implements PhoneInterface {
        @Override
        public void call() {
            System.out.printf("전화 거는 중...\n"); }
        @Override
        public void receive() {
            System.out.printf("전화 수신 중...\n"); }
         }

                 static  class MPphone implements PhoneInterface, MPphoneInterface {
                    @Override
                    public void call() { }
                    @Override
                    public void receive() { }
                    @Override
                    public void playMusic() {
                        System.out.printf("음악을 재생합니다.\n"); }
                    @Override
                    public void watchMovie() {
                        System.out.printf("영상을 재생합니다.\n"); }
                }


       static class SMphone implements PhoneInterface, SMphoneInterface {
            @Override
            public void call() { }
            @Override
            public void receive() { }
            @Override
            public void photo() {
                System.out.printf("카메라를 작동합니다.\n"); }
            @Override
            public void internet() {
                System.out.printf("인터넷 탐색을 시작합니다."); }
        }



}

