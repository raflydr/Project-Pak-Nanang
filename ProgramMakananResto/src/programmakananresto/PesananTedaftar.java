/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmakananresto;


public class PesananTedaftar {
    
    private PelangganResto pelanggan;
    private int indexMenu;
    private String NoMeja;
    
    public PesananTedaftar(PelangganResto pelanggan, int indexMenu, String NoMeja){
        this.pelanggan = pelanggan;
        this.indexMenu = indexMenu;
        this.NoMeja = NoMeja;
    }
    
    public PelangganResto getPelangganResto(){
        return pelanggan;
    }
    
    public int getIndexMenu(){
        return indexMenu;
    }
    
     public String getNoMeja(){
        return NoMeja;
    }
    
    public void setPelangganResto(PelangganResto pelanggan){
        this.pelanggan = pelanggan;
    }
    
    public void setIndexMenu(int indexMenu){
        this.indexMenu = indexMenu;
    }
    
    public void setNoMeja(String NoMeja){
        this.NoMeja = NoMeja;
    }    
}


