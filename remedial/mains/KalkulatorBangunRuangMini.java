/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remedial.mains;
import remedial.shapes.Kerucut; // Import class Kerucut
import remedial.shapes.Balok; // Import class Balok
import java.util.Scanner; // Import Scanner untuk input user
import remedial.bases.BangunRuang;


/**
 *
 * @author Lenovo
 */
// Main class
public class KalkulatorBangunRuangMini {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //  scanner untuk input dari user

        // PRINT Header 
        System.out.println("===============================================");
        System.out.println("Kalkulator Bangun Ruang Mini Versi A");
        System.out.println("MUKHAMAD IRFAN NUR KHAKIM"); // Kamu isi manual waktu jalan
        System.out.println("245150701111021"); // Kamu isi manual waktu jalan
        System.out.println("===============================================");

        //  input Kerucut
        System.out.println("Kerucut");
        System.out.println("===============================================");
        System.out.print("Isikan nama     : ");
        String namaKerucut = input.nextLine();
        System.out.print("Isikan radius   : ");
        double radius = input.nextDouble();
        System.out.print("Isikan tinggi   : ");
        double tinggiKerucut = input.nextDouble();
        System.out.print("Isikan massa    : ");
        double massaKerucut = input.nextDouble();

        // Membuat objek Kerucut
        BangunRuang kerucut = new Kerucut(radius);
        kerucut.setNama(namaKerucut);
        kerucut.setTinggi(tinggiKerucut);
        kerucut.setMassa(massaKerucut);

        kerucut.printInfo(); // Menampilkan info kerucut

        //  input Balok
        input.nextLine(); // Membersihkan buffer
        System.out.println("Balok");
        System.out.println("===============================================");
        System.out.print("Isikan nama     : ");
        String namaBalok = input.nextLine();
        System.out.print("Isikan panjang  : ");
        double panjang = input.nextDouble();
        System.out.print("Isikan lebar    : ");
        double lebar = input.nextDouble();
        System.out.print("Isikan tinggi   : ");
        double tinggiBalok = input.nextDouble();
        System.out.print("Isikan massa    : ");
        double massaBalok = input.nextDouble();

        //  objek Balok
        BangunRuang balok = new Balok(panjang, lebar);
        balok.setNama(namaBalok);
        balok.setTinggi(tinggiBalok);
        balok.setMassa(massaBalok);

        balok.printInfo(); // Menampilkan info balok

        input.close(); // penutup scanner
    }
}
