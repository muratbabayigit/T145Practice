package day03;

import java.util.Scanner;

public class P03_switchStatements {
    /*
    Kullanıcıdan alınan bir sayının kaç basamaklı olduğunu yazdıran bir Java programı yazınız
    Girilen sayı negatifse, pozitif olarak ele alınacaktır. switch yapısını kullanarak çözünüz.
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir  2147483647'den küçük bir sayı giriniz");
        if (scan.hasNextInt()){
            int number= scan.nextInt();

            if (number<0){
                number =-number;
            }
            String numberString=Integer.toString(number);
            int basamakSayisi=numberString.length();
            // int basamakSayisi=(""+sayi).length();

            switch (basamakSayisi){
                case 1: System.out.println("Girilen Sayı 1 basamaklıdır"); break;
                case 2: System.out.println("Girilen Sayı 2 basamaklıdır"); break;
                case 3: System.out.println("Girilen Sayı 3 basamaklıdır"); break;
                case 4: System.out.println("Girilen Sayı 4 basamaklıdır"); break;
                case 5: System.out.println("Girilen Sayı 5 basamaklıdır"); break;
                case 6: System.out.println("Girilen Sayı 6 basamaklıdır"); break;
                case 7: System.out.println("Girilen Sayı 7 basamaklıdır"); break;
                case 8: System.out.println("Girilen Sayı 8 basamaklıdır"); break;
                case 9: System.out.println("Girilen Sayı 9 basamaklıdır"); break;
                case 10: System.out.println("Girilen Sayı 10 basamaklıdır"); break;

            }
        }else{
            System.out.println("Geçersiz bir giriş yaptınız!");
        }
    }
}
