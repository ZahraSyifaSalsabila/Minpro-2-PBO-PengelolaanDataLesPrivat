package Controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Jadwal;
import model.Siswa;
import model.Tutor;

public class LayananLesPrivat {
    private Scanner scanner;

    private ArrayList<Siswa> daftarSiswa = new ArrayList<>();
    private ArrayList<Tutor> daftarTutor = new ArrayList<>();
    private ArrayList<Jadwal> daftarJadwal = new ArrayList<>();

    public LayananLesPrivat(Scanner scanner) {
        this.scanner = scanner;

        daftarSiswa.add(new Siswa(1, "Zahra", "SMA", "Matematika"));
        daftarTutor.add(new Tutor(1, "Rifqy", "Matematika", "08123456789"));
        daftarJadwal.add(new Jadwal(1, 1, 1, "Senin", "16:00"));
    }

    private boolean isIdSiswaAda(int id) {
        for (Siswa s : daftarSiswa) {
            if (s.getId() == id) {
                return true;
            }
        }
        return false;
    }

    private boolean isIdTutorAda(int id) {
        for (Tutor t : daftarTutor) {
            if (t.getId() == id) {
                return true;
            }
        }
        return false;
    }

    private boolean isIdJadwalAda(int id) {
        for (Jadwal j : daftarJadwal) {
            if (j.getIdJadwal() == id) {
                return true;
            }
        }
        return false;
    }

