package day08;

     class Ex15 {
         public static void main(String[] args) {
             //누구나 알기쉬운 자바:입문 편 - 책제목
             //카와바 타케시 - 지은이
             //하진일 - 옮긴이
             //혜지원 - 출판사
             //2014년 06월 - 출간일
             //25,000원 -> 22500원 -  가격 -> 할인가
             //10% - 할인률
             //2,250원 (10%) -적립금(적립률)


         }//main

    }//Ex15 class


      class Book {
         private String bookname;
         private String wright;
         private String trans;
         private String publisher;
         private String date;
         private int price;
         private int sale;
         private double discount;
         private int point;



          // ▼ ▼  alt + ins 에서 생성자에서 대상 선택해서 생성하면 끝
          public Book(String bookname, String wright, String trans,
                      String publisher, String date, int price,
                      double discount) {
              this.bookname = bookname;
              this.wright = wright;
              this.trans = trans;
              this.publisher = publisher;
              this.date = date;
              this.price = price;
              this.discount = discount;
          }


        //↕ 모두 alt + ins 에서 생성자,세터&게터에서 대상 선택해서 생성하면 끝
          public String getBookname() {
              return bookname;
          }
          public void setBookname(String bookname) {
              this.bookname = bookname;
          }
          public String getWright() {
              return wright;
          }
          public void setWright(String wright) {
              this.wright = wright;
          }
          public String getTrans() {
              return trans;
          }
          public void setTrans(String trans) {
              this.trans = trans;
          }
          public String getPublisher() {
              return publisher;
          }
          public void setPublisher(String publisher) {
              this.publisher = publisher;
          }
          public String getDate() {
              return date;
          }
          public void setDate(String date) {
              this.date = date;
          }
          public int getPrice() {
              return price;
          }
          public void setPrice(int price) {
              this.price = price;
          }
          public int getSale() {
              return sale;
          }
          public void setSale(int sale) {
              this.sale = sale;
          }
          public double getDiscount() {
              return discount;
          }
          public void setDiscount(double discount) {
              this.discount = discount;
          }
          public int getPoint() {
              return point;
          }
          public void setPoint(int point) {
              this.point = point;
          }




      }//book class

