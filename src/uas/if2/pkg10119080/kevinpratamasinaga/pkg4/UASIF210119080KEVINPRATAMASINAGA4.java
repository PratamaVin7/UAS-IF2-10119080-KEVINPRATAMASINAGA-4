/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if2.pkg10119080.kevinpratamasinaga.pkg4;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA       : KEVIN PRATAMA SINAGA
 * NIM        : 10119080
 * KELAS      : IF-2
 * TANGGAL    : 20 FEBRUARI 2021
 * NOMOR SOAL : 4
 */
public class UASIF210119080KEVINPRATAMASINAGA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInput = new Scanner(System.in);
        System.out.println("APLIKASI PENDATAAN WISATAWAN");
        System.out.println("============================");
        System.out.print("Nama : ");
        String nama = userInput.nextLine();
        System.out.print("Kewarganegaraan : ");
        String kewarganegaraan = userInput.nextLine();
        System.out.print("Tujuan Wisata : ");
        String tujuan = userInput.nextLine();
        System.out.println();
        System.out.println("HASIL DATA APLIKASI PENDATAAN WISATAWAN");
        System.out.println("=======================================");
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Kewarganegaraan\t\t: " + kewarganegaraan);
        System.out.println("Tujuan Wisata\t\t: " + tujuan);
    }
    
}
