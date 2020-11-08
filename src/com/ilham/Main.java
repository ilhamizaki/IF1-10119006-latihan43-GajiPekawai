/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : class Main Gaji Pegawai
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GajiPegawai gaji = new GajiPegawai();
        
        gaji.setNama("Rizki Adam Kurniawan");
        gaji.setAlamat("Jalan Semar dlm 4 no 72/66");
        gaji.setUangTransport(250000);
        gaji.setUangTunjangan(300000);
        gaji.setGajiPokok(4500000);

        gaji.setTotalGaji(gaji.totalGaji(gaji.getUangTunjangan(), 
                          gaji.getUangTransport(), gaji.getGajiPokok()));
        
        gaji.tampilData(gaji.getNama(), gaji.getAlamat(), gaji.getUangTunjangan(), 
                        gaji.getUangTransport(), gaji.getGajiPokok(), gaji.getTotalGaji());
    }
    
}
