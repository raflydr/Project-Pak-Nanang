/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmakananresto;
import java.util.Date;
import java.util.Scanner;

public class ProgramMakananResto {
private static Scanner input = new Scanner(System.in);
private static PelangganResto[] pelanggan = new PelangganResto[20];

private static PesananTedaftar[] terdaftar = new PesananTedaftar[20];
private static int pilMenu;
private static int jumPelanggan = 0;

    
    public static void main(String[] args) {
        
       int pil;
        
        do{
            System.out.println("Jumlah Pesanan : " +jumPesanan);
            System.out.println("1. Daftarkan Pesanan");
            System.out.println("2. Lihat Pesanan Terdaftar");
            System.out.println("3. Ubah Data Pesanan");
            System.out.println("4. Hapus Pesanan");
            System.out.println("0. Log out");
            
            System.out.print("Pilih : ");
            pil = input.nextInt();
            input.nextLine();
            switch(pil){
                case 1:
                    insertPesanan();
                    break;
                case 2:
                    updatePesanan();
                    break;
                case 3:
                    viewPesanan();
                    break;
                case 4:
                    deletePesanan();
                    break;
            }
        }while (pil !=0);
    }
    
    
}
