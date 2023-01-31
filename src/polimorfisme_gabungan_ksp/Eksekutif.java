

package polimorfisme_gabungan_ksp;

import java.util.ArrayList;

/*
NPM : 200710670
NAMA : Dandy Candra Oktaviano
*/


public class Eksekutif extends Warnet implements ITotalBiaya, IPembayaran {
    private int biayaEksekutif;
    private String pembayaranEksekutif;
    
    // ==== Overloading ==== {
    public Eksekutif(int biayaEksekutif, String pembayaranEksekutif, String namaPemesan, int lamaSewa) {
        super(namaPemesan, lamaSewa);
        this.biayaEksekutif = biayaEksekutif;
        this.pembayaranEksekutif = pembayaranEksekutif;
    }

    public Eksekutif(int biayaEksekutif, String pembayaranEksekutif, String namaPemesan, int lamaSewa, ArrayList<String> menuTambahan) {
        super(namaPemesan, lamaSewa, menuTambahan);
        this.biayaEksekutif = biayaEksekutif;
        this.pembayaranEksekutif = pembayaranEksekutif;
    }
    // ==== Overloading ==== }
    
  
    //Override from Warnet
    @Override
    public void showData() {
        System.out.println("Nama Pemesan : " + super.namaPemesan);
        System.out.println("Total Biaya : " + this.totalBiaya());
        this.Pembayaran();
      
    }
    
    //Override from ITotalBiaya
    @Override
    public double totalBiaya() {
        return super.lamaSewa * biayaEksekutif + 8000;
    }
    
    //Override from IPembayaran
    @Override
    public void Pembayaran() {
        System.out.println("Pembayaran untuk warnet paket eksekutif adalah menggunakan " + pembayaranEksekutif);
        
    }
}
