public class TransaksiPembelian {
    String kodeTransaksi;
    String namaPembeli;
    String tanggalPembelian;
    int qyt;
    Barang brg;

    TransaksiPembelian(String kodeTransaksi, String namaPembeli, String tanggalPembelian, int qyt, Barang brg){
        this.kodeTransaksi = kodeTransaksi;
        this.namaPembeli = namaPembeli;
        this.tanggalPembelian = tanggalPembelian;
        this.qyt = qyt;
        this.brg = brg;
    }

    void tampilDataTransaksi(){
        System.out.printf("%-20s %-20s %-20s %-20s %-20d %-20s", this.kodeTransaksi, this.namaPembeli, this.tanggalPembelian, this.brg.nama, this.qyt, this.brg.harga);
    }
}

