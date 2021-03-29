package day010;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.xml.ws.Service;

public class Singletone {
    /*싱글톤 클래스 :  클래스가 최초에 한번만 메모리에 생성되고
                     메모리에 객체를 만들어 사용하는 디자인 패턴.
                     생성자의 호출이 중복되어도 최초 생성 객체를 반환해줌
                     객체를 재사용하면 메모리를 아낄 수 있음

                     private 생성자, static 클래스 변수, 객체의 getter 정의

     */

    public static void main(String[] args) {
        ServiceOne so1 = new ServiceOne();
        so1.name = "첫번째";
        ServiceOne so2 = new ServiceOne();
       so2.name = "두번째";

        System.out.println(so1.name + "/" + so2.name);


    //ServiceTwo sw1= new ServiceTwo();
    //private 생성자이므로 new 키워드로 객체생성은 불가능

    ServiceTwo sw1 = ServiceTwo.getInstance();
    sw1.name = "첫번째";
        System.out.println(sw1.name);

        ServiceTwo sw2 = ServiceTwo.getInstance();
        sw1.name = "두번째";
        System.out.println(sw2.name);

    }
}


    
    class ServiceOne {
    
    String name;
        public ServiceOne() { }
    }
    
    class ServiceTwo{
    private static ServiceTwo stwo = new ServiceTwo();
    String name;

    private ServiceTwo() { } // private

        public  static  ServiceTwo getInstance() {
            if(stwo == null) stwo = new ServiceTwo();
            //stwo 객체가 한번도 생성되지 않았다면 객체를 생성함
            return stwo;
        }
    }

