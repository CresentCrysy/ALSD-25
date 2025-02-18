package W_2;
public class MahasiswaMain25 {
    public static void main(String[] args) {
        Mahasiswa25 mhs1 = new Mahasiswa25();
        mhs1.nama = "Muhammad Ali Farhan"; 
        mhs1.nim = "22417201171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();
        
        System.out.println("");

        Mahasiswa25 mhs2 = new Mahasiswa25("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(5);
        mhs2.tampilkanInformasi();
        
        System.out.println("");
        
        Mahasiswa25 mhsRaymonDevtant = new Mahasiswa25("Raymon Devtant", "244107020009", 3.69, "TI 1A");
        mhsRaymonDevtant.tampilkanInformasi();
    }
}
