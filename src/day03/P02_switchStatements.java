package day03;

import java.util.Scanner;

public class P02_switchStatements {
    //Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen üç basamaklı bir tamsayı giriniz");
        if(scan.hasNextInt()) {
            int sayi = scan.nextInt();

            if (sayi >= 100 && sayi <= 999) { //325
                int yuzlerBasamagi = sayi / 100; //3 --3,25
                int onlarBasamagi = (sayi % 100) / 10; //2 --2,5
                int birlerBasamagi = sayi % 10; //5

                String sonuc = "";

                switch (yuzlerBasamagi) {
                    case 1:
                        sonuc += "Yüz";
                        break;
                    case 2:
                        sonuc += "İkiyüz";
                        break;
                    case 3:
                        sonuc += "Üçyüz";
                        break;
                    case 4:
                        sonuc += "DörtYüz";
                        break;
                    case 5:
                        sonuc += "Beşyüz";
                        break;
                    case 6:
                        sonuc += "Altyüz";
                        break;
                    case 7:
                        sonuc += "Yediydüz";
                        break;
                    case 8:
                        sonuc += "Sekizyüz";
                        break;
                    case 9:
                        sonuc += "Dokuzyüz";
                        break;
                }

                switch (onlarBasamagi) {
                    case 1:
                        sonuc += "on";
                        break;
                    case 2:
                        sonuc += "yirmi";
                        break;
                    case 3:
                        sonuc += "otuz";
                        break;
                    case 4:
                        sonuc += "kırk";
                        break;
                    case 5:
                        sonuc += "elli";
                        break;
                    case 6:
                        sonuc += "almış";
                        break;
                    case 7:
                        sonuc += "yetmiş";
                        break;
                    case 8:
                        sonuc += "seksen";
                        break;
                    case 9:
                        sonuc += "doksan";
                        break;
                }
                switch (birlerBasamagi) {
                    case 1:
                        sonuc += "bir";
                        break;
                    case 2:
                        sonuc += "iki";
                        break;
                    case 3:
                        sonuc += "üç";
                        break;
                    case 4:
                        sonuc += "dört";
                        break;
                    case 5:
                        sonuc += "beş";
                        break;
                    case 6:
                        sonuc += "altı";
                        break;
                    case 7:
                        sonuc += "yedi";
                        break;
                    case 8:
                        sonuc += "sekiz";
                        break;
                    case 9:
                        sonuc += "dokuz";
                        break;
                }

                System.out.println(sonuc);
            } else {
                System.out.println("Üç basamaklı sayı girmediniz. Kontrol edin!");
            }
        }else{
            System.out.println("Geçerli Bir Sayı Giriniz!");
        }

    }
}
