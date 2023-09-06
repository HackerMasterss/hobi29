/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hobi290;

/**
 *
 * @author acer
 */
public class Main29 {
    public static void main(String[] args) {
        hobi29 hobi1 = new hobi29();
        hobi1.setJenisHobi("Bermain musik");

        // Menggunakan getter untuk mengambil nilai jenisHobi
        String hobiPertama = hobi1.getJenisHobi();
        System.out.println("Hobi pertama: " + hobiPertama);

        hobi29 hobi2 = new hobi29();
        hobi2.setJenisHobi("Membaca buku");

        // Menggunakan getter untuk mengambil nilai jenisHobi
        String hobiKedua = hobi2.getJenisHobi();
        System.out.println("Hobi kedua: " + hobiKedua);
        
        hobi29 hobi3 = new hobi29();
        hobi3.setJenisHobi("Bermain Game");

        // Menggunakan getter untuk mengambil nilai jenisHobi
        String hobiKetiga = hobi3.getJenisHobi();
        System.out.println("Hobi ketiga: " + hobiKetiga);
        
    }
}


  
  
    