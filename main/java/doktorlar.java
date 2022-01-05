/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Furkan
 */
public class doktorlar {

    private String tc, doktoradi, uzmanlik, ucret;

    public doktorlar() {

    }

    public doktorlar(String tc, String doktoradi, String uzmanlik, String ucret) {
        this.tc = tc;
        this.doktoradi = doktoradi;
        this.uzmanlik = uzmanlik;
        this.ucret = ucret;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getDoktoradi() {
        return doktoradi;
    }

    public void setDoktoradi(String doktoradi) {
        this.doktoradi = doktoradi;
    }

    public String getUzmanlik() {
        return uzmanlik;
    }

    public void setUzmanlik(String uzmanlik) {
        this.uzmanlik = uzmanlik;
    }

    public String getUcret() {
        return ucret;
    }

    public void setUcret(String ucret) {
        this.ucret = ucret;
    }

    @Override
    public String toString() {
        return "doktorlar{" + "tc=" + tc + ", doktoradi=" + doktoradi + ", uzmanlik=" + uzmanlik + ", ucret=" + ucret + '}';
    }

}
