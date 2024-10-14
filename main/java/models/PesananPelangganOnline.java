/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author dheaa
 */
public class PesananPelangganOnline extends PesananPelanggan {
    private String metodePembayaran;

    // Constructor untuk PesananPelangganOnline
    public PesananPelangganOnline(String namaPelanggan, String modelPakaian, String bahanPakaian, String ukuranPakaian, String metodePembayaran) {
        super(namaPelanggan, modelPakaian, bahanPakaian, ukuranPakaian);  // Memanggil constructor superclass
        this.metodePembayaran = metodePembayaran;  // Properti tambahan untuk online order
    }

    // Implementasi method abstract dari class Pesanan
    @Override
    public void tampilkanPesanan() {
        super.tampilkanPesanan();  // Menampilkan pesanan umum
        System.out.println("Metode Pembayaran: " + metodePembayaran);
        System.out.println();
    }

    // Getter dan setter untuk metodePembayaran
    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }
}