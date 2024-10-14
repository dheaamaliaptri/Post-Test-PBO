/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author dheaa
 */
public class PesananPelangganOffline extends PesananPelanggan {
    private String lokasiPengambilan;

    // Constructor untuk subclass
    public PesananPelangganOffline(String namaPelanggan, String modelPakaian, String bahanPakaian, String ukuranPakaian, String lokasiPengambilan) {
        super(namaPelanggan, modelPakaian, bahanPakaian, ukuranPakaian); // Memanggil constructor superclass
        this.lokasiPengambilan = lokasiPengambilan; // Properti tambahan untuk subclass
    }

    // Method yang meng-override method tampilkanPesanan dari superclass
    @Override
    public void tampilkanPesanan() {
        super.tampilkanPesanan(); // Memanggil method dari superclass
        System.out.println("Lokasi Pengambilan: " + lokasiPengambilan); // Menambahkan informasi baru
    }

    // Getter dan setter untuk lokasiPengambilan
    public String getLokasiPengambilan() {
        return lokasiPengambilan;
    }

    public void setLokasiPengambilan(String lokasiPengambilan) {
        this.lokasiPengambilan = lokasiPengambilan;
    }
}