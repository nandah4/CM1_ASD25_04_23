
import java.util.Scanner;

public class ServiceClass {
    TransaksiPembelian[] trs = new TransaksiPembelian[5];
    int index = 0;

    void tambahDataTransaksi(TransaksiPembelian trP) {
        if (index < trs.length) {
            trs[index] = trP;
            index++;
        } else {
            System.out.println("Data Penuh!");
        }
    }

    void showBarang() {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s", "Kode Barang", "Nama Barang", "Kategori", "Stock", "Harga");
        System.out.println();
        for (int i = 0; i < trs.length; i++) {
            trs[i].brg.tampilDataBarang();
            System.out.println();
        }
    }

    void showTransaksi() {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s", "Kode Transaksi", "Nama Pembeli", "Tanggal Pembelian",
                "Nama Barang", "Kuantitas", "Harga");
        System.out.println();
        for (int i = 0; i < trs.length; i++) {
            trs[i].tampilDataTransaksi();
            System.out.println();
        }
    }

    void searching(Scanner sc) {
        System.out.print("Cari Nama Pembeli: ");
        String nama = sc.nextLine();

        int indexFound = -1;

        for (int i = 0; i < trs.length; i++) {
            if (nama.equalsIgnoreCase(trs[i].namaPembeli)) {
                indexFound = i;
                break;
            }
        }

        if (indexFound >= 0) {
            System.out.println("Data ditemukan di index : " + indexFound);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    void sorting() {
        for (int i = 0; i < trs.length - 1; i++) {
            for (int j = 1; j < trs.length - i; j++) {
                if (trs[j - 1].namaPembeli.compareToIgnoreCase(trs[j].namaPembeli) > 0) {
                    TransaksiPembelian temp = trs[j - 1];
                    trs[j - 1] = trs[j];
                    trs[j] = temp;
                }
            }
        }
    }
}