package day03;

public class P06_stringManipulation {
    public static void main(String[] args) {
        String str1="Emre Can";
        String str2="Emre Can";

        String str3=new String("Emre Can");


     // System.out.println(str1.equals(str2)); //true - referanslarına baktı
     // System.out.println(str1==str2); //true

        /*
                Wis@98e? Quar/t{%er olarak verilen metni Wise Quarter olarak yazdırın
         */
            String metin="Wis@98e? Quar/t{%35er";
            metin=metin.replaceAll("\\d","");
            System.out.println(metin);
            metin=metin.replace(" ","X");
            System.out.println("metin = " + metin);
            metin=metin.replaceAll("\\W","");
            metin=metin.replaceAll("X"," ");

            System.out.println(metin);








    }

}
