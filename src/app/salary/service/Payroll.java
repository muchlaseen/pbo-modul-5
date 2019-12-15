/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.salary.service;

import app.salary.model.Gaji;
import app.salary.model.Karyawan;

/**
 *
 * @author muchlas
 */
public class Payroll {
    public Gaji gaji;
    public Karyawan karyawan;
    
    public Payroll(Gaji gaji, Karyawan karyawan) {
        this.gaji = gaji;
        this.karyawan = karyawan;
    }
    
    public int getDataNipKaryawan() {
        return karyawan.getNoKtp();
    }
    
    public String getDataNamaKaryawan() {
        return karyawan.getNama();
    }
    
    public String getDataJabatanKaryawan() {
        return karyawan.getJabatan();
    }
    
    public String getDataStatusKaryawan() {
        return karyawan.getStatus();
    }
    
    public double getDataGajiPokok() {
        return gaji.getGajiPokok();
    }
    
    public String getDetailsSalary() {
        return "\nNIP\t\t: " + karyawan.getNoKtp()
                + "\nNama Karyawan\t: " + karyawan.getNama()
                + "\nJabatan\t\t: " + karyawan.getJabatan()
                + "\nStatus\t\t: " + karyawan.getStatus()
                + "\nGaji Pokok\t: " + gaji.getGajiPokok()
                + "\nTunjangan\t: " + gaji.getTunjangan()
                + "\nPajak\t\t: " + gaji.getPajak() + "\n";
    }
}
