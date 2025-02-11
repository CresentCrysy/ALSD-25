package W_1;
import java.util.Scanner;;
public class Perulangan {
    public static void main(String[] args) {
        long n=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan NIM: ");
        n = sc.nextLong();
        n = n%100;
        
        if (n<10) {
            n+=10;
        }

        System.out.println("n: "+n);

        for (int i=1; i<=n; i++){
            if (i==6||i==10) {
                continue;
            }
            else if (i%2!=0) {
                System.out.print("*");
            }
            else System.out.print(i);
        }
    }
}
