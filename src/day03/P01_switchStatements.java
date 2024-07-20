package day03;

import java.util.Scanner;

public class P01_switchStatements {
    public static void main(String[] args) {
        // Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
        // 1. 0()dahil ile 50 arasi - D
        // 2. 50(dahil) ile 60 arası - C
        // 3. 60(dahil) ile 80 arası - B
        // 4. 80(dahil) ustu- A
        // Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
        // switch() kullanarak yapiniz.


        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Notunuzu giriniz: ");

        if (scan.hasNextInt()){
            int not= scan.nextInt();

        switch (not/10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Notunuzun hafr karşılığı: D");
                break;
            case 5:
                System.out.println("Notunuzun harf karşılığı: C");
                break;
            case 6:
            case 7:
                System.out.println("Notunuzun harf karşılığı: B");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Notunuzun harf karşılığı: A");
                break;
            default:
                System.out.println("Gecerli not giriniz");

        }
            }else{
            System.out.println("Gecerli not giriniz");
        }



    }
}
