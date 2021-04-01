package day011;

public class SungJukVO011 {


    protected String name;
    protected int kor;
    protected int eng;
    protected int mat;
    protected int tot;
    protected double avg;
    protected char grd;

    public SungJukVO011(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;    }

    public String getName() { return name; }
    public void setName(String name) {  this.name = name; }
    public int getKor() { return kor; }
    public void setKor(int kor) {  this.kor = kor; }
    public int getEng() { return eng;  }
    public void setEng(int eng) {   this.eng = eng;  }
    public int getMat() {  return mat;  }
    public void setMat(int mat) { this.mat = mat; }
    public int getTot() {return tot;}
    public void setTot(int tot) {this.tot = tot; }
    public double getAvg() { return avg; }
    public void setAvg(double avg) { this.avg = avg; }
    public char getGrd() { return grd;}
    public void setGrd(char grd) {this.grd = grd;}


    @Override // alt + ins 로 overrode method 작성!
    public String toString() {
        String fmt = "{name='', kor:, eng:, mat:%d," +
                "tot:%d, avg:%,1f, grd:'%s'}";

        String result = String.format(
                fmt, name, kor, eng, mat, tot, avg, grd);
        return result;




    }
}

