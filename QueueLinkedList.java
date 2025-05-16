public class QueueLinkedList {
    Node front, rear;
    int size;

    public QueueLinkedList() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false;
    }
    public void enqueue(Mahasiswa mhs) {
        Node newNode = new Node(mhs);
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
            return;
        }
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa dipanggil.");
        } else {
            System.out.println("Mahasiswa berikut telah dipanggil:");
            front.data.tampil();
            front = front.next;
            size--;
            if (front == null) {
                rear = null;
            }
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian terdepan:");
            front.data.tampil();
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian paling akhir:");
            rear.data.tampil();
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            Node temp = front;
            System.out.println("Daftar Mahasiswa dalam antrian:");
            while (temp != null) {
                temp.data.tampil();
                System.out.println("-------------------");
                temp = temp.next;
            }
        }
    }

    public int getSize() {
        return size;
    }
}
