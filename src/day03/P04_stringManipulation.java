package day03;

import java.util.Scanner;

public class P04_stringManipulation {
    public static void main(String[] args) {
        // Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen metinsel bir ifade giriniz: ");
        String metin= scan.nextLine();
            if (metin.contains(" ")){
                System.out.println("Metinde boşluk vardır");
            }else {
                System.out.println("Metinde boşluk yoktur");
            }

            /*
                    Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
                    ad ayrı soyad ayrı sekilde ekrana yazdırınız.
             */

        System.out.println("Adınızı ve Soyadınızı Giriniz(Adınız 1 den fazla ise sadece birini yazınız): ");
        String isimSoyisim= scan.nextLine(); //Murat Yiğit
        String isim=isimSoyisim.substring(0,isimSoyisim.indexOf(" "));
        String soyisim=isimSoyisim.substring(isimSoyisim.indexOf(" ")+1);

        System.out.println("İsim: "+isim+"\nSoyisim: "+soyisim);


    }
}
