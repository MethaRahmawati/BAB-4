/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal6b;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class Soal6b {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Masukkan angka (n):");
        int n = Integer.parseInt(input);

        // Menampilkan pola bintang
        for (int i = n; i >= 1; i--) {
            // Mencetak bintang sesuai dengan nilai i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            for (int k = 0; k < n; k++) {
            System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // Pindah ke baris baru setelah selesai mencetak satu baris penuh
            System.out.println();
        }
    }
}
