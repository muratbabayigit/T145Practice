package day05;

import java.util.Scanner;

public class P01_doWhileLoop {
    // kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int pin=0;
        int sPin=8796;

      // do {
      //     System.out.println("Pin Kodunuzu giriniz: ");
      //     pin= scan.nextInt();
      // } while(pin!=sPin); //parantez içerisndeki şart sağlandıkça do işlemi tekrar eder

      // System.out.println("Doğru Giriş Yaptınız!");


        do {
            System.out.println("Pin Kodunuzu giriniz: ");
            pin= scan.nextInt();
            if (pin==sPin){
                System.out.println("Doğru Giriş Yaptınız");
            }else{
                System.out.println("Yanlış Giriş Yaptınız");
            }
        }while(pin!=sPin);
        }
    }

