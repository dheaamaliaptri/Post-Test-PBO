/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author dheaa
 */
package customization;

import models.PesananPelanggan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("+-----| Artful Weave |-----+");
        System.out.println("|   Welcome to Our Place   |");
        System.out.println("|    Customize Your Own    |");
        System.out.println("+__________________________+");
        
        ManajemenPesanan manajemen = new ManajemenPesanan();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("+--------| Customization Clothing Design |--------+");
            System.out.println("|  [1] Tambah Pesanan                             |");
            System.out.println("|  [2] Tampilkan Semua Pesanan                    |");
            System.out.println("|  [3] Update Status Pesanan                      |");
            System.out.println("|  [4] Hapus Pesanan Selesai                      |");
            System.out.println("|  [5] Tampilkan Total Pesanan Selesai            |");
            System.out.println("|  [6] Keluar                                     |");
            System.out.println("+-------------------------------------------------+");
            System.out.print("Pilih menu: ");

            String input = scanner.nextLine();

            if (isNumeric(input)) {
                int pilihan = Integer.parseInt(input);

                if (pilihan == 1) {
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan model pakaian: ");
                    String model = scanner.nextLine();
                    System.out.print("Masukkan bahan pakaian: ");
                    String bahan = scanner.nextLine();
                    System.out.print("Masukkan ukuran pakaian (S, M, L, XL): ");
                    String ukuran = scanner.nextLine();

                    PesananPelanggan pesanan = new PesananPelanggan(nama, model, bahan, ukuran);
                    manajemen.tambahPesanan(pesanan);

                } else if (pilihan == 2) {
                    manajemen.tampilkanSemuaPesanan();

                } else if (pilihan == 3) {
                    System.out.print("Masukkan nama pelanggan yang akan diperbarui: ");
                    String namaPelanggan = scanner.nextLine();
                    System.out.println("Pilih status baru: ");
                    System.out.println("1. Sedang Diproses");
                    System.out.println("2. Pesanan Selesai");
                    System.out.print("Pilih status: ");
                    String statusInput = scanner.nextLine();
                    String statusBaru = statusInput.equals("1") ? "Sedang diproses" : "Selesai";
                    
                    manajemen.updateStatusPesanan(namaPelanggan, statusBaru);

                } else if (pilihan == 4) {
                    manajemen.hapusPesananSelesai();

                } else if (pilihan == 5) {
                    ManajemenPesanan.tampilkanPesananSelesai();

                } else if (pilihan == 6) {
                    System.out.println("| Thank you for coming to our place, hope you like it! |");
                    break;

                } else {
                    System.out.println("Harap masukkan angka yang benar.");
                }
            } else {
                System.out.println("Harap masukkan angka yang benar.");
            }
        }
    }

    // Method untuk mengecek apakah input string berupa angka
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
