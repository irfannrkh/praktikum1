/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author Lenovo
 */
public class praktikum2 {
     public static void main(String[] args) {
        
        BankAcc akunsaya = new BankAcc("245150701111021", "Irfan", 500000);
        BankAcc akundia = new BankAcc("245152617282828", "Habibie");

        System.out.println("\ninformasi akunsaya:");
        akunsaya.displayInfo();
        System.out.println("\ninformasi akun dia:");
        akundia.displayInfo();
        System.out.println("==========================");
        
        System.out.println("\ntransaksi akunsaya: ");
        akunsaya.deposit(100000);
        akunsaya.withdraw(120000);
        
        System.out.println("\ntransaksi akun dia: ");
        akundia.deposit(250000);
        akundia.withdraw(45000);
        System.out.println("==========================");

        System.out.println("\nakun saya stelah transaksi:");
        akunsaya.displayInfo();
        
        System.out.println("\nakun dia stelah transaksi:");
        akundia.displayInfo();
        System.out.println("==========================");
        
    }
    
}
