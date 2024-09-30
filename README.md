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
   Package ini berisi class PesananPelanggan yang digunakan untuk menyimpan informasi tentang pesanan pelanggan.
   - Class PesananPelanggan
     Attributes: namaPelanggan, modelPakaian, bahanPakaian, ukuranPakaian, status.
   - Constructor
     Terdapat 4 parameter: namaPelanggan, modelPakaian, bahanPakaian, ukuranPakaian. Saat sebuah objek PesananPelanggan dibuat, status pesanan secara default diatur ke            "Belum diproses".
   - Methods
     1. tampilkanPesanan(): Menampilkan informasi pesanan pelanggan, termasuk nama, model pakaian, bahan, ukuran, dan status.
     2. getNamaPelanggan(): Mengembalikan nama pelanggan.
     3. getStatus(): Mengembalikan status pesanan.
     4. setStatus(String status): Mengubah status pesanan (Sedang diproses atau Selesai)
2. Package customization
   Package ini berisi logika utama dari program, seperti interaksi pengguna dan manajemen pesanan.
   - Class Main
     Ini adalah entry point dari program yang menampilkan pesan selamat datang dan menjalankan menu utama serta menerima input dari pengguna untuk mengelola pesanan.
   - Methods
     1. main(): Merupakan method utama yang menampilkan menu pilihan CRUD untuk pesanan pakaian.
     2. isNumeric(String str): Method utility untuk memeriksa apakah input dari pengguna berupa angka atau tidak. Method ini digunakan untuk validasi input menu.
   - Class ManajemenPesanan
     Kelas ini mengelola daftar pesanan pelanggan dengan menggunakan ArrayList untuk menyimpan objek PesananPelanggan. Setiap pesanan yang masuk akan dikelola melalui class       ini.
   - Properties
     1. daftarPesanan: Arraylist yang menyimpan semua pesanan yang dibuat pelanggan.
     2. pesananSelesai: Variabel static yang menyimpan jumlah pesanan yang telah diselesaikan. Pengunaan static di sini memungkinan jumlah pesanan selesai dihitung di                seluruh program.
   - Constructor
     Constructor default yang  secara otomatis menginisialisasi daftarPesanan sebagai ArrayList.
   - Methods
     1. tambahPesanan(PesananPelanggan pesanan): Menambahkan pesanan baru ke dalam daftarPesanan:
     2. tampilkanSemuaPesanan(): Menampilkan semua pesanan yang ada di daftarPesanan, menggunakan perulangan for-each untuk menampilkan setiap pesanan.
     3. updateStatusPesanan(String namaPelanggan, String statusBaru): Mengubah status pesanan berdasarkan nama pelanggan. Jika status berubah menjadi "Selesai" maka akan             dihitung di pesananSelesai.
     4. hapusPesananSelesai(): Method static yang menampilkan jumlah pesanan yang sudah selesai, menggunakan variabel pesananSelesai.
     
# Dokumentasi Program
1. Menu Utama
   
   ![image](https://github.com/user-attachments/assets/83ca27e1-3d1d-4323-a196-f0ccdb1d9ef0)

   Program dimulai dengan menampilkan menu utama yang berisi pesan selamat datang dan menampilkan menu pilihan CRUD dan juga menu keluar. Jika pengguna tidak menginput          apapun atau inputan kosong, maka program akan memberi peringatan untuk memasukkan inputan yang benar dan program akan looping ke menu CRUD.
2. Menambahkan Pesanan
   
   ![image](https://github.com/user-attachments/assets/368f8e9b-db03-4416-a358-6ae871197f8f)

   Jika pengguna memilih pilihan 1, program akan meminta pengguna menginput nama pelanggan, model pakaian, bahan pakaian, dan ukuran pakaian. Setelah itu, objek                 PesananPelanggan dibuat dan ditambahkan ke daftarPesanan melalui method tambahPesanan di class ManajemenPesanan.
3. Menampilkan Pesanan
   
   ![image](https://github.com/user-attachments/assets/8d9cf827-2e9b-4eba-b313-5c70fbca5302)

   Pada pilihan 2 ini, program akan menjalankan tampilkanSemuaPesanan() untuk menampilkan semua pesanan yang ada di daftarPesanan dengan menggunakan perulangan for-each.        Setiap pesanan baru yang diinput, program akan secara default mengatur statusnya menjadi "Belum diproses".
4. Memperbarui Status Pesanan
   
   ![image](https://github.com/user-attachments/assets/ddc4b850-2d28-4cf2-a0fd-88e9c87bdb26)

   Pengguna bisa memperbarui status pesanan dari "Belum diproses" ke "Sedang diproses atau "Selesai". Status diubah menggunakan method                                           updateStatusPesanan().
5. Menghapus Pesanan
    
   ![image](https://github.com/user-attachments/assets/ea405c56-9fd3-4ba0-b2c2-713d293cf5c1)
   
   ![image](https://github.com/user-attachments/assets/87351bfc-e52b-4c34-9f3c-2d966f420d4a)

   Program diatur untuk melakukan penghapusan secara otomatis terhadap semua pesanan yang memiliki status "Selesai" menggunakan method hapusPesananSelesai(). Jika pesanan       sudah "Selesai" dan dihapus dari program, maka jika pengguna mengakses pilihan 2, pesanan akan kosong.        Karena menu         Tampilkan Semua Pesanan hanya membaca       pesanan yang memiliki status "Belum diproses" atau "Sedang diproses".
6. Tampilkan Total Pesanan Selesai
    
   ![image](https://github.com/user-attachments/assets/1f408616-f9be-460b-9fc2-d2e7904f4285)

   Program akan membaca dan menghitung setiap pesanan yang sudah selesai melalui method tampilkanPesananSelesai() yang merupakan method static.
7. Keluar dari Program

   ![image](https://github.com/user-attachments/assets/2d408dcf-4065-4c65-bc82-41326112978b)
   
   Pengguna dapat memilih opsi untuk keluar dari program yang akan menampilkan pesan penutup dan menghentikan jalannya program.
   
