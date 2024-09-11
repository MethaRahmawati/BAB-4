/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bilanganganjilgenapjoptionpane;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class BilanganGanjilGenapJOptionPane {

    public static void main(String[] args) {
        String nInput = JOptionPane.showInputDialog("Masukkan jumlah angka (n):");
        int n = Integer.parseInt(nInput);
        
        int jumlahGanjil = 0;
        int jumlahGenap = 0;
        int countGanjil = 0;
        int countGenap = 0;

        for (int i = 0; i < n; i++) {
            String angkaInput = JOptionPane.showInputDialog("Masukkan angka ke-" + (i + 1) + ":");
            int angka = Integer.parseInt(angkaInput);

            if (angka % 2 == 0) {
                JOptionPane.showMessageDialog(null, angka + " adalah bilangan genap.");
                jumlahGenap += angka;
                countGenap++;
            } else {
                JOptionPane.showMessageDialog(null, angka + " adalah bilangan ganjil.");
                jumlahGanjil += angka;
                countGanjil++;
            }
        }

        String hasil = "Total bilangan genap: " + countGenap + "\n" +
                       "Jumlah nilai bilangan genap: " + jumlahGenap + "\n" +
                       "Total bilangan ganjil: " + countGanjil + "\n" +
                       "Jumlah nilai bilangan ganjil: " + jumlahGanjil;

        JOptionPane.showMessageDialog(null, hasil);
    }
}
