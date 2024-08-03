package day05;

import java.util.Arrays;
import java.util.Scanner;

public class P03_Arrays {
    public static void main(String[] args) {
        // kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini
        // kullanicidan alan ve girilen array elemanlarinin en buyuk ile en kucuk
        // elemaninin arasinki farki gosteren java programi yazin

        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç elemanlı bir array(dizi) oluşturacaksınız: ");
        int sayi= scan.nextInt();

        int arr[]=new int[sayi];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+1+"'.ci sayıyı giriniz: ");
            int arrEleman= scan.nextInt();
            arr[i]=arrEleman;
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Array'deki En Büyük Eleman ile En küçük Eleman arasındaki fark: "+(arr[arr.length-1]-arr[0]));




    }

}
