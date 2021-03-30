package Sel_Rumination;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Re_JavaCalendar {

    public static void main(String[] args) {

/*
● ● ● 자바에서 날짜, 시간 다루기

                JDK에서 제공하는 Date 클래스로도 날짜 처리가 오류 파티가 터지는 바람에
                JDK 1.1 에 나온 Clalendar 클래스를 써서 날짜 시간 처리를 권장함
                ↑근데 얘도 윤초랑 월표시 계산 똑바로 못함


● ● ● 현재 JDK 8버전 라이브러리 Joda-Time 요다 타임을 쓰는 게 최선임   */


            Date d = new Date();
            System.out.println(d.toString ());
            //결과 : Tue Mar 30 16:05:01 KST 2021
                                                                                                System.out.println();
            String fmt = "%d년 %d월 %d일 %d시 %d분 %d초 \n";
            System.out.printf(fmt, d.getYear() +1900, d.getMonth() +1, d.getDate(),
                    d.getHours(), d.getMinutes(), d.getSeconds());
            //결과 : 2021년 3월 30일 16시 5분 1초
            //연수에 더해주고 월에도 더해주는 짓을 해야해서 아웃당함
                                                                                                   System.out.println();


            Calendar c =Calendar.getInstance();
            System.out.println(" Today is  " + c.getTime());
             //결과 : Tue Mar 30 16:05:01 KST 2021
                                                                                                            System.out.println();
            System.out.printf(fmt, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE),
                    c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE), c.get(Calendar.SECOND));
            //결과 : 2021년 2월 30일 16시 5분 1초

                                                                                                  System.out.println();
            System.out.println("오늘은 " + c.get(Calendar.DAY_OF_WEEK)+ " 요일입니다.");
            //결과 오늘은 3 요일입니다.
            //일요일이 1이라서 3이면 화요일...... 이럴 거면 왜쓰니 너네 미국놈들아...
                                                                                                       System.out.println();
            System.out.println("오늘은 2021년 중 "+c.get(Calendar.DAY_OF_YEAR) + " 알째 날입니다.");
            // 결과 : 오늘은 2021년 중 89 알째 날입니다.
            //이걸 어따 써 이색히야!!
                                                                                                      System.out.println();

            //오늘 기준 5일 후 날짜는? (add Method 사용)
            c.add(Calendar.DATE, 5);
            System.out.println("5일 후는 " + c.getTime());
            //결과 Sun Apr 04 16:09:41 KST 2021
                                                                                                          System.out.println();
            //오늘기준 100일 후는 언제?
            c=Calendar.getInstance();
            c.add ( Calendar.DATE, 100);
            System.out.println("오늘부터 100일은 " + c.getTime());
                                                                                                          System.out.println();
            //12일 전은 언제?
            c=Calendar.getInstance();
            c.add ( Calendar.DATE, -11 -4);
            System.out.println("12일 전은 " + c.getTime());
                                                                                                         System.out.println();

            //출산 예정일을 계산합시다. 10개월 후
            c = Calendar.getInstance();
            c.add(Calendar.MONTH, 10);
            System.out.println("출산 예정일은 " + c.getTime());
                                                                                                         System.out.println();

//SimpleDateFormat
            //날짜 출력을 원하는 대로 커스텀
             //가장 간편함

        // 1
        fmt = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        System.out.println( sdf.format(d));
                                                                                                             System.out.println();
        //2
        c = Calendar.getInstance();
        System.out.println( sdf.format (c.getTime()) );


                                                                                                                     System.out.println();
    //JDK8 의 그 요다 타임을 써보자
        System.out.println("JODA TIME!!");
        //java.time 패키지
        //날짜 표현에는 LocalDate
        //시간 표현에는 LocalTime
        //둘 다 표현에는 LocalDateTime

        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();
        LocalDateTime oops = LocalDateTime.now();

        System.out.println(time);
        System.out.println(date);
        System.out.println(oops);
    }
}
