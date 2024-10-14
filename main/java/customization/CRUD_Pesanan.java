/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package customization;

/**
 *
 * @author dheaa
 */
import models.PesananPelanggan;

public interface CRUD_Pesanan {
    // Create
    void tambahPesanan(PesananPelanggan pesanan);
    
    // Read
    void tampilkanSemuaPesanan();
    
    // Update
    void updateStatusPesanan(String namaPelanggan, String statusBaru);
    
    // Delete
    void hapusPesananSelesai();
}