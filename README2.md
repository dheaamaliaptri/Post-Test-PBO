# Post Test 2
# Nama: Dhea Amalia Putri
# NIM: 2309116037
# Kelas: Sistem Informasi A'23

Customize Clothing Design (Artful Weave)
Artful Weave merupakan sebuah aplikasi sederhana yang berfungsi untuk mendata pesanan pelanggan terkait kustomisasi pakaian yang nantinya dari setiap pesanan akan berisi nama pelanggan, model pakaian, bahan pakaian, dan ukuran pakaian. Program ini mengimplementasikan fungsi CRUD (Create, Read, Update, Delete) untuk menangani pesanan pakaian, fungsi ini memungkinkan pengguna untuk menambah pesanan, menampilkan pesanan, memperbarui status pesanan, menghapus pesanan yang telah selesai, dan menampilkan jumlah pesanan yang telah selesai.

Program ini dibagi ke dalam dua package utama:

customization: Berisi class yang mengatur logika dan interaksi program, seperti menu dan manajemen pesanan.
models: Berisi class yang merepresentasikan data atau model pesanan pelanggan.
Package dan Kelas
Package models Package ini berisi class PesananPelanggan yang digunakan untuk menyimpan informasi tentang pesanan pelanggan.
Class PesananPelanggan Attributes: namaPelanggan, modelPakaian, bahanPakaian, ukuranPakaian, status.
Constructor Terdapat 4 parameter: namaPelanggan, modelPakaian, bahanPakaian, ukuranPakaian. Saat sebuah objek PesananPelanggan dibuat, status pesanan secara default diatur ke "Belum diproses".
Methods
tampilkanPesanan(): Menampilkan informasi pesanan pelanggan, termasuk nama, model pakaian, bahan, ukuran, dan status.
getNamaPelanggan(): Mengembalikan nama pelanggan.
getStatus(): Mengembalikan status pesanan.
setStatus(String status): Mengubah status pesanan (Sedang diproses atau Selesai)
Package customization Package ini berisi logika utama dari program, seperti interaksi pengguna dan manajemen pesanan.
Class Main Ini adalah entry point dari program yang menampilkan pesan selamat datang dan menjalankan menu utama serta menerima input dari pengguna untuk mengelola pesanan.
Methods
main(): Merupakan method utama yang menampilkan menu pilihan CRUD untuk pesanan pakaian.
isNumeric(String str): Method utility untuk memeriksa apakah input dari pengguna berupa angka atau tidak. Method ini digunakan untuk validasi input menu.
Class ManajemenPesanan Kelas ini mengelola daftar pesanan pelanggan dengan menggunakan ArrayList untuk menyimpan objek PesananPelanggan. Setiap pesanan yang masuk akan dikelola melalui class ini.
Properties
daftarPesanan: Arraylist yang menyimpan semua pesanan yang dibuat pelanggan.
pesananSelesai: Variabel static yang menyimpan jumlah pesanan yang telah diselesaikan. Pengunaan static di sini memungkinan jumlah pesanan selesai dihitung di seluruh program.
Constructor Constructor default yang secara otomatis menginisialisasi daftarPesanan sebagai ArrayList.
Methods
tambahPesanan(PesananPelanggan pesanan): Menambahkan pesanan baru ke dalam daftarPesanan:
tampilkanSemuaPesanan(): Menampilkan semua pesanan yang ada di daftarPesanan, menggunakan perulangan for-each untuk menampilkan setiap pesanan.
updateStatusPesanan(String namaPelanggan, String statusBaru): Mengubah status pesanan berdasarkan nama pelanggan. Jika status berubah menjadi "Selesai" maka akan dihitung di pesananSelesai.
hapusPesananSelesai(): Method static yang menampilkan jumlah pesanan yang sudah selesai, menggunakan variabel pesananSelesai.
