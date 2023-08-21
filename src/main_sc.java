/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author HP
 */
abstract class setterGetter {

    private String stokBarang, namaBarang, hargaSatuan, jumlahBarang;
    private static String hargaTotal, waktuPembelian, diskon, hasilKurangDiskon, totalKeseluruhan, nominal, kembalian;

    public static String getHasilKurangDiskon() {
        return hasilKurangDiskon;
    }

    public static void setHasilKurangDiskon(String hasilKurangDiskon) {
        setterGetter.hasilKurangDiskon = hasilKurangDiskon;
    }

    public static String getDiskon() {
        return diskon;
    }

    public static void setDiskon(String diskon) {
        setterGetter.diskon = diskon;
    }

    public static String getTotalKeseluruhan() {
        return totalKeseluruhan;
    }

    public static void setTotalKeseluruhan(String totalKeseluruhan) {
        setterGetter.totalKeseluruhan = totalKeseluruhan;
    }

    public static String getNominal() {
        return nominal;
    }

    public static void setNominal(String nominal) {
        setterGetter.nominal = nominal;
    }

    public static String getKembalian() {
        return kembalian;
    }

    public static void setKembalian(String kembalian) {
        setterGetter.kembalian = kembalian;
    }

    public static String getWaktuPembelian() {
        return waktuPembelian;
    }

    public static void setWaktuPembelian(String waktuPembelian) {
        setterGetter.waktuPembelian = waktuPembelian;
    }
    
