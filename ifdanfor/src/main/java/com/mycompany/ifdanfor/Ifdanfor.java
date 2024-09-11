/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ifdanfor;

/**
 *
 * @author USER
 */
public class Ifdanfor {

    public static void main(String[] args) {
        for (int angka = 1; angka <= 10; angka++) {
            if (angka == 3) {
                continue;
            }
            if (angka == 7) {
                break;
            }
            
            System.out.println(angka);
        }
    }
}
