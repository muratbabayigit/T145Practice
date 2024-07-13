package day02;

import java.util.Scanner;

public class P04_ifElseStatements {
    // Kullanicidan  yasini ve kilosunu alaliniz
    // 18 yasindan kucuk ise kan bagisi yapamaz
    // 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
    // 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Yaşınızı giriniz: ");
        int age= scan.nextInt();
        System.out.print("Kilonuzu giriniz: ");
        double kilo= scan.nextDouble();

        if (age < 18) {
            System.out.println("Kan bağışı yapamazsınız!");
        }else {
            if (kilo<50){
                System.out.println("Kan bağışı yapamazsınız!");
            }else{
                System.out.println("Kan Bağışı yapabilirisiniz.");
            }
        }
    }



}
