package W_6;

public class Mahasiswa25 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa25(){

    }

    Mahasiswa25(String nm, String name, String kls, double ip){
        nim=nm;
        nama=name;
        kelas=kls;
        ipk=ip;
    }

    void tampilInformasi(){
        System.out.println("Nama: "+nama);
        System.out.println("NIM: "+nim);
        System.out.println("Kelas: "+kelas);
        System.out.println("IPK: "+ipk);
    }
}
