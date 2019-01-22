package com.zipcodewilmington.phonebook;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBookTest {





    @Test
    public void hasEntryTest() {
        boolean containsKey;

        PhoneBook phone = new PhoneBook();
        String name = "xzavia";
        String phoneNumber = "302-399-3694";
        phone.add(name, phoneNumber);
        boolean actual = phone.hasEntry(name);

        Assert.assertTrue(actual);


    }


     @Test
     public void lookUpTest() {

         PhoneBook phone = new PhoneBook();
         String name = "xzavia";
         String phoneNumber = "302-399-3694";
         phone.add(name, phoneNumber);
         String expected = (phoneNumber);
         String actual = phone.lookUp(name);

         Assert.assertEquals(expected, actual);

     }

     @Test
     public void removeTest() {

         PhoneBook phone = new PhoneBook();
         String name = "xzavia";
         String phoneNumber = "302-399-3694";
         phone.add(name, phoneNumber);

         phone.remove(name);

         boolean actual = phone.hasEntry(name);


         Assert.assertFalse(actual);



     }
     @Test
    public void reverseLookUpTest() {

         PhoneBook phone = new PhoneBook();
         String name = "xzavia";
         String phoneNumber = "302-399-3694";
         phone.add(name, phoneNumber);
         String expected = (name);
         String actual = phone.reverseLookUp(phoneNumber);

         Assert.assertEquals(expected,actual);


     }



    //@Test
    //public void testContainsValueTest() {
        // Given
        // WE have a new phone book
       // TreeMap <Integer, String> phoneBook = new TreeMap<Integer, String>();

        // When
        // We add an entry
       // phoneBook.put(1 , "name");

        // Then
        // It will contain an entry
        //Assert.assertTrue(phoneBook.containsValue("name"));


    }



