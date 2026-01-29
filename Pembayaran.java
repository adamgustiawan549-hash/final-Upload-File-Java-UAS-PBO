/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemsppsekolah;

/**
 *
 * @author Windows
 */
public class Pembayaran implements Transaksi {
    private Siswa siswa;
    private Double jumlahBayar;
    private Bulan bulan;

    public Pembayaran(Siswa siswa, Double jumlahBayar, Bulan bulan) {
        this.siswa = siswa;
        this.jumlahBayar = jumlahBayar;
        this.bulan = bulan;
        siswa.tambahBayar(jumlahBayar);
    }

    @Override
    public void simpanData() {
        String data = siswa.getId() + "," + bulan + "," + jumlahBayar;
        FileManager.simpan(data);
    }

    @Override
    public void tampilkanData() {
        System.out.println("Pembayaran Bulan: " + bulan +
                " | Jumlah: " + jumlahBayar);
    }
}

