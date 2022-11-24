import java.util.Scanner;

public class ucVedordeBolum {
    public static void main(String[] args) {
        int kullanici, toplam = 0, bolme = 0, ort = 0;
        System.out.println("Lütfen sayı giriniz: ");
        Scanner scan = new Scanner(System.in);
        kullanici = scan.nextInt();
        for (int i = 1; i <= kullanici; i++) {
            if (i % 12 == 0) {
                System.out.println();
                toplam = toplam+ i;
                bolme++;
                ort = toplam/bolme;
            }
            System.out.println(ort);
        }
    }
}