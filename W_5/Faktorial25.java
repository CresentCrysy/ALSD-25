package W_5;

public class Faktorial25 {
    int faktorialBF(int n){
        int faktor = 1;
        int i=0;
        while (i<n) {
            faktor= faktor*i;
            i++;
        }
        return faktor;
        // for (int i=1; i<=n; i++){
        //     faktor = faktor * i;
        // }
    }

    int faktorialDC(int n){
        if(n==1){
            return 1;
        }
        else {
            int faktor = n * faktorialDC(n-1);
            return faktor;
        }
    }
}
