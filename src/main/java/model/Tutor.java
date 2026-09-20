package model;

public class Tutor extends Pengguna {
    private String keahlian;
    private String noTelepon;

    public Tutor(int id, String nama, String keahlian, String noTelepon) {
        super(id, nama);
        this.keahlian = keahlian;
        this.noTelepon = noTelepon;
    }

    public String getKeahlian() {
        return keahlian;
    }

    public void setKeahlian(String keahlian) {
        this.keahlian = keahlian;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID              : " + getId());
        System.out.println("Nama            : " + getNama());
        System.out.println("Keahlian        : " + keahlian);
        System.out.println("No. Telepon     : " + noTelepon);
    }
}