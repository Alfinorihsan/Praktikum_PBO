import java.util.ArrayList;
import java.util.Scanner;

public class PenjualanKostum {
    private ArrayList<KostumCosplay> daftarKostum;
    private Scanner input;

    public PenjualanKostum() {
        daftarKostum = new ArrayList<KostumCosplay>();
        input = new Scanner(System.in);
    }

    public void tambahKostum(KostumCosplay kostum) {
        daftarKostum.add(kostum);
    }

    public void tampilkanKostum() {
        System.out.println("Daftar Kostum Cosplay:");
        for (KostumCosplay kostum : daftarKostum) {
            System.out.println("ID: " + kostum.getId());
            System.out.println("Nama Kostum: " + kostum.getNamaKostum());
            System.out.println("Harga: " + kostum.getHarga());
        }
        System.out.println();
    }

    public void hapusKostum(int id) {
        for (int i = 0; i < daftarKostum.size(); i++) {
            if (daftarKostum.get(i).getId() == id) {
                daftarKostum.remove(i);
                System.out.println("Kostum dengan ID " + id + " telah dihapus.");
                return;
            }
        }
        System.out.println("Kostum dengan ID " + id + " tidak ditemukan.");
    }

    public void editKostum(int id) {
        for (int i = 0; i < daftarKostum.size(); i++) {
            if (daftarKostum.get(i).getId() == id) {
                System.out.println("Data Kostum:");
                System.out.println("ID: " + daftarKostum.get(i).getId());
                System.out.println("Nama Kostum: " + daftarKostum.get(i).getNamaKostum());
                System.out.println("Harga: " + daftarKostum.get(i).getHarga());

                System.out.println("Masukkan data baru:");
                System.out.print("Nama Kostum: ");
                String namaKostumBaru = input.nextLine();
                System.out.print("Harga: ");
                int hargaBaru = input.nextInt();

                // set data baru ke objek KostumCosplay yang bersangkutan
                daftarKostum.get(i).setNamaKostum(namaKostumBaru);
                daftarKostum.get(i).setHarga(hargaBaru);

                System.out.println("Data Kostum dengan ID " + id + " telah diupdate.");
                return;
            }
        }
        System.out.println("Kostum dengan ID " + id + " tidak ditemukan.");
    }

    public void tutupScanner() {
        input.close();
    }
}
