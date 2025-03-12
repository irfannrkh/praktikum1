package Tugas2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
class BankAcc {
    
    String noRek;
    String namaPemilik;
    double saldo;


    public BankAcc(String noRek, String namaPemilik, double saldo) {
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    public BankAcc(String noRek, String namaPemilik) {
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.saldo = 0.0;
    }

    public void displayInfo() {
        System.out.println("Nomor Rekening: " + noRek);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: " + saldo);
    
    }


    public void deposit(double nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal deposit harus lebih dari 0!");
        } else {
            saldo += nominal;
            System.out.println("Berhasil deposit: " + nominal);
        }
    }


    public void withdraw(double nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal penarikan harus lebih dari 0!");
        } else if (nominal > saldo) {
            System.out.println("Saldo tidak mencukupi!");
        } else {
            saldo -= nominal;
            System.out.println("Berhasil tarik: " + nominal);
        }
    }
}