    public void tambahData() {
        System.out.println("\n1. Siswa");
        System.out.println("2. Tutor");
        System.out.println("3. Jadwal");
        System.out.print("Pilih: ");

        int pilih = inputAngka();

        if (pilih == 1) {
            System.out.print("ID Siswa: ");
            int id = inputAngka();

            while (isIdSiswaAda(id)) {
                System.out.print("ID Siswa sudah digunakan! Masukkan ID lain: ");
                id = inputAngka();
            }

            System.out.print("Nama: ");
            String nama = inputTeks();

            System.out.print("Jenjang: ");
            String jenjang = inputTeks();

            System.out.print("Mata Pelajaran: ");
            String mapel = inputTeks();

            daftarSiswa.add(new Siswa(id, nama, jenjang, mapel));
            System.out.println("Data siswa berhasil ditambahkan.");

        } else if (pilih == 2) {
            System.out.print("ID Tutor: ");
            int id = inputAngka();

            while (isIdTutorAda(id)) {
                System.out.print("ID Tutor sudah digunakan! Masukkan ID lain: ");
                id = inputAngka();
            }

            System.out.print("Nama: ");
            String nama = inputTeks();

            System.out.print("Keahlian: ");
            String keahlian = inputTeks();

            System.out.print("No. Telepon: ");
            String telepon = inputTeks();

            daftarTutor.add(new Tutor(id, nama, keahlian, telepon));
            System.out.println("Data tutor berhasil ditambahkan.");

        } else if (pilih == 3) {
            System.out.print("ID Jadwal: ");
            int id = inputAngka();

            while (isIdJadwalAda(id)) {
                System.out.print("ID Jadwal sudah digunakan! Masukkan ID lain: ");
                id = inputAngka();
            }

            System.out.print("ID Siswa: ");
            int siswa = inputAngka();

            while (!isIdSiswaAda(siswa)) {
                System.out.print("ID Siswa belum tersedia! Masukkan ID lain: ");
                siswa = inputAngka();
            }

            System.out.print("ID Tutor: ");
            int tutor = inputAngka();

            while (!isIdTutorAda(tutor)) {
                System.out.print("ID Tutor belum tersedia! Masukkan ID lain: ");
                tutor = inputAngka();
            }

            System.out.print("Hari: ");
            String hari = inputTeks();

            System.out.print("Jam: ");
            String jam = inputTeks();

            daftarJadwal.add(new Jadwal(id, siswa, tutor, hari, jam));
            System.out.println("Data jadwal berhasil ditambahkan.");

        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }

    public void tampilkanData() {
        System.out.println("\n=== TAMPILKAN DATA ===");
        System.out.println("1. Data Siswa");
        System.out.println("2. Data Tutor");
        System.out.println("3. Data Jadwal");
        System.out.print("Pilih: ");

        int pilih = inputAngka();

        if (pilih == 1) {
            System.out.println("\n=== DATA SISWA ===");

            for (Siswa s : daftarSiswa) {
                s.tampilkanInfo();
                System.out.println("-------------------------------");
            }

        } else if (pilih == 2) {
            System.out.println("\n=== DATA TUTOR ===");

            for (Tutor t : daftarTutor) {
                t.tampilkanInfo();
                System.out.println("-------------------------------");
            }

        } else if (pilih == 3) {
            System.out.println("\n=== DATA JADWAL ===");

            for (Jadwal j : daftarJadwal) {
                String namaSiswa = cariNamaSiswa(j.getIdSiswa());
                String namaTutor = cariNamaTutor(j.getIdTutor());

                j.tampilkanInfo(namaSiswa, namaTutor);
                System.out.println("-------------------------------");
            }

        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }

    public void updateData() {
        System.out.println("\n1. Siswa");
        System.out.println("2. Tutor");
        System.out.println("3. Jadwal");
        System.out.print("Pilih: ");

        int pilih = inputAngka();

        if (pilih == 1) {
            System.out.print("ID Siswa: ");
            int id = inputAngka();

            for (Siswa s : daftarSiswa) {
                if (s.getId() == id) {
                    System.out.print("Nama: ");
                    s.setNama(inputTeks());

                    System.out.print("Jenjang: ");
                    s.setJenjang(inputTeks());

                    System.out.print("Mata Pelajaran: ");
                    s.setMataPelajaran(inputTeks());

                    System.out.println("Data siswa berhasil diupdate.");
                    return;
                }
            }

            System.out.println("Data siswa tidak ditemukan.");

        } else if (pilih == 2) {
            System.out.print("ID Tutor: ");
            int id = inputAngka();

            for (Tutor t : daftarTutor) {
                if (t.getId() == id) {
                    System.out.print("Nama: ");
                    t.setNama(inputTeks());

                    System.out.print("Keahlian: ");
                    t.setKeahlian(inputTeks());

                    System.out.print("No. Telepon: ");
                    t.setNoTelepon(inputTeks());

                    System.out.println("Data tutor berhasil diupdate.");
                    return;
                }
            }

            System.out.println("Data tutor tidak ditemukan.");

        } else if (pilih == 3) {
            System.out.print("ID Jadwal: ");
            int id = inputAngka();

            for (Jadwal j : daftarJadwal) {
                if (j.getIdJadwal() == id) {
                    System.out.print("ID Siswa: ");
                    int siswa = inputAngka();

                    while (!isIdSiswaAda(siswa)) {
                        System.out.print("ID Siswa belum tersedia! Masukkan ID lain: ");
                        siswa = inputAngka();
                    }

                    System.out.print("ID Tutor: ");
                    int tutor = inputAngka();

                    while (!isIdTutorAda(tutor)) {
                        System.out.print("ID Tutor belum tersedia! Masukkan ID lain: ");
                        tutor = inputAngka();
                    }

                    j.setIdSiswa(siswa);
                    j.setIdTutor(tutor);

                    System.out.print("Hari: ");
                    j.setHari(inputTeks());

                    System.out.print("Jam: ");
                    j.setJam(inputTeks());

                    System.out.println("Data jadwal berhasil diupdate.");
                    return;
                }
            }

            System.out.println("Data jadwal tidak ditemukan.");

        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }

    public void hapusData() {
        System.out.println("\n1. Siswa");
        System.out.println("2. Tutor");
        System.out.println("3. Jadwal");
        System.out.print("Pilih: ");

        int pilih = inputAngka();

        if (pilih == 1) {
            System.out.print("ID Siswa: ");
            int id = inputAngka();

            for (Siswa s : daftarSiswa) {
                if (s.getId() == id) {
                    daftarSiswa.remove(s);
                    System.out.println("Data siswa berhasil dihapus.");
                    break;
                }
            }

        } else if (pilih == 2) {
            System.out.print("ID Tutor: ");
            int id = inputAngka();

            for (Tutor t : daftarTutor) {
                if (t.getId() == id) {
                    daftarTutor.remove(t);
                    System.out.println("Data tutor berhasil dihapus.");
                    break;
                }
            }

        } else if (pilih == 3) {
            System.out.print("ID Jadwal: ");
            int id = inputAngka();

            for (Jadwal j : daftarJadwal) {
                if (j.getIdJadwal() == id) {
                    daftarJadwal.remove(j);
                    System.out.println("Data jadwal berhasil dihapus.");
                    break;
                }
            }

        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }

    private String cariNamaSiswa(int id) {
        for (Siswa s : daftarSiswa) {
            if (s.getId() == id) {
                return s.getNama();
            }
        }

        return "Tidak ditemukan";
    }

    private String cariNamaTutor(int id) {
        for (Tutor t : daftarTutor) {
            if (t.getId() == id) {
                return t.getNama();
            }
        }

        return "Tidak ditemukan";
    }

    private String inputTeks() {
        String input = scanner.nextLine();

        while (input.trim().isEmpty()) {
            System.out.print("Input tidak boleh kosong, masukkan lagi: ");
            input = scanner.nextLine();
        }

        return input;
    }

    private int inputAngka() {
        while (!scanner.hasNextInt()) {
            System.out.print("Input harus berupa angka, masukkan lagi: ");
            scanner.nextLine();
        }

        int angka = scanner.nextInt();
        scanner.nextLine();

        return angka;
    }
}