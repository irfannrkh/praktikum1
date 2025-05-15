/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author Lenovo
 */
// kelas generik product yang menyimpan informasi produk dengan tipe kategori generik T
public class Product<T extends Comparable<T>> implements Comparable<Product<T>> {
    private int id; // ID unik produk
    private String name; // Nama produk
    private T category;  // Kategori produk, tipe generik harus Comparable sesuai ketentuan
    private double price; // Harga produk

    // Konstruktor untuk inisialisasi atribut
    public Product(int id, String name, T category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }
    
    // Getternya si ID
    public int getId() {
        return id;
    }
    // Getternya si nama
    public String getName() {
        return name;
    }
    // Getternya si kategori
    public T getCategory() {
        return category;
    }
    // Getternya si harga
    public double getPrice() {
        return price;
    }

    // Implementasi Comparable berdasarkan kategori, ini gunanya untuk mengurutkan produk bedasarkan kategori
    @Override
    public int compareTo(Product<T> other) {
        return this.category.compareTo(other.category);
    }
    
    // Override method toString seoerti yang diminta di soal untuk menampilkan info produk 
    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Category: %s, Price: %.2f",
                id, name, category.toString(), price);
    }
}
