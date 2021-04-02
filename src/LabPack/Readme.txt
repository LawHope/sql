//클래스 만드는 순서
1. VO클래스만들기  ###VO.java
    멤버 변수 선언 -> 생성자 정의 (none, 매개변수 선택)-> stter getter / toString

    # 변수 선언//
                public class EmployeeVO {

                protected String lname;
                protected String email;


    # 알트 인서트 - 생성자 정의 - non , 매개변수 두가지 자동 생성//

                    public GradeVO(String name, int kor, int eng, int mat) {
                    this.name = name;
                    this.kor = kor;
                    this.eng = eng;
                    this.mat = mat; }

    # 알트 인서트 - 셋 겟 -  전체 매개 변수로 자동 생성 //

                    public String getName() {return name; }
                    public void setName(String name) {this.name = name; }
                    public void setDeptid(String deptid) {this.deptid = deptid; }


    # 알트 인서트 - ()toString - 투스트링 자동 생성 //

                    @Override
                    public String toString() {
                    String fmt = "{name:'%s', kor:%d, eng:%d, mat:%d," +
                                "tot:%d, avg:%.1f, grd:'%s'}";

                    String result = String.format(
                        fmt,name,kor,eng,mat,tot,avg,grd);

    # return result; 확인
                     return result;  }


                    } -> EmployeeVO Class Close
   ###VO.JAVA 끝 //




