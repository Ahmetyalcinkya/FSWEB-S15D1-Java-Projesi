package com.workintech.lists;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }
    public boolean addNewContact(Contact contact){
        if(contact == null || contact.getName() == null
                || contact.getPhoneNumber() == null) return false;

        if(!myContacts.contains(contact)){
            myContacts.add(contact);
            return true;
        }else {
            return false;
        }
    }
    public boolean updateContact(Contact oldContact, Contact newContact){
        int oldIndex = findContact(oldContact.getName());
        if(oldIndex < 0) return false;
        myContacts.set(oldIndex, newContact);
        return true;
    }
    public boolean removeContact(Contact contact){
        if(findContact(contact.getName()) < 0) return false;

        myContacts.remove(contact);
        return true;
    }

    public int findContact(Contact contact){
       if(myContacts.contains(contact)){
          return myContacts.indexOf(contact);
       }else {
           return -1;
       }
    }
    public int findContact(String contactName){
        for(int i = 0 ; i < myContacts.size(); i++){
            Contact contact = myContacts.get(i);
            if(contact.getName().equalsIgnoreCase(contactName)){
                return i;
            }
        }
        return -1;
    }
    public Contact queryContact(String contactName){
        int index = findContact(contactName);
        if(index >= 0){
            return myContacts.get(index);
        }
        return null;
    }
    public void printContacts(){
        for(int i = 0; i < myContacts.size(); i++){
            Contact contact = myContacts.get(i);
            System.out.println(contact.getName() + contact.getPhoneNumber());
        }
    }
}
