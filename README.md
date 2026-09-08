# Sistem Penyewaan Alat Camping

## Deskripsi Singkat Program

Sistem Penyewaan Alat Camping merupakan program berbasis Java yang digunakan untuk mengelola data alat camping, penyewa, dan sewa. Program ini memiliki fitur untuk menambah, menampilkan, mengubah, dan menghapus data alat camping, penyewa, serta data sewa.

## <b>2. Penjelasan Alur Program</b>

Ketika program dijalankan, sistem akan menampilkan <b>Menu Utama</b> yang terdiri dari menu Alat Kemping, Penyewa, Sewa, dan Keluar.

Pengguna dapat memilih menu dengan memasukkan angka sesuai dengan pilihan yang tersedia.

### <b>A. Menu Alat Kemping</b>

Menu Alat Kemping digunakan untuk mengelola data alat camping yang tersedia untuk disewa.

Terdapat beberapa pilihan:

1. <b>Tambah Alat</b>  
   Pengguna memasukkan nama alat, jenis alat, harga sewa, dan stok. Data kemudian disimpan ke dalam ArrayList.

2. <b>Lihat Alat</b>  
   Sistem menampilkan seluruh data alat camping yang telah tersimpan.

3. <b>Ubah Alat</b>  
   Pengguna memilih data alat yang ingin diubah, kemudian memasukkan data baru berupa nama alat, jenis alat, harga sewa, dan stok.

4. <b>Hapus Alat</b>  
   Pengguna memilih data alat yang ingin dihapus, kemudian sistem menghapus data tersebut.

5. <b>Kembali</b>  
   Pengguna kembali ke Menu Utama.

### <b>B. Menu Penyewa</b>

Menu Penyewa digunakan untuk mengelola data penyewa yang melakukan penyewaan alat camping.

Terdapat beberapa pilihan:

1. <b>Tambah Penyewa</b>  
   Pengguna memasukkan nama, nomor telepon, dan alamat. Data kemudian disimpan ke dalam ArrayList.

2. <b>Lihat Penyewa</b>  
   Sistem menampilkan seluruh data penyewa yang telah tersimpan.

3. <b>Ubah Penyewa</b>  
   Pengguna memilih data penyewa yang ingin diubah, kemudian memasukkan nama, nomor telepon, dan alamat yang baru.

4. <b>Hapus Penyewa</b>  
   Pengguna memilih data penyewa yang ingin dihapus, kemudian sistem menghapus data tersebut.

5. <b>Kembali</b>  
   Pengguna kembali ke Menu Utama.

### <b>C. Menu Sewa</b>

Menu Sewa digunakan untuk mengelola data transaksi penyewaan alat camping.

Terdapat beberapa pilihan:

1. <b>Tambah Sewa</b>  
   Pengguna memasukkan nama penyewa, nama alat, tanggal sewa, lama sewa, dan total harga. Data kemudian disimpan ke dalam ArrayList.

2. <b>Lihat Sewa</b>  
   Sistem menampilkan seluruh data penyewaan yang telah tersimpan.

3. <b>Ubah Sewa</b>  
   Pengguna memilih data sewa yang ingin diubah, kemudian memasukkan nama penyewa, nama alat, tanggal sewa, lama sewa, dan total harga yang baru.

4. <b>Hapus Sewa</b>  
   Pengguna memilih data sewa yang ingin dihapus, kemudian sistem menghapus data tersebut.

5. <b>Kembali</b>  
   Pengguna kembali ke Menu Utama.

### <b>D. Keluar Program</b>

Jika pengguna memilih menu <b>0. Keluar</b> pada Menu Utama, sistem akan menampilkan pesan <b>"Program selesai. Terima kasih!"</b> dan program akan berhenti.

## <b>3. Dokumentasi Program</b>

### <b>A. Menu Data Alat Kemping</b>

Berikut screenshot tampilan menu Data Alat Kemping yang menyediakan fitur untuk menambah, melihat, mengubah, dan menghapus data alat camping.

Menu Data Alat Kemping

<img width="221" height="102" alt="Screenshot 2026-09-07 182727" src="https://github.com/user-attachments/assets/a3dae8d1-af06-459f-ac23-73f69f2e33b9" />


### <b>B. Menu Data Penyewa</b>

Berikut screenshot tampilan menu Data Penyewa yang digunakan untuk mengelola data penyewa dengan fitur tambah, lihat, ubah, dan hapus.

Menu Data Penyewa

<img width="216" height="85" alt="image" src="https://github.com/user-attachments/assets/8ece6240-65fb-4fbd-86a7-b25b45ae0d95" />

### <b>C. Menu Data Sewa</b>

Screenshot berikut menunjukkan tampilan menu Data Sewa yang digunakan untuk mengelola data transaksi penyewaan alat camping dengan fitur tambah, lihat, ubah, dan hapus.

![Menu Data Sewa]

<img width="227" height="78" alt="image" src="https://github.com/user-attachments/assets/f29da16f-f28d-4ca9-9ea9-976a800ddfb2" />



## <b>3. Implementasi Program</b>

### <b>3.1 Implementasi Menu Alat Kemping</b>

<p>
Menu Alat Kemping digunakan untuk mengelola data alat camping yang tersedia untuk disewa.
Pada menu ini terdapat fitur <b>Tambah Alat</b>, <b>Lihat Alat</b>,
<b>Ubah Alat</b>, dan <b>Hapus Alat</b>.
</p>

