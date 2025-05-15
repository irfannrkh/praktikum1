/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author Lenovo
 */
import java.util.*;
// Kelas ini untuk mengelola daftar produk
public class ProductManager {
    private List<Product<?>> products; // Daftar utama produk, menggunakan ArrayList
    private Set<String> categories; // Set kategori unik, menggunakan HashSet
    private Queue<Product<?>> processedQueue; // Antrian produk yang telah diproses, menggunakan LinkedList sebagai Queue

    // Konstruktor untuk inisialisasi semua koleksi
    public ProductManager() {
        products = new ArrayList<>(); // Inisialisasi daftar produk
        categories = new HashSet<>(); // Inisialisasi set kategori
        processedQueue = new LinkedList<>(); // Inisialisasi antrian produk diproses
    }

    // Method untuk menambahkan produk  ke daftar
    public void addProduct(Product<?> product) {
        products.add(product); // Tambahkan produk ke daftar
        categories.add(product.getCategory().toString()); // Tambahkan kategori ke set kategori unik
    }

    // Method untuk menghapus produk berdasarkan ID
    public void removeProductById(int id) {
        products.removeIf(p -> p.getId() == id); // Hapus produk yang ID-nya cocok
    }

        // Method untuk mencari produk berdasarkan nama dan kategori
    public List<Product<?>> searchProduct(String name, String category) {
        List<Product<?>> result = new ArrayList<>();
        for (Product<?> p : products) { // Iterasi seluruh produk
            // Jika nama produk cocok (tidak case-sensitive) dan kategori cocok
            if (p.getName().equalsIgnoreCase(name) &&
                p.getCategory().toString().equalsIgnoreCase(category)) {
                // Tambahkan produk yang cocok ke hasil
                result.add(p); 
            }
        }
        return result;
    }
    
    // Method untuk menampilkan semua produk dan mengurutkannya berdasarkan kategori
    public void displayAllProductsSorted() {
        //salinan dari daftar produk agar tidak mengubah data asli
        List<Product<?>> sorted = new ArrayList<>(products);
        // Urutkan produk berdasarkan kategori, ini juga di konversi ke string 
        sorted.sort((a, b) -> a.getCategory().toString().compareTo(b.getCategory().toString()));
         // Tampilkan setiap produk kalo sudah diurutkan 
        for (Product<?> p : sorted) {
            System.out.println(p);
        }
    }

    // Method untuk menampilkan seluruh kategori unik
    public void displayAllCategories() {
        // Iterasi setiap elemen dalam set kategori
        for (String c : categories) {
            // Tampilkan kategori
            System.out.println(c);
        }
    }
    
    // Method untuk menambahkan produk ke dalam antrian produk 
    public void addToProcessedQueue(Product<?> product) {
        processedQueue.add(product); // Tambahkan produk ke antrian 
    }

    // Method untuk menampilkan seluruh produk dalam antrian
    public void displayProcessedQueue() {
       // Iterasi setiap produk dalam antrian
        for (Product<?> p : processedQueue) {
            System.out.println(p);
        }
    }
}
