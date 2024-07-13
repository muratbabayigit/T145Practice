package day02;

import java.util.Scanner;

public class P08_ifElseStatements {
    /*

    Soru ) Interview Question
    Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.

    Kural 1: 4 ile bolunen yillar artik yildir
    Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir(istisna)
    Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400’un kati olan yillar artik yildir(İstisnanın İstisnası)

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kontrol Etmek İstediğiniz Yıl: ");
        int year = scan.nextInt();

        System.out.println("-------- İf Çözümü -------");
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " yılı bir artık yıldır");
        } else if (year % 100 != 0 && year % 4 == 0) {
            System.out.println(year + " yılı bir artık yıldır");
        } else {
            System.out.println("Girilen yıl artık yıl değildir");
        }

        System.out.println("-------- Ternary Çözümü -------");
        System.out.println(year%100==0 ? year %400==0 ? "Artık Yıldır":"Artık Yıl değildir"
                          :year%4==0 ?"Artık yıldır":"Artık yıl değildir");
    }

}
