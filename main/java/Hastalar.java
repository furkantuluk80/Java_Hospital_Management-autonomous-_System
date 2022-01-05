
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
public class Hastalar extends Odalar {

    private String tc, hastaad, adres, cinsiyet, hastalık;
    private String doktorad, alan;
    private String  yatakno; 

    public Hastalar() {

    }

    public Hastalar(String tc, String hastaad, String adres, String cinsiyet, String hastalık, String doktorad,
                    String alan, String odano, String yatakno, String tesis) {
        super(odano,tesis);
        this.tc = tc;
        this.hastaad = hastaad;
        this.adres = adres;
        this.cinsiyet = cinsiyet;
        this.hastalık = hastalık;
        this.doktorad = doktorad;
        this.alan = alan;
        this.yatakno=yatakno;
        //this.odano=odano;
        //this.tesis=tesis;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getHastaad() {
        return hastaad;
    }

    public void setHastaad(String hastaad) {
        this.hastaad = hastaad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getHastalık() {
        return hastalık;
    }

    public void setHastalık(String hastalık) {
        this.hastalık = hastalık;
    }

    public String getDoktorad() {
        return doktorad;
    }

    public void setDoktorad(String doktorad) {
        this.doktorad = doktorad;
    }

    public String getAlan() {
        return alan;
    }

    public void setAlan(String alan) {
        this.alan = alan;
    }

    
    public String getYatakno() {
        return yatakno;
    }

    public void setYatakno(String yatakno) {
        this.yatakno = yatakno;
    }

    @Override
    public String toString() {
        return "Hastalar{" + "tc=" + tc + ", hastaad=" + hastaad + ", adres=" + adres + ", cinsiyet=" + cinsiyet + ", hastal\u0131k=" + hastalık + ", doktorad=" + doktorad + ", alan=" + alan + ", yatakno=" + yatakno + '}';
    }

    

   
    
}
