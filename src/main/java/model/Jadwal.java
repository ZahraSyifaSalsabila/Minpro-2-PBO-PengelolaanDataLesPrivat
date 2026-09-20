package model;

public class Jadwal {
    private int idJadwal;
    private int idSiswa;
    private int idTutor;
    private String hari;
    private String jam;

    public Jadwal(int idJadwal, int idSiswa, int idTutor, String hari, String jam) {
        this.idJadwal = idJadwal;
        this.idSiswa = idSiswa;
        this.idTutor = idTutor;
        this.hari = hari;
        this.jam = jam;
    }

    public int getIdJadwal() {
        return idJadwal;
    }

    public void setIdJadwal(int idJadwal) {
        this.idJadwal = idJadwal;
    }

    public int getIdSiswa() {
        return idSiswa;
    }

    public void setIdSiswa(int idSiswa) {
        this.idSiswa = idSiswa;
    }

    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public void tampilkanInfo(String namaSiswa, String namaTutor) {
        System.out.println("ID              : " + idJadwal);
        System.out.println("Siswa           : " + namaSiswa);
        System.out.println("Tutor           : " + namaTutor);
        System.out.println("Hari            : " + hari);
        System.out.println("Jam             : " + jam);
    }
}