    public String getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(String jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public static String getHargaTotal() {
        return hargaTotal;
    }

    public static void setHargaTotal(String hargaTotal) {
        setterGetter.hargaTotal = hargaTotal;
    }

    public void setStokBarang(String stokBarang) {
        this.stokBarang = stokBarang;
    }

    public String getStokBarang() {
        return stokBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setHargaSatuan(String hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public String getHargaSatuan() {
        return hargaSatuan;
    }

}

interface Interface {

    public ResultSet tampilDataBarang();
    
    public ResultSet tampilAktifitasTransaksi(String hariIni);

    public String aktifitasTransaksiHariIni(String tglHariIni);

    public String cekKodeBarang(String kodeBarang);

    public String settingStok(String kodeBarang, String jumlahyangDibeli);

    public String returBarang(String kodeBarang, String jumlahRetur);

    public String updateBarang(String kodeBarang, String namaBarang, String Stok, String hargaSatuan);

    public String barangBaru(String kodeBarang, String namaBarang, String Stok, String hargaSatuan);

    public String catatAktifitas(String kodeBarang, String namaBarang, String jumlahBarang, String hargaSatuan, int hargaTotal, String diskon, int totalSetelahDiskon, String Keterangan);

    public ResultSet cetakStruk(String waktu_pembelian);
}

public class main_sc extends setterGetter implements Interface {

    private Connection koneksi;
    private PreparedStatement psmt;
    private Statement stat;
    private ResultSet hasil;
    private String query, pesan;

    public main_sc() {
        try {
            koneksi connection = new koneksi();
            koneksi = connection.getKoneksi();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public ResultSet tampilDataBarang() {
        query = "SELECT kode_barang, nama_barang, stok_barang, harga_satuan from data_Barang";
        try {
            stat = koneksi.createStatement();
            hasil = stat.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return hasil;
    }

    @Override
    public ResultSet tampilAktifitasTransaksi(String hariIni) {
        query = "select * from aktifitas" + hariIni;
        try {
            stat = koneksi.createStatement();
            hasil = stat.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return hasil;
    }
    
    @Override
    public String cekKodeBarang(String kodeBarang) {
        try {
            query = "SELECT nama_barang, stok_barang, harga_satuan from data_Barang WHERE kode_barang=?";
            psmt = koneksi.prepareStatement(query);
            psmt.setString(1, kodeBarang);
            hasil = psmt.executeQuery();
            if (hasil.next()) {
                setNamaBarang(hasil.getString("nama_barang"));
                setStokBarang(hasil.getString("stok_barang"));
                setHargaSatuan(hasil.getString("harga_satuan"));
            } else {
                pesan = "Kode Barang Tidak Terdaftar";
            }
        } catch (SQLException e) {
            pesan = "Gagal Login, Query Error " + e;
        }
        return pesan;
    }

    @Override
    public String aktifitasTransaksiHariIni(String tglHariIni) {
        String result = "Data Berhasil Disimpan";
        query = " CREATE TABLE aktifitas" + tglHariIni + " (waktu_pembelian TIME,kode_barang VARCHAR(7), nama_barang VARCHAR(50), jumlah_barang INT(5), harga_satuan INT(10), harga_total INT(10), diskon INT(3), totalSetelahDiskon INT(10), keterangan VARCHAR(50))";
        try {
            stat = koneksi.createStatement();
            stat.execute(query);
        } catch (SQLException exc) {
            result = "Aktifitas Registrasi Gagal Disimpan" + exc;
        }
        return result;
    }

    @Override
    public String settingStok(String kodeBarang, String jumlahyangDibeli) {
        String result = "Data Berhasil Diubah";
        query = "UPDATE data_barang SET stok_barang = stok_barang-? WHERE kode_barang=?";
        try {
            psmt = koneksi.prepareStatement(query);
            psmt.setString(1, jumlahyangDibeli);
            psmt.setString(2, kodeBarang);
            psmt.executeUpdate();
            psmt.close();
        } catch (SQLException e) {
            result = "Data Gagal Diubah" + e;
        }
        return result;
    }

    @Override
    public String returBarang(String kodeBarang, String jumlahRetur) {
        String result = "Data Berhasil Diubah";
        query = "UPDATE data_barang SET stok_barang = stok_barang+? WHERE kode_barang=?";
        try {
            psmt = koneksi.prepareStatement(query);
            psmt.setString(1, jumlahRetur);
            psmt.setString(2, kodeBarang);
            psmt.executeUpdate();
            psmt.close();
            LocalDate date = LocalDate.now();
            DateTimeFormatter formatTgl = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String formatKalender = date.format(formatTgl);
            String hariIni = formatKalender.replace("-", "");
            query = "delete from aktifitas" + hariIni + " where waktu_pembelian=?";
            try {
                psmt = koneksi.prepareStatement(query);
                psmt.setString(1, getWaktuPembelian());
                psmt.executeUpdate();
                psmt.close();
            } catch (SQLException e) {
                System.out.println("Error : " + e.getMessage());
            }
        } catch (SQLException e) {
            result = "Data Gagal Diubah" + e;
        }
        return result;
    }

    @Override
    public String updateBarang(String kodeBarang, String namaBarang, String Stok, String hargaSatuan) {
        String result = "Data Berhasil Diubah";
        query = "UPDATE data_barang SET nama_barang=?, stok_barang = stok_barang+?, harga_satuan=? WHERE kode_barang=?";
        try {
            psmt = koneksi.prepareStatement(query);
            psmt.setString(1, namaBarang);
            psmt.setString(2, Stok);
            psmt.setString(3, hargaSatuan);
            psmt.setString(4, kodeBarang);
            psmt.executeUpdate();
            psmt.close();
        } catch (SQLException e) {
            result = "Data Gagal Diubah" + e;
        }
        return result;
    }

    @Override
    public String barangBaru(String kodeBarang, String namaBarang, String Stok, String hargaSatuan) {
        String result = "Data Barang Berhasil Disimpan";
        query = "INSERT INTO data_barang(kode_barang, nama_barang, stok_barang, harga_satuan) VALUES (?,?,?,?)";
        try {
            psmt = koneksi.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            psmt.setString(1, kodeBarang);
            psmt.setString(2, namaBarang);
            psmt.setString(3, Stok);
            psmt.setString(4, hargaSatuan);
            psmt.executeUpdate();
            psmt.close();
        } catch (SQLException e) {
            result = "Data Gagal Disimpan" + e;
        }
        return result;
    }

    public String hapusBarang(String kodeBarang) {
        String result = "Data Berhasil Dihapus";
        query = "delete from data_barang where kode_barang=?";
        try {
            psmt = koneksi.prepareStatement(query);
            psmt.setString(1, kodeBarang);
            psmt.executeUpdate();
            psmt.close();
        } catch (SQLException e) {
            result = "Data Gagal Dihapus" + e;
        }
        return result;
    }

    @Override
    public String catatAktifitas(String kodeBarang, String namaBarang, String jumlahBarang, String hargaSatuan, int hargaTotal, String diskon, int totalSetelahDiskon, String Keterangan) {
        String result = "Data Barang Berhasil Dicatat";
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatTgl = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatKalender = date.format(formatTgl);
        String hariIni = formatKalender.replace("-", "");

        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatJamMenitDetik = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formatJam = currentTime.format(formatJamMenitDetik);

        query = "INSERT INTO aktifitas" + hariIni + "(waktu_pembelian, kode_barang, nama_barang, jumlah_barang, harga_satuan, harga_total, diskon , totalSetelahDiskon , keterangan) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            psmt = koneksi.prepareStatement(query);
            psmt.setString(1, formatJam);
            psmt.setString(2, kodeBarang);
            psmt.setString(3, namaBarang);
            psmt.setString(4, jumlahBarang);
            psmt.setString(5, hargaSatuan);
            psmt.setInt(6, hargaTotal);
            psmt.setString(7, diskon);
            psmt.setInt(8, totalSetelahDiskon);
            psmt.setString(9, Keterangan);
            psmt.executeUpdate();
            psmt.close();
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
        return result;
    }

    @Override
    public ResultSet cetakStruk(String waktu_pembelian) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatTgl = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatKalender = date.format(formatTgl);
        String hariIni = formatKalender.replace("-", "");
        query = "SELECT nama_barang, jumlah_barang, harga_satuan, harga_total from aktifitas" + hariIni + " WHERE waktu_pembelian=?";
        try {    
            psmt = koneksi.prepareStatement(query);
            psmt.setString(1, waktu_pembelian);
            hasil = psmt.executeQuery();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return hasil;
    }
}
