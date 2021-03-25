package day08;

public class EX74 {
 Account a1 = new Account(1122, 20000, 4.5, "2014-08-15 14:34:29");
 //↑ 밑에 작업 다하고나서 이걸 쓰면 됨, 숫자 쭉, 로 연결해서 쓰면 알아서 aid: 들이 붙음


    static class Account {
        private  int aid;
        private int balance;
        private  double interestRate;
        private String dateCreated;

        public Account() {} //빈생성자로 만들기}

        public Account(int aid, int balance, double interestRate, String dateCreated) {
            this.aid = aid;
            this.balance = balance;
            this.interestRate = interestRate;
            this.dateCreated = dateCreated;
             //↑전체 멤버 선택해서 선택지정자로 만듦
        }



    }

}
