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
public class Karyawan extends Manusia {

    public Gaji gaji;
    private int noKtp;
    private String nama;
    private String status;
    private String jabatan;
    private double gajiPokok;

    @Override
    public void setNoKtp(int id) {
        this.noKtp = id;
    }

    public int getNoKtp() {
        return noKtp;
    }

    @Override
    public void setNama(String name) {
        this.nama = name;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

}
