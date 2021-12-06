/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmakananresto;


public class Biodata {
    protected String nama,noTelp;
    
    public Biodata(String nama,String noTelp){
        this.nama = nama;
        this.noTelp = noTelp;
        
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNoTelp(){
        return noTelp;
    }
    
    public void setNoTelp(String noTelp){
        this.noTelp = noTelp;
    }
    
}

