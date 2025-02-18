package W_2;

public class MataKuliahMain25 {
    public static void main(String[] args) {
        MataKuliah25 MK1 = new MataKuliah25();
    
        MK1.kodeMK = "ALSD";
        MK1.nama = "Algoritma";
        MK1.sks = 10;
        MK1.jumlahJam = 6;
        
        MK1.tampilInformasi();
        MK1.kurangiJam(2);
        MK1.tampilInformasi();
    }
}
