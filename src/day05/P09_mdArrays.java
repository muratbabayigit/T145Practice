package day05;

public class P09_mdArrays {
    public static void main(String[] args) {
          /* TASK :
        arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }  veriliyor.
        Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
         */

        int arr1[][] = { {1,2}, {3,4,5}, {6} };
        int arr2[][] = { {7,8,9}, {10,11}, {12,122} };


        int toplam=0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                toplam+=arr1[i][j];
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int k = 0; k < arr2[i].length; k++) {
                toplam+=arr2[i][k];

            }
        }

        System.out.println("Tüm elemanlar toplamı: "+toplam);
    }
}
