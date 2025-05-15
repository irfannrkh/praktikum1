/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author Lenovo
 */
// klas utama
public class Marketplace {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        //  produk 
        Product<String> p1 = new Product<>(123, "Laptop", "Elektronik", 15000000); //  produk pertama
        Product<String> p2 = new Product<>(456, "Kemeja", "Pakaian", 250000); //  produk kedua
        Product<String> p3 = new Product<>(789, "Smartphone", "Elektronik", 7000000); //  produk ketiga

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        // header
        System.out.println("== Daftar Produk ==");
        manager.displayAllProductsSorted(); // memanggil method untuk menampilkan semua produk dalam urutan berdasarkan kategori

        // header
        System.out.println("\n== Hasil Pencarian: 'Smartphone' kategori 'Elektronik' ==");
         // memanggil method untuk mencari produk berdasarkan nama dan kategori
        for (Product<?> p : manager.searchProduct("Smartphone", "Elektronik")) {
            System.out.println(p);
        }

        // header
        System.out.println("\n== Kategori Unik ==");
        manager.displayAllCategories();  // memanggil method untuk menampilkan semua kategori produk yang unik

        // ibaratnya memproses produk ke queue
        manager.addToProcessedQueue(p1);
        manager.addToProcessedQueue(p2);

        // antrian yang diproses
        System.out.println("\n== Produk yang Telah Diproses ==");
        manager.displayProcessedQueue(); // manggil method untuk menampilkan produk dalam antrian yang telah diproses

        // Hapus produk
        manager.removeProductById(2);
        System.out.println("\n== Daftar Produk setelah penghapusan ID 2 ==");
        manager.displayAllProductsSorted();
    }
}