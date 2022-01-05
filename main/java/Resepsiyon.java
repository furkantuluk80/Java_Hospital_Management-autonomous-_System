
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Furkan
 */
public class Resepsiyon {
    private String ad,soyad,email,cinsiyet,tel,tc;
    private int yaş;
    private String kullanıcıAdı,şifre;
   
    public Resepsiyon(){
        
    }
    

     public Resepsiyon(String ad, String soyad, String email, String cinsiyet, String tel, String tc, int yaş, String kullanıcıAdı, String şifre){
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.cinsiyet = cinsiyet;
        this.tel = tel;
        this.tc = tc;
        this.yaş = yaş;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public int getYaş() {
        return yaş;
    }

    public void setYaş(int yaş) {
        this.yaş = yaş;
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
        return "Resepsiyon{" + "ad=" + ad + ", soyad=" + soyad + ", email=" + email + ", cinsiyet=" + cinsiyet + ", tel=" + tel + ", tc=" + tc + ", ya\u015f=" + yaş + ", kullan\u0131c\u0131Ad\u0131=" + kullanıcıAdı + ", \u015fifre=" + şifre + '}';
    }
     
}