2. 인터페이스 만들기 ###Service.java : interface = class
    인터페이스 파일에는 Service가 붙는게 관례다.
    클래스 포함되어야하는 메소드 정의 ->
    (서비스 클래스의 인터페이스 정의 임 )
    CRUD에 따라서 new, read = show, readOne, modify, remove 접두사 쓰기

            입력, 처리, 출력 기능이 들어가고
            displayMenu(); 로 메뉴를 보이게 해줌.
            누구나 볼 수 있어야하니 public void 로 변수 지정.

    # public interface ###Service{ 작성
    # void displayMenu(); 작성

                ★ public ★ interface EmployeeService {
                ★ void displayMenu();
                    void newEmployee();
                    void showEmployee();
                    void showOneEmployee();
                    void modifyEmployee();
                    void removeEmployee();
                    void makeExtInfo(EmployeeVO emp);

               임플로이 ↑  /  성적처리기  ↓

               ★ public ★ interface GradeService {
               ★ void displayMenu();
                    Grade.GradeVO readGrade();
                    void computeGrade(Grade.GradeVO gr);
                    void printGrade(Grade.GradeVO gr);


                } -> interface close
    ##인터페이스 끝





3. 서비스 클래스 만들기 ###ServiceImpl.java
                    서비스 클래스는 인터페이스를 구현한다는 의미로 Impl를 붙이는게 관례다.

                    서비스 인터페이스를 써서 CRUD 메소드를 만들기
                    단일 개체로 만들어야함 / 싱글톤 패턴을 포함해서 작성해야함



                    public class GradeServiceV2Impl ★extends GradeServiceV2 {
                                               ★↑ 난 왜 Implement에서 상속으로 바꾸라고 뜸;;
                    public class EmployeeServiceImpl implements EmployeeService {
                                }


   # 멤버변수 선언

                 ★ List<GradeVO> gr ★data = ★new ArrayList<>();
                 Grade★VO gr = ★null;

                 ★ List<EmployeeVO> emp ★data = ★new ArrayList<>();
                 Employee★VO emp = ★null;




                  String displaymenu =
                  "    성적 프로그램 v6 \n" +
                  " 1. 성적데이터 입력
                  2.조회 3.상세조회 4.수정 5.삭제 0.종료 \n" + 어쩌구저쩌구 메뉴 넣고

                  ★ System.out.print(displaymenu); }



   # 단일 상수 선언// 임플로이의 경우 급에 따라 다른 부분을 기입

                    static final String[] JOBID = {
                            "FI_MGR","AC_MGR","SA_MAN","IT_PROG","ST_CLERK"};
                    static int MINSAL = 2000;
                    static int MAXSAL = 40000;
                    static int MAXDEPT = 270;
                    static int MAXMGRID = 206;




    # 싱글톤 블럭 시작
                    ★private ★static
                    Employee★Service empsrv = ★null;
                    ★private Employee★Service★Impl() {
                    }

                    ★public ★static Employee★Service ★getInstance() {
                        ★if (empsrv == null) empsrv = ★new EmployeeService★Impl();
                        ★return empsrv;
                    }
                    // 싱글톤 블럭 끝

             ↑  임플로이 /   ↓성적

                    ★private ★static
                    Grade★ServiceV2 grsrv = ★null;
                    ★private Grade★ServiceV2★Impl() {
                    }

                    ★public ★static Grade★ServiceV2 ★getInstance() {
                       ★ if (grsrv == null) grsrv = ★new GradeServiceV2★Impl();
                        ★return grsrv;
                    }
                    // 싱글톤 패턴 끝



    # 오버라이드 부분과 직접 기입

               @Override
               ★public void displayMenu()
                            { 이기서 부터는 복붙해서 작성
                    ★String displaymenu =
                            "----- 성적처리프로그램 V6 복 붙"
                    ★System.out.print(displaymenu);
                        }


               @Override
               ★public void displayMenu()
                            {
               ★ String displaymenu =
                        "    사원관리 프로그램 v1     \n" +
                        " 1. 사원정보 입력       \n" +
                        " 2. 사원정보 조회       \n" +
                        " 3. 사원정보 상세조회   \n" +
                        " 4. 사원정보 수정       \n" +
                        " 5. 사원정보 삭제       \n" +
                        " 0. 프로그램 종료       \n" +
                        " 작업을 선택하세요 : ";
               ★System.out.print(displaymenu);
                         }



            //정보 입력 받기
                @Override
                public void newGrade() { //여기서부터 작성하기
               ★ Scanner sc = new Scanner(System.in);
                ★    try {
                    System.out.print("이름은?");
                    String name = sc.next();

                    GradeVO gr = new GradeVO(name, kor, eng, mat);
                    // 입력받은 성적데이터를 객체화함
                    computeGrade(gr);
                    // 성적데이터 처리
                    grdata.add(gr);
                    // 처리된 성적데이터를 동적배열에 저장
                    } //try



            //정보 입력 받기
                @Override
                public void newEmployee() { //여기섭터 작성하기
                ★Scanner sc = new Scanner(System.in);
                ★     try {
                     System.out.print("사번은?");
                     String empno = sc.next();

                    EmployeeVO emp = new EmployeeVO(
                     empno,fname,lname,email,phone,hdate);
                    // 사원 추가정보를 생성해서 사원정보로 저장
                    empsrv.makeExtInfo(emp);
                    empdata.add(emp);
                    } //try

                 //캐치 부분
                      catch (Exception ex) {
                      System.out.println("잘못입력하셨습니다!");
                      return;  // 오류발생시 실행중단하고 main으로 복귀
                      }//catch
                       } <- 입력받기 끝

                  //캐치부분
                      catch (Exception ex) {
                      System.out.println("잘못입력하셨습니다!!");
                      }//catch
                       } <-입력받기 끝




//show 부분
             //show 정보를 리스트 형태로 출력
                    @Override
                    ★ public void showGrade() {
                    ★ String fmt = "번호:%d, 이름:%s, 국어:%d, 영어:%d, 수학:%d \n";
                 int pos = 0;  // 배열인덱스

                    ★ for(GradeVO gr : grdata) {
                    ★ System.out.printf(fmt, pos, gr.getName(),
                                gr.getKor(), gr.getEng(), gr.getMat() );
                 ++pos;
                            }
                        }

             //show 정보를 리스트 형태로 출력
                    @Override
                    ★ public void showEmployee() {
                    ★ String fmt = "%s %s %s %s %s %s \n";

                    ★ for(EmployeeVO emp : empdata) {
                    ★ System.out.printf(fmt, emp.getEmpno(),
                                 emp.getFname(), emp.getLname(), emp.getEmail(),
                                 emp.getPhone(), emp.getHdate());    }
                        }

                   @Override
                   public void computeGrade(GradeVO sj) {
                   sj.setTot( sj.getKor() + sj.getEng() + sj.getMat() );
                   sj.setAvg( (double)sj.getTot() / 3);

                   switch((int)sj.getAvg() / 10) {
                   case 10: case 9: sj.setGrd('수'); break;
                   case 8:  sj.setGrd('우'); break;
                   case 7:  sj.setGrd('미'); break;
                   case 6:  sj.setGrd('양'); break;
                   default: sj.setGrd('가'); break;
                                }
                            }
//showOne 부분
                     @Override
                       ★public void showOneGrade() {
                       ★String fmt = "번호:%d, 이름:%s, 국어:%d, 영어:%d, 수학:%d \n"
                       + "총점:%d, 평균:%.1f, 학점:%c \n";

                       ★Scanner sc = new Scanner(System.in);
                       ★System.out.print("조회할 학생의 번호는? ");
                           int pos = sc.nextInt();
                           try {
                           GradeVO sj = grdata.get(pos);
                           System.out.printf(fmt, pos,
                           sj.getName(), sj.getKor(), sj.getEng(), sj.getMat(),
                           sj.getTot(), sj.getAvg(), sj.getGrd());
                           }
                           catch (Exception ex) {
                                System.out.println("데이터가 존재하지 않습니다!!");
                              }
                        } <-show one close


                    @Override
                        ★public void showOneEmployee() {
                        ★String fmt = "%s %s %s %s %s %s \n" +
                                "%s %s %s %s %s \n";
                        ★Scanner sc = new Scanner(System.in);
                        ★System.out.print("조회할 사원번호는? ");
                            String empno = sc.next();
                            EmployeeVO emp = null;
                            for(EmployeeVO e : empdata) {
                            // 찾는 데이터가 동적배열에 존재한다면
                            // emp 변수에 저장하고 반복문을 종료함
                            if (e.getEmpno().equals(empno)) {
                                emp = e;
                                break;  }
                                } // for
                                System.out.printf(fmt, emp.getEmpno(), emp.getFname(),
                                emp.getLname(), emp.getEmail(), emp.getPhone(),
                                emp.getHdate(), emp.getJobid(), emp.getSal(),
                                emp.getComm(), emp.getMgrid(), emp.getDeptid() );
                        } // show One close





##그밖에
                      @Override
                            public void modifyGrade() {

                            }

                            @Override
                            public void removeGrade() {

                            }
           } ->성적 Impl 종료


                    @Override
                        public void modifyEmployee() {    }
                    @Override
                        public void removeEmployee() {    }
                    @Override
                        public void makeExtInfo(EmployeeVO emp) {
                        Random rnd = new Random();

                        int key = rnd.nextInt(JOBID.length);
                        String jobid = JOBID[key];

                        int sal = rnd.nextInt(MAXSAL) + MINSAL;
                        int mgrid = rnd.nextInt(MAXMGRID) + 100;
                        int deptid = (rnd.nextInt(MAXDEPT) % 100) * 10;

                        DecimalFormat df = new DecimalFormat("#.##");
                        double comm = Double.parseDouble(
                                df.format( rnd.nextDouble() / 2))

                        emp.setJobid(jobid);
                        emp.setSal(sal);
                        emp.setComm(comm);
                        emp.setMgrid(mgrid+"");
                        emp.setDeptid(deptid+"");
                    }


                       @Override
                             public void displayMenu() {
                            String displaymenu =
                                "    사원관리 프로그램 v1     \n" +
                                " 1. 사원정보 입력       \n" +
                                " 2. 사원정보 조회       \n" +
                                " 3. 사원정보 상세조회   \n" +
                                " 4. 사원정보 수정       \n" +
                                " 5. 사원정보 삭제       \n" +
                                " 0. 프로그램 종료       \n" +
                                " 작업을 선택하세요 : ";
                              System.out.print(displaymenu);
                             }
            } ->성적 Impl 종료

        # Service 자바 클래스들을 만들다보면 @Override가 생기나봐;

        }  -> public class ###ServiceImpl
              Implements ###Service 클래스 close
    ##서비스클래스 완료








