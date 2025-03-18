package W_6;

public class Dosen25 {
    String kode, nama, kelamin;
    Boolean jenisKelamin;
    int usia;

    Dosen25(String kd, String name, Boolean jk, int age){
        kode=kd;
        nama=name;
        jenisKelamin=jk;
        usia=age;
    }
    
    void tampil(){
        System.out.println("Kode: "+kode);
        System.out.println("Nama: "+nama);
        if (jenisKelamin==true) {
            kelamin = "Laki-laki";
        }
        else{
            kelamin = "Perempuan";
        }
        System.out.println("Jenis kelamin: "+kelamin);
        System.out.println("Usia: "+usia);
    }
}
