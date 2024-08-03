package day05;

import java.util.Arrays;

public class P07_Arrays {
    public static void main(String[] args) {
        	/*TASK :
	write a java program to find the second largest number in the array?
	Maximum and minimum number in the array?
	(Dizideki en büyük ikinci sayyiyi, maksimum ve minimum sayiyi
	bulmak için bir java programi yazin)

	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };

	*/
    //1.Yol
        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };

        Arrays.sort(arr);
        System.out.println("En Küçük Sayı: "+arr[0]);
        System.out.println("En büyük 2.Sayı: "+arr[arr.length-2]);
        System.out.println("En Büyük Sayı: "+arr[arr.length-1]);

    //2.Yol sort  kullanmadan çözünüz
        int min=0;
        int max=0;
        int max2=0;

        for (int i = 0; i < arr.length; i++) {
                if (arr[i]>max){
                max=arr[i];
            } else if (arr[i]>max2 && arr[i]<max) {
                    max2=arr[i];
                }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("En Küçük Sayı: "+min);
        System.out.println("En büyük 2.Sayı: "+max2);
        System.out.println("En Büyük Sayı: "+max);

    }
}
