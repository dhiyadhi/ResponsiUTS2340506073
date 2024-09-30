/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi73;

/**
 *
 * @author dhiya
 */
class PegawaiKontrak extends Pegawai {
    private int lamaKontrak; // Dalam bulan

    public PegawaiKontrak(String namaPegawai, double gaji, int lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }

    public int getLamaKontrak() {
        return lamaKontrak;
    }

    public void setLamaKontrak(int lamaKontrak) {
        this.lamaKontrak = lamaKontrak;
    }

    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() + ", \nLama Kontrak: " + lamaKontrak + " bulan";
    }
}