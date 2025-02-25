package W_3;

public class DataDosen25 {

    public void dataSemuaDosen(Dosen25[] arrayOfDosen) {
        for (Dosen25 dosen : arrayOfDosen) {
            System.out.println("Kode: " + dosen.kode + ", Nama: " + dosen.nama + ", Jenis Kelamin: " + (dosen.jenisKelamin ? "Pria" : "Wanita") + ", Usia: " + dosen.usia);
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen25[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;
        for (Dosen25 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria: " + pria);
        System.out.println("Jumlah Dosen Wanita: " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen25[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int countPria = 0;
        int countWanita = 0;

        for (Dosen25 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                countPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                countWanita++;
            }
        }

        double rerataUsiaPria = countPria > 0 ? (double) totalUsiaPria / countPria : 0;
        double rerataUsiaWanita = countWanita > 0 ? (double) totalUsiaWanita / countWanita : 0;

        System.out.println("Rata-rata Usia Dosen Pria: " + rerataUsiaPria);
        System.out.println("Rata-rata Usia Dosen Wanita: " + rerataUsiaWanita);
    }

    public void infoDosenPalingTua(Dosen25[] arrayOfDosen) {
        Dosen25 dosenTua = arrayOfDosen[0];
        for (Dosen25 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTua.usia) {
                dosenTua = dosen;
            }
        }
        System.out.println("Dosen Paling Tua: " + dosenTua.nama + ", Usia: " + dosenTua.usia);
    }

    public void infoDosenPalingMuda(Dosen25[] arrayOfDosen) {
        Dosen25 dosenMuda = arrayOfDosen[0];
        for (Dosen25 dosen : arrayOfDosen) {
            if (dosen.usia < dosenMuda.usia) {
                dosenMuda = dosen;
            }
        }
        System.out.println("Dosen Paling Muda: " + dosenMuda.nama + ", Usia: " + dosenMuda.usia);
    }
}