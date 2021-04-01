package day008;

public class ValueObject {

    public static void main(String[] args) {
        //기본적으로 클래스 멤버변수 접근지정자는 private 가 안전해
        //private 선언한 경우 외부 클래스에서 멤버변수에 접근이 안되니까
        // setter / getter 메소드를 써서 접근불가변수를 조정 가능함

                /* C sj = new C ();
                 sj.name = "송혜교";
                 sj.kor = 99;
                 sj.eng = 54;
                 sj.mat = 54; */
        //OOP 에서는 sj.name = "송혜교";  처럼 외부에서 호출로 접근하는 것을 지양함
        //빨간 글씨로 뜨는 이유가 그거.
        //공개만 메소드로만 접근할 수 있게 유도함 = setter / getter임

        C sj = new C ();
        sj.setName ("송혜교");
        sj.setKor(18);
        sj.setEng(43);
        sj.setMat(65); //setter
                        // setㅁㅁ(ㅁㅁㅁ); 로 객체의 변수 값에 대입

        System.out.println(sj.getName());
        System.out.println(sj.getEng());
        System.out.println(sj.getKor());
        System.out.println(sj.getMat()); //getter

           }//main
    }//valueObject class



    class C {
    private String name;
    private  int kor;
    private  int eng;
    private int mat;

            /*setter 정의하기 : public set 변수명(변수명)*/
                        //setter는 외부 객체의 멤버변수에 값을 내가 여기서 설정할 때
                public void setName(String name){
                            // ↑생성자랑 비슷하제?, set 뒤에 변수는 대문자로 쓰그라.
                    this.name = name;
                }
                public void setKor(int kor) {
                  this.kor = kor;
                }
                 public void setEng(int eng) {
                     this.kor = kor;
                 }
                 public void setMat(int mat) {
                     this.kor = mat;
                 }
                                    //외부에서 객체 변수를 조절할 때


            /*getter 정의 : public 반환유형 get 변수명() */
                    //getter는 외부에서 이미 결정 되어 있는 값을 불러오는 메소드임
                public String getName (){
                    return name;
                }

                public int getKor(){
                    return kor;
                }

                public int getEng(){
                        return eng;
                }

                public int getMat(){
                        return mat;
                }
      }// class c





    class D {
    private String userid;
    private String userpw;
    private String usermail;

    public D() {} //일단 non 으로 생성자 만들고

    public D(String userid, String userpw, String usermail) {
    this.userid = userid;
    this.userpw = userpw;
    this.usermail = usermail;  }


    }//class D