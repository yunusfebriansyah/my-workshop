/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yunus Febriansyah
 */
public class Transaksi {
    
    // attibutes
    private final String namaPemesan;
    private final int jumlahPesanan;
    private final Menu menuPesanan;
    
    // constructor
    public Transaksi( String namaPemesan, int jumlahPesanan, Menu jenisPesanan )
    {
        this.namaPemesan = namaPemesan;
        this.jumlahPesanan = jumlahPesanan;
        this.menuPesanan = jenisPesanan;
    }
    
    // method cetakTransaksi
    public void cetakTransaksi()
    {
        System.out.println("\n=== TRANSAKSI ANGKRINGAN DIGITAL ==="
        + "\nNama Pemesan : " + this.namaPemesan
        + "\nJumlah Pesanan : " + this.jumlahPesanan);
        
        this.menuPesanan.cetakInfoMenu();
        
        System.out.println("--- Total Harga : Rp."
        + (this.menuPesanan.getHarga() * this.jumlahPesanan ) );
        
    }
    
}
