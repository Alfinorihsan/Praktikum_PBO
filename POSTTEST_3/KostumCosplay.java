public class KostumCosplay {
    private int id;
    private String namaKostum;
    private int harga;
    private String kategori;

    public KostumCosplay(int id, String namaKostum, int harga, String kategori) {
        this.id = id;
        this.namaKostum = namaKostum;
        this.harga = harga;
        this.kategori = kategori;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return namaKostum;
    }

    public void setNama(String namaKostum) {
        this.namaKostum = namaKostum;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    @Override
    public String toString() {
        return "KostumCosplay [id=" + id + ", namaKostum=" + namaKostum + ", harga=" + harga + ", kategori=" + kategori + "]";
    }
}
