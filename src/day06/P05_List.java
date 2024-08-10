package day06;

import java.util.ArrayList;
import java.util.List;

public class P05_List {
    /* TASK :
     * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array haline getiren bir code create ediniz.
     *
     * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
     * OUTPUT : [1,2,3,4,5,6,7,8,9]
     */

    public static void main(String[] args) {
        int [] arr={1,2,2,3,1,4,2,5,6,8,7,5,9,1};
        List<Integer> tekrarsizList=new ArrayList<>(); //ilk bulduğu elemanı ekleyeceği list oluşturduk
        for (Integer each:arr) {
            if (!tekrarsizList.contains(each)){  //baktığı elemanın daha önce ekleneip eklenmediğine baktı
                tekrarsizList.add(each); //daha önce eklenmediyse onu ekledi
            }

        }
        System.out.println(tekrarsizList);



    }


}
