package W_2;

public class DosenMain25 {
    public static void main(String[] args) {
        int masaKerja=0;
        Dosen25 D1 = new Dosen25();
        D1.idDosen = "Lyn Lapid";
        D1.nama = "LL";
        D1.tahunBergabung = 2000;
        D1.bidangKeahlian = "ALSD";

        D1.setStatusAktif(true);
        D1.tampilInformasi();
        masaKerja=D1.hitungMasaKerja(2025);
        System.out.println("Masa kerja: "+masaKerja);
        System.out.println("");
        D1.setStatusAktif(false);
        D1.ubahKeahlian("Daspro");
        D1.tampilInformasi();
        System.out.println("Masa kerja: "+masaKerja);
    }
}
