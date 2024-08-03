package day05;

import java.util.Scanner;

public class P02_whileLoop {
    /*
    Kullanıcıdan 1 ile 100 arasında sayılar girmesini isteyin. Kullanıcı 0 girdiğinde:

        -- En büyük ve en küçük sayıyı,
        -- Girilen sayı addedini,
        -- Girilen sayıların toplamını,
        -- Girilen sayıların ortalamasını,
        -- Tek ve çift sayıların toplamını,
        -- Tek ve çift sayıların adetini ekrana yazdırın.
        -- 1 ile 100 aralığı dışında girilen sayıları kabul etmeyin ve kullanıcıyı uyarın.
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int enBuyuk=1;
        int enKucuk=100;
        int toplam=0;
        int sayiAdedi=0;
        int tekToplam=0;
        int ciftToplam=0;
        int tekAdedi=0;
        int ciftAdedi=0;
        double ortalama=0.0;
        System.out.println("1 ile 100 arasında tamsayılar giriniz. Bitirmek istediğinizde 0 (sıfır) girip enter tuşuna basınız");

        while(true){ //kaç adet sayı gireceğini bilmediğimiz için sonsuz döngü yaptık
            System.out.print("Yeni Sayı Giriniz: ");
            sayi= scan.nextInt();
            if (sayi==0){
                break; //sayı sıfır girilirse döngüyü kıracak(durduracak)
            }
            if (sayi<1 || sayi>100){
                System.out.println("Lütfen sadece 1-100 arasındaki sayılardan birini giriniz!");
            }

            if (sayi>enBuyuk){ //girilen sayı eğer 1'den buyuk ise enBuyuk sayı artık girilen sayı olur
                enBuyuk=sayi;
            }
            if (sayi<enKucuk){//girilen sayı eğer 100'den kücük ise enKucuk sayı artık girilen sayı olur
                enKucuk=sayi;
            }

            toplam+=sayi;
            sayiAdedi++;

            if (sayi%2==0){
                ciftToplam+=sayi;
                ciftAdedi++;
            }else{
                tekToplam+=sayi;
                tekAdedi++;
            }



        }

        if (sayiAdedi>0){
            ortalama=(double)toplam/sayiAdedi;
            System.out.println("Girilen En Büyük Sayı: "+enBuyuk);
            System.out.println("Girilen En Küçük Sayı: "+enKucuk);
            System.out.println("Girilen Sayıların Toplamı: "+toplam);
            System.out.println("Girilen Sayı Adedi: "+sayiAdedi);
            System.out.println("Girilen Sayıların Ortalaması: "+ortalama);
            System.out.println("Girilen Çift Sayı Adedi: "+ciftAdedi);
            System.out.println("Girilen Çift Sayıların Toplamı: "+ciftToplam);
            System.out.println("Girilen Tek Sayı Adedi: "+tekAdedi);
            System.out.println("Girilen Tek Sayıların Toplamı: "+tekToplam);
        }else{
            System.out.println("Hiç bir sayı giriş yapılmadığı için istenen değerlerin tümü 0 'dır");
        }
    }
}
