import java.util.Scanner;

public class T145_Market {
   static Scanner scan=new Scanner(System.in);
   static int urunKodu=0;
   static boolean ekUrun=false;
   static int urunMiktari=0;
   static String urunAd;
   static int urunBirimFiyat=0;

    /*
   ====================PROJEMIZ===================================
 ilk programa girildiginde bizi bir menu karsilasin bu secenekler
   1 ŞARKÜTERİ ÜRÜNLERİ
   2 MANAV ÜRÜNLERİ
   3 MARKET ÜRÜNLERİ
   4 FIS YAZDIR
   5 CIKIS
   secime göre;
   4-urunleri listele ve
   5-fiyatlari gelsin
   6-Alışveriş bitince fiş yazdırsın.
   7- Fiş yazdırdıktan sonra da çıkış yapılsın.
*/


    public static void main(String[] args) {
        girisEkrani();
    }

        public static void girisEkrani(){
            System.out.println("-------- T145 MARKET --------");
            System.out.println("======== HOSGELDINIZ ========");
            System.out.println("Lütfen Alışveriş Yapacağınız Reyon Numarasını Giriniz");
            System.out.println("1-Şarküteri Reyonu\n2-Manav Reyonu\n3-Market Reyonu\n4-Fiş Yazdır\n5-Çıkış");
            System.out.print("Seçiminiz: ");
            int secim = scan.nextInt();

            if (!(secim>=1 && secim<=5)){
                System.out.println("Geçersiz bir seçim yaptınız!");
                girisEkrani();
            }else{
                switch (secim){
                    case 1:
                        sarkuteri();
                        break;
                    case 2:
                        manav();
                        break;
                    case 3:
                        market();
                        break;
                    case 4:
                        fisYazdir();
                        break;
                    case 5:
                        cikis();
                        break;
                    default:
                }
            }



        }

    private static void sarkuteri() {

        System.out.println("---- Şarküteri Resyonuna Hoş Geldiniz ----");
        System.out.println("==== Ürün Listesindeki ürünleri başında bulunan kod ile sisteme ekleyiniz ====");
        System.out.println("  Şarküteri Ürün Listesi\n----------------------------");
        System.out.println("101 - Peynir 135₺\n102 - Süt 32₺\n103 - Yoğurt 160₺\n104 - Zeytin 300₺\n105 - Yumurta 95₺");
        System.out.print("Ürün kodunu giriniz: ");
        urunKodu = scan.nextInt();
        if (!(urunKodu >= 101 && urunKodu <= 105)) {
            sarkuteri();
        }
            while (!ekUrun) {

                if (urunKodu >= 101 && urunKodu <= 105) {
                    System.out.print("Kaç Paket alacaksınız: ");
                    urunMiktari = scan.nextInt();

                    switch (urunKodu) {
                        case 101:
                            urunAd = "Peynir";
                            urunBirimFiyat = 135;
                            System.out.println(urunMiktari + " paket " + urunAd + " fiyatı:" + (urunMiktari * urunBirimFiyat) + "₺'dir");
                            break;

                    }

                }
            }
        }




    private static void manav() {
        System.out.println("---- Manav Resyonuna Hoş Geldiniz ----");
    }

    private static void market() {
        System.out.println("---- Market Resyonuna Hoş Geldiniz ----");
    }

    private static void fisYazdir() {
        System.out.println("---- Fiş Yazdırmak İçin Gerekli Düzenlemeler Yapılıyor ----");
    }

    public static void cikis() {
        System.exit(0);
    }


}
