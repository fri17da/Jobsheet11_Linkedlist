import java.util.Scanner;

public class MainAntrian {
    public static void main(String[] args) {
        QueueLinkedList antrian = new QueueLinkedList();
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n======= MENU ANTRIAN LAYANAN UNIT KEMAHASISWAAN =======");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil Mahasiswa (Dequeue)");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Paling Akhir");
            System.out.println("5. Tampilkan Seluruh Antrian");
            System.out.println("6. Tampilkan Jumlah Mahasiswa yang Mengantri");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM  : ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                {
                    antrian.enqueue(new Mahasiswa(nim, nama, kelas));
                }
                    break;

                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    antrian.printQueue();
                    break;
                case 6:
                    System.out.println("Jumlah Mahasiswa yang mengantri: " + antrian.getSize());
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}
