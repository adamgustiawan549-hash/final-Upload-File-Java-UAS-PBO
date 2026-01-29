/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemsppsekolah;

/**
 *
 * @author Windows
 */
import java.io.*;

public class FileManager {

    public static void simpan(String data) {
        try {
            FileWriter fw = new FileWriter("dataSPP.txt", true);
            fw.write(data + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Gagal menyimpan data!");
        }
    }

    public static void baca() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("dataSPP.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("File belum tersedia.");
        }
    }
}

