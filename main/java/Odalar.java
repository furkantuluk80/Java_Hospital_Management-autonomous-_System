/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Furkan
 */
public class Odalar {
    
   private String Odano,yataksayisi,blok,ucret; 
public Odalar(){
    
}
public Odalar(String Odano, String blok){
    
    this.Odano=Odano;
    
    this.blok=blok;
  
}



public Odalar(String Odano, String yataksayisi,String blok,String ucret){
    
    this.Odano=Odano;
    this.yataksayisi=yataksayisi;
    this.blok=blok;
    this.ucret=ucret;
}

    public String getOdano() {
        return Odano;
    }

    public void setOdano(String Odano) {
        this.Odano = Odano;
    }

    public String getYataksayisi() {
        return yataksayisi;
    }

    public void setYataksayisi(String yataksayisi) {
        this.yataksayisi = yataksayisi;
    }

    public String getBlok() {
        return blok;
    }

    public void setBlok(String blok) {
        this.blok = blok;
    }

    public String getUcret() {
        return ucret;
    }

    public void setUcret(String ucret) {
        this.ucret = ucret;
    }

    @Override
    public String toString() {
        return "Odalar{" + "odano=" + Odano + ", yataksayisi=" + yataksayisi + ", blok=" + blok + ", ucret=" + null + '}';
    }

    

}
