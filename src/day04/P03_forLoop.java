package day04;

import java.util.Scanner;

public class P03_forLoop {
    public static void main(String[] args) {
/*

         *
        ***
       *****
        ***
         *

        şeklini yazdırınız.


        */


        Scanner scan = new Scanner(System.in);
        System.out.print("Baklava Deseninin Yüksekliğini Giriniz: ");
        int yukseklik = scan.nextInt();

        //baklava deseninin orta noktasını bulalım
        int n = yukseklik / 2 + 1;

        //Önce Üst yarıyı yapalım
        for (int i = 1; i <= n; i++) {  // i satır sayısını temsil eder 1. satırdan orta satıra kadar inecek
            for (int j = i; j < n; j++) { // j Sütun sayısını temsil eder Her bir dongude gerktiği kadar boşluk bırakacak
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i-1); k++) { //Her bir satıra gerekitği kadar yıldız
                                                // koymak için satır sayısının 2 katının bir eksiğine kadar gitsin
                System.out.print("*");
            }
            System.out.println();
        }
        //Alt kısmını yapalım
        for (int i = n-1; i >=1 ; i--) {  //orta satırı yeniden yazdırmamak için n-1 dedik.
            for (int j = n; j >i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
