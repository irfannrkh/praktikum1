/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktik.geometry.interfaces;

/**
 *
 * @author Lenovo
 */
// Interface untuk benda yang memiliki massa dan berat
public interface Weightable {
    double GRAVITY = 9.8; // Konstanta gravitasi nilainya tetap
    double getWeight();  // Method untuk menghitung berat berdasarkan massa dan gravitasi
}
