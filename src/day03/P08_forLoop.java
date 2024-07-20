package day03;

import java.util.Scanner;

public class P08_forLoop {
    public static void main(String[] args) {
        /*
         * Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse
         * döngüden çıkılsın
         *
         * Bugün hava oldukca güzel.-> 2
         *
         *
         */


            Scanner scan=new Scanner(System.in);
            System.out.println("Lütfen bir cümle giriniz");
            String cumle= scan.nextLine().toUpperCase();
           // cumle=cumle.toUpperCase();
            int flag=0;

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i)=='A'){
                flag++;
            }
            if (cumle.charAt(i)=='C'){
                break;
            }

        }
        System.out.println(flag);

    }
}
