package day02;

import java.util.Scanner;

public class P07_ifElseStatements {
    public static void main(String[] args) {
        /* Problem tanimi : Kulanicidan aracacinin hizini aliniz Trafik cezasinin
         * degerini hesaplayin. 45 hiz siniridir.
         * Eger Hiziniz 55-74 arasinda ise: Ceza 100 $'dir.
         * Eger Hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
         * Eger Hiziniz 85 -94 arainda ise: Ceza 320 $'dir.
         * Eger Hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
         * Eger kullanicinin ehliyeti yoksa cezaya 200 $ eklenir.
         * orn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
         * ----------------------------------------
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Ehliyet Var mı?:  (E/H)");
        char isDrivingLicence=scan.next().toUpperCase().charAt(0);
        System.out.print("Hız değeri: ");
        int velocity= scan.nextInt();

        if (isDrivingLicence=='E'){
            if (velocity<55){
                System.out.println("Hız limitlerine uyduğunuz için teşekkür ederiz...");
            } else if (velocity>=55 && velocity<=74 ){
                System.out.println("Hız sınırını aştınız ceza tutarınız: 100$");
            } else if (velocity>=75 && velocity<=84) {
                System.out.println("Hız sınırını aştınız ceza tutarınız: 150$");
            } else if (velocity>=85 && velocity<=94) {
                System.out.println("Hız sınırını aştınız ceza tutarınız: 320$");
            }else if(velocity>94){
                System.out.println("Hız sınırını aştınız ceza tutarınız: 500$");
            }
        }else if(isDrivingLicence=='H'){
            if (velocity<55) {
                System.out.println("Ehliyetsiz araç kullanıyorsunuz cezanız 200$. Lütfen araçtan ininiz");
            }else if (velocity>=55 && velocity<=74 ){
                System.out.println("Hız sınırını aştınız ceza tutarınız: 300$");
            } else if (velocity>=75 && velocity<=84) {
                System.out.println("Hız sınırını aştınız ceza tutarınız: 350$");
            } else if (velocity>=85 && velocity<=94) {
                System.out.println("Hız sınırını aştınız ceza tutarınız: 520$");
            }else if(velocity>94){
                System.out.println("Hız sınırını aştınız ceza tutarınız: 700$");
            }

        }else{
            System.out.println("Ehliyet bilgisi yanlış girildi");
        }


    }

}
