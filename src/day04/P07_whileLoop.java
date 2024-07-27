package day04;

import java.util.Scanner;

public class P07_whileLoop {
    /// kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
    // kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create
    // ediniz.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bölünecek Sayı: ");
        int bolunen= scan.nextInt();
        System.out.print("Bölen Sayı: ");
        int bolen= scan.nextInt();

        bolmeIslemi(bolunen,bolen);
    }

    public static void bolmeIslemi(int bolunen, int bolen) {
        int ilkbolunen=bolunen;
        int sayac=0;
        while(bolunen>=bolen){  // while döngüsü parantez içindeki şart geçerli olduğu müddetçe döner
            bolunen=bolunen-bolen;
            sayac++;
        }
        System.out.println(ilkbolunen+"/"+bolen+"="+sayac);


    }

}
