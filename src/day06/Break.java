package day06;

import java.util.concurrent.SynchronousQueue;

public class Break {
    public static void main(String[] args) {
        
        
  mth.random(),


반복문 제어하기 break


               
                    Q. 1 ~ 100 총합 구하기 / 더한 값이 500을 넘는 경우 중단하기


                    int sum = 0; // 정수 합 = 0 이다 로 '초기화' + 선언한 거
                    int i; // i는 정수라고 선언한거

                    for ( i =0; i <= 100; ++i) {// i는 0부터 시작이고 100보다 작거나 같으며 1씩 증가한다.
                        sum += i; // 총합+i가 i이다.  
                        if ( sum >= 500) break; // 만약 총합이 500보다 크거나 같으면 멈춘다.
                    }
                    System.out.println("총합 : " + sum);  // '총합 : 000000' 로 표기한다
                    System.out.println("중지 지점 : " + i); // '중지 지점 : 000' 로 표기한다

          
        
        


                      
                     Q. while로 주사위 눈이 6나올때 까지 계속 굴리고, 굴린 횟수를 표시하기
                            
                          mth.random(),  break 사용하기

                        int dice = 0; // 정수 dice 값을 0으로 초기화 선언한다
                        int count = 0; //카운트 값을 0으로 초기화 선언한다

                        while(true){                       <-------------------------------동안 (참이라면)
                         dice = (int) (Math.random() * 6) +1;       <------다이스 = 정수 수학 랜덤 x 6 +1 
                                 ++count;                        <----------------------카운트는 1씩 증가함
                                   System.out.print(dice + " " );
                                    
                            if (dice == 6) break; <------------------------다이스 값이 6과 같다면 중지한다.
                                                    
                        }                ↖  ==는 '값이 같다'는 연산자이고 =는 선언이라 연산자가 아니다.
                            
                        System.out.println("횟수 : " +  count);

                            }
                        }





{teach Ver.}




                        // ex) 1 ~ 100까지의 총합을 구하는 프로그램 작성
                        // 단, 총합이 500을 넘는 경우, 실행을 중단함
                        int sum = 0;
                        int i;

                        for(i = 0; i <= 100; ++i) {
                            sum += i;
                            if (sum >= 500) break;
                            // 부분합이 500이상인 경우 반복실행을 중지함
                        }

                        System.out.println("총합 : " + sum);
                        System.out.println("중지지점 : " + i);

                        // ex) 주사위의 눈이 6이 나올때가지 굴려보는
                        // 프로그램을 작성하세요. 또한, 6이 나올때까지의
                        // 굴린 횟수도 같이 출력하세요
                        // Math.random() 과 break문을 사용
                        int dice = 0;
                        int count = 0;

                        while(true) {
                            dice = (int)(Math.random() * 6) + 1;
                            ++count;

                            System.out.print(dice + " ");
                            if (dice == 6) break;
                        }
                        System.out.println("굴린 총 횟수 : " + count);




                        for(int j = 0; j < 50; ++j)
                            System.out.print(
                                ((int)(Math.random() * (45 - 1)) + 1) + " ");


                    }
                }
