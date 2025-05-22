/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;
import java.util.Scanner; // Import Scanner untuk input dari keyboard

/**
 *
 * @author Lenovo
 */
public class ValidasiBeratBarang {

    // Menentukan batas maksimal berat barang
    public static final double MAKS_BERAT = 50.0;

    // Method untuk mengecek apakah berat barang valid
    public static void cekBerat(double berat) throws OverweightException {
        if (berat <= 0) {
            // Lempar exception jika berat tidak masuk akal
            throw new OverweightException(" Berat tidak boleh nol atau negatif.");
        } else if (berat > MAKS_BERAT) {
            // Lempar exception jika berat lebih dari batas
            throw new OverweightException(" Berat melebihi batas maksimal (" + MAKS_BERAT + " kg).");
        }
        // Jika tidak bermasalah, tidak melakukan apa-apa (berat valid)
    }

    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari user
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM CEK BERAT BARANG ===");

        try {
            // Meminta user memasukkan berat barang
            System.out.print("Masukkan berat barang (kg): ");
            double berat = Double.parseDouble(input.nextLine()); // Mengubah input ke tipe double

            // Memanggil method cekBerat untuk validasi
            cekBerat(berat);

            // Jika tidak error, tampilkan pesan ini
            System.out.println(" Berat valid. Barang siap dikirim!");

        } catch (OverweightException e) {
            // Menangani jika berat tidak valid (kelebihan atau kurang dari 0)
            System.out.println(e.getMessage());

        } catch (NumberFormatException e) {
            // Menangani jika input bukan angka
            System.out.println("️ Input harus berupa angka. Coba lagi.");

        } catch (Exception e) {
            // Menangani error lainnya yang tidak terduga
            System.out.println("‼️ Terjadi kesalahan: " + e.getMessage());
        }

        input.close(); // Menutup scanner untuk menghindari kebocoran resource
    }
}
