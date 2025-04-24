/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktik.geometry.bases;

/**
 *
 * @author Lenovo
 */
// Kelas abstrak namanya shape
public abstract class Shape {
    protected String name;
    
// Konstruktor default tanpa parameter
    public Shape() {}

    // Method setter untuk mengatur nilai atribut name
    public void setName(String inputName) {
        this.name = inputName;
    }

    // Method getter untuk mengambil nilai atribut name
    public String getName() {
        return name;
    }

     // Method abstrak yang wajib diimplementasikan oleh semua subclass
    public abstract void printInfo();
}
