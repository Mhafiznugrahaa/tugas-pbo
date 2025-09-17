public class Mahasiswa {
    public String nama;
    public int nim;

    public void muncul(){
        System.out.println("Nama Mahasiswa adalah: " + nama );
    }

    public static void main(String[] args){
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Hafiz";
        mahasiswa1.nim = 2403062;
        mahasiswa1.muncul();

        // System.out.println()
    }

}