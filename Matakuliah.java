public class Matakuliah {
    String namaMatakuliah;
    String kodeMatakuliah;
    int jumlahSks;

    // Constructor
    public Matakuliah(String namaMatakuliah, String kodeMatakuliah, int jumlahSks) {
        this.namaMatakuliah = namaMatakuliah;
        this.kodeMatakuliah = kodeMatakuliah;
        this.jumlahSks = jumlahSks;
    }

    // Method 1: Menampilkan info matakuliah
    public void tampilkanInfo() {
        System.out.println("Nama: " + namaMatakuliah);
        System.out.println("Kode: " + kodeMatakuliah);
        System.out.println("Jumlah SKS: " + jumlahSks);
    }

    // Method 2: Mengubah jumlah SKS
    public void ubahJumlahSks(int sksBaru) {
        this.jumlahSks = sksBaru;
    }

    // Method main (psvm)
    public static void main(String[] args) {
        Matakuliah mk = new Matakuliah("Pemrograman Berorientasi Objek", "TIU3302", 3);
        mk.tampilkanInfo();
    }
}

