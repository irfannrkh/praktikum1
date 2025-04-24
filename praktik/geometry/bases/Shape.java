/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktik.geometry.bases;

/**
 *
 * @author Lenovo
 */
// Kelas abstrak 
public abstract class Shape {
    protected String name;

    public Shape() {}

    public void setName(String inputName) {
        this.name = inputName;
    }

    public String getName() {// method untuk mengambil nama bentuk
        return name;
    }

    public abstract void printInfo();
}
