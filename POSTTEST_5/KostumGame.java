public class KostumGame extends KostumCosplay {
    public KostumGame(int id, String namaKostum, int harga, String kategori) {
        super(id, namaKostum, harga, "Game");
    }

    // Implementasi method toString()
    @Override
    public String toString() {
        return super.toString() + " [kategori=Game]";
    }
}