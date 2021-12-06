/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmakananresto;

public class PelangganResto extends Biodata {
    private String IdPelanggan;
    //private String NoMeja;
    
    public PelangganResto(String nama, String noTelp, String IdPelanggan){
        super(nama, noTelp);
        this.IdPelanggan = IdPelanggan;
        
    }
    
    public String getIdPelanggan(){
        return IdPelanggan;
    }
    public void setIdPelanggan(String IdPelanggan){
        this.IdPelanggan = IdPelanggan;
    }
    
}
