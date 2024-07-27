import java.util.Scanner;

public class T145_Market {
   static Scanner scan=new Scanner(System.in);
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
                    case 2:
                        manav();
                    case 3:
                        market();
                    case 4:
                        fisYazdir();
                    case 5:
                        cikis();
                }
            }



        }

    private static void sarkuteri() {
        System.out.println("---- Şarküteri Resyonuna Hoş Geldiniz ----");
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
