package W_6;

public class MahasiswaBerprestasi25 {
    Mahasiswa25 [] listMhs = new Mahasiswa25[5];
    int idx;

    void tambah(Mahasiswa25 m){
        if (idx<listMhs.length) {
            listMhs[idx]=m;
            idx++;
        }
        else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (int i = 0; i < idx; i++) { // Gunakan idx untuk membatasi iterasi
            listMhs[i].tampilInformasi();
            System.out.println("-----------------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < idx-1; i++) {
            for (int j = 1; j < idx-i; j++) {
                if (listMhs[j].ipk>listMhs[j-1].ipk) {
                    Mahasiswa25 tmp = listMhs [j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }   
    
    void selectionSort(){
        for (int i = 0; i < idx-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < idx; j++) {
                if (listMhs[j].ipk<listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa25 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs [i];
            listMhs [i] = tmp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < idx; i++) {
            Mahasiswa25 temp = listMhs[i];   
            int j=i;
            while (j>0&&listMhs[j-1].ipk<temp.ipk) {
                listMhs[j]=listMhs[j-1];
                j--;
            }
            listMhs[j]=temp;
        }
    }
}
