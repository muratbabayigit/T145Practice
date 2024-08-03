package day05;

import java.util.Arrays;

public class P06_Arrays {
    public static void main(String[] args) {
        /*
         * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun
         *
         * String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
         */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 £123";
        String arr[]=str.split(" ");
        System.out.println(Arrays.toString(arr));
        int dolarToplam=0;
        int poundToplam=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("$")){
                dolarToplam+=Integer.parseInt(arr[i].replace("$",""));
            }else {
                poundToplam=Integer.parseInt(arr[i].replace("£",""));
            }
        }
        System.out.println("Dolar Toplamı: "+dolarToplam+"$");
        System.out.println("Pound Toplam: "+poundToplam+"£");

    }
}
