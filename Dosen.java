public class Dosen {
    String nama;
    String nip;
    String alamat;
    String email;
    int noTelp;

    public Dosen(String nama, String nip, String alamat, String email, int noTelp) {
        this.nama = nama;
        this.nip = nip;
        this.alamat = alamat;
        this.email = email;
        // this.noTelp = noTelp;
    }

    public void tampilkanDosen() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Alamat: " + alamat);
        System.out.println("Email: " + email);
        // System.out.println("No. Telp: " + noTelp);
    }
}
