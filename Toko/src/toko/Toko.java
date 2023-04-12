/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package toko;

import controller.koneksi;
import view.*;
/**
 *
 * @author aplikasi
 */
public class Toko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new FormBarang().setVisible(true);
        koneksi konek = new koneksi();
        konek.connection();
        
        
    }
    
}
