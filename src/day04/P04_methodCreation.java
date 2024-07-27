package day04;

import java.util.Scanner;

public class P04_methodCreation {
    //Soru: Bir metod oluşturun ve bu metod bir string ve bir sayı alıp,
    // string'i belirtilen sayı kadar tekrar etsin ve sonucu döndürsün.

    public static String metinTekrari(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin= scan.nextLine();
        System.out.println("Lütfen tekrar sayısını giriniz");
        int tekrar= scan.nextInt();
        //String result="";
        String result=metin.repeat(tekrar);

        //StringBuilder result=new StringBuilder();
     //  for (int i = 0; i <=tekrar; i++) {
     //          result+=metin;
     //
     //  }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(metinTekrari());
    }
}
