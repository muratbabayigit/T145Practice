package day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01_List {
    //  /*
    //     * Input olarak verilen listteki isimlerden
    //     * icinde ‘a’ harfi bulunanlari silen bir program yaziniz
    //     *
    //     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
    //     * OUTPUT : [Veli,Omer]
    //     */

    public static void main(String[] args) {
     // List<String> list=new ArrayList<>();
     // list.add("Ali");
     // list.add("Veli");
     // list.add("Ayse");
     // list.add("Fatma");
     // list.add("Omer");
     // System.out.println(list);

    ArrayList<String> list=new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
    System.out.println("Listin ilk hali: "+list); //[Ali, Veli, Ayse, Fatma, Omer]

    List<String> newList=new ArrayList<>();

        for (String each:list) {
            if (!each.toLowerCase().contains("a")){
                newList.add(each);
            }

        }


        System.out.println("Yeni Oluşan Liste: "+newList);


    }

}
