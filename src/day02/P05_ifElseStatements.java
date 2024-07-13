package day02;

import java.util.Scanner;

public class P05_ifElseStatements {
    public static void main(String[] args) {

        	/*
		 *  Kullanicidan IT alanini isteyerek
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		yazdiriniz
		 */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen job title'nızı qa-dev-ba-pm şeklinde giriniz: ");
        String jobTitle= scan.nextLine();

        if (jobTitle.equalsIgnoreCase("qa")){
            System.out.println("Mesleğiniz: Quality Analyist");
        } else if (jobTitle.equalsIgnoreCase("dev")) {
            System.out.println("Mesleğiniz: Developer");
        } else if (jobTitle.equalsIgnoreCase("ba")) {
            System.out.println("Mesleğiniz: Business Analyist");
        } else if (jobTitle.equalsIgnoreCase("pm")) {
            System.out.println("Mesleğiniz: Project Manager");
        }else{ //else yazabilmek için mümkün olan tüm ihtimallerin bitmesi ve onlar dışındaki ihtimal kalması gerekir
            System.out.println("Hatalı Giriş Yaptınız");
        }


    }
}
