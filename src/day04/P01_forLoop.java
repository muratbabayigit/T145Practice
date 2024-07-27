package day04;

import java.util.Scanner;

public class P01_forLoop {
    public static void main(String[] args) {
          /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */
        Scanner scan=new Scanner(System.in);
        System.out.print("1'den büyük bir tam sayı giriniz: ");
        int sayi= scan.nextInt();
        int toplam=0;
        if (sayi<=1){
            System.out.println("Lütfen 1 'den büyük bir tam sayı giriniz");
        }else{

            for (int i = 1; i <=sayi; i++) {
                toplam+=i*i;
                
            }
            System.out.println("Girilen Sayı: "+sayi);
            System.out.println("1 ile "+sayi+" arasındaki sayıların kareleri toplamı: "+toplam);
        }


    }
}
