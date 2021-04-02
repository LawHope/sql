package Sel_Rumination;
public class Re_Singletone {
      public static void main(String[] args) {
    
    
    
    
    싱글톤 클래스 : 클래스 생성 최초 메모리에 객체를 만들어서 쓰는 디자인 패턴
                     생성자를 바꿔가며 호출해도 최초 값만 반환해줌
                    기존객체를 재활용해서 메모리 절약
                    private 생성자, static 변수 사용, 객체에 대한 getter 정의
        
        
        
       
        
        
        ServiceOne so1 = new ServiceOne();
        so1.name = "첫번째";

        ServiceOne so2 = new ServiceOne();
        so2.name = "두번째";

        System.out.println(so1.name + "/" + so2.name);
                         // so1과 so2의 name 변수 값은 서로 다름 - 인스턴스 변수

        
        
        
//      ServiceTwo sw1 = new ServiceTwo();
//     private 생성자이므로 ServiceOne처럼 new 키워드로 객체생성을 못함 - die
//                                      ↙그래서 get으로 우회 호출을 해야함
        ServiceTwo sw1 = ServiceTwo.getInstance(); 
        sw1.name = "첫번째";
        System.out.println(sw1.name);

        ServiceTwo sw2 = ServiceTwo.getInstance();
        System.out.println(sw2.name);

    }
}




class ServiceOne {
    String name;
    public ServiceOne() {
    }
}





class ServiceTwo {
    private static ServiceTwo stwo = null; // 프라이빗이라 new 키워드로 호출을 못함

    String name;

    private ServiceTwo() { }  // private

    public static ServiceTwo getInstance() {
        if (stwo == null) stwo = new ServiceTwo();
                       // ↑ stwo 객체가 한번도 생성되지않았다면 객체를 생성함
        return stwo;
    }
    
    
    
}

