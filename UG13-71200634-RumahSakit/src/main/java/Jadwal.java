import java.awt.image.PixelGrabber;

public class Jadwal {
    private PixelGrabber pasien;
    private Dokter dokter;
    private Suster suster;
    private Pelayanan pelayanan;
    private Boolean statusDaftar;
    private Boolean statusScreening;

    public Jadwal(Dokter dokter) {
        this.dokter = dokter;
    }

    public PixelGrabber getPasien() {
        return pasien;
    }

    public void setPasien(PixelGrabber pasien) {
        this.pasien = pasien;
    }
}
