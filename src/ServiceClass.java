import java.util.Scanner;

public class ServiceClass {
    TransaksiPembelian[] trs = new TransaksiPembelian[5];
    int index = 0;

}

void tambahDataTransaksi(TransaksiPembelian trP) {
    if (index < trs.length) {
        trs[index] = trP;
        index++;
    } else {
        System.out.println("Data Penuh!");
    }
}

void searching(Scanner sc) {
    System.out.println("Cari Nama Pembeli: ");
    String nama = sc.nextLine();

    int indexFound;

    for (int i = 0; i < trs.length; i++) {
        if (nama.equalsIgnoreCase(trs[i].namaPembeli)) {
            indexFound = i;
            break;
        } else {
            indexFound = -1;
        }
    }

    if (indexFound >= 0) {
        System.out.println("Data ditemukan di index - " + indexFound);
    } else {
        System.out.println("Data tidak ditemukan");
    }
}

void sorting() {
        for(int i = 0; i < trs.length - 1; i++){
            for(int j = 1; j < trs.length - i; j++) {

            }
        }
    }
