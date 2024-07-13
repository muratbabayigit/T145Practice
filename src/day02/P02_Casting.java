package day02;

import java.util.Scanner;

public class P02_Casting {
    public static void main(String[] args) {
         /*
        2- Kullanıcdan bir harf girmesini isteyiniz. O harften sonra gelen harfleri
            Girdiğiniz harf :
            Girdiğiniz harften sonraki  3 harf :
        şeklinde yazdırın.
        ipucu: char
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir harf giriniz: ");//kullanıcıdan char değer istiyoruz
        char harf=scan.next().charAt(0);
        System.out.println("Girdiğiniz harf: "+harf);
        System.out.println("Girdiğiniz harften sonra gelen 3 harf: "+(char)(harf+1)+"-"+(char)(harf+2)+"-"+(char)(harf+3));

    }
}
