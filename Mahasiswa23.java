public class Mahasiswa23 {
    String nim, nama, kelas;
    double ipk;
    
    public Mahasiswa23() {

    }

    public Mahasiswa23(String nim,String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    public void tampilInformasi() {
    System.out.printf("%-10s %-10s %-4s %.2f%n", nama, nim, kelas, ipk);
    }
}
