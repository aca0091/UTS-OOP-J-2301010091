package uts.oop.j.pkg2301010091;

public class IkanMag {
    private Ikan[] ikans;
    private int count;

    public IkanMag(int size) {
        ikans = new Ikan[size];
        count = 0;
    }

    // Method untuk menambah ikan
    public void tambahIkan(Ikan ikan) {
        if (count < ikans.length) {
            ikans[count++] = ikan;
            System.out.println("Data ikan berhasil ditambahkan.");
        } else {
            System.out.println("Kapasitas penyimpanan penuh.");
        }
    }

    // Method untuk menampilkan semua ikan
    public void tampilkanIkan() {
        if (count == 0) {
            System.out.println("Belum ada data ikan.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(ikans[i]);
            }
        }
    }

    // Method untuk mengubah data ikan
    public void ubahIkan(int id, String namaBaru, String jenisBaru, String deskripsiBaru) {
        boolean ditemukan = false;
        for (int i = 0; i < count; i++) {
            if (ikans[i].getId() == id) {
                ikans[i].setNama(namaBaru);
                ikans[i].setJenis(jenisBaru);
                ikans[i].setDeskripsi(deskripsiBaru);
                ditemukan = true;
                System.out.println("Data ikan berhasil diubah.");
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Ikan dengan ID " + id + " tidak ditemukan.");
        }
    }

    // Method untuk menghapus data ikan
    public void hapusIkan(int id) {
        boolean ditemukan = false;
        for (int i = 0; i < count; i++) {
            if (ikans[i].getId() == id) {
                for (int j = i; j < count - 1; j++) {
                    ikans[j] = ikans[j + 1];
                }
                ikans[--count] = null;
                ditemukan = true;
                System.out.println("Data ikan berhasil dihapus.");
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Ikan dengan ID " + id + " tidak ditemukan.");
        }
    }
}
