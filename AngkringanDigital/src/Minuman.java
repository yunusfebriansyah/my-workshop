/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yunus Febriansyah
 */
public abstract class Minuman implements Menu {
    
    // attributes
    private String nama;
    private int harga;
    private final String jenisMenu = "Minuman";
    
    // constructor
    public Minuman( String nama, int harga )
    {
        this.nama = nama;
        this.harga = harga;
    }
    
    // implementasi method dari Interface Menu
    @Override
    public void cetakInfoMenu()
    {
        System.out.println(
        "Jenis Menu : " + this.jenisMenu
        + "\nNama Menu : " + this.nama
        + "\nHarga Menu : Rp." + this.harga
        );
    }
    
    // method setter & getter
    public void setNama( String nama )
    {
        this.nama = nama;
    }
    
    public String getNama()
    {
        return this.nama;
    }
    
    public void setHarga( int harga )
    {
        this.harga = harga;
    }
    
    @Override
    public int getHarga()
    {
        return this.harga;
    }
    
}
