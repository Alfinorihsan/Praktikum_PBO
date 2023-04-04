public class KostumAnime extends KostumCosplay {
    public KostumAnime(int id, String namaKostum, int harga, String kategori) {
        super(id, namaKostum, harga, "Anime");
    }

    // Implementasi method toString()
    @Override
    public String toString() {
        return super.toString() + " [kategori=Anime]";
    }
}