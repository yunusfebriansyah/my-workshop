/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yunus Febriansyah
 */
public class Main {
    
    public static void main(String[] args) {
        
        // buat objek kopi dan cemilan
        Kopi kopiHitam = new Kopi("Kopi Hitam", 4000);
        Cemilan pisangGoreng = new Cemilan("Pisang Goreng", 1000);
        
        // buat objek transaksi dari kedua menu
        Transaksi pesananUdin = new Transaksi("Udin", 2, kopiHitam);
        Transaksi pesananMamat = new Transaksi("Mamat", 10, pisangGoreng);
        
        // cetak informasi pesanan
        pesananUdin.cetakTransaksi();
        pesananMamat.cetakTransaksi();
        
    }
    
}
