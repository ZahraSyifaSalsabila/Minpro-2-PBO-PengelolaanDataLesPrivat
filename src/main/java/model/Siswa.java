package model;

public class Siswa extends Pengguna {
    private String jenjang;
    private String mataPelajaran;

    public Siswa(int id, String nama, String jenjang, String mataPelajaran) {
        super(id, nama);
        this.jenjang = jenjang;
        this.mataPelajaran = mataPelajaran;
    }

    public String getJenjang() {
        return jenjang;
    }

    public void setJenjang(String jenjang) {
        this.jenjang = jenjang;
    }

    public String getMataPelajaran() {
        return mataPelajaran;
    }

    public void setMataPelajaran(String mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID              : " + getId());
        System.out.println("Nama            : " + getNama());
        System.out.println("Jenjang         : " + jenjang);
        System.out.println("Mata Pelajaran  : " + mataPelajaran);
    }
}