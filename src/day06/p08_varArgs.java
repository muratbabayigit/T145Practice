package day06;

public class p08_varArgs {
    //  verilen Stringleri birlestiren concat isimli bir method olusturunuz
    // input : "m", "e", "r", "v", "e";
    // output : merve

    public static void main(String[] args) {
        concat("a","b","d","u","l","l","a","h");
    }

    public static void concat(String... str){
        String yeni="";
        for (String each:str) {
            yeni=yeni.concat(each);
        }
        System.out.println(yeni);

    }
}
