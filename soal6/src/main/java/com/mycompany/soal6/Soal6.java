/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal6;
/**
 *
 * @author USER
 */
import javax.swing.JOptionPane;

public class Soal6 {

    public static void main(String[] args) {
        // Mengambil input dari pengguna
        String input = JOptionPane.showInputDialog("Masukkan angka (n):");
        int n = Integer.parseInt(input);

        // Menampilkan pola bintang
        for (int i = 1; i <= n; i++) {
            // Bagian kiri: mencetak bintang bertambah
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // Pindah ke baris baru
            System.out.print(" ");
            
            // Bagian kanan: mencetak bintang berkurang
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            
            // Pindah ke baris baru setelah selesai mencetak satu baris penuh
            System.out.println();
        }
    }
}