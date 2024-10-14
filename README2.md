# Post Test 2
# Nama: Dhea Amalia Putri
# NIM: 2309116037
# Kelas: Sistem Informasi A'23

# Customize Clothing Design (Artful Weave)
Artful Weave merupakan sebuah aplikasi sederhana yang berfungsi untuk mendata pesanan pelanggan terkait kustomisasi pakaian yang nantinya dari setiap pesanan akan berisi nama pelanggan, model pakaian, bahan pakaian, dan ukuran pakaian. Program ini mengimplementasikan fungsi CRUD (Create, Read, Update, Delete) untuk menangani pesanan pakaian, fungsi ini memungkinkan pengguna untuk menambah pesanan, menampilkan pesanan, memperbarui status pesanan, menghapus pesanan yang telah selesai, dan menampilkan jumlah pesanan yang telah selesai.

Aplikasi sederhana ini adalah sistem manajemen pesanan berbasis objek, dengan konsep-konsep dasar OOP (Object-Oriented Programming) seperti inheritance, encapsulation, abstraction, interface, dan penggunaan final serta static. Program ini juga memanfaatkan ArrayList dan perulangan for-each untuk menangani pesanan-pesanan pelanggan. Berikut adalah rincian cara kerja program:

1. Package dan Struktur Kelas
   Program ini dibagi menjadi dua package:
   - customization: Di dalam package ini terdapat ManajemenPesanan, Main, dan interface CRUD_Pesanan.
   - models: Package ini berisi class-class yang merepresentasikan pesanan pelanggan, seperti PesananPelanggan, 
     PesananPelangganOffline, PesananPelangganOnline, dan class abstrak PesananAbstrak.
2.  Inheritance (Pewarisan)
    - PesananPelangganOffline dan PesananPelangganOnline adalah subclass dari PesananPelanggan.
    Class-class ini memanfaatkan inheritance untuk memperluas fungsionalitas dari class induk (PesananPelanggan).

3. Encapsulation (Enkapsulasi)
   Setiap class menggunakan getter dan setter untuk mengelola properti mereka, menjaga agar properti tidak bisa diakses 
   secara langsung. Misalnya, properti status di PesananPelanggan hanya bisa diubah melalui method setStatus().

4. Abstraction dan Interface
   - Interface CRUD_Pesanan mengatur operasi CRUD (Create, Read, Update, Delete) yang diterapkan pada class 
   ManajemenPesanan. Method-method seperti tambahPesanan, tampilkanSemuaPesanan, updateStatusPesanan, dan 
   hapusPesananSelesai adalah implementasi dari interface ini.
   - Abstraksi juga diterapkan melalui PesananAbstrak, yang merupakan class abstrak yang digunakan untuk menyimpan properti 
   dan method umum dari semua pesanan. Class ini mengandung method tampilkanPesanan() yang diimplementasikan oleh subclass 
   (PesananPelanggan dan turunannya).

5. Final dan Static Keyword
   - final digunakan pada method tambahPesanan di class ManajemenPesanan untuk mencegah override oleh subclass di masa depan.
   - static digunakan pada properti pesananSelesai dan method tampilkanPesananSelesai di ManajemenPesanan. Ini memungkinkan 
   jumlah pesanan yang selesai dicatat secara global tanpa terikat pada instance tertentu dari class tersebut.

6. ArrayList dan Perulangan
   - ArrayList<PesananPelanggan> digunakan untuk menyimpan daftar pesanan pelanggan.
   - For-each loop digunakan di method tampilkanSemuaPesanan() untuk menampilkan semua pesanan yang ada dalam daftar.

8. Percabangan dan Logika di Main
   Program utama (Main) menggunakan Scanner untuk menerima input dari pengguna dan percabangan if-else untuk menavigasi menu.

   - Menu: Program menawarkan beberapa pilihan kepada pengguna, seperti menambah pesanan, menampilkan semua pesanan, 
   memperbarui status pesanan, menghapus pesanan yang selesai, dan keluar dari program.
     • Penambahan Pesanan: Menggunakan method tambahPesanan() untuk menambahkan pesanan baru ke dalam daftar.
     • Menampilkan Semua Pesanan: Menggunakan method tampilkanSemuaPesanan() untuk menampilkan daftar pesanan pelanggan.
     • Update Status Pesanan: Menggunakan method updateStatusPesanan() untuk memperbarui status pesanan berdasarkan nama 
     pelanggan.
     • Hapus Pesanan Selesai: Menggunakan hapusPesananSelesai() untuk menghapus pesanan yang statusnya "Selesai" dari daftar.
     • Tampilkan Total Pesanan Selesai: Menggunakan tampilkanPesananSelesai() untuk menampilkan jumlah pesanan yang telah 
     selesai.

