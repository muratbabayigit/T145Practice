package day03;

import java.util.Scanner;

public class P05_stringManipulation {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız, 3 kelimeden oluşan metni
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("LÜtfen 3 kelimeli bir metin giriniz!");
        String metin= scan.nextLine();

        String ilkKelime=metin.substring(0,metin.indexOf(" "));
        String ikinciKelime=metin.substring(metin.indexOf(" ")+1,metin.lastIndexOf(" "));
        String ucuncuKelime=metin.substring(metin.lastIndexOf(" ")+1);

        System.out.println(ilkKelime.substring(0,1).toUpperCase()+"."+ikinciKelime.substring(0,1).toUpperCase()
                                                                 +"."+ucuncuKelime.substring(0,1).toUpperCase()+".");





    }
}
