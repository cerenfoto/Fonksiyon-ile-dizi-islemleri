package fonkdizieleman;

import java.util.Random;
import java.util.Scanner;

public class FonkDiziEleman {

    public static void main(String[] args) {
        int dizi[], diziElamanSayisi, kacıncıEleman;

        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Diziniz kaç elemanlı olsun?");
        diziElamanSayisi = scan.nextInt();

        System.out.println("Kaçıncı elemanı öğrenmek istiyorsunuz?");
        kacıncıEleman = scan.nextInt();

        dizi = new int[diziElamanSayisi];
        System.out.println("Diziniz:");

        for (int i = 0; i < diziElamanSayisi; i++) {
            dizi[i] = rnd.nextInt(101);
            System.out.print(dizi[i] + "-");
        }
        
        System.out.println(istenenEleman(dizi, kacıncıEleman));

    }

    public static int istenenEleman(int[] dizi, int arananEleman) {
        int gecici;
        for (int i = 0; i <= dizi.length - 1; i++) {
            for (int k = i + 1; k < dizi.length; k++) {
                if (dizi[k] < dizi[i]) {
                    gecici = dizi[i];
                    dizi[i] = dizi[k];
                    dizi[k] = gecici;

                }
            }
        }
        System.out.println("\nSıralı diziniz:");
        for (int j = 0; j <= dizi.length - 1; j++) {
            System.out.print(dizi[j] + "-");
        }
        for (int j = 0; j < dizi.length; j++) {
            if (arananEleman == j) {
                arananEleman = dizi[j];
            }

        }
        System.out.println("\nAradığınız eleman:");
        return arananEleman;
    }

}
