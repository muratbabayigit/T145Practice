package day01;

public class P03_Operators {
    public static void main(String[] args) {
        // Java da bazı işlemlere karşılık gelep Operatorler vardır
        // bunlar bulundukları yerde görevi olan işlevi yerine getirir

        // Atama Operatoru ( = )
        int a = 34;
        int b = 71;
        int c = 71;
        int d = 71;


        // Eşitlk operatoru ( == ) Koşul durumlarında kullanılır
        System.out.println(b == c); //true
        System.out.println(a == c); //false

        // Eşit değildir operatoru ( != )
        System.out.println(b != c); //false
        System.out.println(a != c); //true

        // Dört İşlem Operatoru
        System.out.println("Toplam: " + (a + b));
        System.out.println("Fark: " + (c - a));
        System.out.println("Çarpım: " + (b * a));
        System.out.println("Bölüm: " + (b / a));

        // Modulus Operatoru %
        // bu operator sağındaki sayının solundaki sayıya bölümünden kalanı verir
        System.out.println("Kalan: " + (c % a));


        // VE Operatoru (&&)
        // iki koşul kontrol edildiğinde ikisi de doğru ise true verir

        System.out.println(a == c && b == c); // false
        System.out.println(b == c && b == d); // true

        // || veya operatoru
        // koşul durumlarında iki koşuldan birinin doğru olması durumunda true verir
        // her ikisi de yanlış ise false verir

        System.out.println(a == d || b == d); //true
        System.out.println(a == c || a == b); // false
        System.out.println(b == c || d == b); // true


    }
}
