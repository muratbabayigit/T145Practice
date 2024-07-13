package day02;

import java.util.Scanner;

public class P09_Ternary {
    /*
    18 yaşından küçüklere sigara satmak yasaktır.
    Sigara alana yaşını sorup sigara alıp alamayacağını
    bir teranry kod ile yazdırınız
   */

    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
        System.out.print("Kaç Yaşındasınız: ");
        int yas= scan.nextInt();

        System.out.println(yas<18 ? "Size sigara satamıyoruz. Yasak var!":"Hangi sigarayı istiyorsunuz");

    }
}
