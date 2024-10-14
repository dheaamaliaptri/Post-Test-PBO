/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customization;

import models.PesananPelanggan;
import java.util.ArrayList;

/**
 *
 * @author dheaa
 */
public class ManajemenPesanan implements CRUD_Pesanan { 
    private final ArrayList<PesananPelanggan> daftarPesanan = new ArrayList<>();
    private static int pesananSelesai = 0;

    // Method yang tidak boleh di-override
    @Override
    public final void tambahPesanan(PesananPelanggan pesanan) {
        daftarPesanan.add(pesanan);
        System.out.println("Pesanan berhasil ditambahkan!\n");
    }

    @Override
    public void tampilkanSemuaPesanan() {
        if (daftarPesanan.isEmpty()) {
            System.out.println("Belum ada pesanan yang terdaftar.");
        } else {
            System.out.println("Daftar Semua Pesanan:");
            for (PesananPelanggan pesanan : daftarPesanan) {
                pesanan.tampilkanPesanan();
            }
        }
    }

    @Override
    public void updateStatusPesanan(String namaPelanggan, String statusBaru) {
        for (PesananPelanggan pesanan : daftarPesanan) {
            if (pesanan.getNamaPelanggan().equalsIgnoreCase(namaPelanggan)) {
                if (statusBaru.equals("Sedang diproses") || statusBaru.equals("Selesai")) {
                    pesanan.setStatus(statusBaru);
                    System.out.println("Status pesanan atas nama " + namaPelanggan + " telah diupdate menjadi: " + statusBaru);

                    if (statusBaru.equals("Selesai")) {
                        pesananSelesai++;
                    }
                    return;
                }
            }
        }
        System.out.println("Pesanan atas nama " + namaPelanggan + " tidak ditemukan.\n");
    }

    @Override
    public void hapusPesananSelesai() {
        daftarPesanan.removeIf(pesanan -> pesanan.getStatus().equals("Selesai"));
        System.out.println("Semua pesanan yang selesai telah dihapus.\n");
    }

    // Static method untuk menampilkan jumlah pesanan yang selesai
    public static void tampilkanPesananSelesai() {
        System.out.println("Total pesanan yang selesai: " + pesananSelesai);
    }
}