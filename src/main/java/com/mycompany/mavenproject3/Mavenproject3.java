/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Mavenproject3 {
    
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String name = scanner.nextLine();
        System.out.println("Selamat datang, " + name + "!");
             
        // Meminta pengguna untuk memasukkan dua angka
        System.out.print("Masukkan angka pertama: ");
        double num1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double num2 = scanner.nextDouble();


        // Menampilkan hasil
        Mavenproject3 calculator = new Mavenproject3();
        System.out.println("Hasil penjumlahan: " + calculator.add(num1, num2));
        System.out.println("Hasil pengurangan: " + calculator.subtract(num1, num2));
        System.out.println("Hasil perkalian: " + calculator.multiply(num1, num2));
        System.out.println("Hasil pembagian: " + calculator.divide(num1, num2));
        
        scanner.close();
    }
}
