package Proje;

import java.util.Scanner;

public class Anamenu {
   void menu(){
       /*
    ====================================
	 ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
	====================================
	    1- ÖĞRENCİ İŞLEMLERİ
	    2- ÖĞRETMEN İŞLEMLERİ
	    Q- ÇIKIŞ
        */
       Scanner scan=new Scanner(System.in);
       System.out.print("\t====================================\n" +
               "\t\t1- ÖĞRENCİ İŞLEMLERİ\n" +
               "\t\t2- ÖĞRETMEN İŞLEMLERİ\n" +
               "\t\tQ- ÇIKIŞ\n" +
               "\t====================================\n\nSEÇİMİNİZ: ");
        char secim=scan.next().charAt(0);

        switch (secim){
            case '1':{
                  //Öğrenci işlemleri menüsü çağırılacak
                break;
            }
            case '2':{
                //Öğretmen işlemleri menüsü çağrılacak
                break;
            }
            case 'Q':{
                System.exit(0);
                break;
            }
            case 'q':{
                System.exit(0);
                break;
            }
            default:
                System.out.println("Hatalı giriş Yaptınız");
                menu();
        }



   }


}
