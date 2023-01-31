/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfisme_gabungan_ksp;

import java.util.ArrayList;

/**
 *
 * @author VICTUS
 */
public class Polimorfisme_Gabungan_KSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Pembuatan arrayList dengan nama variabel menuTambahan
        ArrayList<String> menuTambahan = new ArrayList<String>();
        
        //Pembuatan user
        Warnet user = null;
        
        //mengisi arrayList 
        menuTambahan.add("Indomie");
        menuTambahan.add("Es Teh");
        
        //Mengassign user dengan kelas Reguler 
        user =  new Reguler (8000, "Cash","John", 3 , menuTambahan);
        
        System.out.println("---- User Reguler ----");
        user.showData();
        user.showMenuTambahan();
        
        
        //Mengassign user dengan kelas Eksekutif
        user = new Eksekutif (10000, "Debit","Doe", 3 );
        System.out.println("\n\n---- User Eksekutif ----");
        user.showData();
        
    }
    
}
