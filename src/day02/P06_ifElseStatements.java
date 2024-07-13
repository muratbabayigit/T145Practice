package day02;

import java.util.Scanner;

public class P06_ifElseStatements {
    public static void main(String[] args) {
        /*
    Kullanıcıdan üçgenin kenar uzunluklarını isteyip
        -Eğer üç kenar da eşitse eşitkenar üçgen
        -İki kenar eşitse ikizkenar üçgen yazdırın
     */
        Scanner murat=new Scanner(System.in);
        System.out.println("Lütfen kontrol edilecek üçgenin kenar uzunluklarını giriniz!");
        System.out.print("1.Kenar: ");
        double kenar1=murat.nextDouble();
        System.out.print("2.Kenar: ");
        double kenar2=murat.nextDouble();
        System.out.print("3.Kenar: ");
        double kenar3=murat.nextDouble();

        if (kenar1==kenar2 && kenar1==kenar3){
            System.out.println("Girilen kenar ölçüleri bir \"Eşkenar Üçgen\"'e aittir");
        } else if (kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3) {
            System.out.println("Girilen kenar ölçüleri bir \"İkizkenar Üçgen\"'e aittir");
        }else{
            System.out.println("Girilen kenar ölçüleri bir \"Çeşitkenar Üçgen\"'e aittir");
        }

    }
}
