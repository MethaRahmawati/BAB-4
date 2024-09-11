/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perhitunganpangkat;

/**
 *
 * @author USER
 */
public class PerhitunganPangkat {

    public static void main(String[] args) {
        
        int angka1 = 4;
        int exponent1 = 3;
        int angka2 = 5;
        int exponent2 = 2;
        
        int pangkat4 = 1;
        for (int i = 0; i < exponent1; i++) {
            pangkat4 *= angka1;
    }
        int pangkat5 = 1;
        for (int i = 0; i < exponent2; i++) {
            pangkat5 *= angka2;
    }
        int hasil = pangkat4 + pangkat5;
        
        System.out.println("4 pangkat 3 + 5 pangkat 2 = " + hasil);
    }
}
