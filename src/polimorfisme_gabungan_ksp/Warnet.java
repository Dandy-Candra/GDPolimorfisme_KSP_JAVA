

package polimorfisme_gabungan_ksp;

import java.util.ArrayList;

/*
NPM : 200710670
NAMA : Dandy Candra Oktaviano
*/


public abstract class Warnet {
    protected String namaPemesan;
    protected int lamaSewa;
    protected ArrayList<String> menuTambahan;
    
    // ==== Overloading ==== {
    public Warnet(String namaPemesan, int lamaSewa) {
        this.namaPemesan = namaPemesan;
        this.lamaSewa = lamaSewa;
    }

    public Warnet(String namaPemesan, int lamaSewa, ArrayList<String> menuTambahan) {
        this.namaPemesan = namaPemesan;
        this.lamaSewa = lamaSewa;
        this.menuTambahan = menuTambahan;
    }
    // ==== Overloading ==== }
    
    // Method yang tidak perlu dioverride
    public void showMenuTambahan(){
       
        //Melakukan iterasi dan menampilan value tersebut lalu ditampilkan
        System.out.print("Menu Tambahan : ");
        for(String i : menuTambahan){
            System.out.print(i + ", ");
        }
        
    }
    
    // Method yang akan dioverride
    public abstract void showData();

}
