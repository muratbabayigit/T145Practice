package day02;

import java.util.Scanner;

public class P01_Casting {

    /*
    Kullanıcıdan iki adet ondalıklı sayı alıp bu ondalıklı sayıları birbirne bölüp sonucu tamsayı olarak yazdırın
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir adet ondalıklı sayı giriniz: ");
        double sayi1= scan.nextDouble();
        System.out.print("Başka bir ondalıklı sayı giriniz: ");
        double sayi2= scan.nextDouble();
        int sonuc=(int)(sayi1/sayi2);
        // byte<short<int<long<float<double sıralamasında büyük olan data küçük olan datayı kapsamama ihtimalinde casting yapılır
        // java bizi uyarır büyük olan bir datayı küçük olana atıyorsunuz der
        // eğer sorun olmayacak sayılarla uğraşıyorsak biz dorumluluk alıp sorun olmayacağını bilerek casting yaparız
        System.out.println("Sonuc = " + sonuc);
        //System.out.println(sayi1/sayi2);


    }
}
