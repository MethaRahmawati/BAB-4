/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal5;
import javax.swing.*;
/**
 *
 * @author USER
 */
public class Soal5 {

    public static void main(String[] args) {
        String angka = JOptionPane.showInputDialog("Masukkan Angka Yang Anda Inginkan : ");
        int n = Integer.parseInt(angka);
        
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
            System.out.print("*");
            }
            System.out.println();
        }
    }
}