<img width="203" height="242" alt="Screenshot 2026-09-07 183903" src="https://github.com/user-attachments/assets/8604dc47-eb63-49ef-b507-890554e9aba8" />

<img width="220" height="286" alt="Screenshot 2026-09-07 184025" src="https://github.com/user-attachments/assets/baf4f29b-6dd3-4782-bca4-23838d8a3e88" />

<img width="211" height="223" alt="Screenshot 2026-09-07 184048" src="https://github.com/user-attachments/assets/afcb5aeb-875b-46c3-8dc6-757e001db3f0" />

<p> Menu Alat Kemping digunakan untuk mengelola data alat camping yang tersedia untuk disewa. Pada menu ini pengguna dapat menambahkan, melihat, mengubah, dan menghapus data alat camping. </p> <p> Pada proses <b>Tambah Alat</b>, pengguna memasukkan nama alat, jenis alat, harga sewa per hari, dan stok alat. Data tersebut kemudian disimpan ke dalam sistem. </p> <p> Pada proses <b>Lihat Daftar Alat</b>, sistem menampilkan seluruh data alat camping yang telah tersimpan, seperti nama alat, harga sewa, dan stok. </p> <p> Pada proses <b>Ubah Alat</b>, pengguna memilih nomor alat yang ingin diubah. Kemudian pengguna memasukkan nama alat, jenis alat, harga sewa, dan stok yang baru. </p> <p> Pada proses <b>Hapus Alat</b>, pengguna memilih nomor alat yang ingin dihapus. Sistem kemudian menghapus data alat tersebut dari daftar. </p> <p align="center">
  
### <b>3.2 Implementasi Menu Penyewa</b>

<p>
Menu Penyewa digunakan untuk mengelola data penyewa.
Pengguna dapat menambahkan, melihat, mengubah, dan menghapus data penyewa
yang tersimpan dalam sistem.
</p>

<img width="256" height="246" alt="Screenshot 2026-09-07 184231" src="https://github.com/user-attachments/assets/284e0374-a61e-4ec5-9970-3440c8b53c13" />

<img width="275" height="268" alt="Screenshot 2026-09-07 184315" src="https://github.com/user-attachments/assets/3eeb77bd-a315-4be2-8f2a-ec149acb46db" />

<img width="223" height="207" alt="Screenshot 2026-09-07 184338" src="https://github.com/user-attachments/assets/52b712de-1506-4ce6-93c5-dc73ca1bdee2" />

<p> Menu Penyewa digunakan untuk mengelola data penyewa yang melakukan penyewaan alat camping. Pada menu ini pengguna dapat menambahkan, melihat, mengubah, dan menghapus data penyewa. </p> <p> Pada proses <b>Tambah Penyewa</b>, pengguna memasukkan nama penyewa, nomor telepon, dan alamat. Data tersebut kemudian disimpan ke dalam sistem. </p> <p> Pada proses <b>Lihat Daftar Penyewa</b>, sistem menampilkan seluruh data penyewa yang telah tersimpan, seperti nama, nomor telepon, dan alamat. </p> <p> Pada proses <b>Ubah Penyewa</b>, pengguna memilih nomor penyewa yang ingin diubah. Kemudian pengguna memasukkan nama, nomor telepon, dan alamat yang baru. </p> <p> Pada proses <b>Hapus Penyewa</b>, pengguna memilih nomor penyewa yang ingin dihapus. Sistem kemudian menghapus data penyewa tersebut dari daftar. </p> <p align="center"> 


### <b>3.3 Implementasi Menu Sewa</b>

<p>
Menu Sewa digunakan untuk mengelola data transaksi penyewaan alat camping.
Pada menu ini pengguna dapat menambahkan, melihat, mengubah, dan menghapus
data penyewaan.
</p>

<img width="402" height="265" alt="Screenshot 2026-09-07 184446" src="https://github.com/user-attachments/assets/0e549a4c-ee18-49e0-b5bd-4efcf80a840f" />

<img width="400" height="283" alt="Screenshot 2026-09-07 184549" src="https://github.com/user-attachments/assets/44d11eb6-a27e-47de-99e6-235f33cb54ec" />

<img width="197" height="208" alt="Screenshot 2026-09-07 184610" src="https://github.com/user-attachments/assets/bf108522-318b-4da1-80c7-777004b17a9d" />

<p> Menu Sewa digunakan untuk mengelola data transaksi penyewaan alat camping. Pada menu ini pengguna dapat menambahkan, melihat, mengubah, dan menghapus data sewa. </p> <p> Pada proses <b>Tambah Sewa</b>, pengguna memasukkan nama penyewa, nama alat, tanggal sewa, lama sewa, dan total harga. Data tersebut kemudian disimpan ke dalam sistem. </p> <p> Pada proses <b>Lihat Daftar Sewa</b>, sistem menampilkan seluruh data transaksi sewa yang telah tersimpan, seperti nama penyewa, nama alat, tanggal sewa, lama sewa, dan total harga. </p> <p> Pada proses <b>Ubah Sewa</b>, pengguna memilih nomor sewa yang ingin diubah. Kemudian pengguna memasukkan data penyewaan yang baru seperti nama penyewa, nama alat, tanggal sewa, lama sewa, dan total harga. </p> <p> Pada proses <b>Hapus Sewa</b>, pengguna memilih nomor sewa yang ingin dihapus. Sistem kemudian menghapus data sewa tersebut dari daftar. </p> <p align="center">

