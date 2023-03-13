public class KostumCosplay {
    private int id;
    private String namaKostum;
    private double harga;

    public KostumCosplay(int id, String namaKostum, double harga) {
        this.id = id;
        this.namaKostum = namaKostum;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaKostum() {
        return namaKostum;
    }

    public void setNamaKostum(String namaKostum) {
        this.namaKostum = namaKostum;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "KostumCosplay [id=" + id + ", namaKostum=" + namaKostum + ", harga=" + harga + "]";
    }
}
