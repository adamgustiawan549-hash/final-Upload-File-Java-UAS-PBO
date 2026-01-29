/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemsppsekolah;

/**
 *
 * @author Windows
 */
public class Siswa extends Orang {
    private String kelas;
    private Double totalBayar;

    public Siswa(String id, String nama, Status status, String kelas) {
        super(id, nama, status);
        this.kelas = kelas;
        this.totalBayar = 0.0;
    }

    public void tambahBayar(Double jumlah) {
        totalBayar += jumlah;
    }

    public Double getTotalBayar() {
        return totalBayar;
    }

    @Override
    public void tampilInfo() {
        System.out.println("ID: " + id +
                " | Nama: " + nama +
                " | Kelas: " + kelas +
                " | Total Bayar: " + totalBayar +
                " | Status: " + status);
    }
}

