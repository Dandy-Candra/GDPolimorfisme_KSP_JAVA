

package polimorfisme_gabungan_ksp;

import java.util.ArrayList;

/*
NPM : 200710670
NAMA : Dandy Candra Oktaviano
*/


public class Reguler extends Warnet implements ITotalBiaya, IPembayaran {
    private int biayaReguler;
    private String pembayaranReguler;

    // ==== Overloading ==== {
    public Reguler(int biayaReguler, String pembayaranReguler, String namaPemesan, int lamaSewa) {
        super(namaPemesan, lamaSewa);
        this.biayaReguler = biayaReguler;
        this.pembayaranReguler = pembayaranReguler;
    }

    public Reguler(int biayaReguler, String pembayaranReguler, String namaPemesan, int lamaSewa, ArrayList<String> menuTambahan) {
        super(namaPemesan, lamaSewa, menuTambahan);
        this.biayaReguler = biayaReguler;
        this.pembayaranReguler = pembayaranReguler;
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
        return super.lamaSewa * biayaReguler + 5000;
    }
    
    //Override from IPembayaran
    @Override
    public void Pembayaran() {
        System.out.println("Pembayaran untuk warnet paket reguler adalah menggunakan " + pembayaranReguler);
        
    }
    
    

}
