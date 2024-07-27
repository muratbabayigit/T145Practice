package day04;

import java.util.Scanner;

public class P08_whileLoop {
     // Bir top 220 m  yükseklikten atılmaktadır.
    // Yer çarptıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulunuz.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Topun bırakıldığı yükleklik: ");
        double yukseklik= scan.nextInt();
        double toplamYol=0;

        int sayac=0;

        while(yukseklik>=0.01){
            toplamYol+=yukseklik;
            yukseklik*=0.75; // 3/4=0.75
            sayac++;
        }

        System.out.println("Top yere "+sayac+" kere çarpmıştır");
        System.out.println("Top durana kadar "+toplamYol+" m yol almıştır");




    }
}
