import java.util.Scanner;
public class ModSLLMain23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList23 sll = new SingleLinkedList23();
        System.out.print("Masukkan jumlah data mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa23 mhs = new Mahasiswa23(nim, nama, kelas, ipk);
            sll.addLast(mhs); 

            System.out.println("\nIsi Linked List:");
            sll.print();
        }

    }
}