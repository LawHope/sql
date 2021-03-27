
package sungjuk;


private 지정자를 쓴 정보를 set get 으로 소환해서 표기하기.
       alt + ins 로 생성자 만들기, 셋 겟 만들기 실습
       
       

                            public class SungjikV0 {

                                private String name;
                                private int kor;
                                private int eng;
                                private int mat;
                                private int tot;
                                private  double  avg;
                                private  char  grd;


                                //합계 평균 학점은 계산 결과로 나올테니 지정 생성자에서 제외
                                public SungjikV0(String name, int kor, int eng, int mat) {
                                    this.name = name;
                                    this.kor = kor;
                                    this.eng = eng;
                                    this.mat = mat;
                                }



                                //셋 겟에선 전부다 호출 해야할테니 전부 포함해서 생성
                                public String getName() { }

                                public void setName(String name) { }

                                public int getKor() {}

                                public void setKor(int kor) {  }

                                public int getEng() {  }

                                public void setEng(int eng) { }

                                public int getMat() {}

                                public void setMat(int mat) {}

                                public int getTot() { }

                                public void setTot(int tot) {}

                                public double getAvg() { }

                                public void setAvg(double avg) {}

                                public char getGrd() {}

                                public void setGrd(char grd) {}
}
