package uts.oop.j.pkg2301010091;

import java.util.Scanner;

public class UTSOOPJ2301010091 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IkanMag ikanMag = new IkanMag(100); // gunakan objek, bukan class langsung

        int pilihan;
        do {
            System.out.println("\n--- Aplikasi Data Ikan ---");
            System.out.println("1. Tambah Data Ikan");
            System.out.println("2. Tampilkan Data Ikan");
            System.out.println("3. Ubah Data Ikan");
            System.out.println("4. Hapus Data Ikan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Input harus angka. Silakan coba lagi.");
                scanner.next();
            }
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Ikan: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Nama Ikan: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Jenis Ikan: ");
                    String jenis = scanner.nextLine();
                    System.out.print("Masukkan Deskripsi: ");
                    String deskripsi = scanner.nextLine();
                    Ikan ikan = new Ikan(id, nama, jenis, deskripsi);
                    ikanMag.tambahIkan(ikan);
                    break;
                case 2:
                    ikanMag.tampilkanIkan();
                    break;
                case 3:
                    System.out.print("Masukkan ID Ikan yang ingin diubah: ");
                    int idUbah = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Nama Baru: ");
                    String namaBaru = scanner.nextLine();
                    System.out.print("Masukkan Jenis Baru: ");
                    String jenisBaru = scanner.nextLine();
                    System.out.print("Masukkan Deskripsi Baru: ");
                    String deskripsiBaru = scanner.nextLine();
                    ikanMag.ubahIkan(idUbah, namaBaru, jenisBaru, deskripsiBaru);
                    break;
                case 4:
                    System.out.print("Masukkan ID Ikan yang ingin dihapus: ");
                    int idHapus = scanner.nextInt();
                    ikanMag.hapusIkan(idHapus);
                    break;
                case 5:
                    System.out.println("Keluar dari aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
