package day009;

public class StarCraft {
    //테란만 가지고 만들어보자
    //이름 체력 이동속도 소요미네랄 소요가스
    // Attack -> ex)
    //마린 : 가우스건을 이용해서 대상에 6의 피해를 주었습니다.
    //파이어백 : 화염방사기를 이용해서 대상에 8*3의 피해를 주고 있습니다.

    public static void main(String[] args) {
        /*SCV 유닛을 만들 때마다 초기값을 지정하면 hell
         동일 속성의 유닛을 만들 때마다 매개변수로 객체를 만드는 것은 hell hell
         ● ● ●생성자에서 초기값을 지정하는 게 훨씬 빠름 ● ● ●
         */

          SCVs s = new SCVs ();
          s.attack();
          s.move();
          s.sAbility();
            System.out.println("SCV' s HP :" + s);

            Marines m = new Marines ();
            m.attack();
            m.move();
            m.sAbility();

                Firebats f= new Firebats ();
                f.attack();
                f.move();
                f.sAbility();
         }
    }


    //슈퍼 클래스 작성
    abstract class Unit{
            protected String name;
            protected int HP;
            protected int power;
            protected double mvspeed;
            protected int cost_mineral;
            protected int cost_gas;
        abstract public void attack();
        abstract public void move();
        abstract public void sAbility();
        //추상화 메소드라 public 을 생략해도 ok, {}도 ;로 교체}

     public Unit() { }//none 기본 생성자가 필요한 이유?????????

     /*   public Unit(String name, int HP, int power,
                double mvspeed, int cost_mineral, int cost_gas) {
    this.name = name;
        this.HP = HP;
        this.power = power;
        this.mvspeed = mvspeed;
        this.cost_mineral = cost_mineral;
        this.cost_gas = cost_gas;
        }  */           //  ↑ 이 방식보다 추상화 메소드를 써보자

    }


 //----------------------------------------//

class SCVs extends Unit {
         final String fmtattack = "융합절단기를 이용해서 대상을 %d 의 데미지로 공격 중 \n";
         final String fmtmove = "지정 위치로 %.2f 의 속도로 이동 중\n";
         final String fmtmvsAbility = "대상을 수리하고 있습니다. \n";
        @Override public void attack(){System.out.println(fmtattack);}
        @Override public void move() {System.out.println(fmtmove);}
        @Override public void sAbility() {System.out.println(fmtmvsAbility);}
            public SCVs() {
            name = "SCV";
            HP = 45;
            power = 0;
            mvspeed = 2.81;
            cost_mineral = 50;
            cost_gas = 0; }
            }


class Marines extends Unit {
                //융합절단기를¨ 인 추상 메소드로
                // 부모 클래스에 정의된 메소드를 유닛 별로 재정의
     final String fmtattack = "가우스소총을 이용해서 대상을 %d 의 데미지로 공격 중 \n";
     final String fmtmove = "지정 위치로 %.2f 의 속도로 이동 중\n";
     final String fmtsAbility = "전투자극제를 사용해 이동속도를 높입니다.\n";

    @Override public void attack() {
        System.out.println(fmtattack);}
    @Override public void move() {System.out.println(fmtmove);}
    @Override public void sAbility() {System.out.println(fmtsAbility);}
          public Marines() {
            name = "Marine";
            HP = 50;
            power = 30;
            mvspeed = 2.81;
            cost_mineral = 50;
            cost_gas = 0;}
        }

class Firebats extends Unit {

    final String fmtattack = "화염방사기를 이용해서 대상에 %d의 피해를 주고있습니다\n";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다\n";
    final String fmtsAbility = "전투자극제를 사용해서 이동속도 50%%증가, 공격속도 33%%증가합니다\n";
    @Override public void attack() {System.out.println(fmtattack);}
    @Override public void move() {System.out.println(fmtmove);}
    @Override public void sAbility() {System.out.println(fmtsAbility);}
    public  Firebats () {
              name = "FireBat";
              HP = 50;
              power = 30;
              mvspeed = 2.81;
              cost_mineral = 50;
              cost_gas = 0;}



                    }



