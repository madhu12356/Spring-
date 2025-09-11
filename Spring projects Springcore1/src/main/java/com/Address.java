package com;

public class Address {

    private int addrId;
    private String street;
    private String city;
    private String pincode;

    public Address() {
    }

    public Address(int addrId, String street, String city, String pincode) {
        this.addrId = addrId;
        this.street = street;
        this.city = city;
        this.pincode = pincode;
    }

    public int getAddrId() {
        return addrId;
    }

    public void setAddrId(int addrId) {
        this.addrId = addrId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address [addrId=" + addrId + ", street=" + street +
                ", city=" + city + ", pincode=" + pincode + "]";
    }
}