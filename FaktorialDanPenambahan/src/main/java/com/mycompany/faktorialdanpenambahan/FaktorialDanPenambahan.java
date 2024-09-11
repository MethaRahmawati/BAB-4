/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.faktorialdanpenambahan;

/**
 *
 * @author USER
 */
public class FaktorialDanPenambahan {

    public static void main(String[] args) {
       int n1 = 5;
       int n2 = 4;
       
       int faktorialN1 = 1;
       for (int i = 1; i <= n1; i++) {
           faktorialN1 *= i;
       }
       
       int faktorialN2 = 1;
       for (int i = 1; i <= n2; i++) {
           faktorialN2 *= i;
       }
       
       int hasil = faktorialN1 + faktorialN2;
       
       System.out.println("Hasil dari 5! + 4! adalah: " + hasil);
    }
}
