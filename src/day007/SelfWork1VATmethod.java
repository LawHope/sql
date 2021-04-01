package day007;

public class SelfWork1VATmethod { // <-이것도 사실 클래스 메소드야



        // 공급가액
        public static double valueOfSupply = 10000.0; //클래스 선언 & 초기화
        // 부가가치세율
        public static double vatRate = 0.1; //클래스 선언

        public static double getVAT() {      //매개변수 없는 생성자선언
            return valueOfSupply * vatRate;
         }

        public static double getTotal() {
            return valueOfSupply + getVAT();
         }

        public static void main(String[] args) {

            System.out.println("Value of supply : " + valueOfSupply);
            System.out.println("VAT : " + getVAT());
            System.out.println("Total : " + getTotal());

System.out.println();
System.out.println();

            String str = new String("Java");

            System.out.println("원본 문자열 : " + str);

            for (int i = 0; i < str.length(); i++) {  // <- for 문을 쓴 메소드!

            System.out.print(str.charAt(i) + " "); //여기가 charAt( ) 메소드
            }
            System.out.println("\ncharAt() 메소드 호출 후 원본 문자열 : " + str);



        }
    }


    //이게 이렇게 복잡스럽게 할만한 연산인가;;;
