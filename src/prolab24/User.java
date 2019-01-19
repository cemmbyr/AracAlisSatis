/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab24;

/**
 *
 * @author ABRA
 */
class User {
    private String Sehir,Araba_Marka,Araba_Model,Ilan_Adi,Ilan_Fiyat,Ilan_Km,YakitTuru,VitesTuru,Renk;
    
    User(String Sehir, String Ilan_Adi, String Ilan_Fiyat, String Araba_Marka, String Araba_Model, String Ilan_Km, String Yakit_Turu,String Vites_Turu,String Renk) {
        this.YakitTuru=YakitTuru;
        this.VitesTuru=VitesTuru;
        this.Renk=Renk;
        this.Ilan_Fiyat=Ilan_Fiyat;
        this.Ilan_Km=Ilan_Km;
        this.Sehir=Sehir;
        this.Araba_Marka=Araba_Marka;
        this.Araba_Model=Araba_Model;
        this.Ilan_Adi=Ilan_Adi;
    }
    public String getYakitTuru(){
        return YakitTuru;
    }
    public String getVitesTuru(){
        return VitesTuru;
    }
    public String getRenk(){
        return Renk;
    }
    public String getIlanFiyat(){
        return Ilan_Fiyat;
    }
    public String getIlanKM(){
        return Ilan_Km;
    }
    public String getIlanSehir(){
        return Sehir;
    }
    public String getMarka(){
        return Araba_Marka;
    }
    public String getModel(){
        return Araba_Model;
    }
    public String getIlanAdi(){
        return Ilan_Adi;
    }
}
