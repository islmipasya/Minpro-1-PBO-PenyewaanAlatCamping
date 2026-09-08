package com.mycompany.minpro;

public class Sewa {

    String namaPenyewa;
    String namaAlat;
    String tanggalSewa;
    int lamaSewa;
    double totalHarga;

    public Sewa(String namaPenyewa, String namaAlat, String tanggalSewa, int lamaSewa,double totalHarga) {
        this.namaPenyewa = namaPenyewa;
        this.namaAlat = namaAlat;
        this.tanggalSewa = tanggalSewa;
        this.lamaSewa = lamaSewa;
        this.totalHarga = totalHarga;
    }
}
