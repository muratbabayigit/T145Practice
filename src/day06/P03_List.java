package day06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03_List {
     /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */


    public static void main(String[] args) {
        karelerinToplami();

    }

    public static void karelerinToplami() {
        List<String> list=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen sayıları giriniz\nİşlemi bitirmek için s tuşuna basınız! ");
        int toplam=0;
        String giris="";
        while(!giris.equalsIgnoreCase("s")) {
            System.out.println("Lütfen sayı giriniz: ");
            giris= scan.next();
            list.add(giris);
        }
        list.remove(list.size()-1); // s harfini siliyoruz.

        for (String each:list) {
            int a=Integer.parseInt(each);
            toplam+=a*a;
            
        }
        System.out.println("Girilen Sayıların kareleri toplamı: "+toplam);



    }
}
