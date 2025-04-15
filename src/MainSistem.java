import java.util.Scanner;

public class MainSistem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Barang brg1 = new Barang("Br001", "Leo Kripik", "Makanan", 10, 1000);
        Barang brg2 = new Barang("Br002", "You C1000 Botol", "Minuman", 10, 7000);
        Barang brg3 = new Barang("Br003", "Teh Pucuk Botol", "Minuman", 10, 4000);
        Barang brg4 = new Barang("Br004", "Rinso Cair", "Sabun", 10, 7000);
        Barang brg5 = new Barang("Br005", "Leo Kripik", "Sabun", 10, 1000);

        TransaksiPembelian trp1 = new TransaksiPembelian("Tr001", "Santi", "21-04-2024", 1, brg1);
        TransaksiPembelian trp2 = new TransaksiPembelian("Tr002", "Vani", "21-04-2024", 2, brg2);
        TransaksiPembelian trp3 = new TransaksiPembelian("Tr003", "Siska", "23-04-2024", 3, brg3);
        TransaksiPembelian trp4 = new TransaksiPembelian("Tr004", "MeiMei", "23-04-2024", 1, brg4);
        TransaksiPembelian trp5 = new TransaksiPembelian("Tr005", "Ihsan", "24-04-2024", 1, brg5);

        while (true) {
            System.out.println("================= TOKO Manasuka TOKO =================");
            System.out.println("1. Data Barang");
            System.out.println("2. Data Transaksi");
            System.out.println("3. Pencarian Data");
            System.out.println("4. Pengurutan Data");
            System.out.println("5. exit");
            System.out.print("Chose Menu(1-6): ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
            }
        }
    }
}
