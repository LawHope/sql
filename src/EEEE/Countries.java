package EEEE;

public class Countries {

    private String country_id;
    private String country_namte;
    private int region;

                    public Countries() {} 까지 쓰고 { } 안에 Alt + inst 눌러서 cunstroctor = 생성자, 대상 모두 선택하면
                        
                                                                              ↓ this. 시리즈 이게 생김
                  
                    public Countries(String country_id, String country_namte, int region) {
                        this.country_id = country_id;
                        this.country_namte = country_namte;
                        this.region = region;
                    }
    
                                         ↓ 그리고 나서  public String getCountry_id() {  } 이게 생기는데
                                             이거 우클릭, setter gertter 누르면 이것들이 생김.
                                              끝!

                    public String getCountry_id() {
                        return country_id;
                    }

                    public void setCountry_id(String country_id) {
                        this.country_id = country_id;
                    }

                    public String getCountry_namte() {
                        return country_namte;
                    }

                    public void setCountry_namte(String country_namte) {
                        this.country_namte = country_namte;
                    }

                    public int getRegion() {
                        return region;
                    }

                    public void setRegion(int region) {
                        this.region = region;
                    }
}
