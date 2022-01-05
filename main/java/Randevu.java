/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Furkan
 */
public class Randevu {
    
  private String tc,hastaadi,doktoradi,tarih,saat;  
    
   public Randevu(){
       
   } 

    public Randevu(String tc, String hastaadi, String doktoradi, String tarih, String saat) {
        this.tc = tc;
        this.hastaadi = hastaadi;
        this.doktoradi = doktoradi;
        this.tarih = tarih;
        this.saat = saat;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getHastaadi() {
        return hastaadi;
    }

    public void setHastaadi(String hastaadi) {
        this.hastaadi = hastaadi;
    }

    public String getDoktoradi() {
        return doktoradi;
    }

    public void setDoktoradi(String doktoradi) {
        this.doktoradi = doktoradi;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    @Override
    public String toString() {
        return "Randevu{" + "tc=" + tc + ", hastaadi=" + hastaadi + ", doktoradi=" + doktoradi + ", tarih=" + tarih + ", saat=" + saat + '}';
    }
   
}
