/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

/**
 *
 * @author Lenovo
 */
public class praktikum1 {
    


 public static void main(String[] args) {
    
        motor motor1 = new motor();
        motor motor2 = new motor();
        motor motor3 = new motor();

        System.out.println("infomasi motor :");

        motor1.merk = "Vario 160";
        motor1.kondisi = "baru";
        motor1.surat = "lengkap";

        motor1.infomotor();

        motor1.deskripsi();
        System.out.println("-------------------------");
        System.out.println("infomasi motor :");

        motor2.merk = "Scoopy ";
        motor2.kondisi = "bekas";
        motor2.surat = "lengkap";

        motor2.infomotor();

        motor2.deskripsi();
        System.out.println("-------------------------");
        System.out.println("infomasi motor :");

        motor3.merk = "Beat ";
        motor3.kondisi = "baru";
        motor3.surat = "kosong";

        motor3.infomotor();

        motor3.deskripsi();



    }
}
