package jdbc.przyklad6;

import jdbc.Country;

public class Address {
    private int addressId;
    private String addressStreet;
    private String addresBuildingNo;
    private String addresApartamentNo;
    private String addresCity;
    private String addresPostalCode;
    private Country addressCountry;
    public Address() {
    }
    public Address(int addressId, String addressStreet, String addresBuildingNo, String addresApartamentNo, String addresCity, String addresPostalCode, Country addressCountry) {
        this.addressId = addressId;
        this.addressStreet = addressStreet;
        this.addresBuildingNo = addresBuildingNo;
        this.addresApartamentNo = addresApartamentNo;
        this.addresCity = addresCity;
        this.addresPostalCode = addresPostalCode;
        this.addressCountry = addressCountry;
    }
    public Address(String addressStreet, String addresBuildingNo, String addresApartamentNo, String addresCity, String addresPostalCode, Country addressCountry) {
        this.addressStreet = addressStreet;
        this.addresBuildingNo = addresBuildingNo;
        this.addresApartamentNo = addresApartamentNo;
        this.addresCity = addresCity;
        this.addresPostalCode = addresPostalCode;
        this.addressCountry = addressCountry;
    }
    public int getAddressId() {
        return addressId;
    }
    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }
    public String getAddressStreet() {
        return addressStreet;
    }
    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }
    public String getAddresBuildingNo() {
        return addresBuildingNo;
    }
    public void setAddresBuildingNo(String addresBuildingNo) {
        this.addresBuildingNo = addresBuildingNo;
    }
    public String getAddresApartamentNo() {
        return addresApartamentNo;
    }
    public void setAddresApartamentNo(String addresApartamentNo) {
        this.addresApartamentNo = addresApartamentNo;
    }
    public String getAddresCity() {
        return addresCity;
    }
    public void setAddresCity(String addresCity) {
        this.addresCity = addresCity;
    }
    public String getAddresPostalCode() {
        return addresPostalCode;
    }
    public void setAddresPostalCode(String addresPostalCode) {
        this.addresPostalCode = addresPostalCode;
    }
    public Country getAddressCountry() {
        return addressCountry;
    }
    public void setAddressCountry(Country addressCountry) {
        this.addressCountry = addressCountry;
    }
}