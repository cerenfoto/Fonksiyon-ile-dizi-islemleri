package fonkdizi;

import java.util.Scanner;
import java.util.Random;

public class FonkDizi {

    public static void main(String[] args) {
        // kodumuzda kullanacağımız değişkenleri tanımladık.
        int diziElamanSayisi, dizi[];
        
        // Dizimizi random oluşturabilmek ve dizinin eleman sayısını dışarıdan alabilmek için javanın random ve scanner sınıflarından nesne oluşturduk.
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        
        //Dizimizin eleman sayısını belirledik.
        System.out.println("Diziniz kaç elemanlı olsun?");
        diziElamanSayisi = scan.nextInt();
   
        dizi = new int[diziElamanSayisi];
        System.out.println("Diziniz:");
        
        // Random dizimizi oluşturduk.
        for (int i = 0; i < diziElamanSayisi; i++) {
            dizi[i] = rnd.nextInt(1001);
            System.out.print(dizi[i] + "-");
        }
        
        System.out.println("\nDizinin en büyük elemanı:");
        System.out.println(maxDizi(dizi));// mazDizi fonksiyonumuzu çağırdık.

    }
    
    
    //mazDizi adında bir fonksiyon oluşturduk ve dizi elemanlarından en büyük olan elemanı bulduk.
    public static int maxDizi(int[] dizi) {
        int maxEleman = 0;

        for (int i = 0; i < dizi.length; i++) {
            if (maxEleman < dizi[i]) {
                maxEleman = dizi[i];
            }

        }
        return maxEleman;
    }
}
