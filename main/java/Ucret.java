/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Furkan
 */
public class Ucret {

    private String doktorucreti, odaucreti, ekstracret, tutar, telno;

    public Ucret() {
    }

    public Ucret(String doktorucreti, String odaucreti, String ekstracret, String tutar, String telno) {
        this.doktorucreti = doktorucreti;
        this.odaucreti = odaucreti;
        this.ekstracret = ekstracret;
        this.tutar = tutar;
        this.telno = telno;
    }

    public String getDoktorucreti() {
        return doktorucreti;
    }

    public void setDoktorucreti(String doktorucreti) {
        this.doktorucreti = doktorucreti;
    }

    public String getOdaucreti() {
        return odaucreti;
    }

    public void setOdaucreti(String odaucreti) {
        this.odaucreti = odaucreti;
    }

    public String getEkstracret() {
        return ekstracret;
    }

    public void setEkstracret(String ekstracret) {
        this.ekstracret = ekstracret;
    }

    public String getTutar() {
        return tutar;
    }

    public void setTutar(String tutar) {
        this.tutar = tutar;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    @Override
    public String toString() {
        return "Ucret{" + "doktorucreti=" + doktorucreti + ", odaucreti=" + odaucreti + ", ekstracret=" + ekstracret + ", tutar=" + tutar + ", telno=" + telno + '}';
    }

}
