package com.example.chris.viewpagerdemo.model;

/**
 * Created by Chris on 31/05/2016.
 */
public class Information {

    private String fullName;
    private String address;
    private String status;
    private String interest;
    private String height;
    private String car;

    public Information(String fullName, String address, String status, String interest, String height, String car) {
        this.fullName = fullName;
        this.address = address;
        this.status = status;
        this.interest = interest;
        this.height = height;
        this.car = car;
    }

    public String getFullName() {
        return "Name: " + fullName;
    }

    public String getAddress() {
        return "Address: " +address;
    }

    public String getStatus() {
        return "Status: " + status;
    }

    public String getInterest() {
        return "Interest: "+ interest;
    }

    public String getHeight() {
        return "Height: " + height;
    }

    public String getCar() {
        return "Car: " +car;
    }
}



