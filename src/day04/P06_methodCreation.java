package day04;

import java.util.Scanner;

public class P06_methodCreation {

 /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

    public static String benzersizKarakterler(String input){
        String sonuc="";

        for (int i = 0; i < input.length(); i++) {
            char harf=input.charAt(i);
            if (sonuc.indexOf(harf)==-1){
                sonuc+=harf;
            }
        }


        return sonuc;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String input= scan.nextLine();
        System.out.println("Benzersiz Karakterler: "+benzersizKarakterler(input));


    }
}
