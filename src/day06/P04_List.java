package day06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04_List {
  /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.
  */
  public static void main(String[] args) {
      List<Integer> nots=new ArrayList<>();  //notların ekleneceği list oluşturuldu
      Scanner scan=new Scanner(System.in);
      System.out.println("Yeni not girmek için N tuşuna basınız.");
      char devam=scan.next().charAt(0);
      while (devam=='N' || devam=='n'){ //Not girişine devam etme kuralına bakılarak işlem planlandı
          System.out.print("Notu Giriniz: ");
          nots.add(scan.nextInt());
          System.out.println("Yeni not girecekseniz tekrar N tuşuna basınız\nGirilen notların ortalamasını bulmak için X tuşuna basınız");
          devam=scan.next().charAt(0);
      }

      double ortalama=0;
      int toplam=0;

      for (int i = 0; i <nots.size(); i++) {  //Bu döngü ile list içindeki sayıların toplamını bulduk
          toplam+=nots.get(i);
      }
      ortalama=toplam/ nots.size(); // Girilen sayıların ortalamasınıa hesapladık


      List<Integer> ortUstu=new ArrayList<>(); //ortalama üstü olan notları ekleyeceğimiz yeni birlist oluşturduk
      for (int i = 0; i < nots.size(); i++) {  // bu döngü ile //ortalama üstü olan notları yeni liste ekledik
            if (ortalama<nots.get(i)){
                ortUstu.add(nots.get(i));
            }


      }
      System.out.println("Girilen notlar: "+nots);
      System.out.println("Not ortalaması: "+ortalama);
      System.out.println("Ortalamayı gecen kişi sayısı: "+ortUstu.size()); //Yeni listin uzunluğu ortamala üstündeki öğre sayısını ifade eder



  }




}
