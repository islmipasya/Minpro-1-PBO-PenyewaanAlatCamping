package com.mycompany.minpro;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<AlatKemping> daftarAlat = new ArrayList<>();
        ArrayList<Penyewa> daftarPenyewa = new ArrayList<>();
        ArrayList<Sewa> daftarSewa = new ArrayList<>();

        int pilihan;

        do {

            System.out.println("\n=== SISTEM PENYEWAAN ALAT CAMPING ===");
            System.out.println("1. Kelola Alat Kemping");
            System.out.println("2. Kelola Penyewa");
            System.out.println("3. Kelola Sewa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                // =========================================================
                // MENU ALAT KEMPING
                // =========================================================
                case 1:

                    int pilihanAlat;

                    do {

                        System.out.println("\n=== MANAJEMEN ALAT KEMPING ===");
                        System.out.println("1. Tambah Alat");
                        System.out.println("2. Lihat Daftar Alat");
                        System.out.println("3. Ubah Alat");
                        System.out.println("4. Hapus Alat");
                        System.out.println("0. Kembali");
                        System.out.print("Pilih menu: ");

                        pilihanAlat = input.nextInt();
                        input.nextLine();

                        switch (pilihanAlat) {

                            // =================================================
                            // CREATE
                            // =================================================
                            case 1:

                                System.out.print("Nama alat: ");
                                String namaAlat = input.nextLine();

                                System.out.print("Harga sewa per hari: ");
                                double hargaSewa = input.nextDouble();

                                System.out.print("Stok: ");
                                int stok = input.nextInt();
                                input.nextLine();

                                AlatKemping alat = new AlatKemping( namaAlat, 
                                                hargaSewa,
                                                stok
                                );

                                daftarAlat.add(alat);

                                System.out.println("Alat berhasil ditambahkan!");

                                break;

                            // =================================================
                            // READ
                            // =================================================
                            case 2:

                                if (daftarAlat.isEmpty()) {

                                    System.out.println(
                                            "Belum ada alat camping."
                                    );

                                } else {

                                    System.out.println(
                                            "\n=== DAFTAR ALAT KEMPING ==="
                                    );

                                    for (int i = 0; i < daftarAlat.size(); i++) {

                                        AlatKemping a = daftarAlat.get(i);

                                        System.out.println(
                                                (i + 1)
                                                + ". "
                                                + a.namaAlat
                                                + " | Harga: Rp "
                                                + a.hargaSewa
                                                + " | Stok: "
                                                + a.stok
                                        );
                                    }
                                }

                                break;

                            // =================================================
                            // UPDATE
                            // =================================================
                            case 3:

                                if (daftarAlat.isEmpty()) {

                                    System.out.println(
                                            "Belum ada alat yang dapat diubah."
                                    );

                                } else {

                                    System.out.println("\n=== DAFTAR ALAT ===");

                                    for (int i = 0; i < daftarAlat.size(); i++) {

                                        System.out.println(
                                                (i + 1)
                                                + ". "
                                                + daftarAlat.get(i).namaAlat
                                        );
                                    }

                                    System.out.print(
                                            "Pilih nomor alat yang ingin diubah: "
                                    );

                                    int nomorAlat = input.nextInt();
                                    input.nextLine();

                                    if (nomorAlat >= 1
                                            && nomorAlat <= daftarAlat.size()) {

                                        AlatKemping a =
                                                daftarAlat.get(nomorAlat - 1);

                                        System.out.print("Nama alat baru: ");
                                        a.namaAlat = input.nextLine();

                                        System.out.print("Harga sewa baru: ");
                                        a.hargaSewa = input.nextDouble();

                                        System.out.print("Stok baru: ");
                                        a.stok = input.nextInt();
                                        input.nextLine();

                                        System.out.println(
                                                "Alat berhasil diubah!"
                                        );

                                    } else {

                                        System.out.println(
                                                "Nomor alat tidak tersedia."
                                        );
                                    }
                                }

                                break;

                            // =================================================
                            // DELETE
                            // =================================================
                            case 4:

                                if (daftarAlat.isEmpty()) {

                                    System.out.println(
                                            "Belum ada alat yang dapat dihapus."
                                    );

                                } else {

                                    System.out.println("\n=== DAFTAR ALAT ===");

                                    for (int i = 0; i < daftarAlat.size(); i++) {

                                        System.out.println(
                                                (i + 1)
                                                + ". "
                                                + daftarAlat.get(i).namaAlat
                                        );
                                    }

                                    System.out.print(
                                            "Pilih nomor alat yang ingin dihapus: "
                                    );

                                    int nomorAlat = input.nextInt();
                                    input.nextLine();

                                    if (nomorAlat >= 1
                                            && nomorAlat <= daftarAlat.size()) {

                                        daftarAlat.remove(nomorAlat - 1);

                                        System.out.println(
                                                "Alat berhasil dihapus!"
                                        );

                                    } else {

                                        System.out.println(
                                                "Nomor alat tidak tersedia."
                                        );
                                    }
                                }

                                break;

                            case 0:

                                System.out.println("Kembali ke menu utama.");

                                break;

                            default:

                                System.out.println(
                                        "Pilihan tidak tersedia."
                                );
                        }

                    } while (pilihanAlat != 0);

                    break;

                // ================== =======================================
                // MENU PENYEWA
                // =========================================================
                case 2:

                    int pilihanPenyewa;

                    do {

                        System.out.println("\n=== MANAJEMEN PENYEWA ===");
                        System.out.println("1. Tambah Penyewa");
                        System.out.println("2. Lihat Daftar Penyewa");
                        System.out.println("3. Ubah Penyewa");
                        System.out.println("4. Hapus Penyewa");
                        System.out.println("0. Kembali");
                        System.out.print("Pilih menu: ");

                        pilihanPenyewa = input.nextInt();
                        input.nextLine();

                        switch (pilihanPenyewa) {

                            // =================================================
                            // CREATE
                            // =================================================
                            case 1:

                                System.out.print("Nama penyewa: ");
                                String nama = input.nextLine();

                                System.out.print("No. telepon: ");
                                int noTelepon = input.nextInt();
                                input.nextLine();

                                System.out.print("Alamat: ");
                                String alamat = input.nextLine();

                                Penyewa penyewa = new Penyewa(
                                        nama,
                                        noTelepon,
                                        alamat
                                );

                                daftarPenyewa.add(penyewa);

                                System.out.println(
                                        "Penyewa berhasil ditambahkan!"
                                );

                                break;

                            // =================================================
                            // READ
                            // =================================================
                            case 2:

                                if (daftarPenyewa.isEmpty()) {

                                    System.out.println(
                                            "Belum ada penyewa."
                                    );

                                } else {

                                    System.out.println(
                                            "\n=== DAFTAR PENYEWA ==="
                                    );

                                    for (int i = 0;
                                            i < daftarPenyewa.size();
                                            i++) {

                                        Penyewa p =
                                                daftarPenyewa.get(i);

                                        System.out.println(
                                                (i + 1)
                                                + ". "
                                                + p.nama
                                                + " | No. Telepon: "
                                                + p.noTelepon
                                                + " | Alamat: "
                                                + p.alamat
                                        );
                                    }
                                }

                                break;

                            // =================================================
                            // UPDATE
                            // =================================================
                            case 3:

                                if (daftarPenyewa.isEmpty()) {

                                    System.out.println(
                                            "Belum ada penyewa yang dapat diubah."
                                    );

                                } else {

                                    for (int i = 0;
                                            i < daftarPenyewa.size();
                                            i++) {

                                        System.out.println(
                                                (i + 1)
                                                + ". "
                                                + daftarPenyewa.get(i).nama
                                        );
                                    }

                                    System.out.print(
                                            "Pilih nomor penyewa yang ingin diubah: "
                                    );

                                    int nomorPenyewa = input.nextInt();
                                    input.nextLine();

                                    if (nomorPenyewa >= 1
                                            && nomorPenyewa <= daftarPenyewa.size()) {

                                        Penyewa p =
                                                daftarPenyewa.get(
                                                        nomorPenyewa - 1
                                                );

                                        System.out.print("Nama baru: ");
                                        p.nama = input.nextLine();

                                        System.out.print("No. telepon baru: ");
                                        p.noTelepon = input.nextInt();
                                        input.nextLine();

                                        System.out.print("Alamat baru: ");
                                        p.alamat = input.nextLine();

                                        System.out.println(
                                                "Penyewa berhasil diubah!"
                                        );

                                    } else {

                                        System.out.println(
                                                "Nomor penyewa tidak tersedia."
                                        );
                                    }
                                }

                                break;

                            // =================================================
                            // DELETE
                            // =================================================
                            case 4:

                                if (daftarPenyewa.isEmpty()) {

                                    System.out.println(
                                            "Belum ada penyewa yang dapat dihapus."
                                    );

                                } else {

                                    for (int i = 0;
                                            i < daftarPenyewa.size();
                                            i++) {

                                        System.out.println(
                                                (i + 1)
                                                + ". "
                                                + daftarPenyewa.get(i).nama
                                        );
                                    }

                                    System.out.print(
                                            "Pilih nomor penyewa yang ingin dihapus: "
                                    );

                                    int nomorPenyewa = input.nextInt();
                                    input.nextLine();

                                    if (nomorPenyewa >= 1
                                            && nomorPenyewa <= daftarPenyewa.size()) {

                                        daftarPenyewa.remove(
                                                nomorPenyewa - 1
                                        );

                                        System.out.println(
                                                "Penyewa berhasil dihapus!"
                                        );

                                    } else {

                                        System.out.println(
                                                "Nomor penyewa tidak tersedia."
                                        );
                                    }
                                }

                                break;

                            case 0:

                                System.out.println("Kembali ke menu utama.");

                                break;

                            default:

                                System.out.println(
                                        "Pilihan tidak tersedia."
                                );
                        }

                    } while (pilihanPenyewa != 0);

                    break;

                // =========================================================
                // MENU PENYEWAAN
                // =========================================================
                    case 3:

                        int pilihanSewa;

                do {

                    System.out.println("\n=== MANAJEMEN SEWA ===");
                    System.out.println("1. Tambah Sewa");
                    System.out.println("2. Lihat Daftar Sewa");
                    System.out.println("3. Ubah Sewa");
                    System.out.println("4. Hapus Sewa");
                    System.out.println("0. Kembali");
                    System.out.print("Pilih menu: ");

                    pilihanSewa = input.nextInt();
                    input.nextLine();

                    switch (pilihanSewa) {

                        // =================================================
                        // CREATE
                        // =================================================
                        case 1:

                            System.out.print("Nama penyewa: ");
                            String namaPenyewa = input.nextLine();

                            System.out.print("Nama alat: ");
                            String namaAlatSewa = input.nextLine();

                            System.out.print("Tanggal sewa: ");
                            String tanggalSewa = input.nextLine();

                            System.out.print("Lama sewa (hari): ");
                            int lamaSewa = input.nextInt();
                            input.nextLine();

                            System.out.print("Total harga: Rp ");
                            double totalHarga = input.nextDouble();
                            input.nextLine();

                            Sewa sewa = new Sewa(
                                    namaPenyewa,
                                    namaAlatSewa,
                                    tanggalSewa,
                                    lamaSewa,
                                    totalHarga
                            );

                            daftarSewa.add(sewa);

                            System.out.println(
                                    "Sewa berhasil ditambahkan!"
                            );

                            break;

                        // =================================================
                        // READ
                        // =================================================
                        case 2:

                            if (daftarSewa.isEmpty()) {

                                System.out.println(
                                        "Belum ada data Sewa."
                                );

                            } else {

                                System.out.println(
                                        "\n=== DAFTAR SEWA ==="
                                );

                                for (int i = 0;
                                        i < daftarSewa.size();
                                        i++) {

                                    Sewa p = daftarSewa.get(i);

                                    System.out.println(
                                            (i + 1)
                                            + ". Penyewa: "
                                            + p.namaPenyewa
                                            + " | Alat: "
                                            + p.namaAlat
                                            + " | Tanggal: "
                                            + p.tanggalSewa
                                            + " | Lama: "
                                            + p.lamaSewa
                                            + " hari"
                                            + " | Total: Rp "
                                            + p.totalHarga
                                    );
                                }
                            }

                            break;

                        // =================================================
                        // UPDATE
                        // =================================================
                        case 3:

                            if (daftarSewa.isEmpty()) {

                                System.out.println(
                                        "Belum ada sewa yang dapat diubah."
                                );

                            } else {

                                for (int i = 0;
                                        i < daftarSewa.size();
                                        i++) {

                                    System.out.println(
                                            (i + 1)
                                            + ". "
                                            + daftarSewa.get(i).namaPenyewa
                                            + " - "
                                            + daftarSewa.get(i).namaAlat
                                    );
                                }

                                System.out.print(
                                        "Pilih nomor sewa yang ingin diubah: "
                                );

                                int nomorSewa = input.nextInt();
                                input.nextLine();

                                if (nomorSewa >= 1
                                        && nomorSewa <= daftarSewa.size()) {

                                    Sewa p =
                                            daftarSewa.get(
                                                    nomorSewa - 1
                                            );

                                    System.out.print("Nama penyewa baru: ");
                                    p.namaPenyewa = input.nextLine();

                                    System.out.print("Nama alat baru: ");
                                    p.namaAlat = input.nextLine();

                                    System.out.print("Tanggal sewa baru: ");
                                    p.tanggalSewa = input.nextLine();

                                    System.out.print("Lama sewa baru: ");
                                    p.lamaSewa = input.nextInt();
                                    input.nextLine();

                                    System.out.print("Total harga baru: Rp ");
                                    p.totalHarga = input.nextDouble();
                                    input.nextLine();

                                    System.out.println(
                                            "Sewa berhasil diubah!"
                                    );

                                } else {

                                    System.out.println(
                                            "Nomor sewa tidak tersedia."
                                    );
                                }
                            }

                            break;

                        // =================================================
                        // DELETE
                        // =================================================
                        case 4:

                            if (daftarSewa.isEmpty()) {

                                System.out.println(
                                        "Belum ada sewa yang dapat dihapus."
                                );

                            } else {

                                for (int i = 0;
                                        i < daftarSewa.size();
                                        i++) {

                                    System.out.println(
                                            (i + 1)
                                            + ". "
                                            + daftarSewa.get(i).namaPenyewa
                                            + " - "
                                            + daftarSewa.get(i).namaAlat
                                    );
                                }

                                System.out.print(
                                        "Pilih nomor sewa yang ingin dihapus: "
                                );

                                int nomorSewa = input.nextInt();
                                input.nextLine();

                                if (nomorSewa >= 1
                                        && nomorSewa <= daftarSewa.size()) {

                                    daftarSewa.remove(
                                            nomorSewa - 1
                                    );

                                    System.out.println(
                                            "Sewa berhasil dihapus!"
                                    );

                                } else {

                                    System.out.println(
                                            "Nomor sewa tidak tersedia."
                                    );
                                }
                            }

                            break;

                        case 0:

                            System.out.println(
                                    "Kembali ke menu utama."
                            );

                            break;

                        default:

                            System.out.println(
                                    "Pilihan tidak tersedia."
                            );
                    }

                } while (pilihanSewa != 0);

                break;

                // =========================================================
                // EXIT
                // =========================================================
                case 0:

                    System.out.println(
                            "Program selesai. Terima kasih!"
                    );

                    break;

                default:

                    System.out.println(
                            "Pilihan tidak tersedia."
                    );
            }

        } while (pilihan != 0);

        input.close();
    }
}
