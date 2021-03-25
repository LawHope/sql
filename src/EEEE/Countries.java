package EEEE;

public class Countries {

    private String country_id;
    private String country_namte;
    private int region;

    public Countries(String country_id, String country_namte, int region) {
        this.country_id = country_id;
        this.country_namte = country_namte;
        this.region = region;
    }

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
