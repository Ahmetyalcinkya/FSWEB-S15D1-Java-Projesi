package com.workintech.lists;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void arrayListChallenge(){

        Scanner scanner = new Scanner(System.in);

        List<String> groceryList = new ArrayList<>();

        Lists grocery = new Lists(groceryList);

        System.out.println("-----------------------");
        System.out.println("Market uygulamasına hoşgeldiniz !");
        System.out.println("-----------------------");

        int choice;

        do {
            System.out.println("Lütfen bir işlem seçiniz !");
            System.out.println("-----------------------");
            System.out.println("0 : Uygulamadan çık.");
            System.out.println("1 : Listeye ürün ekle.");
            System.out.println("2 : Listeden ürün sil.");
            System.out.println("3 : Listeyi sırala.");
            System.out.println("-----------------------");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    System.out.println("Uygulama durduruluyor...");
                    scanner.close();
                    break;
                case 1:
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                    String added = scanner.nextLine();
                    grocery.addItems(added);
                    System.out.println(grocery);
                    break;
                case 2:
                    System.out.println("Çıkarılmasını istediğiniz elemanları giriniz.");
                    int index = scanner.nextInt();
                    grocery.removeItem(index);
                    break;
                default:
                    System.out.println("Geçerli bir aralıkta değer giriniz!");
                    System.exit(0);
                    break;
            }
            grocery.printSorted();
        } while(choice != 0);



    }

    public static void mobilePhone() {
        Contact hasan = new Contact("Hasan", "05555555555");
        Contact samil = new Contact("Samil", "05097568914");
        Contact aslı = new Contact("Aslı", "05084661232");
        Contact salen = new Contact("Salen", "05090900909");

        MobilePhone mobile = new MobilePhone("05436801400");
        mobile.findContact("Salen");
        mobile.findContact(hasan);
        mobile.addNewContact(salen);
        mobile.addNewContact(samil);
        mobile.addNewContact(aslı);
        mobile.printContacts();
        mobile.queryContact("samil");
        mobile.updateContact(samil, hasan);


    }
    public static void main(String[] args) {

        arrayListChallenge();
        mobilePhone();

    }
}