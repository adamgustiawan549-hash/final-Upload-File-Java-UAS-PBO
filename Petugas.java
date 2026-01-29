/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemsppsekolah;

/**
 *
 * @author Windows
 */
public class Petugas extends Orang {

    public Petugas(String id, String nama, Status status) {
        super(id, nama, status);
    }

    @Override
    public void tampilInfo() {
        System.out.println("Petugas ID: " + id + " | Nama: " + nama);
    }
}