4. 메인 클래스 만들기 - 프로그램의 시작 지점임! ###Main.java
   메인 메소드가 있는 클래스임

                     // (1)newGrade, (2)showGrade, (3)showOneGrade,
                    // (4)modifyGrade, (5)removeGrade
                    // computeGrade, displayMenu

                   public static void main(String[] args) {
                   ★Scanner sc = new Scanner(System.in);
                   Grade★ServiceV2 grsrv = GradeServiceV2★Impl.getInstance();
                   ★String menu = "";
                   ★while(true) {
                   grsrv ★.displayMenu();
                   ★menu = sc.next();
                   ★switch(menu) {
                           case "1": grsrv.newGrade(); break;
                           case "2": grsrv.showGrade(); break;
                           case "3": grsrv.showOneGrade(); break;
                           case "4": grsrv.modifyGrade(); break;
                           case "5": grsrv.removeGrade(); break;
                           case "0": System.exit(0); break;
                   ★default:
                   ★System.out.println("잘못 입력하셨습니다!!");
                   }
                   }
                   }



                  public static void main(String[] args) {
                  ★Scanner sc = new Scanner(System.in);
                  Employee★Service empsrv = Employee★ServiceImpl.getInstance();

                  ★String menu = "";
                  ★while(true) {
                  empsrv ★.displayMenu();
                  ★menu = sc.next();
                  ★switch (menu) {
                          case "1": empsrv.newEmployee(); break;
                          case "2": empsrv.showEmployee(); break;
                          case "3": empsrv.showOneEmployee(); break;
                          case "4": empsrv.modifyEmployee(); break;
                          case "5": empsrv.removeEmployee(); break;
                          case "0": System.exit(0); break;
                  ★default:
                  ★System.out.println("잘못 입력하셨습니다!!");
                  }// switch
                  } // while
                  } //main

## 메인 끝