package day008.HR;

//매개변수 포함하는 생성자 연습문

public class Company {

    public static void main(String[] args) {


    }//main

}//company

class Employee {


    //멤버변수

    private String emploip;
    private String departments;
    private String jobhis;
    private String job;
    private String location;
    private String countrie;
    private String region;



    //생성자

    public Employee(String emploip, String departments, String jobhis,
                    String job, String location, String countrie,
                    String region) {
        this.emploip = emploip;
        this.departments = departments;
        this.jobhis = jobhis;
        this.job = job;
        this.location = location;
        this.countrie = countrie;
        this.region = region;
    }

    public String getEmploip() {
        return emploip;
    }

    public void setEmploip(String emploip) {
        this.emploip = emploip;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    public String getJobhis() {
        return jobhis;
    }

    public void setJobhis(String jobhis) {
        this.jobhis = jobhis;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountrie() {
        return countrie;
    }

    public void setCountrie(String countrie) {
        this.countrie = countrie;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}//Employee






