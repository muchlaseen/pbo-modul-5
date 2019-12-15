/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.salary.main;

import app.salary.model.Karyawan;
import app.salary.model.Gaji;
import app.salary.service.Payroll;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author muchlas
 */
public class App {

    static void Menu() {
        System.out.println("=== Menu ===");
        System.out.println("1. Input Karyawan");
        System.out.println("2. Hitung Gaji");
        System.out.println("0. Exit");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Payroll> payrollArr = new ArrayList<>();

        int pilihMenu, nip;

        do {
            Menu();
            System.out.print("Pilih menu [1-2]/[0] : ");
            pilihMenu = scan.nextInt();

            switch (pilihMenu) {
                case 1:
                    Karyawan karyawan = new Karyawan();
                    Gaji gaji = new Gaji();
                    System.out.println("### Input Data Karyawan ###\n");
                    
                    boolean ulangInput = true;
                    do {
                        try {
                            System.out.print(">> ID Karyawn\t\t: ");
                            nip = scan.nextInt();
                            karyawan.setNoKtp(nip);

                            ulangInput = false;
                        } catch (InputMismatchException ex) {
                            System.err.println("Input (invalid) : Harus angka!");
                            scan.nextLine();
                        }
                      
                    } while (ulangInput);

                    System.out.print(">> Nama Karyawan\t: ");
                    karyawan.setNama(scan.next());
                    System.out.print(">> Jabatan Karyawan\t: ");
                    karyawan.setJabatan(scan.next());
                    gaji.setGajiPokok(karyawan.getJabatan());
                    gaji.setPajak(karyawan.getJabatan());
                    System.out.println(">> Status Karyawan\t: ");
                    System.out.println("1. BM [Belum Menikah]\n"
                            + "2. SM [Sudah Menikah]\n"
                            + "3. SMM [Sudah Menikah - Memiliki anak]");
                    System.out.print("Input sesuai kode[BM/SM/SMM] : ");
                    karyawan.setStatus(scan.next());
                    gaji.setTunjangan(karyawan.getStatus());

                    Payroll payroll = new Payroll(gaji, karyawan);

                    payrollArr.add(payroll);

                    break;

                case 2:
                    System.out.println("### Hitung Gaji Karyawan ###\n");
                    for (int i = 0; i < payrollArr.size(); i++) {
                        System.out.println(payrollArr.get(i).getDetailsSalary());
                    }

                    break;

                default:
                    System.out.println("Pilihan tidak ada!");
                    break;
            }

        } while (pilihMenu != 0);
    }

}
