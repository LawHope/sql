package day09;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class StarCraft2 {
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

          SCV2 s = new SCV2 ();
          s.attack();
          s.move();
          s.sAbility();

        Marine2 m = new Marine2 ();
        m.attack();
        m.move();
        m.sAbility();

        Firebat2 f= new Firebat2 ();
        f.attack();
        f.move();
        f.sAbility();


          System.out.println("SCV' s HP :" + s);
         }
    }


//슈퍼 클래스 작성
abstract class Unit2 {
    protected String name;
    protected int HP;
    protected int power;
    protected double mvspeed;
    protected int cost_mineral;
    protected int cost_gas;

    void attack(){}
    public void move(){}
    public void sAbility(){} //추상화 메소드라 public 을 생략해도 ok, {}도 ;교체}

     /*   public Unit(String name, int HP, int power,
                double mvspeed, int cost_mineral, int cost_gas) {
    this.name = name;
        this.HP = HP;
        this.power = power;
        this.mvspeed = mvspeed;
        this.cost_mineral = cost_mineral;
        this.cost_gas = cost_gas;
        }
      */

    public Unit2(String name, int HP, int power,
                double mvspeed, int cost_mineral, int cost_gas)
            { this.name = name;
                this.HP = HP;
                this.power = power;
                this.mvspeed = mvspeed;
                this.cost_mineral = cost_mineral;
                this.cost_gas = cost_gas; }


    public Unit2() { }//none 기본 생성자가 필요한 이유?????????
    }


    //_______________________________________________________//


class SCV2 extends Unit2 {
        final String fmtattack = "융합절단기를 이용해서 대상을 %d 의 데미지로 공격 중 \n";
        final String fmtmove = "지정 위치로 %.2f 의 속도로 이동 중\n";
        final String fmtmvspeed  = "대상을 수리하고 있습니다. \n";

     public SCV2() {
                    name = "SCV";
                    HP = 45;
                    power = 0;
                    mvspeed = 2.81;
                    cost_mineral = 50;
                    cost_gas = 0; }

             public SCV2(String name, int HP, int power,
                   double mvspeed, int cost_mineral, int cost_gas) {
                 super(name, HP, power, mvspeed, cost_mineral, cost_gas);}
                }


        class Marine2 extends Unit2 {
                //융합절단기를¨ 인 추상 메소드로
                // 부모 클래스에 정의된 메소드를 유닞 별로 재정의
                final String fmtattack = "가우스 소총으로 %d 의 공격 중 \n";
            final String fmtmove = "지정 위치로 %.2f 의 속도로 이동 중\n";
            final String fmtmvspeed  = "대상을 수리하고 있습니다. \n";

            public Marine2() {
                name = "Marine";
                HP = 50;
                power = 30;
                mvspeed = 2.81;
                cost_mineral = 50;
                cost_gas = 0;}
                 public Marine2(String name, int HP, int power, double mvspeed,
                          int cost_mineral, int cost_gas) {
                super(name, HP, power, mvspeed, cost_mineral, cost_gas);}
                @Override
                void attack() { super.attack(); }
                @Override
                public void move() { super.move(); }
                @Override
                public void sAbility() { super.sAbility(); } }


        class Firebat2 extends Unit2 {
            public  Firebat2 () {
                    name = "Marine";
                    HP = 50;
                    power = 30;
                    mvspeed = 2.81;
                    cost_mineral = 50;
                    cost_gas = 0;}
            public Firebat2(String name, int HP, int power, double mvspeed,
                                  int cost_mineral, int cost_gas)
                   {super(name, HP, power, mvspeed, cost_mineral, cost_gas);} }


