/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package responsi73;

/**
 *
 * @author dhiya
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek produk
        Produk produk1 = new Elektronik("Laptop Asus", 18000000, 2);
        Produk produk2 = new Makanan("Camilan Sehat", 28000, "2025-1-11");

        System.out.println("\nInformasi Produk:");
        System.out.println(produk1.tampilkanInfo());

        // Membuat objek pegawai
        Pegawai pegawai1 = new PegawaiTetap("Dhiya Rahma", 8000000, 4000000);
        Pegawai pegawai2 = new PegawaiKontrak("Beni Surahman", 2000000, 24);

        System.out.println("\nInformasi Pegawai:");
        System.out.println(pegawai1.tampilkanInfo());

        // Polimorfisme

        System.out.println("\nInformasi Polimorfisme:");
        System.out.println(produk2.tampilkanInfo());
        System.out.println(pegawai2.tampilkanInfo());
        }
    }

