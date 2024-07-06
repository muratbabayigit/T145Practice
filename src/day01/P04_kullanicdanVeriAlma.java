package day01;

import java.util.Scanner;

public class P04_kullanicdanVeriAlma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Adınızı Giriniz: ");

        String name=scan.next();
        scan.nextLine();
        System.out.println("Adınızı Tekrar giriniz:");
        String fullName=scan.nextLine();
        System.out.println();
        System.out.println("Merhaba " + fullName + " Hoşgeldin");




    }
}
