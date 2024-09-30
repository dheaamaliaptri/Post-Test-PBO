# Post Test 1 PBO
# Nama: Dhea Amalia Putri
# NIM: 2309116037
# Kelas: Sistem Informasi A'23

# Customize Clothing Design (Artful Weave)
Artful Weave merupakan sebuah aplikasi sederhana yang berfungsi untuk mendata pesanan pelanggan terkait kustomisasi pakaian yang nantinya dari setiap pesanan akan berisi nama pelanggan, model pakaian, bahan pakaian, dan ukuran pakaian. Program ini mengimplementasikan fungsi CRUD (Create, Read, Update, Delete) untuk menangani pesanan pakaian, fungsi ini memungkinkan pengguna untuk menambah pesanan, menampilkan pesanan, memperbarui status pesanan, menghapus pesanan yang telah selesai, dan menampilkan jumlah pesanan yang telah selesai.

Program ini dibagi ke dalam dua package utama:
1. customization: Berisi class yang mengatur logika dan interaksi program, seperti menu dan manajemen pesanan.
2. models: Berisi class yang merepresentasikan data atau model pesanan pelanggan.

# Package dan Kelas
1. Package models
   Package ini berisi class PesananPelanggan yang digunakan untuk menyimpan     informasi tentang pesanan pelanggan.
   - Class PesananPelanggan
     Attributes: namaPelanggan, modelPakaian, bahanPakaian, ukuranPakaian,        status.
   - Constructor
     Terdapat 4 parameter: namaPelanggan, modelPakaian, bahanPakaian,             ukuranPakaian. Saat sebuah objek PesananPelanggan dibuat, status             pesanan secara default diatur ke "Belum diproses".
   - Methods
     1. tampilkanPesanan(): Menampilkan informasi pesanan pelanggan,                 termasuk nama, model pakaian, bahan, ukuran, dan status.
     2. getNamaPelanggan(): Mengembalikan nama pelanggan.
     3. getStatus(): Mengembalikan status pesanan.
     4. setStatus(String status): Mengubah status pesanan (Sedang diproses           atau Selesai)
2. Package customization
   Package ini berisi logika utama dari program, seperti interaksi pengguna     dan manajemen pesanan.
   - Class Main
     Ini adalah entry point dari program yang menampilkan pesan selamat           datang dan menjalankan menu utama serta menerima input dari pengguna         untuk mengelola pesanan.
   - Methods:
     1. main(): Merupakan method utama yang menampilkan menu pilihan CRUD            untuk pesanan pakaian.
     2. isNumeric(String str): Method utility untuk memeriksa apakah input           dari pengguna berupa angka atau tidak. Method ini digunakan untuk            validasi input menu.


