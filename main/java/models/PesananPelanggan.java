/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author dheaa
 */
public class PesananPelanggan {
    private final String namaPelanggan;
    private final String modelPakaian;
    private final String bahanPakaian;
    private final String ukuranPakaian;
    private String status;  // Belum diproses, Dalam proses, Selesai

    public PesananPelanggan(String namaPelanggan, String modelPakaian, String bahanPakaian, String ukuranPakaian) {
        this.namaPelanggan = namaPelanggan;
        this.modelPakaian = modelPakaian;
        this.bahanPakaian = bahanPakaian;
        this.ukuranPakaian = ukuranPakaian;
        this.status = "Belum diproses";  // Default status
    }

    public void tampilkanPesanan() {
        System.out.println("Nama: " + namaPelanggan);
        System.out.println("Model Pakaian: " + modelPakaian);
        System.out.println("Bahan: " + bahanPakaian);
        System.out.println("Ukuran: " + ukuranPakaian);
        System.out.println("Status: " + status);
        System.out.println();
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}