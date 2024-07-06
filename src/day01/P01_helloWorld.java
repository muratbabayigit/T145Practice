package day01;

public class P01_helloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("Merhaba ");
        System.out.println("Nasılsın");

        int sayi=120;
        int sayi2=110;
        System.out.println("sayi = " + sayi);
        System.out.println("sayi2 = " + sayi2);

       // System.err.println("Hata var dikkat et");
       // System.err.println("Merhaba Faig");

        //javada bir satırlık yorum eklemek istedğimizde bu yapıyı kullanırız

        /*
        javada birden fazala satır kullanmak istersek
        bu yapıyı kullanarak yorum yazarız
        java yorum satırlarını okumaz ve işlemez
         */


        // Soru -1 : Konsola  "Hello Java Ben Geldim"  yazdırınız.

        System.out.println("\"Hello Java Ben Geldim\"");
          /*
            \' : Tek tırnak işareti yazdırır
            \" : Çift tırnak işareti yazdırır
            \n : Bu işaretten sonra bir alt satıra geçip işleme devam eder
            \t : Bu işareti gorunce bir TAB tuşu kadar ilerler

         */

        // Soru-2: Konsola Aşağıdaki şekilde aşağıdaki metni tek bir sout komutuyla yazdırın

         /*
                Hello World
                    "Merhaba Dünya"
         */


        System.out.println("Hello World\n\t\"Merhaba Dünya\"");
        System.out.println();
        System.out.println();

        String isim="Furkan Bahar";
        String job="QA Automation Engineer";

        System.out.println(isim+" - "+job);

        // Ekran Görüntüsü almak için
        //Mac(OSx): CMD+Shift+4 ekranın istediğiniz yerini seçmenizi ve foto almanızı sağlar
        //Mac(OSx): CMD+Shift+3: Tam ekran alır
        //Mac(OSx): CMD+Shift+5: video kaydı yapar

        //windows: Win+Shift+S ekranın istediğiniz yerini seçmenizi ve foto almanızı sağlar



    }
}
