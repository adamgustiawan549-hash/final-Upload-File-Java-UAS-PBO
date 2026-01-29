/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemsppsekolah;

/**
 *
 * @author Windows
 */
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Siswa> daftarSiswa = new ArrayList<>();

    public static void main(String[] args) {
        int pilih;

        do {
            System.out.println("\n=== SISTEM PEMBAYARAN SPP ===");
            System.out.println("1. Tambah Data Siswa");
            System.out.println("2. Tampilkan Data Siswa");
            System.out.println("3. Transaksi Pembayaran");
            System.out.println("4. Cek Status Siswa");
            System.out.println("5. Tampilkan File Transaksi");
            System.out.println("6. Keluar");
            System.out.print("Pilih Menu: ");

            pilih = Integer.parseInt(sc.nextLine()); // Wrapper Class

            switch (pilih) {
                case 1 -> tambahSiswa();
                case 2 -> tampilSiswa();
                case 3 -> transaksiBayar();
                case 4 -> cekStatus();
                case 5 -> FileManager.baca();
            }
        } while (pilih != 6);
    }

    static void tambahSiswa() {
        System.out.print("ID Siswa: ");
        String id = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Kelas: ");
        String kelas = sc.nextLine();

        Siswa s = new Siswa(id, nama, Status.AKTIF, kelas);
        daftarSiswa.add(s);

        System.out.println("Data siswa berhasil ditambahkan!");
    }

    static void tampilSiswa() {
        for (Siswa s : daftarSiswa) {
            s.tampilInfo(); // Polymorphism
        }
    }

    static void transaksiBayar() {
        System.out.print("Masukkan ID Siswa: ");
        String id = sc.nextLine();

        for (Siswa s : daftarSiswa) {
            if (s.getId().equals(id)) {
                System.out.print("Jumlah Bayar: ");
                Double jumlah = Double.valueOf(sc.nextLine());

                Pembayaran p = new Pembayaran(s, jumlah, Bulan.JANUARI);
                p.simpanData();
                System.out.println("Pembayaran berhasil!");
                return;
            }
        }
        System.out.println("Siswa tidak ditemukan!");
    }

    static void cekStatus() {
        System.out.print("Masukkan ID Siswa: ");
        String id = sc.nextLine();

        for (Siswa s : daftarSiswa) {
            if (s.getId().equals(id)) {
                System.out.println("Status: " + s.status);
                return;
            }
        }
        System.out.println("Data tidak ditemukan.");
    }
}
