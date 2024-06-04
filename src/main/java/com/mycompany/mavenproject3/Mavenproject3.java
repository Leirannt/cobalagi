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

        // Melakukan operasi aritmatika
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        // Menampilkan hasil
        System.out.println("Hasil penjumlahan: " + sum);
        System.out.println("Hasil pengurangan: " + difference);
        System.out.println("Hasil perkalian: " + product);
        System.out.println("Hasil pembagian: " + quotient);

        scanner.close();
    }
}
