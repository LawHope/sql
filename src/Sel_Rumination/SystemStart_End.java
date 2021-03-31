package day011;

public class JavaSysStartEnd {
    public static void main(String[] args) {

        
        
System 클래스
                표준 입출력, 실행시트렘 관련 필드, 메서드를 제공
                static 으로 선언되어 있음, 객체 생성 필요 없음

    
    
                Start- end 메소드는 프로그램 성능 테스트할 때 쓰기 좋음,
                접속 시점 밀리 세컨드, 게임 플레이 시간 표시에도 쓰임

                    long start = System.currentTimeMillis();

                double sum=0;
                for(double i =1; i< 10000000; ++i)
                 sum *= i; //+= *= 등으로 오버클럭 시킬 수 있음
                System.out.println(sum);
                long end = System.currentTimeMillis();
                System.out.println("소요 시간 : " +(end - start));
    }
}
