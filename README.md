# Panduan Penggunaan Application Cashier Java Netbeans

Proyek ini memerlukan langkah-langkah tertentu agar dapat dijalankan dengan benar. Berikut adalah langkah-langkah yang perlu Anda ikuti:

## Langkah 1: Unduh Database

Unduh file database dari https://github.com/lebefriedlich/Application-Cashier/blob/main/kasir.sql dan simpan di lokasi yang mudah diakses pada komputer Anda.

## Langkah 2: Impor Database

Gunakan manajer database favorit Anda (seperti MySQL Workbench atau phpMyAdmin) untuk mengimpor database yang telah diunduh. Ikuti langkah-langkah berikut:

1. Buka manajer database.
2. Buat database baru (jika belum ada).
3. Pilih opsi impor dan pilih file database yang diunduh.
4. Klik "OK" untuk mengimpor struktur dan data ke database Anda.

## Langkah 3: Konfigurasi Koneksi Database

Buka berkas `koneksi.java` pada proyek ini dan ubah bagian berikut:

Perhatikan pada baris 18: String url = "jdbc:mysql://localhost/kasir"; rubah nama **kasir** menjadi nama database yang kalian impor tadi

## Kontribusi
Kontribusi selalu dipersilakan! Jika Anda ingin meningkatkan proyek ini, silakan buka *issue* untuk mendiskusikan perubahan yang ingin Anda usulkan atau kirimkan *pull request*.

## Lisensi
Proyek ini dilisensikan di bawah Lisensi MIT. Silakan lihat [LICENSE](LICENSE) untuk detail lebih lanjut.


