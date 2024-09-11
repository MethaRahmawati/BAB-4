/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bilanganganjilgenapconsole;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class BilanganGanjilGenapConsole {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka : ");
        int n = myInput.nextInt();
        
        int jumlahGanjil = 0;
        int jumlahGenap = 0;
        int countGanjil = 0;
        int countGenap = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            int angka = myInput.nextInt();
            
            if (angka % 2 == 0) {
                System.out.println(angka + " adalah bilangan genap.");
                jumlahGenap += angka;
                countGenap++;
            } else {
                System.out.println(angka + " adalah bilanganganjil.");
                jumlahGanjil += angka;
                countGanjil++;
            }
        }
        
        System.out.println("Total bilangan genap: " + countGenap);
        System.out.println("Jumlah nilai bilangan genap: " + jumlahGenap);
        System.out.println("Total bilangan ganjil: " + countGanjil);
        System.out.println("Jumlah nilai bilangan genap: " + jumlahGanjil);
    }
}
