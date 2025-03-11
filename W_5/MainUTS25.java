package W_5;
import java.util.Scanner;
public class MainUTS25 {
    public static void main(String[] args) {
        int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};

        UTS25 ut = new UTS25();
        int maxUTS = ut.tertinggi(nilaiUTS, 0, nilaiUTS.length-1);
        int minUTS = ut.terendah(nilaiUTS, 0, nilaiUTS.length-1);
        double avgUAS = ut.rerata(nilaiUAS);

        System.out.println("Nilai UTS tertinggi: " + maxUTS);
        System.out.println("Nilai UTS terendah: " + minUTS);
        System.out.println("Rata-rata nilai UAS: " + avgUAS);
    }
}
