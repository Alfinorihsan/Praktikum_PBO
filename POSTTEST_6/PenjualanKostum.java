import java.util.ArrayList;
import java.util.Scanner;

public final class PenjualanKostum {
private final ArrayList<KostumCosplay> daftarKostum;
private final Scanner input;
private static int jumlahKostum = 0; // variabel static untuk menghitung jumlah kostum

public PenjualanKostum() {
    daftarKostum = new ArrayList<KostumCosplay>();
    input = new Scanner(System.in);
}

public final void tambahKostum(final KostumCosplay kostum) {
    daftarKostum.add(kostum);
    jumlahKostum++; // menambah jumlahKostum setiap kali kostum ditambahkan
}

public final void tambahKostum(final int id, final String nama, final int harga, final int kategori) {
    KostumCosplay kostumBaru;
    if (kategori == 1) {
        kostumBaru = new KostumAnime(id, nama, harga, "Anime");
    } else if (kategori == 2) {
        kostumBaru = new KostumGame(id, nama, harga, "Game");
    } else {
        System.out.println("Pilihan kategori tidak valid.");
        return;
    }
    daftarKostum.add(kostumBaru);
    jumlahKostum++; // menambah jumlahKostum setiap kali kostum ditambahkan
}

public final void tampilkanKostum() {
    System.out.println("Daftar Kostum Cosplay:");
    for (KostumCosplay kostum : daftarKostum) {
        System.out.println("ID: " + kostum.getId());
        System.out.println("Nama Kostum: " + kostum.getNama());
        System.out.println("Kategori Kostum: " + kostum.getKategori());
        System.out.println("Harga: " + kostum.getHarga());
        System.out.println();
    }
    System.out.println("Jumlah Kostum: " + jumlahKostum); // menampilkan jumlahKostum
    System.out.println();
}

public final void hapusKostum(final int id) {
    for (int i = 0; i < daftarKostum.size(); i++) {
        if (daftarKostum.get(i).getId() == id) {
            daftarKostum.remove(i);
            System.out.println("Kostum dengan ID " + id + " telah dihapus.");
            jumlahKostum--; // mengurangi jumlahKostum setiap kali kostum dihapus
            return;
        }
    }
    System.out.println("Kostum dengan ID " + id + " tidak ditemukan.");
}

    public final void editKostum(final int id) {
        for (int i = 0; i < daftarKostum.size(); i++) {
            if (daftarKostum.get(i).getId() == id) {
                System.out.println("Data Kostum:");
                System.out.println("ID: " + daftarKostum.get(i).getId());
                System.out.println("Nama Kostum: " + daftarKostum.get(i).getNama());
                System.out.println("Kategori Kostum: " + daftarKostum.get(i).getKategori());
                System.out.println("Harga: " + daftarKostum.get(i).getHarga());

                System.out.println("Masukkan data baru:");
                System.out.print("Nama Kostum: ");
                String namaKostumBaru = input.nextLine();
                System.out.print("Kategori Kostum: ");
                String kategoriKostumBaru = input.nextLine();
                System.out.print("Harga: ");
                int hargaBaru = input.nextInt();

            // set data baru ke objek KostumCosplay yang bersangkutan
            daftarKostum.get(i).setNama(namaKostumBaru);
            daftarKostum.get(i).setKategori(kategoriKostumBaru);
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