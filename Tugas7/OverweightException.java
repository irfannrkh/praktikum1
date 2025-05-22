/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;

/**
 *
 * @author Lenovo
 */

// Membuat custom exception bernama OverweightException
class OverweightException extends Exception {
    // Constructor untuk menampilkan pesan error
    public OverweightException(String message) {
        super(message); // Memanggil constructor dari kelas Exception
    }
}
