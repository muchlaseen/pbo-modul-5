/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.salary.model;

/**
 *
 * @author muchlas
 */
public class Gaji {

    public Karyawan karyawan;
    private double gajiPokok;
    private double tunjangan;
    private double pajak;

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(String jabatan) {
        if (jabatan.equals("CEO")) {
            gajiPokok = 8000000;
        } else if (jabatan.equals("CTO")) {
            gajiPokok = 6000000;
        } else if (jabatan.equals("CFO")) {
            gajiPokok = 4000000;
        } else {

        }

    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(String status) {
        if (status.equals("BM")) {
            tunjangan = getGajiPokok() * 0;
        } else if (status.equals("SM")) {
            tunjangan = getGajiPokok() * 0.1;
        } else if (status.equals("SMM")) {
            tunjangan = getGajiPokok() * 0.2;
        } else {

        }
    }

    public double getPajak() {
        return pajak;
    }

    public void setPajak(String jabatan) {
        if (jabatan.equals("CEO")) {
            pajak = getGajiPokok() * 0.1;
        } else if (jabatan.equals("CTO")) {
            pajak = getGajiPokok() * 0.05;
        } else if (jabatan.equals("CFO")) {
            pajak = getGajiPokok() * 0.03;
        } else {

        }
    }

    

}
