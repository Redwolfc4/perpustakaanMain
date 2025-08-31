package com.perpustakaanmain;

// File: Buku.java
// Ini adalah Superclass
class Buku {
    // Atribut yang akan diwariskan
    String judul;
    String penulis;
    int tahunTerbit;

    // Method yang akan diwariskan dan bisa di-override
    public void displayInfo() {
        System.out.println("Judul\t\t: " + this.judul);
        System.out.println("Penulis\t\t: " + this.penulis);
        System.out.println("Tahun Terbit\t: " + this.tahunTerbit);
    }
}
