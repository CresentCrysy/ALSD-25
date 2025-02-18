package W_2;

public class Dosen25 {
    String idDosen, nama, bidangKeahlian, keAktifan="";
    boolean statusAktif;
    int tahunBergabung;
    
    void tampilInformasi(){
        System.out.println("idDosen: "+idDosen);
        System.out.println("Nama: "+nama);
        System.out.println("Bidang keahlian: "+bidangKeahlian);
        System.out.println("Status: "+keAktifan);
    }

    void setStatusAktif(boolean status){
        if (status == true) {
            keAktifan = "Aktif";
        }

        else {
            keAktifan = "Tidak aktif";
        }   
    }

    int hitungMasaKerja(int thnSkrng){
        int masaKerja = thnSkrng-tahunBergabung;
        return masaKerja;
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
}
