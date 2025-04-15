
import java.util.Scanner;

public class ServiceClass {
    TransaksiPembelian[] trs = new TransaksiPembelian[5];
    Barang[] brg = new Barang[5];
    int index = 0;
    int indexBrg = 0;

    void tambahDataTransaksi(TransaksiPembelian trP) {
        if (index < trs.length) {
            trs[index] = trP;
            index++;
        } else {
            System.out.println("Data Penuh!");
        }
    }

    // void tambahBarang(BranchInstruction brg) {
    // if (index < brg.length) {
    // brg[index] = trP;
    // index++;
    // } else {
    // System.out.println("Data Penuh!");
    // }
    // }

    void showBarang() {
        System.out.printf("%-20s %-20s %-20s %-20d %-20d", "Kode Barang", "Nama Barang", "Kategori", "Stock", "Harga");
        System.out.println();
        for (int i = 0; i < trs.length; i++) {
            trs[i].brg.tampilDataBarang();
            System.out.println();
        }
    }

    void searching(Scanner sc) {
        System.out.println("Cari Nama Pembeli: ");
        String nama = sc.nextLine();

        int indexFound = -1;

        for (int i = 0; i < trs.length; i++) {
            if (nama.equalsIgnoreCase(trs[i].namaPembeli)) {
                indexFound = i;
                break;
            }
        }

        if (indexFound >= 0) {
            System.out.println("Data ditemukan di index - " + indexFound);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    void sorting() {
        for (int i = 0; i < trs.length - 1; i++) {
            for (int j = 1; j < trs.length - i; j++) {
                if (trs[j - 1].namaPembeli.compareToIgnoreCase(trs[j].namaPembeli) > 0) {
                    // TransaksiPembelian temp = trs[]
                }
            }
        }
    }
}