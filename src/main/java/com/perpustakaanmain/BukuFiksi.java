package com.perpustakaanmain;

// File: BukuFiksi.java
// Ini adalah Subclass yang mewarisi dari Buku
class BukuFiksi extends Buku {
    // Atribut tambahan yang spesifik untuk BukuFiksi
    String genre;

    // Method Overriding
    // Mengganti implementasi method displayInfo() dari superclass
    @Override
    public void displayInfo() {
        // Memanggil method displayInfo() original dari superclass (Buku)
        super.displayInfo(); 
        // Menambahkan fungsionalitas baru
        System.out.println("Genre\t\t: " + this.genre);
    }
}
