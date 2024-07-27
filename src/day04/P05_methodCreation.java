package day04;

public class P05_methodCreation {
    public static String tekrarMetin(String metin, int tekrar){
        String result=metin.repeat(tekrar);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(tekrarMetin("Ahmet ",13));
    }

}
