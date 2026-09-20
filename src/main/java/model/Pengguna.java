package model;

public class Pengguna {
    private int id;
    private String nama;

    public Pengguna(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilkanInfo() {
        System.out.println(id + " | " + nama);
    }
}