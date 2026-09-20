package main;

import java.util.Scanner;
import Controller.LayananLesPrivat;
import Controller.LesPrivatController;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LayananLesPrivat layanan = new LayananLesPrivat(scanner);
        LesPrivatController controller = new LesPrivatController(layanan);

        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n=== SISTEM PENGELOLAAN DATA LES PRIVAT ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Update Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            while (!scanner.hasNextInt()) {
                System.out.print("Input harus berupa angka, masukkan lagi: ");
                scanner.nextLine();
            }

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    controller.tambahData();
                    break;

                case 2:
                    controller.tampilkanData();
                    break;

                case 3:
                    controller.updateData();
                    break;

                case 4:
                    controller.hapusData();
                    break;

                case 5:
                    berjalan = false;
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        scanner.close();
    }
}