package com.example.week11;

import java.io.Serializable;

public class Customer implements Serializable {

    private String name_surname,mail,phone,city,date;

    public Customer(String name_surname, String mail, String phone, String city, String date) {
        this.name_surname = name_surname;
        this.mail = mail;
        this.phone = phone;
        this.city = city;
        this.date = date;
    }

    public String getName_surname() {
        return name_surname;
    }

    public void setName_surname(String name_surname) {
        this.name_surname = name_surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
