package com.example.personelkayit;

public class Personel {
    private int id;
    private String adsoyad,mail,telefon;
    public Personel() {
    }

   public Personel( String adsoyad, String mail, String telefon) {
        this.adsoyad = adsoyad;
        this.mail = mail;
        this.telefon = telefon;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAdsoyad() {
        return adsoyad;
    }
    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getTelefon() {
        return telefon;
    }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
