package day01;

public class P02_dataTypes {
    public static void main(String[] args) {
        /*

        Javada data tipleri primitive ve nonPrimitive olmak üzere iki çeşittir
        Primitive Data Türleri: Sayısal-Char-Boolean

        byte < short < int < long < float < double

         */

        byte byteMax = Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("byteMax = " + byteMax);
        System.out.println("byteMin = " + byteMin);


        short ShortMax = Short.MAX_VALUE;
        short ShortMin = Short.MIN_VALUE;
        System.out.println("ShortMax = " + ShortMax);
        System.out.println("ShortMin = " + ShortMin);

        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        System.out.println("intMax = " + intMax);
        System.out.println("intMin = " + intMin);

        long LongMax = Long.MAX_VALUE;
        long LongMin = Long.MIN_VALUE;
        System.out.println("LongMax = " + LongMax);
        System.out.println("LongMin = " + LongMin);

        float FloatMax = Float.MAX_VALUE;
        float FloatMin = Float.MIN_VALUE;
        System.out.println("FloatMax = " + FloatMax);
        System.out.println("FloatMin = " + FloatMin);

        double DoubleMax = Double.MAX_VALUE;
        double DoubleMin = Double.MIN_VALUE;
        System.out.println("DoubleMax = " + DoubleMax);
        System.out.println("DoubleMin = " + DoubleMin);

        // boolean data türü atanan değer/işlev doğru ise tru yanlış ise false verir
        boolean isHeRetired = false;
        System.out.println("Emekli mi? = " + isHeRetired);
        ;

        // char data türünde ise tek tırnak kullşanılır ve tek karakter
        // yahut  ASCII tablosunda karşılığı kullanılır

        char ch1 = 'a';
        char ch2 = 97;

        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);

        float fl1=2.32f;
        //float ile double aynı değerleri içerebildiği için
        // bir sayının float olarak oluşturulması için sonuna f koymak gerekir.
        // koymazsanız CTE verir
        //double db1=2.32d; bu şekilde sonunda d koyarak da ifade edilebilir.
        //                  Zorunlu değildir
        double db1=2.32;
        System.out.println("fl1 = " + fl1);
        System.out.println("db1 = " + db1);
    }
}