package EEEE;

public class Locations {
    private int location_id;
    private String street_adress;
    private String postal_code;
    private String city;
    private String state_province;
    private String country_id;


    public Locations(int location_id, String street_adress, String postal_code, String city, String state_province, String country_id) {
        this.location_id = location_id;
        this.street_adress = street_adress;
        this.postal_code = postal_code;
        this.city = city;
        this.state_province = state_province;
        this.country_id = country_id;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public String getStreet_adress() {
        return street_adress;
    }

    public void setStreet_adress(String street_adress) {
        this.street_adress = street_adress;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState_province() {
        return state_province;
    }

    public void setState_province(String state_province) {
        this.state_province = state_province;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }
}
