/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grade5;

/**
 *
 * @author USER
 */
public class Grade5 {

    public static void main(String[] args) {
        String names[] = {"Joko", "Bhekti", "Hendi", "Prasekti"};
        
        // Perulangan Pertama: Berhenti saat menemukan "Bhekti"
        firstLoop:
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Bhekti")) {
                break firstLoop; // Menghentikan perulangan jika menemukan "Bhekti"
            }
            System.out.println(names[i]);
        }
        
        // Perulangan Kedua: Lanjutkan jika menemukan "Bhekti"
        secondLoop:
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Bhekti")) {
                continue secondLoop; // Lewatkan "Bhekti", lanjut ke elemen berikutnya
            }
            System.out.println(names[i]);
        }
    }
}

