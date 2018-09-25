package subduapartdua.dicoding.farid.tugasmobro.model;

public class Item {
    private int gambar;
    private String namaResto;
    private String noTelepon;
    private String alamatResto;
    private String lokasiResto;

    public Item(int gambar, String namaResto, String noTelepon, String alamatResto, String lokasiResto) {
        this.gambar = gambar;
        this.namaResto = namaResto;
        this.noTelepon = noTelepon;
        this.alamatResto = alamatResto;
        this.lokasiResto = lokasiResto;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getNamaResto() {
        return namaResto;
    }

    public void setNamaResto(String namaResto) {
        this.namaResto = namaResto;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public String getAlamatResto() {
        return alamatResto;
    }

    public void setAlamatResto(String alamatResto) {
        this.alamatResto = alamatResto;
    }

    public String getLokasiResto() {
        return lokasiResto;
    }

    public void setLokasiResto(String lokasiResto) {
        this.lokasiResto = lokasiResto;
    }
}