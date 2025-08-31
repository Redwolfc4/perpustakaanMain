package com.perpustakaanmain;


// File: Main.java
// Class utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // 1. Membuat objek dari superclass 'Buku'
        Buku bukuBiasa = new Buku();
        bukuBiasa.judul = "Pemrograman Java untuk Pemula";
        bukuBiasa.penulis = "Budi Raharjo";
        bukuBiasa.tahunTerbit = 2022;

        System.out.println("--- Informasi Buku Umum ---");
        bukuBiasa.displayInfo();
        System.out.println(); // Memberi jarak

        // 2. Membuat objek dari subclass 'BukuFiksi'
        BukuFiksi bukuFiksi = new BukuFiksi();
        bukuFiksi.judul = "Harry Potter and the Sorcerer's Stone";
        bukuFiksi.penulis = "J.K. Rowling";
        bukuFiksi.tahunTerbit = 1997;
        bukuFiksi.genre = "Fantasi";

        System.out.println("--- Informasi Buku Fiksi ---");
        bukuFiksi.displayInfo();
    }
}