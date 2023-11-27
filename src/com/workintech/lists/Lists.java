package com.workintech.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {
    private List<String> groceryList;

    public Lists(List<String> groceryList) {
        this.groceryList = groceryList;
    }
    public boolean checkItemIsInList(String a){
        return groceryList.contains(a);
    }

    public void addItems(String givenStr){

        if(!checkItemIsInList(givenStr)){
           groceryList.add(givenStr);
        }else {
            System.out.println("Bu ürün zaten listede var!");
        }
    }

    public void removeItem(int index){
        if(index < 0) {
            System.out.println("Geçerli bir index giriniz.");
            System.exit(0);
        }
        if(groceryList.size() < index) {
            System.out.println("Geçerli bir index giriniz.");
            System.exit(0);
        }else {
            groceryList.remove(index);
        }
    }

    public void printSorted(){
        Collections.sort(this.groceryList);

        for(String grocery: this.groceryList){
            System.out.println(grocery);
        }
    }

    @Override
    public String toString() {
        return "Lists{" +
                "groceryList=" + groceryList +
                '}';
    }
}
