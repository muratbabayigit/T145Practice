package day02;

import java.util.Scanner;

public class P03_ifStatements {
    /*
    Kullanıcıdan üçgenin kenar uzunluklarını isteyip
        -Eğer üç kenar da eşitse eşitkenar üçgen
        -İki kenar eşitse ikizkenar üçgen yazdırın
     */

    public static void main(String[] args) {
        Scanner murat=new Scanner(System.in);
        System.out.println("Lütfen kontrol edilecek üçgenin kenar uzunluklarını giriniz!");
        System.out.print("1.Kenar: ");
        double kenar1=murat.nextDouble();
        System.out.print("2.Kenar: ");
        double kenar2=murat.nextDouble();
        System.out.print("3.Kenar: ");
        double kenar3=murat.nextDouble();

        if(kenar1==kenar2 && kenar1==kenar3){
            System.out.println("Giridiğiniz üçgen \"Eşkenar Üçgendir\"");
        }

        //Bağımsız if yapılır

        if (kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3){
            System.out.println("Girdiğiniz üçgen \"İkizkenar Üçgendir\"");
        }


    }

}
