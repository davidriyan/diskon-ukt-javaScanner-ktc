package com.project;

import java.util.Scanner;

public class Main{
    public static void main (String[]args){
        //menginputkan data
        String nama;
        String Huruf_Pertama;
        String Huruf_terakhir;
        String npm;
        int Tiga_Angka_Akhir;
        int Jumlah_Angka_Akhir;
        Scanner david = new Scanner(System.in);

        //memasukkan intro
        System.out.println("<=============================>");
        System.out.println("MEMBUAT PROGRAM SCANNER UAS OPP");
        System.out.println("BY DAVID RIYAN KURNIAWAN");
        System.out.println("<=============================>");

        //memasukkan  perintah input
        System.out.print("MASUKKAN NAMA ANDA = ");
        nama = david.nextLine();
        System.out.print("MASUKKAN HURUF PERTAMA ANDA = ");
        Huruf_Pertama = david.nextLine();
        System.out.print("MASUKKAN HURUF TERAKHIR ANDA = ");
        Huruf_terakhir = david.nextLine();
        System.out.print("MASUKKAN NPM ANDA = ");
        npm =  david.nextLine();
        System.out.print("MASUKKAN TIGA ANGKA AKHIR/TERAKHIR = ");
        Tiga_Angka_Akhir = david.nextInt();
        System.out.print("MASUKKAN JUMLAH ANGKA TERAKHIR = ");
        Jumlah_Angka_Akhir = david.nextInt();


        System.out.println("<=========== SELESAI ==========>");

        System.out.println("<======= MENENTUKAN PERCABANGAN ATAU CONDITIONAL UKT DAN IPK =======>");

        //membuat class ukt
        float ukt;
        float ipk;
        Scanner riyan = new Scanner(System.in);

        //membuat perintah
        System.out.print("Masukkan jumlah UKT Anda = ");
        int UKT  = riyan.nextInt();
        System.out.print("Masukkan nilai IPK Anda = ");
        float IPK = riyan.nextFloat();

        //Mmembuat percabangan
        System.out.println("<===================================================>");
        if (IPK>3.5) {
            System.out.println("Anda mendapatkan Diskon 33% karna nilai ipk anda diatas rata-rata");
            
            int diskon = UKT-(UKT*33/100);
            System.out.println("MAKA TOTAL PEMBAYARAN UKT ANDA ADALAH = " + diskon);
            System.out.println("<===============================================>");
            
        } else {
            System.out.println("ANDA TIDAK MENDAPAT DISKON");
            System.out.println("UKT YANG HARUS ANDA BAYAR ADALAH = " + UKT);
        }
    }
}