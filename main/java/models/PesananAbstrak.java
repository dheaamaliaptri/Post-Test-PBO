/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author dheaa
 */
public abstract class PesananAbstrak {
    protected final String namaPelanggan;
    protected final String modelPakaian;
    protected final String bahanPakaian;
    protected final String ukuranPakaian;
    protected String status;  // Belum diproses, Dalam proses, Selesai

    // Constructor
    public PesananAbstrak(String namaPelanggan, String modelPakaian, String bahanPakaian, String ukuranPakaian) {
        this.namaPelanggan = namaPelanggan;
        this.modelPakaian = modelPakaian;
        this.bahanPakaian = bahanPakaian;
        this.ukuranPakaian = ukuranPakaian;
        this.status = "Belum diproses";
    }

    // Abstract method
    public abstract void tampilkanPesanan();
}