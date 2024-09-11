/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perhitungan;

/**
 *
 * @author USER
 */
public class Perhitungan {

    public static void main(String[] args) {
        int angka1 = 4;
        int exponent1 = 2;
        int angka2= 5;
        int exponent2 = 1;
        
        int hasilPangkat1 = 1;
        for (int i = 1; i <= exponent1; i++) {
            hasilPangkat1 *= angka1;
        }
        
        int hasilPangkat2 = 1;
        for (int i = 1; i <= exponent2; i++) {
            hasilPangkat2 *= angka2;
        }
        
        int hasilPenjumlahan = hasilPangkat1 + hasilPangkat2;
        
        int hasilBagi = hasilPenjumlahan / angka2;
        
        int hasilPangkat3 = 1;
        for (int i = 1; i <= exponent1; i++) {
            hasilPangkat3 *= angka1;
        }
        
        int hasilAkhir = hasilBagi + hasilPangkat3;
        
        System.out.println("Hasil dari (4^2 + 5^1) / 5 + 4^2 adalah: " + hasilAkhir);
    }
}
