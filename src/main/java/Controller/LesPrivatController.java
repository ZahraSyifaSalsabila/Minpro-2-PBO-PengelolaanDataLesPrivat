package Controller;

public class LesPrivatController {
    private LayananLesPrivat layanan;

    public LesPrivatController(LayananLesPrivat layanan) {
        this.layanan = layanan;
    }

    public void tambahData() {
        layanan.tambahData();
    }

    public void tampilkanData() {
        layanan.tampilkanData();
    }

    public void updateData() {
        layanan.updateData();
    }

    public void hapusData() {
        layanan.hapusData();
    }
}