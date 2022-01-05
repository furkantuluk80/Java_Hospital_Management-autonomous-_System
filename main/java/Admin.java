/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Furkan
 */
public class Admin {
    private String ad, soyad, kullanıcıAdı, şifre;
  
    public Admin(){
        
    }
    
    public Admin(String ad, String soyad, String kullanıcıAdı, String şifre){
        this.ad = ad;
        this.soyad = soyad;
        this.kullanıcıAdı = kullanıcıAdı;
        this.şifre = şifre;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getKullanıcıAdı() {
        return kullanıcıAdı;
    }

    public void setKullanıcıAdı(String kullanıcıAdı) {
        this.kullanıcıAdı = kullanıcıAdı;
    }

    public String getŞifre() {
        return şifre;
    }

    public void setŞifre(String şifre) {
        this.şifre = şifre;
    }

    @Override
    public String toString() {
        return "Admin{" + "ad=" + ad + ", soyad=" + soyad + ", kullan\u0131c\u0131Ad\u0131=" + kullanıcıAdı + ", \u015fifre=" + şifre + '}';
    }
    
}
