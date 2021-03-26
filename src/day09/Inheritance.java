package day09;

public class Inheritance {

    public static void main(String[] args) {
        Students s = new Students();
           s.study(); //개발자가 추가한 메소드
           s.toString(); //수퍼클래스에서 물려받은 것

        A a= new A();
             a.toString(); //수퍼클래스에서 물려온 것

/* 자바에서는 모든 것들이 "Object" 라는 클래스에서 정의된 메소드들을 상속 받음
그래서  class A { } 쓰고 main 에서 s. 만 써도 뒤에 toString, equals,
hashtag 등이 자동으로 붙음 편리하지! */

    }
}

class A { }

                   /* class Student {
                        public void speak(){}
                        public void eat(){}
                        public void walk(){}
                        public void sleep(){}
                        public void study(){}
                    }
                    class Student_worker{
                        public void speak(){}
                        public void eat(){}
                        public void walk(){}
                        public void sleep(){}
                        public void study(){}
                        public void work(){}
                    }

                    class Researcher {
                        public void speak(){}
                        public void eat(){}
                        public void walk(){}
                        public void sleep(){}
                        public void research(){}
                    }

                    class Professor{
                        public void speak(){}
                        public void eat(){}
                        public void walk(){}
                        public void sleep(){}
                        public void research(){}
                        public void teach(){}
                    }*/
                                    //오우야 너무 길어;;;;



/* ....... 상속으로 재정의하기 투하 ........ */


        // 1. 공통사항 뽑기
        class People {
            public void speak(){}
            public void eat(){}
            public void walk(){}
            public void sleep(){}
        }

        //2.비공통 사항 뽑기
        class Students extends People {
          public void study (){}
        }

        // 3. 어라 study 는 학생즈 클래스에도 있음, 걔를 끌어오자
        class Student_workers extends Students{
            public void work(){}
        }

        class Researchers extends People {
            public void research(){}
        }

        //4. 3번처럼 중복되는 부분은 그녀석을 상속해버리자
        class Professors extends Researchers {
            public void teach(){}
        }



