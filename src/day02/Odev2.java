package day02;

import javax.swing.*;
import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        /*1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
        sisteme kaydedildiğini aşağıdaki formatta yazdırın.
        ******       KAYIT BAŞARILI      ******
        Adınız: Tarık
        Soyadınız: Yiğit
        Yaşınız:42
        Mail Adresiniz:tarik@yigit.com.tr
        Şifreniz: A2e365
        şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.

         */
        String isim= JOptionPane.showInputDialog("Adınız: ");
        String soyisim=JOptionPane.showInputDialog("Soyadınız: ");
        String yas=JOptionPane.showInputDialog("Yaşınız: ");
        String mail=JOptionPane.showInputDialog("Mail Adesiniz: ");
        String sifre=JOptionPane.showInputDialog("Şifre: ");

        System.out.println("******    KAYIT BAŞARILI    ******\nAdınız: "+isim+
                                                             "\nSoyadınız: "+soyisim+
                                                             "\nYaşınız: "+yas+
                                                             "\nMail Adresiniz: "+mail+
                                                             "\nŞifreniz: "+sifre+
                                                             "\nşeklinde sistemimize kaydınız başarıyla tamamlanmıştır.");





    }
}
