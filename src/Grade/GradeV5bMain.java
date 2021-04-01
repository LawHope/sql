package Grade;


    public class GradeV5bMain {
        public static void main(String[] args) {

            //GradeService grsrv = new GradeServiceImpl();
            GradeService grsrv = GradeServiceImpl.getInstance();

            Grade.GradeVO gr = grsrv.readGrade();
            grsrv.computeGrade(gr);
            grsrv.printGrade(gr);
        }
    }