9. Metode Tambahan isNumeric()
   Metode ini digunakan untuk memeriksa apakah input yang dimasukkan oleh pengguna adalah angka yang valid, mencegah 
   kesalahan input pada pemilihan menu.

10. Cara Kerja Program
    - Program dimulai dengan menampilkan menu kepada pengguna.
    
    ![Screenshot 2024-09-30 125225](https://github.com/user-attachments/assets/35987123-c370-4027-8080-59b56b413208)

    Program dimulai dengan menampilkan menu utama yang berisi pesan selamat datang dan menampilkan menu pilihan CRUD dan        juga menu keluar. Jika pengguna tidak menginput apapun atau inputan kosong, maka program akan memberi peringatan untuk      memasukkan inputan yang benar dan program akan looping ke menu CRUD. Pada menu utama ini, pengguna dapat memilih 
    salah satu opsi dari menu tersebut.
    
    - Berdasarkan pilihan pengguna:
      • Jika pengguna memilih Tambah Pesanan, program akan meminta pengguna menginput nama pelanggan, model pakaian, bahan 
      pakaian, dan ukuran pakaian. Setelah itu, objek PesananPelanggan dibuat dan ditambahkan ke daftarPesanan melalui 
      method tambahPesanan di class ManajemenPesanan.
      
      ![image](https://github.com/user-attachments/assets/f8668c99-8573-47f6-a663-cb024b7b27ac)

      • Jika pengguna memilih Tampilkan Semua Pesanan, program akan menampilkan semua pesanan yang ada di daftarPesanan. 
      Method tampilkanSemuaPesanan di class ManajemenPesanan akan memanggil method tampilkanPesanan pada setiap objek 
      PesananPelanggan, baik itu objek dari class PesananPelanggan, PesananPelangganOffline, atau PesananPelangganOnline. 
      Informasi seperti nama pelanggan, model pakaian, bahan pakaian, ukuran pakaian, status pesanan, serta properti 
      tambahan (misalnya metode pembayaran atau lokasi pengambilan) akan ditampilkan.
      
      ![image](https://github.com/user-attachments/assets/4a3f20a9-cd42-4906-ab57-6732e28fa99e)

      ![image](https://github.com/user-attachments/assets/5f7565b4-5da4-4475-a5df-ed41a89c30fe)

      • Jika pengguna memilih Update Status Pesanan, program akan meminta nama pelanggan yang pesananannya akan diupdate. 
      Setelah itu, pengguna dapat memilih status baru pesanan, yaitu "Sedang diproses" atau "Selesai". Program akan mencari 
      pesanan berdasarkan nama pelanggan dan memperbarui statusnya menggunakan method updateStatusPesanan di class 
      ManajemenPesanan. Jika status diubah menjadi "Selesai", properti pesananSelesai yang bersifat static akan diincrement.

      ![image](https://github.com/user-attachments/assets/d3af5590-bb36-49d4-9b21-1d990421066e)

      • Jika pengguna memilih Hapus Pesanan Selesai, program akan menghapus semua pesanan yang statusnya "Selesai" dari 
      daftarPesanan. Method hapusPesananSelesai di class ManajemenPesanan akan menghapus pesanan-pesanan tersebut dengan 
      menggunakan removeIf. Pesan konfirmasi akan ditampilkan setelah pesanan selesai dihapus.

      ![image](https://github.com/user-attachments/assets/8bc38248-f310-4d1f-9ae7-c8a86d032375)

      • Jika pengguna memilih Tampilkan Total Pesanan Selesai, program akan menampilkan jumlah pesanan yang telah selesai. 
      Method tampilkanPesananSelesai yang bersifat static di class ManajemenPesanan akan menampilkan nilai dari properti 
      pesananSelesai, yang telah mencatat total pesanan yang berstatus "Selesai".

      ![image](https://github.com/user-attachments/assets/b49a697e-e8a5-4539-b6c0-959ac4b493bc)

      • Program berjalan dalam loop sampai pengguna memilih untuk keluar dengan memilih opsi "Keluar".
      Jika pengguna memilih Keluar, program akan menampilkan pesan ucapan terima kasih dan menghentikan eksekusi. Program 
      akan keluar dari loop utama dan berakhir.

      ![image](https://github.com/user-attachments/assets/515baa1a-241e-40eb-b5d8-26701539e94c)

      
