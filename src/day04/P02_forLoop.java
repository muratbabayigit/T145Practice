package day04;

import java.util.Scanner;

public class P02_forLoop {
    public static void main(String[] args) {


        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
        */

        Scanner scan=new Scanner(System.in);

        System.out.print("Bir cümle yazınız: ");
        String cumle= scan.nextLine().toLowerCase();

        System.out.print("Bir harf giriniz: ");
        char harf=scan.next().toLowerCase().charAt(0);

        int flag=0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == harf){
                flag++;
            }
            
        }
        if (flag!=0){
            System.out.println("Girdiğiniz cümlede \""+harf+"\" harfi "+flag+" adet vardır");
        }else{
            System.out.println("Girdiğiniz cümlede \""+harf+"\" harfi bulunmamaktadır");
        }


    }


}
