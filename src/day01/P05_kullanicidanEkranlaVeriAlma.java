package day01;

import javax.swing.*;

public class P05_kullanicidanEkranlaVeriAlma {
    public static void main(String[] args) {
        String isim= JOptionPane.showInputDialog("İsminizi Giriniz: ");
        String soyIsim=JOptionPane.showInputDialog("Soyisim Giriniz: ");



        JOptionPane.showMessageDialog(null, "Kayıt Başarılı\nOlarak Gerçekleştirildi\n"+isim+" "+soyIsim);
    }
}
