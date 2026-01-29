/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemsppsekolah;

/**
 *
 * @author Windows
 */
public abstract class Orang {
    protected String id;
    protected String nama;
    protected Status status;

    public Orang(String id, String nama, Status status) {
        this.id = id;
        this.nama = nama;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public abstract void tampilInfo(); // abstract method
}

