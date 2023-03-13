import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PenjualanKostum penjualanKostum = new PenjualanKostum();

        Scanner input = new Scanner(System.in);
        int pilihanMenu;

        do {
            System.out.println("+-----------------------------------------------+");
            System.out.println("|      Aplikasi Penjualan Kostum Cosplay        |");
            System.out.println("|                 Anna-Chan                     |");
            System.out.println("+-----------------------------------------------+");
            System.out.println("| 1. Tambah Kostum                              |");
            System.out.println("| 2. Tampilkan Daftar Kostum                    |");
            System.out.println("| 3. Hapus Kostum                               |");
            System.out.println("| 4. Edit Kostum                                |");
            System.out.println("| 5. Keluar                                     |");
            System.out.println("+-----------------------------------------------+");
            System.out.print("Masukkan pilihan (1-5): ");
            pilihanMenu = input.nextInt();

            switch (pilihanMenu) {
                case 1:
                    System.out.println("+-----------------------------------------------+");
                    System.out.println("|                Tambah Kostum                  |");
                    System.out.println("+-----------------------------------------------+");
                    System.out.print("ID: ");
                    int idKostum = input.nextInt();
                    input.nextLine(); // clear buffer
                    System.out.print("Nama Kostum: ");
                    String namaKostum = input.nextLine();
                    System.out.print("Harga: ");
                    int harga = input.nextInt();
                    KostumCosplay kostumBaru = new KostumCosplay(idKostum, namaKostum, harga);
                    penjualanKostum.tambahKostum(kostumBaru);
                    System.out.println("\nKostum " + namaKostum + " berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.println("+-----------------------------------------------+");
                    System.out.println("|            Daftar Kostum Cosplay              |");
                    System.out.println("+-----------------------------------------------+");
                    penjualanKostum.tampilkanKostum();
                    break;
                case 3:
                    System.out.println("+-----------------------------------------------+");
                    System.out.println("|                Hapus Kostum                   |");
                    System.out.println("+-----------------------------------------------+");
                    System.out.print("Masukkan ID Kostum yang ingin dihapus: ");
                    int idHapus = input.nextInt();
                    penjualanKostum.hapusKostum(idHapus);
                    System.out.println("\nKostum dengan ID " + idHapus + " berhasil dihapus.");
                    break;
                case 4:
                    System.out.println("+-----------------------------------------------+");
                    System.out.println("|                 Edit Kostum                   |");
                    System.out.println("+-----------------------------------------------+");
                    System.out.print("Masukkan ID Kostum yang ingin diubah: ");
                    int idEdit = input.nextInt();
                    penjualanKostum.editKostum(idEdit);
                    break;
                case 5:
                    System.out.println("+-----------------------------------------------+");
                    System.out.println("|                 Terima kasih                  |");
                    System.out.println("+-----------------------------------------------+");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.println();
        } while (pilihanMenu != 5);

        input.close();
        penjualanKostum.tutupScanner();
    }
}
