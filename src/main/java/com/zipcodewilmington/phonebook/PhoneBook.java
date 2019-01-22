package com.zipcodewilmington.phonebook;

import java.util.TreeMap;

/**
 * Created by leon on 1/23/18.
 */

public class PhoneBook {

    TreeMap<String, String> phoneBook = new TreeMap<String, String>();

    public PhoneBook() {

    }

    public boolean hasEntry(String name) {

        if (phoneBook.containsKey(name)) {

            return true;
        }
        return false;
    }

    public void add(String name, String phoneNumber) {

        if (this.hasEntry(name)) {

            this.phoneBook.get(name);
        }

        phoneBook.put(name, phoneNumber);

    }

    public String lookUp(String name) {

        return phoneBook.get(name);

    }

    public void remove(String name) {

        phoneBook.remove(name);

    }

    public String reverseLookUp(String phoneNumber) {

        String result = "";

        for (String keyName : phoneBook.keySet()) {

            if (phoneBook.get(keyName).equals(phoneNumber)) {

                result = keyName;

            }
        }

        return result;
    }

    public void listNamesAndNumbers() {

        for (String keyName : phoneBook.keySet()) {

            System.out.println(keyName + " " + phoneBook.get(keyName));
        }
    }
}




