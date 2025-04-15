public class Barang {
    String kodeBarang;
    String nama;
    String kategori;
    int stock;
    int harga;

    Barang(String kodeBarang, String nama, String kategori, int stock, int harga) {
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.kategori = kategori;
        this.stock = stock;
        this.harga = harga;
    }

    void tampilDataBarang(){
        System.out.printf("%-20s %-20s %-20s %-20d %-20d", this.kodeBarang, this.nama, this.kategori, this.stock, this.harga);
    }
}
